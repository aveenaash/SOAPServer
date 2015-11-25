package com.soap.response;

import java.util.List;

import com.soap.domain.Account;

public class GetAccountsResponse {

    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
