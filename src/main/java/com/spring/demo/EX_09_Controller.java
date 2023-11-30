package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EX_09_Controller {
    /*
    ZADANIE 9:
    Stwórz plik error, ale zamiast informacji tekstowej powinien wyświetlać się formularz z wprowadzonymi danymi.

    ZADANIE 10:
    Dodaj informacje, które pole nie zostało poprawnie zwalidowane (zbyt mała liczba znaków)
     */
    @RequestMapping("/form")
    public Object ObjectForForm(Model model) {
        EX_08_Person person_3 = new EX_08_Person(3, "Jan", "Kołakowski", "666-765-2046", "jan.kolakowski@mail.pl");
        model.addAttribute("person_3", person_3);
        return "EX_09";
    }
}
