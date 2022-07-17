package com.modulecourse.repo;

import com.modulecourse.entity.ModuleAssociation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleAssociationRepo extends MongoRepository<ModuleAssociation,String>{

    @Query("Select m from ModuleAssociation m where m.id=: id" )
    ModuleAssociation findByModuleAssociationId(@Param("id") String id);

}
