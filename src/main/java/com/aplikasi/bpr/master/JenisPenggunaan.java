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
@Table(name = "master_jenis_penggunaan", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JenisPenggunaan {
    @Id
    @GenericGenerator(name = "penggunaan_id", strategy = "uuid2")
    @GeneratedValue(generator = "penggunaan_id")
    @Column(name = "kode_penggunaan",nullable = false, unique = true, length = 64)
    private String id;
    
    @NotEmpty(message = "Jenis Penggunaan tidak boleh kosong")
    @Column(name = "nama_penggunaan",nullable = false)
    private String nama;
   
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
