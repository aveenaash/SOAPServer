package com.soap.service;

import javax.jws.WebService;

import com.soap.domain.Account;

@WebService
public class GetAccountServiceImpl implements GetAccountService {

    @Override
    public Account getAccountById(String id) {
        System.out.println("ID =====> " + id);
        return new Account(id, "accountType", "12876.23");
    }

}
