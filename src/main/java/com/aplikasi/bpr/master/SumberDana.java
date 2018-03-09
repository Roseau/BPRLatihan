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
@Table(name = "master_sumberdana", schema = "master")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SumberDana {
    @Id
    @GenericGenerator(name = "sumberdana_id", strategy = "uuid2")
    @GeneratedValue(generator = "sumberdana_id")
    @Column(name = "kode_sumberdana",nullable = false, unique = true, length = 64)
    private String id;
    
    @NotEmpty(message = "Nama sumberdana tidak boleh kosong")
    @Column(name = "nama_sumberdana",nullable = false)
    private String keterangan;
    
    @Column(name = "created_date",nullable = false)
    private Timestamp createdDate;
    
    @Column(name = "created_by",nullable = false)
    private String createdBy;
}
