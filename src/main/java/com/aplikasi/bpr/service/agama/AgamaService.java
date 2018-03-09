/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikasi.bpr.service.agama;

import com.aplikasi.bpr.master.Agama;
import com.aplikasi.bpr.repository.agama.AgamaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author St0rm
 */
@Repository
@Transactional(readOnly = true)
public class AgamaService {
    @Autowired
    AgamaRepository agamarepo;
    
    @Transactional
    public void save(Agama agama){
        this.agamarepo.save(agama);
    }
    
    public List<Agama> findAllAgama(){
        return this.agamarepo.findAll();
    }
    
    @Transactional
    public void delete(Agama agama){
        this.agamarepo.delete(agama);
    }
    public Agama findById(String id){
        return this.agamarepo.findByKeterangan(id);
    }
}
