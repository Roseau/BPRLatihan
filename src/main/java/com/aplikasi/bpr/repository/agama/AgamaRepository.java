/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikasi.bpr.repository.agama;

import com.aplikasi.bpr.master.Agama;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author St0rm
 */
public interface AgamaRepository extends CrudRepository<Agama, String> {
    public List<Agama> findAll();
    public Agama findByKeterangan(String nama);
}
