/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.Controller;

import com.emotionalDictionary.EmotionalDictionary.Model.Emotion;
import com.emotionalDictionary.EmotionalDictionary.Service.EmotionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/emotions")
    public String addEmotion(Emotion emotion, Model model) {
        Emotion newEmotion = new Emotion(emotion.getEmotionWord(), emotion.getDescription(),
                Emotion.Frequency.SOMETIMES);

        emotionService.addToEmotionList(newEmotion);

        model.addAttribute("emotions", emotionService.getListOfEmotions());

        emotion.setEmotionWord("");
        emotion.setDescription("");

        return "emotions";
    }
}
