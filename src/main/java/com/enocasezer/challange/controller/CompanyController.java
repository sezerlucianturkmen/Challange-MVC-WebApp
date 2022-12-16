package com.enocasezer.challange.controller;

import com.enocasezer.challange.dto.request.CreateCompanyRequestDto;
import com.enocasezer.challange.dto.request.DeleteCompanyRequestDto;
import com.enocasezer.challange.dto.request.SaveRequestDto;
import com.enocasezer.challange.dto.request.UpdateCompanyRequestDto;
import com.enocasezer.challange.dto.response.CreateCompanyResponseDto;
import com.enocasezer.challange.dto.response.GetAllCompaniesResponseDto;
import com.enocasezer.challange.exception.ErrorType;
import com.enocasezer.challange.exception.ManagerException;
import com.enocasezer.challange.service.CompanyService;
import com.enocasezer.challange.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.enocasezer.challange.constant.EndPoint.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(COMPANY)
public class CompanyController {
    private final CompanyService companyService;


    @PostMapping(SAVE)
    @Operation(summary = "Şirket oluşturan eden metot, oluşturulan şirket id si, eleman oluşturulurken girilmek üzere kullanilmalidir.")
    public ResponseEntity<CreateCompanyResponseDto> createCompany(@RequestBody CreateCompanyRequestDto dto){
            return ResponseEntity.ok(companyService.createCompany(dto));
    }

    @PutMapping(UPDATE)
    public ResponseEntity<Boolean> updateCompany(@RequestBody UpdateCompanyRequestDto dto){
        return ResponseEntity.ok(companyService.updateCompany(dto));
    }

    @DeleteMapping(DELETE)
    @Operation(summary = "ID göre silme methodudur")
    public  ResponseEntity<Boolean> delete(@RequestBody DeleteCompanyRequestDto dto){
        return ResponseEntity.ok(companyService.deleteEmployee(dto));
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<GetAllCompaniesResponseDto>> findAll(){
        return ResponseEntity.ok(companyService.findAllCompanies());
    }

}
