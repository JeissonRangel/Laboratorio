package com.ceiba.biblioteca.services;

import com.ceiba.biblioteca.models.PrestamoModel;
import com.ceiba.biblioteca.repositories.IPrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {
    @Autowired
    IPrestamoRepository iPrestamoRepository;

    public PrestamoModel crearPrestamoLibro(PrestamoModel prestamo){
        return iPrestamoRepository.save(prestamo);
    }

    public Optional<PrestamoModel> obtenerPrestamoPorId(Long Id){
        return iPrestamoRepository.findById(Id);
    }

}
