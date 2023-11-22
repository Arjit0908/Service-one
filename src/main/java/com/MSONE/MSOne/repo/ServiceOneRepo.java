package com.MSONE.MSOne.repo;

import com.MSONE.MSOne.entity.ServiceOneEntity;
//import com.example.microservicetwo.entity.ServiceOneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOneRepo extends JpaRepository<ServiceOneEntity,Long>{
}
