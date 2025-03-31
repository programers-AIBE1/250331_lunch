package org.example.t250331_gpt.controller;

import org.example.t250331_gpt.domain.Lunch;
import org.example.t250331_gpt.service.LunchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LunchController {

    private final LunchService lunchService;

    public LunchController(LunchService lunchService) {
        this.lunchService = lunchService;
    }

    @GetMapping
    public String recommendLunch(Model model) {
        Lunch lunch = lunchService.getRandomLunch();
        model.addAttribute("lunch", lunch);
        return "index";
    }
}