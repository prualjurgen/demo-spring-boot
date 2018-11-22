package com.sda.demo.repositories;

import com.sda.demo.dto.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends CrudRepository<Account,Integer> {

    Iterable<Account> findAllById (int id);

    Iterable<Account> findAccountById(int id);


}
