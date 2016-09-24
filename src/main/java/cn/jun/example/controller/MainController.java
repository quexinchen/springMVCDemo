package cn.jun.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jun on 16/9/24.
 */

@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    protected String index (){
        return "index";
    }
}
