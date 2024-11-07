package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        
        // 1, 조회: 호출할 때마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();
        // 2, 조회: 호출할 때마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();

        // 참조값이 다른 것을 확인
        System.out.println("memberService1= " + memberService1);
        System.out.println("memberService2= " + memberService2);

        // memberService1과 memberService2는 다른 객체이므로 달라야 true
        // 테스트를 할 때는 위 코드처럼 sout으로 출력하기보다 자동화되게 만들어야 함
        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }
}