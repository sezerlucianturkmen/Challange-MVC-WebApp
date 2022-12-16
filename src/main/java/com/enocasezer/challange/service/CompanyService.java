package com.enocasezer.challange.service;

import com.enocasezer.challange.dto.request.CreateCompanyRequestDto;
import com.enocasezer.challange.dto.request.DeleteCompanyRequestDto;
import com.enocasezer.challange.dto.request.UpdateCompanyRequestDto;
import com.enocasezer.challange.dto.response.CreateCompanyResponseDto;
import com.enocasezer.challange.dto.response.GetAllCompaniesResponseDto;
import com.enocasezer.challange.exception.ErrorType;
import com.enocasezer.challange.exception.ManagerException;
import com.enocasezer.challange.mapper.ICompanyMapper;
import com.enocasezer.challange.mapper.IEmployeeMapper;
import com.enocasezer.challange.repository.ICompanyRepository;
import com.enocasezer.challange.repository.entity.Company;
import com.enocasezer.challange.repository.entity.Employee;
import com.enocasezer.challange.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyService extends ServiceManager<Company,Long> {

    private final ICompanyRepository companyRepository;


    public CompanyService(ICompanyRepository companyRepository){
        super(companyRepository);
        this.companyRepository=companyRepository;

    }
    public CreateCompanyResponseDto createCompany(CreateCompanyRequestDto dto) {
        try{
            Company company= companyRepository.save(ICompanyMapper.INSTANCE.toCompany(dto));
            return ICompanyMapper.INSTANCE.toCreateCompanyResponseDto(company);
        }catch (Exception e) {
            throw new ManagerException(ErrorType.EMPYOLEE_NOT_CREATED);
        }
    }
    public boolean updateCompany(UpdateCompanyRequestDto dto) {
        try{
           Optional<Company> company=companyRepository.findById(dto.getId());
           if(company.isPresent()) {
               company.get().setName(dto.getName());
               company.get().setAddress(dto.getAddress());
               company.get().setType(dto.getType());
               company.get().setCountry(dto.getCountry());
               save(company.get());
               return true;
           }else {
               throw new ManagerException(ErrorType.COMPANY_NOT_FOUND);
           }
        }catch (Exception e) {
            throw new ManagerException(ErrorType.COMPANY_NOT_UPDATED);
        }
    }
    public boolean deleteEmployee(DeleteCompanyRequestDto dto) {
        Optional<Company> company=companyRepository.findById(dto.getId());
        if(company.isPresent()){
            deleteById(company.get().getId());

            return true;
        }else {
            throw new ManagerException(ErrorType.COMPANY_NOT_FOUND);
        }
    }
    public List<GetAllCompaniesResponseDto> findAllCompanies() {
        List<Company> companies=findAll();
        return companies.stream().map(x-> ICompanyMapper.INSTANCE.toGetAllCompaniesResponseDto(x)).collect(Collectors.toList());
    }
}
