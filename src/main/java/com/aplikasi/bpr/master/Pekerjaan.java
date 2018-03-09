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
@Table(name = "master_pekerjaan", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pekerjaan {
    @Id
    @GenericGenerator(name = "pekerjaan_id", strategy = "uuid2")
    @GeneratedValue(generator = "pekerjaan_id")
    @Column(name = "kode_pekerjaan",nullable = false, unique = true)
    private String id;
    
    @NotEmpty(message = "Nama Pekerjaan Tidak Boleh Kosong")
    @Column(name = "nama_pekerjaan",nullable = false)
    private String nama;
    
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
