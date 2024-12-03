package kr.heesoo.hsarchive.member.dto.request;

import kr.heesoo.hsarchive.member.domain.Member;

public record JoinDto(
        String email,
        String password,
        String username
) {
    public Member toMember() {
        return Member.builder()
                .email(email)
                .password(password)
                .username(username)
                .build();
    }
}
