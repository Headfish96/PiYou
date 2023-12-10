# 피유(Piyou)

<div align="center">
<h1>🏆 SSAFY 9기 자율 프로젝트 전국 1등 🏆</h1> 
  <br />
  <img src="https://github.com/Headfish96/PiYou/assets/41338713/246ab400-5a59-41ac-abf5-067827482ce4" width="700" height="550"/>
  <br />
</div>
<div align="center">
 <h3><b>피유(PiYou)</b></h3>
 OnDevice-AI를 활용한 아동 생활습관 개선 서비스<br>
 미러링과 모션인식을 통한 상호작용<br>
  </b><br><br>
  <br>
</div>

## 목차

- [프로젝트 소개](#프로젝트-소개)
- [기획 배경](#기획-배경)
- [주요 기능](#주요-기능)
- [팀원 소개](#팀원-소개)
- [사용 기술](#사용-기술)
- [릴리즈 히스토리(패치노트)](#릴리즈-히스토리)

## 프로젝트 소개
- 프로젝트 명: 피유(Piyou) / SSAFY 9기 2학기 자율 프로젝트
- 🗓️ 프로젝트 기간: 2023.10.10 ~ 2023.11.30
- 개발 엔진 및 언어: Unity, C#, SpringBoot
- 멤버: 팀장 최하영(권소정, 이다영, 이지영, 인영교, 정민)
### :movie_camera: 소개 영상
<div align="center">
<a href="https://youtu.be/uulgX3FKP8o" target="_blank">
   <img width="480" height="270" alt="image" src="https://github.com/Headfish96/PiYou/assets/41338713/4fabff13-4a3a-4aca-b540-3e29b4f1de5a">
</a>
</div>

## 기획 배경
오늘날 아동들이 영상을 두고 식사를 하는 것, 양치를 잘 하지 않는 문제를 해결하는 방안을 모색함.</br>
이를 위해 아동들, 그 부모님들, 유치원 교사들, 아동 전문가들의 자문을 거쳐 서비스를 개발하였음.
- 미러링을 통해 아동들은 본인의 모습을 보며 주체라고 인식함
- 상호작용을 통해 서비스를 즐겁게 사용할 수 있음
- 워치를 통해 식사 중, 양치 중의 습관 뿐아니라 언제 식사를 하고 언제 양치를 해야하는지 그 시기까지 습관화 시킴.</br>
이를 통해 올바른 생활습관을 학습시켜 부모님의 육아 스트레스를 경감시키는 것이 최종 목표임.

## 주요 기능

|                             홈                              |                            먹방                             |                            양치                             |                               모자 꾸미기                               |
| :---------------------------------------------------------: | :---------------------------------------------------------: | :---------------------------------------------------------: | :---------------------------------------------------------------------: |
| ![메인](/README/about_app/main.png) | ![먹방](/README/about_app/eat.png) | ![양치](/README/about_app/tooth_brush.png) | ![모자꾸미기](/README/about_app/accessory.png) |

미러링을 통해 아동들은 본인의 모습을 보며 행위의 주체하고 인식이 가능하며,</br>
OnDevice-AI를 통한 모션인식으로 상호작용하며 올바른 생활습관을 만들어갈 수 있음.

### 1. 먹방 형식을 차용한 식사게임
  - 기존 영상을 보며 식사를 하는 아이들의 문제점을 해결하기 위해 ‘먹방'의 컨셉을 도입
  - 아이의 모션을 인식해 캐릭터도 같이 식사를 하고, 아이의 식사 속도를 측정하여 올바르게 먹고 있다면 칭찬을,
  - 너무 빨리 먹거나 느리게 먹는다면 TTS를 통한 알림으로 올바르게 식사하도록 유도함. 

### 2. 세계 여행 컨셉의 양치 게임
  - ‘먹방' 처럼 본인의 모습을 볼 수 있고 이에 더하여 양치를 하면 캐릭터와 같이 세계여행하는 듯한 느낌을 받을 수 있도록</br> 양치 진행도를 측정해 국가와 랜드마크가 등장.
  - 양치의 경우 아이가 어디를 어떻게 닦야하는지 음성 TTS로 안내함.
  - 모바일, 갤럭시 워치를 통한 알람
  - 식사 중, 양치 중의 습관 뿐아니라 언제 식사를 하고 양치를 해야하는지 그 시기까지 모바일과 워치를 통해 알림.

### 3. 수집요소
  - 캐릭터 수집, 커스터마이징, 배경 선택 기능을 통해 사용자가 지속적으로 서비스를 이용하도록 유도함.

## :family: 팀 소개
[만든사람들](/README/developer/developer.mp4)

|**[최하영](https://github.com/Headfish96)**|**[정민](https://github.com/JeongMiiiin)**|**[인영교](https://github.com/yeongkyo1997)**|**[이다영](https://github.com/dayoung100)**|**[권소정](https://github.com/gleehave)**|**[이지영](https://github.com/bigstar017)** |
| :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: |
| [<img src="https://avatars.githubusercontent.com/u/41338713?v=4" width="800">](https://github.com/Headfish96) | [<img src="https://avatars.githubusercontent.com/u/112797177?v=4" width="800">](https://github.com/JeongMiiiin) | [<img src="https://avatars.githubusercontent.com/u/54164709?v=4" width="800">](https://github.com/yeongkyo1997) | [<img src="https://avatars.githubusercontent.com/u/53906423?v=4" width="800">](https://github.com/dayoung100) | [<img src="https://avatars.githubusercontent.com/u/122436557?v=4" width="800">](https://github.com/nachocatee) | [<img src="https://avatars.githubusercontent.com/u/28944196?v=4?v=4" width="800">](https://github.com/xkagja2006) |
|BackEnd/팀장|FrontEnd|BackEnd|FrontEnd|FrontEnd|FrontEnd|


## 사용 기술

## :wrench: 기술스택

### Client

- `Unity 2022.3.11`
- `MediaPipeUnityPlugin 0.12.0`
- `Vue.js`
- `Vite 3.3.4`
- `Node.js 18.16.1`

### Server

- `SpringBoot 2.7.16`
- `Spring Data JPA`
- `Gradle 8.3`
- `lombok`

### DB

- `MySQL 8.33`

### Infra

- `Ubuntu 20.04.6`
- `Nginx 18.0`
- `AWS EC2`
- `Docker 24.0.7`
- `Docker Compose 2.5.0`

### 외부 API
- `Firebase 7.1.0`

### **Communication**

- `JIRA`
- `Notion`
- `GitLab`
- `Git`
- `Mattermost`

### 주요 기술

![미디어_파이프](/README/tech_intro/mediapipe.png)

![컨벡스_헐](/README/tech_intro/convex_hull.png)

## 릴리즈 히스토리

| 2023-11-03                                                                                                                                                                                | 2023-11-04                                                                                                                                     | 2023-11-06                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| [![1103patchImg](/README/fetch_note/1103pactch.png)](https://piyou.notion.site/PiYou-1010e0122928411cbac97884d75ad5e2) | [![1104patchImg](/README/fetch_note/1104patch.png)](https://piyou.notion.site/11-4-0228d5c7e34a4c2793dcbdb3a7c19fd9) | [![1106patchImg](/README/fetch_note/1106patch.png)](https://piyou.notion.site/11-6-PiYou-e47d18dfa28d4b0bae6b3609cf866463) |

| 2023-11-08                                                                                                                                               | 2023-11-14                                                                                                                                      | 2023-11-15                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [![1108patchImg](/README/fetch_note/1108patch.png)](https://piyou.notion.site/11-8-Ver-1-0-0-94a5fab7776645028f20f744cdb8d3c8) | [![1114patchImg](/README/fetch_note/1114patch.png)](https://piyou.notion.site/11-14-03d08b3ac31a4996a258bcae275e0c94) | [![1115patchImg](/README/fetch_note/1115patch.png)](https://piyou.notion.site/11-15-Ver-2-0-0-e820af624e7e496aa47da6bc7c85d362) |




</div>

