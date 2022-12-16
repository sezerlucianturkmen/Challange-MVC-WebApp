package com.enocasezer.challange.dto.response;

import com.enocasezer.challange.repository.entity.Company;
import com.enocasezer.challange.repository.enums.EGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllCompaniesResponseDto {
    private Long id;
    private String name;
    private String type;
    private String country;
    private String address;
}
