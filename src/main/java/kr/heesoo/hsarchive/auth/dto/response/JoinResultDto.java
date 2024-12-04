package kr.heesoo.hsarchive.auth.dto.response;

import lombok.Builder;

@Builder
public record JoinResultDto(
        Long memberId
) {
}
