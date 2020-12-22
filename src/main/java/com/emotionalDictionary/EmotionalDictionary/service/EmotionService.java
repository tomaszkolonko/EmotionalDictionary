/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.service;

import com.emotionalDictionary.EmotionalDictionary.model.Emotion;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmotionService {
    List<Emotion> listOfEmotions;

    @PostConstruct
    public void postConstruct() {
        listOfEmotions = new ArrayList<>();
        populateFirstEdition();
    }

    private void populateFirstEdition() {
        listOfEmotions.add(new Emotion("accepting", "Tolerant without protest",
                Instant.now(), Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("baffled", "Frustrated or perplexed",
                Instant.now(), Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("confused", "Unable to think with clarity or act intelligently",
                Instant.now(), Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("dainty", "Delicately beautiful",
                Instant.now(), Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("fidgety", "Nervous and unable to relax",
                Instant.now(), Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("inconspicuous", "Invisible; not prominent or readily noticeable",
                Instant.now(), Emotion.Frequency.RARELY));
    }

    public List<Emotion> getListOfEmotions() {
        return listOfEmotions;
    }

    public void addToEmotionList(Emotion emotion) {
        listOfEmotions.add(emotion);
    }
}
