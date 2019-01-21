package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
create table pelanggan
        (
        id        varchar(64)  not null primary key,
        nama_pelanggan      varchar(100) not null,
        no_telp varchar(16)  not null unique,
        alamat    text
        ) engine = InnoDB;
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pelanggan")

public class Pelanggan {

    @Id
    @GenericGenerator(name = "uuid_gen",strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column (name = "id",nullable = false, unique = true)
    private String id;

    @Column(name = "nama_pelanggan",nullable = false)
    private String nama_pelanggan;

    @Column(name = "no_telp", nullable = false)
    private String no_telp;

    @Type(type = "text")
    @Column(name = "alamat")
    private String alamat;

}
