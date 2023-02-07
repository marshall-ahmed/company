package com.company.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms-candidate",
        url = "${client.candidate.url}",
        configuration = {CandidateErrorDecoder.class})
public interface CandidateClient {
    @GetMapping("/")
    Integer sumCompany();
}
