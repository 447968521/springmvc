package com.liu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * user/list.do user/add.do
 *
 * @author yingjie
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/test/add1")
    public String add(HttpServletRequest request) {

        String userNumber = request.getParameter("userNumber");
        String passWord = request.getParameter("passWord");

        System.out.println("userNumber:" + userNumber + " passWord:" + passWord);

        String str = "userNumber:" + userNumber + " passWord:" + passWord;
        
        request.setAttribute("user", str);
        List<String> list= new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        request.setAttribute("list", list);
        return "user_add1";
    }

    @RequestMapping(value = "/add2")
    public ModelAndView add2() {

        ModelAndView mav = new ModelAndView("user_add2");
        mav.addObject("userId", 1001);
        mav.addObject("userName", "����");

        return mav;
    }

    @RequestMapping(value = "/add3")
    public String add3(Model model) {

        model.addAttribute("personId", 9527);
        model.addAttribute("personName", "�Ʋ���");
        return "user_add3";
    }

    @RequestMapping(value = "/add4")
    public String add4(Integer personId, String userName, Map map) {

        System.out.println(personId);
        System.out.println(userName);
        map.put("personId", 9527);
        map.put("personName", "�Ʋ���");

        return "user_add4";
    }

    @RequestMapping(value = "/add5")
    public void add5(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.write("asdf");
    }

}
