# 🌿 감정일기

> 하루의 감정을 기록하고 돌아볼 수 있는 감정 기반 일기 서비스

감정일기는 사용자가 하루의 감정과 일기를 기록하고,
지난 기록을 통해 자신의 감정 흐름을 돌아볼 수 있도록 만드는
웹 기반 감정 기록 서비스입니다.

현재 Spring Boot 기반의 REST API와 React 프론트엔드를
하나의 프로젝트에서 개발하고 있습니다.

---

## 📌 프로젝트 소개

바쁜 일상 속에서 자신의 감정을 기록하고 돌아볼 수 있는
간단한 감정일기 서비스를 만드는 것을 목표로 합니다.

단순한 CRUD 구현에 그치지 않고,

- 회원 관리
- 감정 선택
- 일기 작성 및 조회
- 감정 통계
- 감정 변화 시각화

등을 단계적으로 구현할 예정입니다.

---

## 🛠 기술 스택

### Backend

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Validation
- H2 Database
- Lombok
- Gradle

### Frontend

- React
- Vite
- JavaScript
- HTML5
- CSS3

### Development

- IntelliJ IDEA
- Git
- GitHub
- Postman

---

## 🏗 프로젝트 구조

```text
diary
├── src
│   └── main
│       ├── java
│       │   └── com.back
│       │       ├── member
│       │       ├── diary
│       │       └── emotion
│       │
│       └── resources
│           └── application.properties
│
├── frontend
│   ├── src
│   ├── public
│   ├── package.json
│   └── vite.config.js
│
├── build.gradle
├── settings.gradle
└── README.md

✨ 주요 기능
👤 회원
회원 정보 관리
회원별 일기 관리
📖 일기
일기 작성
일기 목록 조회
일기 상세 조회
일기 삭제
날짜 기준 최신순 정렬
😊 감정

현재 지원하는 감정:

😊 HAPPY
😌 CALM
❤️ LOVE
🙂 NORMAL
😢 SAD
😡 ANGRY
😰 ANXIOUS

📋 개발 진행 상황
Backend
 Spring Boot 프로젝트 생성
 JPA 설정
 H2 Database 설정
 Member Entity
 Diary Entity
 Emotion Enum
 Diary Repository
 Diary Service
 Diary Controller
 일기 생성 API
 일기 목록 조회 API
 일기 상세 조회 API
 일기 삭제 API
Frontend
 React + Vite 프로젝트 생성
 일기 목록 화면
 일기 작성 화면
 일기 상세 화면
 일기 삭제 기능
 Backend API 연동
예정 기능
 회원가입 / 로그인
 Spring Security
 JWT 인증
 일기 수정
 감정 통계
 감정 변화 차트
 월별 감정 캘린더
 감정 검색 / 필터
 반응형 UI
 배포

🔗 API
일기 작성
POST /api/diaries

Request

{
  "memberId": 1,
  "emotion": "HAPPY",
  "title": "오늘의 첫 일기",
  "content": "오늘은 감정일기 프로젝트를 만들었다.",
  "diaryDate": "2026-09-29"
}
회원의 일기 목록 조회
GET /api/diaries?memberId=1
일기 상세 조회
GET /api/diaries/{diaryId}
일기 삭제
DELETE /api/diaries/{diaryId}
🗄 현재 데이터베이스

개발 단계에서는 H2 Database를 사용합니다.

H2 Console:

http://localhost:8080/h2-console

JDBC URL:

jdbc:h2:mem:diary

🎯 프로젝트 목표

이 프로젝트를 통해 다음 기술을 실제 프로젝트에 적용하는 것을 목표로 합니다.

Spring Boot 기반 REST API 설계
Spring Data JPA를 활용한 데이터 접근
DTO를 활용한 요청/응답 분리
Validation을 활용한 입력값 검증
React와 Spring Boot API 연동
회원 인증 및 JWT 구현
Git/GitHub을 활용한 버전 관리
프로젝트 배포 및 운영
