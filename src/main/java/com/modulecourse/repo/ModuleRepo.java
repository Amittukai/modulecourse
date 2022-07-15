package com.modulecourse.repo;

import com.modulecourse.entity.Module;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepo extends MongoRepository<Module,Long> {
    //@Query("")
    List<Module> findByModuleCode(String moduleCode);
}
