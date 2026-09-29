package com.back.diary.diary.dto;


import com.back.diary.emotion.Emotion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DiaryCreateRequest(

        @NotNull
        Long memberId,

        @NotNull
        Emotion emotion,

        @NotBlank
        String title,

        @NotBlank
        String content,

        @NotNull
        LocalDate diaryDate
) {
}