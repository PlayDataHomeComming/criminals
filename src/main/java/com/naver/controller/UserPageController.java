package com.naver.controller;

import com.naver.domain.request.AddAttributeReqeust;
import com.naver.domain.request.InsertCommentRequest;
import com.naver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
        mav.addObject("comments",userService.getComments(userId));
        mav.addObject("userId",userId);
        userService.numOfVisit(Integer.parseInt(userId));
        mav.setViewName("/user/user");
        return mav;
    }

    @PostMapping("/user/addAttribute")
    public ModelAndView postUserAddAttribute(ModelAndView mav
    , @ModelAttribute AddAttributeReqeust addAttributeReqeust)
    {
        mav.setViewName("redirect:/user?userId="+addAttributeReqeust.getUserId());
        userService.insertAttribute(addAttributeReqeust);
        return mav;
    }

    @PostMapping("/user/insertComment")
    public ModelAndView postUserInsertComment(ModelAndView mav
            , @ModelAttribute InsertCommentRequest insertCommentRequest)
    {
        System.out.println(insertCommentRequest.getComment());
        mav.setViewName("redirect:/user?userId="+ insertCommentRequest.getUserId());
        userService.insertComment(insertCommentRequest);
        return mav;
    }

}
