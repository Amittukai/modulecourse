package com.modulecourse.controller;

import com.modulecourse.entitidto.ModuleDto;
import com.modulecourse.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController extends BaseController{

    @Autowired
    ModuleService moduleService;

    @GetMapping
    public ResponseEntity getAllModule(){
        return sendSuccesResponse(moduleService.getAllModuleService());
    }

    @PostMapping()
    public ResponseEntity addModule(@RequestBody ModuleDto moduleDto){
        return sendSuccesResponse(moduleService.addModuleService(moduleDto));
    }
    @DeleteMapping
    public ResponseEntity deleteModule(@RequestParam String moduleCode){
        return sendSuccesResponse(moduleService.deleteModuleService(moduleCode));
    }
}
