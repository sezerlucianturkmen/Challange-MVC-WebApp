package com.enocasezer.challange.dto.request;

import com.enocasezer.challange.repository.enums.EGender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCompanyRequestDto {
    private String name;
    private String type;
    private String country;
    private String address;
}
