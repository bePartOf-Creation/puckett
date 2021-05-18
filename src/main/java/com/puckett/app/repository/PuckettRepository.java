package com.puckett.app.repository;

import com.puckett.app.models.Puckett;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PuckettRepository extends MongoRepository<Puckett, String> {
}
