package kr.heesoo.hsarchive.member.dto.response;

import lombok.Builder;

@Builder
public record JoinResultDto(
        Long memberId
) {
}
