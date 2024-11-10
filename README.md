## [Section02](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9802.md)
- 이야기 - 자바 진영의 추운 겨울과 스프링의 탄생 
- 스프링이란? 
- 좋은 객체 지향 프로그래밍이란? 
- 좋은 객체 지향 설계의 5가지 원칙(SOLID)
- 객체 지향 설계와 스프링

## [Section03](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9803.md)
- 프로젝트 생성 
- 비즈니스 요구사항과 설계 
- 회원 도메인 설계
- 회원 도메인 개발
- 회원 도메인 실행과 테스트
- 주문과 할인 도메인 설계
- 주문과 할인 도메인 개발
- 주문과 할인 도메인 실행과 테스트

> 프로젝트 선택
- project: Gradle Project
- Spring Boot: 3.3.x
- Language: Java
- Packaging: Jar
- Java: 17

> Project Metadata
- groupId: hello
- artifactId: core

## [Section04](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9804.md)
- 새로운 할인 정책 개발]
- 새로운 할인 정책 적용과 문제점
- 관심사의 분리
- AppConfig 리팩터링
- 새로운 구조와 할인 정책 적용
- 전체 흐름 정리
- 좋은 객체 지향 설계의 5가지 원칙의 적용
- IoC, DI, 그리고 컨테이너
- 스프링으로 전환하기

## [Section05](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9805.md)
- 스프링 컨테이너 생성
- 컨테이너에 등록된 모든 빈 조회
- 스프링 빈 조회 - 기본
- 스프링 빈 조회 - 동일한 타입이 둘 이상
- 스프링 빈 조회 - 상속 관계
- BeanFactory와 ApplicationContext
- 다양한 설정 형식 지원 - 자바 코드, XML
- 스프링 빈 설정 메타 정보 - BeanDefinition

## [Section06](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9806.md)
- 웹 애플리케이션과 싱글톤
- 싱글톤 패턴
- 싱글톤 컨테이너
- 싱글톤 방식의 주의점
- @Configuration과 싱글톤
- @Configuration과 바이트코드 조작의 마법

## [Section07](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9807.md)
- 컴포넌트 스캔과 의존관계 자동 주입 시작하기
- 탐색 위치와 기본 스캔 대상
- 필터
- 중복 등록과 충돌

## [Section08](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9808.md)
- 다양한 의존관계 주입 방법
- 옵션 처리
- 생성자 주입을 선택해라! 
- 롬복과 최신 트랜드
- 조회 빈이 2개 이상 - 문제
- @Autowired 필드 명, @Qualifier, @Primary
- 애노테이션 직접 만들기
- 조회한 빈이 모두 필요할 때, List, Map
- 자동, 수동의 올바른 실무 운영 기준

## [Section09](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9809.md)
- 빈 생명주기 콜백 시작
- 인터페이스 InitializingBean, DisposableBean
- 빈 등록 초기화, 소멸 메서드 지정
- 애노테이션 @PostConstruct, @PreDestroy

## [Section10](https://github.com/iieunji023/spring-core/blob/main/%EC%84%B9%EC%85%9810.md)
9. 빈 스코프
- 빈 스코프란?
- 프로토타입 스코프
- 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 문제점
- 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 Provider로 문제 해결
- 웹 스코프
- request 스코프 예제 만들기
- 스코프와 Provider
- 스코프와 프록시