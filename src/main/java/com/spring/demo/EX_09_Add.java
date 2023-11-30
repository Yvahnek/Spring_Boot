package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EX_09_Add {
    @PostMapping("/add")
    public String addPerson(@ModelAttribute EX_08_Person personForm, Model model) {

        model.addAttribute("personForm", personForm);
        if (checkNotEmpty(personForm)) {
            return "EX_09_Correct_Validation";
        } else
            return "EX_09_Error";
        }

    private boolean checkNotEmpty(EX_08_Person person) {
        return 	(person.getFirst_name() != null
                && person.getFirst_name().length() > 2)
                && (person.getLast_name() != null
                && !person.getLast_name().isEmpty())
                && (person.getEmail() != null
                && person.getEmail().length() > 2);
    }

}
