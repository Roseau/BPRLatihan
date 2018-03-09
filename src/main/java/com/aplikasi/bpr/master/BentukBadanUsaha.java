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
@Table(name = "master_bentukbadanusaha", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BentukBadanUsaha {
    @Id
    @GenericGenerator(name = "bbu_id", strategy = "uuid2")
    @GeneratedValue(generator = "bbu_id")
    @Column(name = "kode_bbu",nullable = false, unique = true, length = 64)
    private String id;
    
    @NotEmpty(message = "Nama BBU Tidak Boleh Kosong")
    @Column(name = "nama_bbu",nullable = false)
    private String nama;
    
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
