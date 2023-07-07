package com.naver.controller;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.FreeComment;
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
    @GetMapping("/main/all")
    public ModelAndView getAll(ModelAndView mav)
    {
        List<FreeComment> freeComments = mainService.getFreeComments();
        if(freeComments.size()==0)
        {

        }
        else {
            mav.addObject("freecomments",freeComments);
        }

        mav.setViewName("/main/all");
        return mav;
    }
    @PostMapping("/main/all")
    public ModelAndView postAll(ModelAndView mav, @ModelAttribute FreeComment comment)
    {
        mainService.insertFreeComments(comment);

        mav.setViewName("redirect:/main");
        return mav;
    }




}
