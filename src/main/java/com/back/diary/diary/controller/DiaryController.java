package com.back.diary.diary.controller;

import com.back.diary.diary.dto.DiaryCreateRequest;
import com.back.diary.diary.dto.response.DiaryResponse;
import com.back.diary.diary.service.DiaryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/diaries")
public class DiaryController {

    private final DiaryService diaryService;

    // 일기 생성
    @PostMapping
    public ResponseEntity<Long> createDiary(
            @Valid @RequestBody DiaryCreateRequest request
    ) {

        Long diaryId = diaryService.createDiary(request);

        return ResponseEntity
                .created(URI.create("/api/diaries/" + diaryId))
                .body(diaryId);
    }

    // 회원의 일기 전체 조회
    @GetMapping
    public ResponseEntity<List<DiaryResponse>> getDiaries(
            @RequestParam Long memberId
    ) {

        List<DiaryResponse> diaries =
                diaryService.getDiaries(memberId);

        return ResponseEntity.ok(diaries);
    }

    // 일기 상세 조회
    @GetMapping("/{diaryId}")
    public ResponseEntity<DiaryResponse> getDiary(
            @PathVariable Long diaryId
    ) {

        DiaryResponse diary =
                diaryService.getDiary(diaryId);

        return ResponseEntity.ok(diary);
    }

    // 일기 삭제
    @DeleteMapping("/{diaryId}")
    public ResponseEntity<Void> deleteDiary(
            @PathVariable Long diaryId
    ) {

        diaryService.deleteDiary(diaryId);

        return ResponseEntity.noContent().build();
    }
}