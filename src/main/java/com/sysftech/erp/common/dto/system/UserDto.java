package com.sysftech.erp.common.dto.system;

import lombok.Data;

@Data
public class UserDto {
    Long userId;
    String code;
    String name;
    Long orgId;
    String email;
    String mobile;
    Iterable<String> dashboards;

}
