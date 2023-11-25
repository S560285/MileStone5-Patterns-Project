package com.MalliClasses.DMS.repository;
import java.util.List;

 
import com.MalliClasses.DMS.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DogRepository extends CrudRepository<Dog, Integer>{
    List<Dog>findByName(String name);
}
