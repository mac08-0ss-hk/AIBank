package com.aibank.api.controller;

import com.aibank.api.model.Account;
import com.aibank.api.model.Balances;
import com.aibank.api.model.GetAccounts400Response;
import com.aibank.api.model.GetAccounts500Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
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
    public List<Account> getAccounts(String customerId) {
        return delegate.getAccounts(customerId);
    }

    @Override
    public Account getAccountsByAccountId(String customerId, String accountId) {
        return delegate.getAccountsByAccountId(customerId,accountId);
    }

    @Override
    public Balances getBalances(String customerId, String accountId) {
        return delegate.getBalances(customerId, accountId);
    }
}
