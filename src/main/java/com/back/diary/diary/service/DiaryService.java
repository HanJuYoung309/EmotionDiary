package com.back.diary.diary.service;

import com.back.diary.diary.Diary;
import com.back.diary.diary.dto.DiaryCreateRequest;
import com.back.diary.diary.dto.response.DiaryResponse;
import com.back.diary.diary.repository.DiaryRepository;

import com.back.diary.member.Member;
import com.back.diary.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DiaryService {

    private final DiaryRepository diaryRepository;
    private final MemberRepository memberRepository;


    // 일기 생성
    public Long createDiary(DiaryCreateRequest request) {

        // 1. memberId로 회원 조회
        Member member = memberRepository.findById(request.memberId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회원입니다."));


        //2. Diary 객체 생성
        Diary diary = new Diary(
                member,
                request.emotion(),
                request.title(),
                request.content(),
                request.diaryDate()
        );

        diaryRepository.save(diary);

        return diary.getId();
    }

    // 회원의 일기 전체 조회
    @Transactional(readOnly = true)
    public List<DiaryResponse> getDiaries(Long memberId) {

        return diaryRepository
                .findAllByMemberIdOrderByDiaryDateDesc(memberId)
                .stream()
                .map(DiaryResponse::from)
                .toList();
    }

    // 일기 하나 조회
    @Transactional(readOnly = true)
    public DiaryResponse getDiary(Long diaryId) {

        // 1. Id로 일기 찾기
        Diary diary = diaryRepository.findById(diaryId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 일기입니다."));

        return DiaryResponse.from(diary);
    }

    // 일기 삭제
    public void deleteDiary(Long diaryId) {

        Diary diary = diaryRepository.findById(diaryId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 일기입니다."));

        diaryRepository.delete(diary);
    }
}