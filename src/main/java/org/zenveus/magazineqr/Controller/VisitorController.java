package org.zenveus.magazineqr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zenveus.magazineqr.dto.VisitorDTO;
import org.zenveus.magazineqr.entity.Visitor;
import org.zenveus.magazineqr.service.VisitorService;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor")
@CrossOrigin
public class VisitorController {
    //
    @Autowired
    public VisitorService visitorService;

    @GetMapping("/getVisitor")
    public List<Visitor> getVisitors() {
        return visitorService.getAllVisitors();
    }

    @GetMapping("/getVisitorById/{id}")
    public VisitorDTO getVisitorById(@PathVariable String id) {

        VisitorDTO visitorDTO = visitorService.findVisitorById(id);

        System.out.println("Visitor ID: " + visitorDTO.getVisitor_id());

        if (visitorDTO.getVisitor_id() != null){
            return visitorDTO;
        }else {
            return null;
        }
    }
}
