package com.vn.haitt.restfull.api.app.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WelcomeReq {
 	@ApiModelProperty(notes = "Name", example = "Thanh Hai",  position = 1)
    private String name;
}
