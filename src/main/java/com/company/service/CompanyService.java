package com.company.service;

import com.company.client.CandidateClient;
import com.company.entity.CompanyEntity;
import com.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CandidateClient client;

    @Autowired
    public CompanyService(CompanyRepository companyRepository, CandidateClient client) {
        this.companyRepository = companyRepository;
        this.client = client;
    }


    public CompanyEntity sum() {
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setSum(client.sumCompany());



        return companyRepository.save(companyEntity);
    }


}
