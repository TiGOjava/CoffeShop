package com.CaffeWebApp.controller;


import com.CaffeWebApp.dto.Account;
import com.CaffeWebApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserRegister {

        @Autowired
        AccountRepository accountRepository;

        @PostMapping("/registeruser")
        public String registerUser(@ModelAttribute("account") Account account) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(account.getPassword());
            account.setPassword(encodedPassword);
            accountRepository.save(account);
            return "SignIn";
        }
}







