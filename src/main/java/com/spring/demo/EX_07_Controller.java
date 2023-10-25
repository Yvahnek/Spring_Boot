package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EX_07_Controller {
    /*
    ZADANIE 7:
    Utwórz webowy kalkulator, zakładając że wysyłamy stronę z wynikiem jednego z działań: suma, różnica, iloczyn (@Controller).
    Do strony dane przekazujemy w adresie: rodzaj działania oraz dwie liczby.
     */
    @GetMapping(value = "/calculator-MVC/{operation}/{number_1}/{number_2}")
    public String KalkulatorMVCzPath(@PathVariable String operation, @PathVariable Float number_1, @PathVariable Float number_2, Model model) {
        float result = 0;
        switch (operation) {
            case "addition":
                result = number_1 + number_2;
                break;
            case "subtraction":
                result = number_1 - number_2;
                break;
            case "product":
                result = number_1 * number_2;
                break;
        }
        model.addAttribute("result_from_controller", result);
        return "EX_07";
    }
}
