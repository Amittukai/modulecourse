package com.modulecourse.moduleMapper;

import com.modulecourse.entity.Module;
import com.modulecourse.entitidto.ModuleDto;

public class ModuleMapper {

    public Module convertToModule(ModuleDto moduleDto){
        Module module = new Module();
        module.setModuleName(moduleDto.getModuleName());
        module.setModuleCode(moduleDto.getModuleCode());
        module.setModuleObjective(moduleDto.getModuleObjective());
        return module;
    }

//    public List<ModuleDto> convertListModuleDto(List<Module> moduleList){
//        //List<ModuleDto> moduleDtoCopy = List.copyOf(moduleList);
////        List<ModuleDto> moduleDtoCopy = new List<Module>();
////        moduleDtoCopy.addAll(moduleList);
//          List<ModuleDto> moduleDtoCopy = moduleList.stream().collect(Collectors.toList());
//          return moduleDtoCopy;

    public ModuleDto convertToDto(Module module){
        ModuleDto moduleDto = new ModuleDto();
        moduleDto.setModuleName(module.getModuleName());
        moduleDto.setModuleCode(module.getModuleCode());
        moduleDto.setModuleObjective(module.getModuleObjective());
        return moduleDto;
    }
}

