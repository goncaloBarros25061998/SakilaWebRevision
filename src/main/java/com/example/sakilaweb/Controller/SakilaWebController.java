package com.example.sakilaweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SakilaWebController {
    @GetMapping("/sakila/testname")
    public  String testName(String nameParam, Model model){
        model.addAttribute("nameAttribute",nameParam );
        return "displayName";
    }

}
