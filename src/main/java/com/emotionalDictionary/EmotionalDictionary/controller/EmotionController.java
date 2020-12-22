/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.controller;

import com.emotionalDictionary.EmotionalDictionary.model.Emotion;
import com.emotionalDictionary.EmotionalDictionary.service.EmotionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmotionController {

    EmotionService emotionService;

    public EmotionController(EmotionService emotionService) {
        this.emotionService = emotionService;
    }

    @GetMapping("/emotions")
    public String showEmotionPage(Emotion emotion, Model model) {
        model.addAttribute("emotions", emotionService.getListOfEmotions());
        return "emotions";
    }
}
