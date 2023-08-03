package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {

        //MemberService memberService = new MemberServiceImpl();
        // ↓
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member menber = memberService.findMenber(1L);
        System.out.println("memberA = " + memberA.getName());
        System.out.println("menber = " + menber.getName());
    }
}
