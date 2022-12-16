package com.enocasezer.challange.controller;

import com.enocasezer.challange.dto.request.DeleteEmployeRequestDto;
import com.enocasezer.challange.dto.request.SaveRequestDto;
import com.enocasezer.challange.dto.request.UpdateEmployeeRequestDto;
import com.enocasezer.challange.dto.response.GetAllEmployeesResponseDto;
import com.enocasezer.challange.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import  static com.enocasezer.challange.constant.EndPoint.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(EMPLOYEE)
public class EmployeeController {
    private final EmployeeService employeeService;


    @PostMapping(SAVE)
    @Operation(summary = "Eleman kayit eden method, öncelikle şirket oluşturulmalı ve responsedan Sirket ID si çekilmelidir.")
    public ResponseEntity<Boolean> saveEmployee(@RequestBody @Valid SaveRequestDto dto){
            return ResponseEntity.ok(employeeService.saveEmployee(dto));
    }

    @PutMapping(UPDATE)
    @Operation(summary = "Eleman bilgilerini düzenleyen method.")
    public ResponseEntity<Boolean> updateEmployee(@RequestBody @Valid UpdateEmployeeRequestDto dto){
        return ResponseEntity.ok(employeeService.updateEmployee(dto));
    }

    @DeleteMapping(DELETE)
    @Operation(summary = "ID göre silme methodudur")
    public  ResponseEntity<Boolean> delete(@RequestBody DeleteEmployeRequestDto dto) {
        return ResponseEntity.ok(employeeService.deleteEmployee(dto));
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<GetAllEmployeesResponseDto>> findAll(){
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }


}
