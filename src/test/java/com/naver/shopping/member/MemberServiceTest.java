package com.naver.shopping.member;

import com.naver.shopping.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();

    @Test
    void 회원가입() {
        Member member = new Member(1L, "실험체1", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void 멍청한테스트() {
        Member member1 = new Member(1L, "실험체1", Grade.VIP);
        Member member2 = new Member(2L, "실험체2", Grade.BASIC);

        Assertions.assertThat(member1).isEqualTo(member2);
    }
}