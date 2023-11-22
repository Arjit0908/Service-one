package com.MSONE.MSOne.service;


import com.MSONE.MSOne.repo.ServiceOneRepo;
import com.MSONE.MSOne.entity.ServiceOneEntity;
import com.MSONE.MSOne.repo.ServiceOneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOneServiceimpl implements ServiceOneService {

    @Autowired
    private ServiceOneRepo serviceTwoRepo;


    @Override
    public ServiceOneEntity saveEntity(ServiceOneEntity serviceTwoEntity) {
        return serviceTwoRepo.save(serviceTwoEntity);
    }
}