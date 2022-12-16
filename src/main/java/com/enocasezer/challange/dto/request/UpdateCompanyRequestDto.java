package com.enocasezer.challange.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateCompanyRequestDto {
    private Long id;
    private String name;
    private String type;
    private String country;
    private String address;
}
