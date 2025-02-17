package com.sotwareextractor.cecs547.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;


@Entity
public class MMethodBody {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


    @OneToMany(mappedBy = "mMethodBody", cascade = CascadeType.ALL)
    List<MVariable> variables;


    @OneToMany(mappedBy = "mMethodBody", cascade = CascadeType.ALL)
    List<MMethodCall> methodCalls;

    @JsonIgnore
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }

    public List<MVariable> getVariables() {
        return variables;
    }
    public void setVariables(List<MVariable> variables) {
        this.variables = variables;
    }

    public List<MMethodCall> getMethodCalls() {
        return methodCalls;
    }
    public void setMethodCalls(List<MMethodCall> methodCalls) {
        this.methodCalls = methodCalls;
    }
}
