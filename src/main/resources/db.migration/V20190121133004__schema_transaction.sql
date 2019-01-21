create table transaction
(
  id              varchar(64) not null primary key,
  tanggal_beli  timestamp   not null default now(),
  pelanggan_id    varchar(64) not null
) engine = InnoDB;

create table transaction_detail
(
  id             varchar(64) not null primary key,
  transaction_id varchar(64) not null,
  toko_id        varchar(64) not null
) engine = InnoDB;