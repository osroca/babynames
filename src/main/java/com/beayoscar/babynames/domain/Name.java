package com.beayoscar.babynames.domain;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Name {

    @Min(0L)
    private Integer vote;

    @NotNull
    @Column(unique = true)
    @Size(min = 3)
    private String name;

    private String description;

    @NotNull
    @Enumerated
    private Gender gender;
}
