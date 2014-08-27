package org.magnum.mobilecloud.video;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

}
