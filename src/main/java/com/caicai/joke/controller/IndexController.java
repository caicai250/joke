package com.caicai.joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
@Controller
@RequestMapping("/joke")
public class IndexController {
    /**
     * 测试视图解析器
     */
    @RequestMapping("/index")
    public String hello(Model model) {
        String name = "xiaosha";
        model.addAttribute("name", name);
        return "index";
    }
}
