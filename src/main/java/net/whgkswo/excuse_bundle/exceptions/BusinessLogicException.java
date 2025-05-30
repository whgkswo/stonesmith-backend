package net.whgkswo.excuse_bundle.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BusinessLogicException extends RuntimeException {
    private int status;

    public BusinessLogicException(ExceptionType type) {
        super(type.message());
        this.status = type.status();
    }
}
