package com.back.diary.diary;

import com.back.diary.emotion.Emotion;
import com.back.diary.member.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String title;

    @Lob
    private String content;

    @Enumerated(EnumType.STRING)
    private Emotion emotion;

    private LocalDate diaryDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // 일기 생성용 생성자
    public Diary(
            Member member,
            Emotion emotion,
            String title,
            String content,
            LocalDate diaryDate
    ) {
        this.member = member;
        this.emotion = emotion;
        this.title = title;
        this.content = content;
        this.diaryDate = diaryDate;
    }
}