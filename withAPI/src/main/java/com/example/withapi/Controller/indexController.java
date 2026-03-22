package com.example.withapi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring6.util.SpringReactiveModelAdditionsUtils;

import java.util.ArrayList;

@Controller
public class indexController{

    @GetMapping("/")
    public String ShowfrontHtml(Model model){
        /*welcome wel=new welcome();
        model.addAttribute("name",wel);
        model.addAttribute("pw",wel);*/
        return "check";
    }
    @PostMapping("/userForm")
    public String SubmitShowfrontHtml(@RequestBody welcome wel, Model model){
        model.addAttribute(wel);
        return "secondpg";
    }

}
