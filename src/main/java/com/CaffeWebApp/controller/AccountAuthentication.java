package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.Account;
import com.CaffeWebApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AccountAuthentication {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/authenticateAccount")
    public String authenticateAccount(Account account, Model model) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        Optional<Account> optionalAccount = accountRepository.findByLogin(account.getLogin());
        if (optionalAccount.isPresent()) {
            Account dbAccount = optionalAccount.get();
            if (bCryptPasswordEncoder.matches(account.getPassword(), dbAccount.getPassword())) {
                return "redirect:/loggedaccountview";
            } else {
                model.addAttribute("errorMessage", "Błędne hasło.");
                return "redirect:/signin";
            }
        } else {
            model.addAttribute("errorMessage", "Konto o podanym loginie nie zostało znalezione.");
            return "redirect:/signin";
        }
    }
}
