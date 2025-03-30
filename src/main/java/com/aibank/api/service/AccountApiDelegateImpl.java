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

    @PostConstruct
    public void loadData(){
        Account savingsAccount = new Account();
        Account currentAccount = new Account();
        Balances savingsBalances = new Balances();
        Balances currentBalances = new Balances();
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
        Account savingsAccount = new Account();
        Account currentAccount = new Account();
        Balances savingsBalances = new Balances();
        Balances currentBalances = new Balances();
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
        System.out.println(List.of(savingsAccount,currentAccount).toString());
        return List.of(savingsAccount,currentAccount);
    }

    @Override
    public Account getAccountsByAccountId(String customerId, String accountId) {
        Account savingsAccount = new Account();
        Account currentAccount = new Account();
        Balances savingsBalances = new Balances();
        Balances currentBalances = new Balances();
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
        return currentAccount;

    }

    @Override
    public Balances getBalances(String customerId, String accountId) {

        Account savingsAccount = new Account();
        Account currentAccount = new Account();
        Balances savingsBalances = new Balances();
        Balances currentBalances = new Balances();
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
        return currentBalances;
    }
}
