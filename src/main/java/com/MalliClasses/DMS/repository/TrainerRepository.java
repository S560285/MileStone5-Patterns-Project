package com.MalliClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MalliClasses.DMS.Models.Trainer;


public interface TrainerRepository  extends CrudRepository<Trainer,Integer>{

}
