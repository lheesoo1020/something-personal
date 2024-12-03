package kr.heesoo.hsarchive.member.application;

import kr.heesoo.hsarchive.member.domain.Member;
import kr.heesoo.hsarchive.member.dto.request.JoinDto;
import kr.heesoo.hsarchive.member.dto.response.JoinResultDto;
import kr.heesoo.hsarchive.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public JoinResultDto joinMember(JoinDto joinDto) {
        Member newMember = joinDto.toMember();
        newMember.setPassword(passwordEncoder.encode(newMember.getPassword()));

        Long newMemberId = memberRepository.save(newMember).getId();

        return JoinResultDto.builder()
                .memberId(newMemberId)
                .build();
    }

}
