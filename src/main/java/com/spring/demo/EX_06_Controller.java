package com.spring.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class EX_06_Controller {
    /*
    ZADANIE 6:
    Napisz stronę, która zwróci informację o: wersji przeglądarki/klienta HTTP, języku narodowym strony, adresie hosta.
     */
    @RequestMapping("/RequestHeader")
    @ResponseBody
    public String  ExampleRequestHeader(
            @RequestHeader("User-Agent") String user_agent,
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestHeader("Host") String host
    ) throws Exception {
        return "<b>Przeglądarka/ klient HTTP: </b>" + user_agent
                + "<br><b>Język: </b>" + acceptLanguage
                + "<br><b>Host: </b>" + host;
    }
}
