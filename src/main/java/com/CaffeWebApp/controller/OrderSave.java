package com.CaffeWebApp.controller;

import com.CaffeWebApp.dto.OrderNow;
import com.CaffeWebApp.repository.OrderNowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderSave {

    @Autowired
    OrderNowRepository orderNowRepository;

    @PostMapping("/saveordernow")
    public String saveOrder(@ModelAttribute("ordernow") OrderNow orderNow) {
        orderNowRepository.save(orderNow);
        return "redirect:/home";
    }
}
