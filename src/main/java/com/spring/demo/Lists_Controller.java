package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Lists_Controller {
    @RequestMapping("/List_01")
    public String list_01() {
        return "List_01";
    }
    @RequestMapping("/List_02")
    public String list_02() {
        return "List_02";
    }
}
