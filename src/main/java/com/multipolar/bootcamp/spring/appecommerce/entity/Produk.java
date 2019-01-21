package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**create table produk
 (
 id        varchar(64)  not null primary key,
 nama_produk      varchar(100) not null,
 kategori varchar(60)  not null,
 berat    varchar(15) not null,
 jumlah varchar (60) not null
 ) engine = InnoDB;
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produk")
 public class Produk {
    @Id
    @GenericGenerator(name = "uuid_gen",strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "nama_produk", nullable = false, length = 100)
    private String nama_produk;

    @Column(name = "kategori",nullable = false, length = 60)
    private String kategori;

    @Column(name = "berat",nullable = false, length = 15)
    private String berat;

    @Column(name = "jumlah",nullable = false,length = 60)
    private String jumlah;


}
