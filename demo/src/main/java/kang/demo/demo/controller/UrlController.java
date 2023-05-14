package kang.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlController {
    @RequestMapping("index")
    public String toIndex(){
        return "/index";
    }
    @RequestMapping("login")
    public String toLogin(){
        return "/login";
    }
    @RequestMapping("search")
    public String toSearch(){
        return "/search";
    }
    @RequestMapping("add")
    public String toAdd(){
        return "/add";
    }

}
