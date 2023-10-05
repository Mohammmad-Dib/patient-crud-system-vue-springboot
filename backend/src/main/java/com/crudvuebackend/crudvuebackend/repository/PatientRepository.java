package com.crudvuebackend.crudvuebackend.repository;

import com.crudvuebackend.crudvuebackend.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}
