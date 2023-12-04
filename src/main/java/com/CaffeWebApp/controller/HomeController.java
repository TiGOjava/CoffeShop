package com.CaffeWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/e")
    public String e() {
        return "LoggedUserView";
    }

    @GetMapping("/")
    public String ShowHomeMain() {
        return "Home";
    }

    @GetMapping("/home")
    public String ShowHome() {
        return "Home";
    }

    @GetMapping("/menu")
    public String ShowMenu() {
        return "Menu";
    }

    @GetMapping("/rewards")
    public String ShowRewards() {
        return "Rewards";
    }

    @GetMapping("/giftcards")
    public String ShowGiftcards() {
        return "GiftCards";
    }

    @GetMapping("/joinnow1")
    public String ShowJoinNow() {
        return "JoinNow";
    }

    @GetMapping("/signin1")
    public String ShowSingIn() {
        return "SignIn";
    }

    @GetMapping("/findstore")
    public String ShowFindStore() {
        return "FindStore";
    }
}