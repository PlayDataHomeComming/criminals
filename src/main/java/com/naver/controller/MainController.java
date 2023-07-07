package com.naver.controller;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.MainRequest;
import com.naver.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public ModelAndView mainGet(ModelAndView mav){
        mav.setViewName("main/main");
        List<User> users=mainService.getUser();
        mav.addObject("users",users);
        return mav;
    }
    @PostMapping("/main")
    public ModelAndView mainPost(
            ModelAndView mav,
            @ModelAttribute MainRequest mainRequest
    ){
        mainService.updateImgUrl(mainRequest);
        mav.setViewName("redirect:main");
        return mav;
    }
    @GetMapping("/main/add")
    public ModelAndView getAddUser(ModelAndView mav)
    {
        mav.setViewName("main/add");
        return mav;
    }
    @PostMapping("/main/add")
    public ModelAndView postAddUser(ModelAndView mav,@ModelAttribute User user)
    {
        user.setNumOfVisit(0); //user의 처음 조회수 값은 0임
        mainService.addUser(user);
        mav.setViewName("redirect:/main");
        //
        return mav;
    }
}
