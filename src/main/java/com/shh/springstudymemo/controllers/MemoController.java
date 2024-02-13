package com.shh.springstudymemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/memo") // 해당 컨트롤러의 이름과 일치해야한다 // value 는 문자열 "" 로 처리해야한다
public class MemoController {
    @RequestMapping("/") // 접속 주소의 페이지를 뜻한다 이를 통해 http://localhost:8080/memo/ 로 가게 되면 아래의 코드가 작동한다
    public ModelAndView getIndex() {
        ModelAndView modelAndView  = new ModelAndView(); // 통째로 넘기기 위해 사용하는 편이다
        modelAndView.setViewName("memo/index"); // 연결될 templates 의 html 파일을 말한다 // 위의 RequestMapping 에 적혀있는 주소와는 관계없다
        return modelAndView;
    }
}
