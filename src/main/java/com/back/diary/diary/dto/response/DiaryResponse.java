package com.back.diary.diary.dto.response;

import com.back.diary.diary.Diary;
import com.back.diary.emotion.Emotion;


import java.time.LocalDate;

public record DiaryResponse(
        Long id,
        Long memberId,
        Emotion emotion,
        String title,
        String content,
        LocalDate diaryDate
) {

    public static DiaryResponse from(Diary diary) {

        return new DiaryResponse(
                diary.getId(),
                diary.getMember().getId(),
                diary.getEmotion(),
                diary.getTitle(),
                diary.getContent(),
                diary.getDiaryDate()
        );
    }
}