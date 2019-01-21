create table pelanggan
(
  id        varchar(64)  not null primary key,
  nama_pelanggan      varchar(100) not null,
  no_telp varchar(16)  not null unique,
  alamat    text
) engine = InnoDB;

insert into pelanggan(id, nama_pelanggan, no_telp, alamat)
values ('001', 'Ali Imron', '08112344567', 'Cianjur'),
       ('002', 'Aditya Muhammad H C', '08212344343', 'Karawang'),
       ('003', 'Agung Eka L', '08702343444', 'Lampung'),
       ('004', 'Adi Ramadhan', '08512343434', 'Banjar');