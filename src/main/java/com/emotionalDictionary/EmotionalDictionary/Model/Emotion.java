package com.emotionalDictionary.EmotionalDictionary.Model;

import java.time.LocalDateTime;

public class Emotion {
    private Integer emotionId;
    private String emotionWord;
    private String description;
    private LocalDateTime localDateTime;
    private Frequency frequency;

    public enum Frequency {
        VERY_RARELY, RARELY, SOMETIMES, OFTEN, VERY_OFTEN
    }

    // TODO: Why do I need this one?
    public Emotion() {}

    public Emotion(Integer emotionId, String emotionWord, String description, LocalDateTime instant, Frequency frequency) {
        this.emotionId = emotionId;
        this.emotionWord = emotionWord;
        this.description = description;
        this.localDateTime = instant;
        this.frequency = frequency;
    }

    public Emotion(Integer emotionId, String emotionWord, String description, Frequency frequency) {
        this(emotionId, emotionWord, description, LocalDateTime.now(), frequency);
    }

    public Integer getEmotionId() {
        return emotionId;
    }

    public void setEmotionId(Integer emotionId) {
        this.emotionId = emotionId;
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}
