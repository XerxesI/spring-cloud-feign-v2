package com.progile.spring.feign.api.client;

import com.progile.spring.feign.api.config.UserConfig;
import com.progile.spring.feign.api.dto.IssuerTransactionDao;
import com.progile.spring.feign.api.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(url="https://test.estcard.ee/acquiring/clearing-service/rest/v1/issuer/transaction/info",name="USER-CLIENT", configuration = UserConfig.class)
public interface UserClient {

    @GetMapping("/2022-01-22")
    public List<IssuerTransactionDao> getUsers();

}
