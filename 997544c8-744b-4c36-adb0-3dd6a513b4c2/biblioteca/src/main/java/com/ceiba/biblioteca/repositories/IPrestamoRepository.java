package com.ceiba.biblioteca.repositories;

import com.ceiba.biblioteca.models.PrestamoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrestamoRepository extends CrudRepository<PrestamoModel, Long> {

}
