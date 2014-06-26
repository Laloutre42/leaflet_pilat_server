package org.zed.coding.controller.village;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zed.coding.dao.village.VillageRepository;
import org.zed.coding.model.village.Village;

import java.util.Collection;

@RestController
public class VillageController {

    @Autowired
    private VillageRepository villageRepository;

    @ResponseBody
    public Collection<Village> getVillages() {
        return this.villageRepository.findAll();
    }

    @ResponseBody
    public Village getVillage(String id) {
        return this.villageRepository.findOne(id);
    }

    @ResponseBody
    public Village createVillage(Village village) {
        return this.villageRepository.save(village);
    }

    @ResponseBody
    public void deleteVillage(String id) {
        this.villageRepository.delete(id);
    }
}
