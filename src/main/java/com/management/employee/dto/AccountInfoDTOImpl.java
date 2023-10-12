package com.management.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoDTO {
    private Integer accountId;
    private String fullName;
    private int gender;
    private String skill;
    private String level;
    private String departmentName;
    private String positionName;
}
