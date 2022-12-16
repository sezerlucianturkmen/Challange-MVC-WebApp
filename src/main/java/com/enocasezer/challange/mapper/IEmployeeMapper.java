package com.enocasezer.challange.mapper;


import com.enocasezer.challange.dto.request.SaveRequestDto;
import com.enocasezer.challange.dto.response.GetAllEmployeesResponseDto;
import com.enocasezer.challange.repository.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;



@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IEmployeeMapper {


    IEmployeeMapper INSTANCE = Mappers.getMapper(IEmployeeMapper.class);


    Employee toEmployee(final SaveRequestDto dto);
    GetAllEmployeesResponseDto toGetAllEmployeesResponseDto(final Employee employee);




}