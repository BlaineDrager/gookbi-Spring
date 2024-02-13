//package com.shh.springstudymemo.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping(value = "/hello") // 요청을 받는 경로 지정 부분중 하나로 class 부분에 RequestMapping 을 한다면 해당 경로의 중간 지점을 적어주어야 한다
//public class HelloController {
//    @RequestMapping(value = "say") // 요청을 받는 부분을 지정하는 것 해당 경로의 마지막 부분을 적어 주어서 해당 경로에 도달 했을 때 실행 되는 것으로 만들어 준다 // 생성시 /를 포함하지 않아야 한다 현재 위의 RequestMapping 까지 포함한 경로는 /hello/say 가 된다.
//    @ResponseBody // 해당 경로의 요청을 받았을 시 요청에 대한 응답을 보내는 것
//    public String getSay() {
//        return "Hello World (Updated)";
//    }
//}
