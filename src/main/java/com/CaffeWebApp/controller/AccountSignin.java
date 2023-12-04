package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountSignin {


    @GetMapping("/signin")
    public String login(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "SignIn";
    }
}
