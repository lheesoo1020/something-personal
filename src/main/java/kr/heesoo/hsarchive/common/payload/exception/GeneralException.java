package kr.heesoo.hsarchive.common.payload.exception;

import kr.heesoo.hsarchive.common.payload.code.BaseErrorCode;
import kr.heesoo.hsarchive.common.payload.dto.ErrorReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getErrorReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.code.getErrorReasonHttpStatus();
    }
}
