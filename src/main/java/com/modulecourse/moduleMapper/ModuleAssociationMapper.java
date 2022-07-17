package com.modulecourse.moduleMapper;


import com.modulecourse.entitidto.ModuleAssociationDto;
import com.modulecourse.entity.ModuleAssociation;

public class ModuleAssociationMapper {

    public ModuleAssociation convertToModuleAssociation(ModuleAssociationDto moduleAssociationDto) {
        ModuleAssociation moduleAssociation = new ModuleAssociation();
        moduleAssociation.setId(moduleAssociationDto.getId());
        moduleAssociation.setCourseCode(moduleAssociationDto.getCourseCode());
        moduleAssociation.setModuleCode(moduleAssociationDto.getModuleCode());
        return moduleAssociation;
    }

    public ModuleAssociationDto convertToDto(ModuleAssociation moduleAssociation) {
        ModuleAssociationDto moduleAssociationDto = new ModuleAssociationDto();
        moduleAssociationDto.setId(moduleAssociation.getId());
        moduleAssociationDto.setCourseCode(moduleAssociation.getCourseCode());
        moduleAssociationDto.setModuleCode(moduleAssociation.getModuleCode());
        return moduleAssociationDto;
    }
}
