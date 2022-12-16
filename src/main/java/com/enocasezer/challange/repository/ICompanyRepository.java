package com.enocasezer.challange.repository;

import com.enocasezer.challange.repository.entity.Company;
import com.enocasezer.challange.repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICompanyRepository extends JpaRepository<Company,Long> {


}
