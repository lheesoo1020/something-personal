package kr.heesoo.hsarchive.common.payload.code;

import kr.heesoo.hsarchive.common.payload.dto.ErrorReasonDTO;

public interface BaseErrorCode {

    ErrorReasonDTO getErrorReason();

    ErrorReasonDTO getErrorReasonHttpStatus();
}
