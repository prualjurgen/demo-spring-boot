package com.sda.demo.controllers;

import com.sda.demo.dto.Account;
import com.sda.demo.dto.User;
import com.sda.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/accounts")

public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET, path ="/allac")
    public Iterable<Account> GetAllAccounts(){
        return accountRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path="/allAccountNr")
    public Iterable<Account> getFindAllById (@PathParam("id")int id){
        return accountRepository.findAllById (id);
    }

    @RequestMapping(method = RequestMethod.POST, path ="/addaccount")
    public void AddNewUser(@RequestBody Account account){
        accountRepository.save(account);

    }

    //@RequestMapping(method = RequestMethod.GET,path = "/allMoneyPerCurrency")
   // public Iterable<Account>getAllMoneyPerCurrency



}