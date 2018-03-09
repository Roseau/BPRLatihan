/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  St0rm
 * Created: Mar 8, 2018
 */
create table master.master_pendidikan(
    kode_pendikan character varying(64) not null primary key,
    nama_pendidikan character varying(255) not null,
    created_date timestamp not null,
    created_by character varying(50) not null
);
