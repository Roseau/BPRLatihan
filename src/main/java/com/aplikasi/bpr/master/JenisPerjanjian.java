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
@Table(name = "master_jenis_perjanjian", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JenisPerjanjian {
    @Id
    @NotEmpty(message = "kode perjanjian tidak boleh kosong")
    @Column(name = "kode_perjanjian",nullable = false, unique = true)
    private long id;
    
    @NotEmpty(message = "nama perjanjian tidak boleh kosong")
    @Column(name = "nama_perjanjian",nullable = false)
    private String nama;
    
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
