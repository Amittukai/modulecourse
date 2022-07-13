package com.modulecourse.repo;

import com.modulecourse.entiti.Module;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepo extends MongoRepository<Module,Long> {
    //@Query("")
    List<Module> findByModuleCode(String moduleCode);
}
