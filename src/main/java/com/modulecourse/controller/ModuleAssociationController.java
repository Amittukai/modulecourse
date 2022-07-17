package com.modulecourse.controller;

import com.modulecourse.entitidto.ModuleAssociationDto;
import com.modulecourse.service.ModuleAssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/moduleassociation")
public class ModuleAssociationController extends BaseController {

    @Autowired
    ModuleAssociationService moduleAssociationService;

    @GetMapping()
    public ResponseEntity getModuleAssociation(){
        return sendSuccesResponse(moduleAssociationService.getModuleAssociation());
    }

    @PostMapping()
    public ResponseEntity addModuleAssociation(@RequestBody ModuleAssociationDto moduleAssociationDto){
        return sendSuccesResponse(moduleAssociationService.addModuleAssociationService(moduleAssociationDto));
    }

    @DeleteMapping
    public ResponseEntity deleteModuleAssociation(@RequestParam String id){
        return sendSuccesResponse(moduleAssociationService.deteleModuleAssociation(id));
    }
}
