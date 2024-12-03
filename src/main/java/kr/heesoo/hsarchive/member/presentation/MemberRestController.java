package kr.heesoo.hsarchive.member.presentation;

import kr.heesoo.hsarchive.common.payload.ApiRes;
import kr.heesoo.hsarchive.member.application.MemberService;
import kr.heesoo.hsarchive.member.dto.request.JoinDto;
import kr.heesoo.hsarchive.member.dto.response.JoinResultDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ApiRes<JoinResultDto> join(@RequestBody JoinDto request) {

        log.info("join 시작");

        JoinResultDto result = memberService.joinMember(request);

        log.info("join 완료");

        return ApiRes.onSuccess(result);


    }
}
