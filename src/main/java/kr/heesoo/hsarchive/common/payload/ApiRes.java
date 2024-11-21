package kr.heesoo.hsarchive.common.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import kr.heesoo.hsarchive.common.payload.code.BaseCode;
import kr.heesoo.hsarchive.common.payload.code.status.SuccessStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public class ApiRes<T> {

    @JsonProperty("isSuccess")  //없어도 무방
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)  //null인 경우 json 직렬화에서 제외
    private T result;

    public static <T> ApiRes<T> onSuccess(T result) {
        return new ApiRes<>(true, SuccessStatus._OK.getCode(), SuccessStatus._OK.getMessage(), result);
    }

    public static <T> ApiRes<T> of(BaseCode code, T result) {
        return new ApiRes<>(true, code.getReason().getCode(), code.getReason().getMessage(), result);
    }

    public static <T> ApiRes<T> onFailure(String code, String message, T result) {
        return new ApiRes<>(false, code, message, result);
    }

}
