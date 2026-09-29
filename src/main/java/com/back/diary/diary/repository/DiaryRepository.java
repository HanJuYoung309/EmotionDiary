package com.back.diary.diary.repository;

import com.back.diary.diary.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary,Long> {

    // 해당 회원 일기를 가져오되 날짜가 최신인거 부터
    List<Diary> findAllByMemberIdOrderByDiaryDateDesc(
            Long memberId
    );
}
