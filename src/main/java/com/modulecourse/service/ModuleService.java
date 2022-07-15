package com.modulecourse.service;

import com.modulecourse.entity.Module;
import com.modulecourse.entitidto.ModuleDto;
import com.modulecourse.moduleMapper.ModuleMapper;
import com.modulecourse.repo.ModuleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService extends ModuleMapper {

    @Autowired
    ModuleRepo moduleRepo;

    /*@Autowired
    IModuleMapper iModuleMapper;*/
    @Autowired
    ModuleMapper moduleMapper;
    public List<Module> getAllModuleService(){
        List<Module> moduleList= moduleRepo.findAll();
        //return moduleMapper.listModuleToListDto(moduleList);
        return  moduleList;
    }
    public ModuleDto addModuleService(ModuleDto moduleDto){
        Module module= moduleMapper.convertToModule(moduleDto);
        //Module module= iModuleMapper.convertToModule(moduleDto);
        return moduleMapper.convertToDto(moduleRepo.save(module));
        //return null;
        //return moduleDto;
    }
    public boolean deleteModuleService(String moduleCode){
        Module module = moduleRepo.findByModuleCode(moduleCode).stream().findAny().orElse(null);
        return true;
    }
}
