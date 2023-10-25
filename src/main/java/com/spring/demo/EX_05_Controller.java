package com.spring.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class EX_05_Controller {
    /*
    ZADANIE 5
    Napisz stronę, która będzie realizowała funkcjonalność kalkulatora wykonującego działania: dodawania, odejmowania i iloczynu.
    Do strony przekazujemy w adresie: rodzaj działania oraz dwie liczby
     */
    @GetMapping(value = "/{operation}/{number_1}/{number_2}")
    public Float KalkulatorZPath(@PathVariable String operation, @PathVariable Float number_1, @PathVariable Float number_2) throws Exception {
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
        return result;
    }
}
