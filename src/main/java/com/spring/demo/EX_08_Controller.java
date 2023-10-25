package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EX_08_Controller {
    /*
    ZADANIE 8:
    Napisz kod strony z użyciem Thymeleaf, która wyświetli dwa obiekty przesłane w Controlerze do Modelu.
     */
    @RequestMapping("/object")
    public Object ExampleObject(Model model) {
        EX_08_Person person_1 = new EX_08_Person(1, "Jan", "Kołakowski", "666-765-2046", "jan.kolakowski@mail.pl");
        model.addAttribute("person_1", person_1);
        EX_08_Person person_2 = new EX_08_Person(2, "Jan", "Nowak", "123-456-789", "nowak.jan@mail.com");
        model.addAttribute("person_2", person_2);
        return "EX_08";
    }
}
