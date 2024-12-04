package kr.heesoo.hsarchive.auth.application;

import kr.heesoo.hsarchive.member.domain.Member;
import kr.heesoo.hsarchive.auth.dto.request.JoinRequestDto;
import kr.heesoo.hsarchive.auth.dto.response.JoinResultDto;
import kr.heesoo.hsarchive.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;

    private final PasswordEncoder passwordEncoder;

    public JoinResultDto join(JoinRequestDto joinDto) {
        Member newMember = joinDto.toMember();
        newMember.setPassword(passwordEncoder.encode(newMember.getPassword()));

        Long newMemberId = memberRepository.save(newMember).getId();

        return JoinResultDto.builder()
                .memberId(newMemberId)
                .build();
    }

}
