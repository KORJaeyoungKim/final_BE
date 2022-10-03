# 멍냥마켓
## ![image](https://user-images.githubusercontent.com/72599761/193500030-784be94c-d5c9-438f-b4af-2adce019af44.png) 프로젝트 소개
![image](https://user-images.githubusercontent.com/72599761/193499776-c528e11a-fa77-47f8-a7d7-65b40d1f4f71.png)

![image](https://user-images.githubusercontent.com/72599761/193501894-dc660188-fafa-48b8-bd03-52fb13e6e9ad.png)  소중한 반려동물을 위해, 안 쓰는 반려동물 용품, 멍냥마켓에서 손쉽게 직거래하세요!  <br> 
![image](https://user-images.githubusercontent.com/72599761/193501899-201d9b77-64c1-48bd-9cc5-c21c68319bfd.png)  반려동물의 취향에 맞지 않는 물건들이 있거나, 방치되고 있는 반려동물 용품들이 있다면, 사진을 올려 판매 가능한 웹 애플리케이션<br> 

### [멍냥마켓 바로가기](https://meongnyang-market.com/)
#### [Front-End Github](https://github.com/Hanhae99-final-3team/final_FE)
#### [Back-End Github](https://github.com/Hanhae99-final-3team/final-be)
<br>
<hr>
<br>

## ⚙️ 서비스 아키텍처 
![image](https://user-images.githubusercontent.com/72599761/193501534-683c0049-c673-4105-af83-a86e8aee8965.png)

<br>
<hr>
<br>

## 📅 프로젝트 기간   

기간 : 2022년 8월 26일 ~ 2022년 10월 7일(6주)

<br>
<hr>
<br>

## ✨ 주요 기능 => 표로 정리해서 보여주기 

<br>
<hr>
<br>

## 🛠 기술 스택

<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 
  <img src="https://img.shields.io/badge/Spring boot-6DB33F?style=for-the-badge&logo=Spring boot&logoColor=black"> 
  <br> 

  <img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=black"> 
  <img src="https://img.shields.io/badge/Kakao Login-FFCD00?style=for-the-badge&logo=Kakao Login&logoColor=black"> 
  <img src="https://img.shields.io/badge/Json web tokens-000000?style=for-the-badge&logo=Json web tokens&logoColor=white"> 
  <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"> 
  <br>
  
  <img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> 
  <img src="https://img.shields.io/badge/amazonec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
  <img src="https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/amazonS3-569A31?style=for-the-badge&logo=amazons3&logoColor=white"> 
  <br>
  
  <img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white"> 
  <img src="https://img.shields.io/badge/sourcetree-0052CC?style=for-the-badge&logo=sourcetree&logoColor=white"> 
  <img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white"> 
  <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white"> 
  <img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"> 
  <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"> 
  <br> 

  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  <br> 
    

  <br>
</div>

<br>
<hr>
<br> 

## 🗺 API 설계 

### [API 설계 보러가기](https://heather-warbler-33c.notion.site/API-fb817bdee95f4d03bf54e69108d0dfa8)

<br>
<hr>
<br>

## 📝 ERD 설계 

### [ERD 설계 보러가기](https://www.erdcloud.com/d/uJr3xXdEqhSJFLha3)

<br>
<hr>
<br>

## 🔨 기술 도입 이유 등  

### 1) 라이브러리 
|기술|도입 이유|
|---|---|
|redux-toolkit|렌더링을 줄이고자 컴포넌트를 최대한 분리하여 전체 컴포넌트 구조를 설계했습니다. 컴포넌트 내에서 상태 관리를 했을 때  복잡한 컴포넌트 구조로 인해 props drilling이 심하게 발생함을 느꼈습니다. 이에 대한 해결 방안으로 전역 상태 관리 라이브러리인 redux toolkit을 선택하게 되었습니다.  <br> redux toolkit은 redux보다 보일러 플레이트도 적고, redux를 쓰기 위해서는 다른 라이브러리가 많이 필요한데, 예를 들어 immer를 쓰지 않아도 불변성을 유지할 수 있고, redux thunk가 내장 되어 있어 비동기 통신에 유리하다는 장점을 가지고 있습니다.|
|axios|axios는 XSRF를 보장해주고, axios는 자동으로 JSON데이터 형식으로 변환되지만 fetch는 XSRF를 보장해주지 않고, json() 메서드를 매번 사용해야 한다는 단점이 존재합니다. <br><br> interceptor로 요청이나 응답을 가로채는 것이 가능한데 토큰이 만료되서 403에러가 나면 자동으로 로그아웃이 될 수 있게끔 기능을 구현할 수 있기 때문에 선택하게 되었습니다.|
|react-hook-form|리액트로 form을 다루기 위해서는 많은 보일러 플레이트 코드가 필요하다는 단점이 존재합니다. (유저 입력 값의 상태를 관리하고 검증하기, 유효하지 않은 에러 메세지를 추적하, 폼 제출 다루기 등) <br><br> form을 다루는 라이브러리 중 formik와 react-hook-form 중에서 고민했는데, formik은 단순하고 간결하다는 장점이 있지만, 전체 form을 watch하고, 다른 의존 라이브러리도 같이 써야 한다는 단점이 존재합니다. <br> 반면 react-hook-form은 독립된 라이브러리로 존재하고 각각의 input을 watch한다는 장점이 있고, 성능이나 속도 면에서 우수하기 때문에 react-hook-form을 사용하게 되었습니다.|
|styled-components|기존 css는 전역으로 관리하고, 모듈화가 미흡하기 때문에 유지보수가 오래걸린다는 단점이 있습니다. styled-components는 document 레벨로 전역으로 관리하는 것이 아니라 컴포넌트 레벨로 관리(모듈화)가 가능하기 때문에 유지보수가 편하다는 장점이 있습니다. <br> 또한 CSS-in-Js는 자바스크립트 환경을 최대한 활용할 수 있다는 장점이 있습니다. 리액트에서 props를 활용하여 조건부 스타일링이 가능하다는 장점이 있기 때문에 선택하게 되었습니다. |
|AWS cloudfront|CloudFront는 AWS에서 제공하는 CDN 서비스 입니다. 멍냥마켓에서 유저의 현재 위치를 받아오기 위해서는 HTTPS를 사용해야만 했습니다. S3는 HTTP만 지원이 되는 반면에 cloud front는SSL인증서를 발급받으면 HTTPS로 리다이렉트가 가능하다는 장점이 있었습니다. 그리고 CDN을  통한 페이지 응답 속도가 빠르기 때문에 사용하게 되었습니다. |
|AWS S3|비용적으로 최적화되어 있으며 저장용량이 무한대이며 파일 저장에 최적화되어있어 상품(게시글) 작성 시 이미지 업로드를 위하여 사용하게 되었습니다.|
|react-intersection-observer|무한스크롤을 구현하기 위해 scroll 이벤트를 이용하는 경우도 있지만 성능 상의 단점으로 인하여 observer를 생성해주는 react-intersection-observer를 사용하였습니다. |
|document.cookie|로그인한 유저가 마이페이지에서 최근에 본 상품 페이지에 접속했을 때 최근에 본 상품들의 리스트를 보기 위해서는 페이지 방문 기록을 저장하여 서버에 보내기 위해 도입했습니다. |
|react-slick과 slick-carousel|직접 이미지 슬라이더를 구현했지만, 디자인이나 성능 면에서 부족함을 느꼈고, 제한된    시간 내에서 프로젝트 완성도를 높이고자 이미지 슬라이더 라이브러리로 구현하게 되었습니다. |
|uuidv4|랜덤으로 id를 자동 생성해주는 라이브러리. 이미지 url 리스트를 서버에서 받아올 때 이미지 url 각각에 대한 id값이 존재하지 않아서 unique "key" props Error가 발생하게 되었습니다. 이 에러를 해결하고자 각각의 이미지 태그에 대해서 key값을 부여해줌으로써 에러 해결이 가능합니다. |
|SockJs|sockt.io는 인터넷 익스플로러 구버전의 사용자는 websocket으로 작성된 웹 페이지를 볼 수 없고, 또한 node-js에 종속적이기 때문에 서버가 node-js로 구현된 경우에 가능하다는 단점이 있습니다.Spring 서버에 종속적인 socketJS를 활용하기로 했고, 또한 인터넷 버전에 상관없이 socket 통신이 가능함으로 선택했습니다.|
|webstomp|현재 프로젝트의 경우 1대1 채팅이지만 방이 여러개가 생성되어야 함으로 단순 socketjs로 만으로는 구현하기 힘들기 때문에 pub/sub 구조로 1대1 채팅 + 여러개 방을 생성할 수 있는 webstomp를 사용하기로 결정했습니다. 현 프로젝트의 컨셉에 맞게 1대1 채팅 , 여러개의 방 생성 , 브라우저간 호환성에 관점에서 봤을때 가장 적절한 라이브러리라 선택하게 되었습니다. |

※ SockJs, webstomp 채팅기능은 구현 중에 있습니다. 

### 2) 기술적 의사 결정 

<br>
<hr>
<br>

## 🎯 트러블 슈팅 

### 1. 검색어 자동 완성 API call 최소화 

|구분|설명|
|---|---|
|문제상황|빠르게 많은 텍스트를 input창에 입력하면 자동완성 API로 받아오는 응답값에 블링킹 현상이 발생|
|문제원인|예를 들어 ‘고양이’이라는 단어를 입력하는데 api call이 onChange마다 일어나서 16번이 호출이 되었습니다.|
|문제해결|사용자가 타이핑을 할 때마다 API를 호출하게 되면 짧은 시간 동안 너무 많은 API를 호출하게 되고 이는 네트워크 트래픽 증가로 이어지므로 검색 성능을 향상 시키기 위해 커스텀 훅 useDebounce를 만들어서 적용했습니다. <br> setTimeout으로 마지막 이벤트 발생 이후 350ms 동안 추가 이벤트가 발생하지 않을 경우 debounce 콜백 함수 실행하도록 코드를 작성했습니다. 이를 통해 타이핑을 할 때마다 axios 통신이 발생하는 것을 방지할 수 있었습니다.|
|해결결과|예를 들어 ‘고양이’이라는 단어를 입력했을 때 네트워크 트래픽을 보면 onChange로는 api call이 16번 일어났다면, useDebounce를 적용했을 때 api call이 2번으로 줄어들었습니다. 이로써, 네트워크 트래픽량도 1/8로 감소됨을 확인할 수 있었습니다. |

##### Debounce 적용 전/후
|적용 전|적용 후|
|---|---|
|![debounce적용전_네트워크 트래픽](https://user-images.githubusercontent.com/72599761/193569214-0ebc9139-0fb2-4ad7-8c3c-8ecf8d0487b8.gif)|![debounce적용후_네트워크 트래픽](https://user-images.githubusercontent.com/72599761/193569257-4cf4a103-64d7-4b26-87e3-1c8cf2765f47.gif)|



<br>
<hr>
<br>

## 👩‍💻 유저 피드백 및 개선 사항 

<br>
<hr>
<br>

## 🐶 추가하고 싶은 기능 

<br>
<hr>
<br>

## 👨‍👩‍👧 팀원 소개  

|이름|깃허브 주소|포지션|
|---|---|---|
|김수정|[crystal993의 github](https://github.com/crystal993)|Frontend|
|김주형|[KoreanCodingMachine의 github](https://github.com/KoreanCodingMachine)|Frontend|
|이회섭|[HoisubLee의 github](https://github.com/HoisubLee)|Backend|
|김재영|[fabius96의 github](https://github.com/fabius96)|Backend|
|한종혁|[1argeD의 github](https://github.com/1argeD)|Backend|
|양명현|[thisLife-hyeon의 github](https://github.com/thisLife-hyeon)|UI/UX|


<br>
<hr>
<br>
