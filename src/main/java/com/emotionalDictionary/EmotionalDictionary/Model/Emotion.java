/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.Model;

import java.time.Instant;

public class Emotion {
    private String emotionWord;
    private String description;
    private Instant instant;
    private Frequency frequency;

    public enum Frequency {
        VERY_RARELY, RARELY, SOMETIMES, OFTEN, VERY_OFTEN
    }

    // TODO: Why do I need this one?
    public Emotion() {}

    public Emotion(String emotionWord, String description, Instant instant, Frequency frequency) {
        this.emotionWord = emotionWord;
        this.description = description;
        this.instant = instant;
        this.frequency = frequency;
    }

    public Emotion(String emotionWord, String description, Frequency frequency) {
        this(emotionWord, description, Instant.now(), frequency);
    }

    public String getEmotionWord() {
        return emotionWord;
    }

    public void setEmotionWord(String emotionWord) {
        this.emotionWord = emotionWord;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}
