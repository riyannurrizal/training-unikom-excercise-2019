package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
create table toko
        (
        id       varchar(64)  not null primary key,
        nama_toko      varchar(60)  not null,
        no_telp        varchar(60)  not null,
        alamat         text,
        pemilik        varchar(64)  not null
        ) engine = InnoDb;
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "toko")

public class Toko {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama_toko", nullable = false, length = 60)
    private String nama_toko;

    @Column(name = "no_telp",nullable = false,length = 60)
    private String no_telp;

    @Type(type = "text")
    @Column(name = "alamat")
    private String alamat;

    @Column(name = "pemilik")
    private String pemilik;




}
