package com.progile.spring.feign.api.controller;

import com.progile.spring.feign.api.client.UserClient;
import com.progile.spring.feign.api.dto.IssuerTransactionDao;
import com.progile.spring.feign.api.dto.UserResponse;
import com.progile.spring.feign.api.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("all")
@RestController
public class UserController {

    @Autowired
    public UserClient userClient;

    @Autowired
    public TransactionRepository transactionRepository;


    @GetMapping("/findAllUser")
    public List<IssuerTransactionDao> getAllUser() {
        List<IssuerTransactionDao> transactionDaoList = userClient.getUsers();
        transactionRepository.saveAll(transactionDaoList);
        return userClient.getUsers();

    }
}
