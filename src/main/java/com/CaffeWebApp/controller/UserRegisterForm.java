package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegisterForm {


    @GetMapping("/joinnow")
    public String showRegistrationForm(Model model) {
        model.addAttribute("account", new Account());
        return "JoinNow";
    }
}
