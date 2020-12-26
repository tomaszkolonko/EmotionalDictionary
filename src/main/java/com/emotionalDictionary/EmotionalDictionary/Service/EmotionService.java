package com.emotionalDictionary.EmotionalDictionary.Service;

import com.emotionalDictionary.EmotionalDictionary.Mapper.EmotionMapper;
import com.emotionalDictionary.EmotionalDictionary.Model.Emotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmotionService {

    private EmotionMapper emotionMapper;

    public EmotionService(EmotionMapper emotionMapper) {
        this.emotionMapper = emotionMapper;
    }

    public List<Emotion> getListOfEmotions() {
        return emotionMapper.getAllEmotions();
    }

    public void addToEmotionList(Emotion emotion) {
        emotionMapper.insert(emotion);
    }
}
