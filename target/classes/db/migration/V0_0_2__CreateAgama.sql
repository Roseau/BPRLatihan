/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  St0rm
 * Created: Mar 8, 2018
 */
create schema master;

create table master.master_agama(
    kode_agama character varying(64) not null primary key,
    nama_agama character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_debitur(
    kode_debitur character varying(64) not null primary key,
    nama_debitur character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_akun_kategori(
    kode_kategori bigint not null primary key,
    nama_kategori character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_bpr(
    kode_bpr character varying(64) not null primary key,
    nama_bpr character varying(255) not null,
    nomor_siup character varying(255) not null unique,
    sandi character varying(255) not null unique,
    alamat character varying(255) not null,
    nomor_telepon character varying(255) not null,
    email character varying(255) not null unique,
    nomor_fax character varying(255) not null, 
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_jabatan(
    kode_jabatan character varying(3) not null primary key,
    nama_jabatan character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_jenis_penggunaan(
    kode_penggunaan character varying(64) not null primary key,
    nama_penggunaan character varying(255) not null unique,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_jenis_perjanjian(
    kode_perjanjian bigint not null primary key,
    nama_perjanjian character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_sumberdana(
    kode_sumberdana character varying(64) not null primary key,
    nama_sumberdana character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_penjamin(
    kode_penjamin character varying(3) not null primary key,
    nama_penjamin character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_jaminan(
    kode_jaminan character varying(3) not null primary key,
    nama_jaminan character varying(255) not null,
    bobot bigint not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_bentukbadanusaha(
    kode_bbu character varying(64) not null primary key,
    nama_bbu character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_bidangusaha(
    kode_bidangusaha character varying(64) not null primary key,
    nama_bidangusaha character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_lembagaperingkat(
    kode_lembagaperingkat character varying(2) not null primary key,
    nama_lembagaperingkat character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);

create table master.master_pekerjaan(
    kode_pekerjaan character varying(64) not null primary key,
    nama_pekerjaan character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);