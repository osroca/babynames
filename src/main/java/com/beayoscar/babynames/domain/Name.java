package com.beayoscar.babynames.domain;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Enumerated;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findNamesByGender" })
@RooJson
public class Name {

    private Integer vote = 0;

    @NotNull
    @Column(unique = true)
    @Size(min = 3)
    private String name;

    private String description;

    @NotNull
    @Enumerated
    private Gender gender;

    public static TypedQuery<Name> findNamesByGender(Gender gender) {
        if (gender == null) throw new IllegalArgumentException("The gender argument is required");
        EntityManager em = Name.entityManager();
        TypedQuery<Name> q = em.createQuery("SELECT o FROM Name AS o WHERE o.gender = :gender ORDER BY o.vote DESC, o.name DESC, o.id DESC", Name.class);
        q.setParameter("gender", gender);
        return q;
    }
}
