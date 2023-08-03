package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberSerivceTest {

    MemberService memberService;

    // @BeforeEach : Test 실행 전에 해당 메소드를 실행시킴
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMenber(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
