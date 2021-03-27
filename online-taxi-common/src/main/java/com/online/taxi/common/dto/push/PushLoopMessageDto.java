package com.online.taxi.common.dto.push;

import lombok.Data;

/**
 */
@Data
public class PushLoopMessageDto {

    private Integer id;

    private Integer messageType;

    private String messageBody;

}
