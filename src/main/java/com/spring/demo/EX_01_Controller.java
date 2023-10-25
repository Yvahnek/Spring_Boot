package com.spring.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EX_01_Controller {
    /*
    ZADANIE 1:
    Opracuj aplikację webową zwracającą tekst, listę, liczbę.
     */
    @RequestMapping("/text")
    public String method() {
        return "Witaj Świecie!";
    }
    @RequestMapping("/list")
    public List method_2() {
        List <String> set   = new ArrayList<>();
        set.add("Jan Kołakowski");
        set.add("Jan Nowak");
        set.add("^_^");
        return set;
    }
    @RequestMapping("/number")
    public Double method_3() {
        return 3.14159265359;
    }
}
