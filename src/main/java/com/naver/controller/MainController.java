package com.naver.controller;

import com.naver.domain.entitiy.User;
import com.naver.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public ModelAndView mainController(ModelAndView mav){
        mav.setViewName("main/main");
        mav.addObject("name", mainService.user());
        mav.addObject("subData", mainService.user());
        mav.addObject("numVisit", mainService.user());
        return mav;
    }
}
