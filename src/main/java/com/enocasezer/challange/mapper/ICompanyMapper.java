package com.enocasezer.challange.mapper;

import com.enocasezer.challange.dto.request.CreateCompanyRequestDto;
import com.enocasezer.challange.dto.response.CreateCompanyResponseDto;
import com.enocasezer.challange.dto.response.GetAllCompaniesResponseDto;
import com.enocasezer.challange.repository.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ICompanyMapper {


    ICompanyMapper INSTANCE = Mappers.getMapper(ICompanyMapper.class);

    Company toCompany (final CreateCompanyRequestDto dto);
    CreateCompanyResponseDto toCreateCompanyResponseDto(final Company company);
    GetAllCompaniesResponseDto toGetAllCompaniesResponseDto(final Company company);






}