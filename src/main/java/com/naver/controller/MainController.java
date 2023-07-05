package com.naver.controller;

import com.naver.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public ModelAndView mainController(ModelAndView mav){
        mav.setViewName("main/main");
        return mav;
    }
}
