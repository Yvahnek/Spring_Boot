package com.spring.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class EX_03_Controller {
    /*
    ZADANIE 3:
    Napisz stronę, która pozyska od użytkownika informacje wpisane w adresie URL wg schematu: adres:8080/tekst/liczba/tekst/liczba
     */
    @GetMapping(value = "/{text_1}/{number_1}/{text_2}/{number_2}")
    @ResponseBody
    public String PrzykladZPath(@PathVariable String text_1, @PathVariable Integer number_1, @PathVariable String text_2, @PathVariable Integer number_2) throws Exception {
        return "<b>Z adresu pozyskano następujące dane:</b><br>" + text_1 + " " + number_1 + "<br>" + text_2 + " " + number_2;
    }
}
