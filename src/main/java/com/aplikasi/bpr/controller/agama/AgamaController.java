/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplikasi.bpr.controller.agama;

import com.aplikasi.bpr.master.Agama;
import com.aplikasi.bpr.service.agama.AgamaService;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author St0rm
 */
@Controller
@RequestMapping("/master/agama")
public class AgamaController {
    @Autowired
    AgamaService agamaservice;
    
    @GetMapping(value = {"/","/list"})
    public String listAgama(ModelMap params){
       params.addAttribute("listAgama", agamaservice.findAllAgama());
       return "/pages/master/agama/list";
    }
    @GetMapping("/form")
    public String formAgama(Agama agama, ModelMap params){
        params.addAttribute("agama", agama);
        return "pages/master/agama/form";
    }
    @PostMapping("/submit")
    public String submitAgama(@Valid @ModelAttribute Agama agama, BindingResult bindingresult ,RedirectAttributes redirect) {
        agama.setCreatedDate(Timestamp.valueOf(LocalDateTime.now()));
        agama.setCreatedBy("admin");
        if(bindingresult.hasErrors()){
            return "/pages/master/agama/form";
        }
        agamaservice.save(agama);
        redirect.addFlashAttribute("submitBerhasil", "Data Berhasil Dimasukkan!");
        return "redirect:/master/agama/list";
    }
    
    @GetMapping("/hapus/{keterangan}")
    public String deleteAgama(@PathVariable("keterangan") String nama, RedirectAttributes redirect){
        Agama temp = this.agamaservice.findById(nama);
        this.agamaservice.delete(temp);
        redirect.addFlashAttribute("HapusBerhasil","data berhasil dihapus!");
        return "redirect:/master/agama/list";
    }
    
    @GetMapping("/form/{keterangan}")
    public String updateAgama(@PathVariable("keterangan") String nama, ModelMap params, RedirectAttributes redirect){
        Agama agama = agamaservice.findById(nama);
        if(agama!=null){
            params.addAttribute("agama", agama);
            return "/pages/master/agama/form";
        }else{
            redirect.addFlashAttribute("tidakAda","data tidak ditemukan!");
            return "redirect:/master/agama/list";
        }
    }
}
