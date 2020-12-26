/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping()
    public String loginView() {
        return "login";
    }
}

