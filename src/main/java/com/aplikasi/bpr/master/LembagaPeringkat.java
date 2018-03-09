/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikasi.bpr.master;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author St0rm
 */
@Entity
@Table(name = "master_lembagaperingkat", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LembagaPeringkat {
    @Id
    @NotEmpty(message = "Kode Lembaga Peringkat Tidak Boleh Kosong")
    @Column(name = "kode_lembagaperingkat",nullable = false, unique = true, length = 2)
    private String kode;
    
    @NotEmpty(message = "Nama Lembaga Peringkat Tidak Boleh Kosong")
    @Column(name = "nama_lembagaperingkat",nullable = false)
    private String namalembaga;
    
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
