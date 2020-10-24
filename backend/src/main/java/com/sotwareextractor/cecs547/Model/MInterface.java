package com.sotwareextractor.cecs547.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    @ManyToMany(mappedBy = "implementInterfaces", cascade = CascadeType.ALL)
    private List<MClass> implementedClasses;


    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<MClass> getImplementedClasses() {
        return implementedClasses;
    }
    public void setImplementedClasses(List<MClass> implementedClasses) {
        this.implementedClasses = implementedClasses;
    }
}
