/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2020.
 */

package com.emotionalDictionary.EmotionalDictionary.Service;

import com.emotionalDictionary.EmotionalDictionary.Model.Emotion;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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

    public List<Emotion> getListOfEmotions() {
        return listOfEmotions;
    }

    public void addToEmotionList(Emotion emotion) {
        listOfEmotions.add(emotion);
    }

    private void populateFirstEdition() {
        listOfEmotions.add(new Emotion("accepting", "Tolerant without protest",
                Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("baffled", "Frustrated or perplexed",
                Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("confused", "Unable to think with clarity or act intelligently",
                Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("dainty", "Delicately beautiful",
                Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("fidgety", "Nervous and unable to relax",
                Emotion.Frequency.RARELY));
        listOfEmotions.add(new Emotion("inconspicuous", "Invisible; not prominent or readily noticeable",
                Emotion.Frequency.RARELY));
    }
}
