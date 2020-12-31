package com.emotionalDictionary.EmotionalDictionary.Mapper;

import com.emotionalDictionary.EmotionalDictionary.Model.Emotion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmotionMapper {
    @Select("SELECT * FROM EMOTIONS")
    List<Emotion> getAllEmotions();

    @Insert("INSERT INTO EMOTIONS (emotionword, description, localDateTime, frequency) VALUES (#{emotionWord}, #{description}, #{localDateTime} , #{frequency})")
    @Options(useGeneratedKeys = true, keyProperty = "emotionId")
    int insert(Emotion emotion);
}
