package kr.heesoo.hsarchive.common.payload.code;

import kr.heesoo.hsarchive.common.payload.dto.ReasonDTO;

public interface BaseCode {

    ReasonDTO getReason();

    ReasonDTO getReasonHttpStatus();
}
