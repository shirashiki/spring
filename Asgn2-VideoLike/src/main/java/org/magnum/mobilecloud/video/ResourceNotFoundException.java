package org.magnum.mobilecloud.video;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This class was created to return 404 when we receive bad parameters using Spring
 * @author silviohirashiki
 *
 */
@ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

}
