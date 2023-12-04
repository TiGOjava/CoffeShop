package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.OrderNow;
import com.CaffeWebApp.repository.OrderNowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AccountLoggedView {

    @Autowired
    OrderNowRepository orderNowRepository;

    @GetMapping("/loggedaccountview")
    public String listOrders(Model model) {
        List<OrderNow> orderNows = orderNowRepository.findAll();
        model.addAttribute("ordersnows", orderNows);
        return "LoggedUserView";
    }
}
