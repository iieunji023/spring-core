package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// 설정 정보이므로 @Configuration
@Configuration
// 스프링 빈을 긁어서 자동으로 스프링 빈을 끌어올리기 위함
// Configuration 어노테이션이 붙은 애들을 다 빼겠다
// -> AppConfig도 Configuration 어노테이션 붙어있는데 이럴 경우 충돌이 날 수 있음
@ComponentScan(
        basePackages = "hello.core.member", // 어디서부터 탐색할지 지정할 수 있음
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    @Bean(name="memoryMemberRepository")
    MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
