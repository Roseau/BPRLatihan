/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikasi.bpr.master;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author St0rm
 */
@Entity
@Table(name = "master_bpr", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bpr {
    @Id
    @GenericGenerator(name = "bpr_id", strategy = "uuid2")
    @GeneratedValue(generator = "bpr_id")
    @Column(name = "kode_bpr",nullable = false, unique = true, length = 64)
    private String id;
    
    @NotEmpty(message = "Nama BPR Tidak Boleh Kosong")
    @Column(name = "nama_bpr",nullable = false)
    private String nama;
    
    @NotEmpty(message = "Nomor SIUP Tidak Boleh Kosong")
    @Column(name = "nomor_siup",nullable = false, unique = true)
    private String nomorsiup;
    
    @NotEmpty(message = "Sandi Tidak Boleh Kosong")
    @Column(name = "sandi",nullable = false, unique = true)
    private String sandi;
    
    @NotEmpty(message = "Alamat Tidak Boleh Kosong")
    @Column(name = "alamat",nullable = false)
    private String alamat;
    
    @NotEmpty(message = "Nomor Telepon Tidak Boleh Kosong")
    @Column(name = "nomor_telepon",nullable = false)
    private String nomortelepon;
    
    @NotEmpty(message = "Email Tidak Boleh Kosong")
    @Column(name = "Email",nullable = false, unique = true)
    private String email;
    
    @NotEmpty(message = "Nomor Fax Tidak Boleh Kosong")
    @Column(name = "nomor_fax",nullable = false)
    private String nomorfax;
    
    @Column(name = "created_date",nullable = false, unique = true)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false, unique = true)
    private String createdBy;
}
