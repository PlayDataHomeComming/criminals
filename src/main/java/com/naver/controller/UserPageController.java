package com.naver.controller;

import com.naver.domain.entitiy.User;
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
    public ModelAndView getUser(ModelAndView mav,HttpSession session)
    {

        User user = userService.getUser(1);
        session.setAttribute("user",user);

        //여기서 눌린 사람의 데이터를 session또는 model attribute로 받아온다.
        // 그래서 그 값을 테이블 형식으로 보여준다.
        //그래서 jsp에 contents를 session.setattribute로 설정한 값으로 테이블 출력
        mav.setViewName("/user/user");
        return mav;
    }

    @PostMapping("/user")
    public ModelAndView postUser(ModelAndView mav
    , @ModelAttribute ChangeUserCommentRequest request)
    {

        mav.setViewName("redirect:/user/user");
        return mav;
    }



}
