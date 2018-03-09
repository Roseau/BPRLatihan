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
@Table(name = "master_agama", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agama {
    @Id
    @GenericGenerator(name = "agama_id", strategy = "uuid2")
    @GeneratedValue(generator = "agama_id")
    @Column(name = "kode_agama",nullable = false, unique = true, length = 64)
    private String id;
    
    @NotEmpty(message = "Nama Agama Tidak Boleh Kosong")
    @Column(name = "nama_agama",nullable = false)
    private String keterangan;
    
    @Column(name = "created_Date", nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_By", nullable = false)
    private String createdBy;
}
