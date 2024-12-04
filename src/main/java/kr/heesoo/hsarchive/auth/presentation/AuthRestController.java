package kr.heesoo.hsarchive.auth.presentation;

import kr.heesoo.hsarchive.auth.application.AuthService;
import kr.heesoo.hsarchive.common.payload.ApiRes;
import kr.heesoo.hsarchive.auth.dto.request.JoinRequestDto;
import kr.heesoo.hsarchive.auth.dto.response.JoinResultDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthRestController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ApiRes<JoinResultDto> join(@RequestBody JoinRequestDto request) {

        return ApiRes.onSuccess(authService.join(request));

    }
}
