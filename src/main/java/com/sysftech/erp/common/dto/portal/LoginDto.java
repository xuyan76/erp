package com.sysftech.erp.common.dto.portal;

import lombok.Data;

@Data
public class LoginDto {
    String clientId;
    String nonce;
    String timestamp;
    String sign;
}
