create table produk
(
  id        varchar(64)  not null primary key,
  nama_produk      varchar(100) not null,
  kategori varchar(60)  not null,
  berat    varchar(15) not null,
  jumlah varchar (60) not null
) engine = InnoDB;

insert into produk(id, nama_produk, kategori, berat, jumlah)
values ('001', 'Mesin Cuci Sanken', 'Mesin Cuci', '20 Kg','5'),
       ('002', 'Tas Cihuy Yahuy', 'Tas Pria', '400 gram','10'),
       ('003', 'Samsung S9', 'Smartphone', '189 gram','20'),
       ('004', 'Kulkas LG', 'Kulkas','20 Kg' '40');