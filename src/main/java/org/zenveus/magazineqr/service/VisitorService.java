package org.zenveus.magazineqr.service;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zenveus.magazineqr.Repo.VisitorRepo;
import org.zenveus.magazineqr.dto.VisitorDTO;
import org.zenveus.magazineqr.entity.Visitor;

import java.util.List;

@Service
@Transactional
public class VisitorService {
    @Autowired
    private VisitorRepo visitorRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<Visitor> getAllVisitors() {

        List<Visitor> allVisitors = visitorRepo.findAll();

        return modelMapper.map(allVisitors, new TypeToken<List<VisitorDTO>>(){}.getType());

    }

    public VisitorDTO findVisitorById(String id) {
        return modelMapper.map(visitorRepo.findVisitorById(id), VisitorDTO.class);

    }
}
