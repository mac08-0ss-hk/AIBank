package com.aibank.api.controller;

import com.aibank.api.model.Account;
import com.aibank.api.model.Balances;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-30T16:19:24.480113+08:00[Asia/Hong_Kong]", comments = "Generator version: 7.12.0")
@RestController
@RequestMapping("${openapi.accountsAIBank.base-path:/accountsAIBank/v1}")
public class AccountsApiController implements AccountsApi {

    @Autowired
    private final AccountsApiDelegate delegate;

    public AccountsApiController(AccountsApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public ResponseEntity<List<Account>> getAccounts(String customerId) {
        return ResponseEntity.status(HttpStatus.OK).
                body(
                delegate.getAccounts(customerId));
    }

    @Override
    public ResponseEntity<Account> getAccountsByAccountId(String customerId, String accountId) {
        return ResponseEntity.status(HttpStatus.OK)
                        .body(delegate.getAccountsByAccountId(customerId,accountId));

    }

    @Override
    public ResponseEntity<Balances> getBalances(String customerId, String accountId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(delegate.getBalances(customerId, accountId));
    }
}
