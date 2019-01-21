create table toko
(
  id       varchar(64)  not null primary key,
  nama_toko      varchar(60)  not null,
  no_telp        varchar(60)  not null,
  alamat         text,
  pemilik        varchar(64)  not null
) engine = InnoDb;