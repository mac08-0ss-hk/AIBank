package com.aibank.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.annotation.Generated;

/**
 * Account
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-30T16:19:24.480113+08:00[Asia/Hong_Kong]", comments = "Generator version: 7.12.0")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private String accountId;

  private String currency;

  private String accountType;

  private String accountSubType;



}

