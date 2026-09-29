# 🌿 감정일기

### 오늘의 감정을 기록하고, 나의 마음을 돌아보는 일기 서비스

> 하루의 감정과 생각을 기록하고  
> 시간이 지나 다시 나의 감정 흐름을 돌아볼 수 있는  
> **감정 기반 웹 일기 서비스**입니다.

<br>

## 📖 About

**감정일기**는 단순히 글을 작성하는 일기를 넘어  
사용자가 자신의 감정을 함께 기록하고 돌아볼 수 있도록 만드는 프로젝트입니다.

일기를 작성할 때 현재의 감정을 선택하고,

**기록 → 조회 → 감정 분석 → 회고**

로 이어지는 경험을 만드는 것을 목표로 합니다.

현재는 Spring Boot 기반 REST API와 React를 사용하여  
Backend와 Frontend를 함께 개발하고 있습니다.

<br>

---

# ✨ Features

### 📝 Diary

- 일기 작성
- 일기 목록 조회
- 일기 상세 조회
- 일기 삭제
- 날짜 기준 최신순 정렬

### 💭 Emotion

일기를 작성할 때 현재의 감정을 함께 기록합니다.

| Emotion | 감정 |
|:---:|:---:|
| 😊 | HAPPY |
| 😌 | CALM |
| ❤️ | LOVE |
| 🙂 | NORMAL |
| 😢 | SAD |
| 😡 | ANGRY |
| 😰 | ANXIOUS |

### 👤 Member

- 회원별 일기 관리
- 회원과 일기 데이터 연관관계 구성

<br>

---

# 🛠 Tech Stack

### Backend

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.1-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![JPA](https://img.shields.io/badge/Spring%20Data%20JPA-59666C?style=flat-square)
![Gradle](https://img.shields.io/badge/Gradle-8.x-02303A?style=flat-square&logo=gradle&logoColor=white)

### Frontend

![React](https://img.shields.io/badge/React-19-61DAFB?style=flat-square&logo=react&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-7-646CFF?style=flat-square&logo=vite&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?style=flat-square&logo=javascript&logoColor=black)

### Database

![H2](https://img.shields.io/badge/H2-Database-09476B?style=flat-square)

### Tools

![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=flat-square&logo=postman&logoColor=white)

<br>

---

# 🏗 Architecture

```text
┌───────────────────────────────────────────┐
│                  Client                   │
│                 React                     │
└─────────────────────┬─────────────────────┘
                      │
                      │ REST API
                      ▼
┌───────────────────────────────────────────┐
│              Spring Boot                  │
│                                           │
│   Controller → Service → Repository       │
│                                           │
│        DTO / Entity / Validation           │
└─────────────────────┬─────────────────────┘
                      │
                      ▼
┌───────────────────────────────────────────┐
│               H2 Database                 │

└───────────────────────────────────────────┘

📂 Project Structure
diary/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.back/
│       │       │
│       │       ├── member/
│       │       │   ├── Member.java
│       │       │   └── repository/
│       │       │
│       │       ├── diary/
│       │       │   ├── Diary.java
│       │       │   ├── controller/
│       │       │   ├── service/
│       │       │   ├── repository/
│       │       │   └── dto/
│       │       │
│       │       └── emotion/
│       │           └── Emotion.java
│       │
│       └── resources/
│           └── application.properties
│
├── frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── vite.config.js
│
├── build.gradle
├── settings.gradle
└── README.md

📋 Development Status
Backend
 Spring Boot 프로젝트 생성
 Gradle 설정
 H2 Database 설정
 JPA 설정
 Member Entity
 Diary Entity
 Emotion Enum
 Diary Repository
 Diary Service
 Diary Controller
 Diary Create API
 Diary List API
 Diary Detail API
 Diary Delete API
Frontend
 React + Vite 프로젝트 생성
 기본 Layout
 일기 목록 화면
 일기 작성 화면
 일기 상세 화면
 일기 삭제
 Backend API 연동
🔜 Coming Soon
 일기 수정
 회원가입
 로그인
 Spring Security
 JWT 인증
 감정 통계
 감정 변화 Chart
 월별 감정 Calendar
 감정 검색 / 필터
 반응형 UI
 AWS 배포
<br>
💡 Troubleshooting

프로젝트를 개발하면서 발생한 문제와 해결 과정을 기록합니다.

H2 Console 설정

Spring Boot에서 H2 Console을 활성화하고
개발 단계에서 DB와 Entity가 정상적으로 매핑되었는지 확인할 수 있도록 구성했습니다.

🎯 Goals

이 프로젝트를 통해 다음과 같은 기술을 직접 적용하고 경험하는 것을 목표로 합니다.

Backend
Spring Boot REST API 설계
Spring Data JPA
Entity 연관관계
DTO 설계
Validation
Exception Handling
Spring Security
JWT Authentication
Frontend
React Component 설계
REST API 연동
상태 관리
Form 처리
사용자 경험을 고려한 UI 구현
DevOps
Git / GitHub
API 테스트
AWS 배포
프로젝트 CI/CD
<br>

🌱 앞으로

감정일기를 단순한 CRUD 프로젝트에서 끝내지 않고,

"내가 오늘 어떤 감정을 느꼈고, 시간이 지나면서 내 마음은 어떻게 변했는지"


👩‍💻 Developer

주영

Java · Spring Boot Backend Developer를 목표로
직접 설계하고 구현하며 프로젝트를 발전시키고 있습니다.



![Diary Write](./docs/images/diary-write.png)

## 📖 Diary List

![Diary List](./docs/images/diary-list.png)
