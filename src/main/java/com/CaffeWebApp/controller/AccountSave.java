package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.Account;
import com.CaffeWebApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountSave {

    @Autowired
    private AccountRepository accountRepository;


    @PostMapping("/saveaccount")
    public String saveAccount(@ModelAttribute("account") Account account) {
        accountRepository.save(account);
        return "redirect:/home";
    }
}