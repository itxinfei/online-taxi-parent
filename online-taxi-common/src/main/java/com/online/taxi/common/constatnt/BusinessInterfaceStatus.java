package com.online.taxi.common.constatnt;

import lombok.Getter;

/**
 * @author yueyi2019
 */
@Getter
public enum BusinessInterfaceStatus implements com.online.taxi.constatnt.CodeEnum {

    /**
     * 操作成功
     */
    SUCCESS(0, "success"),

    /**
     * 操作失败
     */
    FAIL(1, "fail");

    private final int code;
    private final String value;

    BusinessInterfaceStatus(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
