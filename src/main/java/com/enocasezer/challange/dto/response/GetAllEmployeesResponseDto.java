package com.enocasezer.challange.dto.response;

import com.enocasezer.challange.repository.entity.Company;
import com.enocasezer.challange.repository.enums.EGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllEmployeesResponseDto {
    private Long id;
    private String name;
    private String surname;
    private String position;
    private int age;
    private String email;
    private String address;
    private EGender gender;
    private Long companyId;
    private String companyName;
}
