package com.spring.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EX_02_Controller {
    /*
    ZADANIE 2:
    Napisz program który odczyta z adresu następujące parametry: imie, nazwisko, pesel, e-mail, telefon.
    Parametry e-mail oraz telefon są opcjonalne. W przypadku gdy jakiś parametr nie byłby przekazywany przez adres to informacja nie ma się wyświetlać.
     */
    @GetMapping("/RequestParam")
    public List Example_RequestParam( @RequestParam("first_name") String first_name, @RequestParam("last_name") String last_name, @RequestParam("personal_id_no") String personal_id_no, @RequestParam(value="email" , required=false) String email, @RequestParam(value="phone_number" , required=false) String phone_number) throws Exception {
        List <String> dane   = new ArrayList<>();
        dane.add(first_name + " " + last_name);
        dane.add("PESEL: " + personal_id_no);
        if (email != null) dane.add("E-MAIL: " + email);
        if (phone_number != null) dane.add("TELEFON: " + phone_number);
        return dane;
    }
}