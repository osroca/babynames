// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.beayoscar.babynames.domain;

import com.beayoscar.babynames.domain.Gender;
import java.lang.Integer;
import java.lang.String;

privileged aspect Name_Roo_JavaBean {
    
    public Integer Name.getVote() {
        return this.vote;
    }
    
    public void Name.setVote(Integer vote) {
        this.vote = vote;
    }
    
    public String Name.getName() {
        return this.name;
    }
    
    public void Name.setName(String name) {
        this.name = name;
    }
    
    public String Name.getDescription() {
        return this.description;
    }
    
    public void Name.setDescription(String description) {
        this.description = description;
    }
    
    public Gender Name.getGender() {
        return this.gender;
    }
    
    public void Name.setGender(Gender gender) {
        this.gender = gender;
    }
    
}
