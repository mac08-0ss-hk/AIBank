package com.aibank.api.service;

import com.aibank.api.controller.AccountsApiDelegate;
import com.aibank.api.model.Account;
import com.aibank.api.model.Balances;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountApiDelegateImpl implements AccountsApiDelegate {
    Account savingsAccount = new Account();
    Account currentAccount = new Account();
    Balances savingsBalances = new Balances();
    Balances currentBalances = new Balances();
    @PostConstruct
    public void loadData(){

        savingsAccount.setAccountId("AIB4000123");
        savingsAccount.setAccountType("Personal");
        savingsAccount.setAccountSubType("Savings");
        savingsAccount.setCurrency("USD");
        currentAccount.setAccountId("AIB4000456");
        currentAccount.setAccountType("Priority");
        currentAccount.setAccountSubType("Current");
        currentAccount.setCurrency("USD");
        savingsBalances.setAccountId("AIB4000123");
        savingsBalances.setBalance(BigDecimal.valueOf(699));
        savingsBalances.setCurrency("USD");
        currentBalances.setAccountId("AIB4000456");
        currentBalances.setBalance(BigDecimal.valueOf(1099));
        currentBalances.setCurrency("USD");
    }


    @Override
    public List<Account> getAccounts(String customerId) {
        loadData();
        return List.of(savingsAccount,currentAccount);
    }

    @Override
    public Account getAccountsByAccountId(String customerId, String accountId) {
        loadData();
        switch (accountId){
            case "AIB4000456":
                return currentAccount;
            case  "AIB4000123":
                return savingsAccount;
            default:
                return new Account();
        }

    }

    @Override
    public Balances getBalances(String customerId, String accountId) {
        loadData();
        switch (accountId){
            case "AIB4000456":
                return currentBalances;
            case  "AIB4000123":
                return savingsBalances;
            default:
                return new Balances();
        }
    }
}
