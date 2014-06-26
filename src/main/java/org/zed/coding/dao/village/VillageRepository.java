package org.zed.coding.dao.village;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.zed.coding.model.village.Village;

public interface VillageRepository extends MongoRepository<Village, String> {

}