package com.appiskey.raservice.util;

import com.appiskey.raservice.model.Skill;

import java.util.UUID;

public class Datagen {
    public static Skill generateSkill(String name) {
        Skill item = new Skill();
        item.setSkillName(name);
        UUID uuid = UUID.randomUUID();
//        item.setId(uuid);
        return item;
    }

    public static UUID getUuId(){
        UUID uuid = UUID.randomUUID();
//        UUID wrongUuid = UUID.fromString("123e4567-e89b-42d3-a456-886642449911");
        return uuid;
    }
}
