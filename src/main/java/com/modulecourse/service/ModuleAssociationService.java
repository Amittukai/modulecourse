package com.modulecourse.service;


import com.modulecourse.entitidto.ModuleAssociationDto;
import com.modulecourse.entity.ModuleAssociation;
import com.modulecourse.repo.ModuleAssociationRepo;
import com.modulecourse.moduleMapper.ModuleAssociationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleAssociationService extends ModuleAssociationMapper{

    @Autowired
    ModuleAssociationRepo moduleAssociationRepo;

    @Autowired
    ModuleAssociationMapper moduleAssociationMapper;

    public List<ModuleAssociation> getModuleAssociation(){
        List<ModuleAssociation> moduleAssociationList = moduleAssociationRepo.findAll();
        return moduleAssociationList;
    }

    public ModuleAssociationDto addModuleAssociationService(ModuleAssociationDto moduleAssociationDto){
        ModuleAssociation moduleAssociation = moduleAssociationMapper.convertToModuleAssociation(moduleAssociationDto);
        return moduleAssociationMapper.convertToDto(moduleAssociationRepo.save(moduleAssociation));
    }

    public boolean deteleModuleAssociation(String id){
        ModuleAssociation moduleAssociation = moduleAssociationRepo.findByModuleAssociationId(id);
        moduleAssociationRepo.delete(moduleAssociation);
        return true;
    }
}
