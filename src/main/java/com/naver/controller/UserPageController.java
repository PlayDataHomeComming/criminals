package com.naver.controller;

import com.naver.domain.entitiy.User;
import com.naver.domain.request.AddAttributeReqeust;
import com.naver.domain.request.ChangeUserCommentRequest;
import com.naver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;

@Controller
public class UserPageController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ModelAndView getUser(
            ModelAndView mav,
            @ModelAttribute(value = "userId") String userId)
    {
        mav.addObject("contents",userService.getUserContents(userId));
        mav.addObject("userId",userId);
        mav.setViewName("/user/user");
        return mav;
    }

    @PostMapping("/user/addAttribute")
    public ModelAndView postUser(ModelAndView mav
    , @ModelAttribute AddAttributeReqeust addAttributeReqeust)
    {
        mav.setViewName("redirect:/user?userId="+addAttributeReqeust.getUserId());
        userService.insertAttribute(addAttributeReqeust);
        return mav;
    }



}
