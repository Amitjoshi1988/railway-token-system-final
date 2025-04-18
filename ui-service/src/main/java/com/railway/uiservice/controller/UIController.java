package com.railway.uiservice.controller;

import com.railway.uiservice.service.UIGrpcClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UIController {

    private final UIGrpcClient client;

    public UIController(UIGrpcClient client) {
        this.client = client;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/generate/{counterId}")
    public String generate(@PathVariable("counterId") int counterId, Model model) {
        String token = client.getToken(counterId);
        model.addAttribute("token", token);
        return "token :: result";
    }
}
