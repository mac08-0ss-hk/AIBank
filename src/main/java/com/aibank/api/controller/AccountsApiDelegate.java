package com.aibank.api.controller;

import com.aibank.api.model.Account;
import com.aibank.api.model.Balances;
import com.aibank.api.model.GetAccounts400Response;
import com.aibank.api.model.GetAccounts500Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link AccountsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-30T16:19:24.480113+08:00[Asia/Hong_Kong]", comments = "Generator version: 7.12.0")
public interface AccountsApiDelegate {

    List<Account> getAccounts(String customerId);

    Account getAccountsByAccountId(String customerId,
        String accountId);

    Balances getBalances(String customerId,
        String accountId);

}
