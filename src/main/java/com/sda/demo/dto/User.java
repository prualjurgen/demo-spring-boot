package com.sda.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date dob;
    private String nationality;
    @OneToOne(fetch = FetchType.LAZY,targetEntity=Account.class,cascade = CascadeType.ALL)
    private int accountId;
}