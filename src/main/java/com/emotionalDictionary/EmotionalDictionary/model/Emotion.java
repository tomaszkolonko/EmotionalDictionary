/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.model;

import java.time.Instant;

public class Emotion {
    private String emotion;
    private String description;
    private Instant instant;
    private Frequency frequency;

    public enum Frequency {
        VERY_RARELY, RARELY, SOMETIMES, OFTEN, VERY_OFTEN
    }

    public Emotion(String emotion, String description, Instant instant, Frequency frequency) {
        this.emotion = emotion;
        this.description = description;
        this.instant = instant;
        this.frequency = frequency;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
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
