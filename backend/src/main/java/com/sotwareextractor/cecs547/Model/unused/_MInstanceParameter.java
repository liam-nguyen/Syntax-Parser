package com.sotwareextractor.cecs547.Model.unused;

import com.sotwareextractor.cecs547.Model.MType;
import com.sotwareextractor.cecs547.Model.unused._MInstanceMethod;

import javax.persistence.*;
import java.util.Collection;

public class _MInstanceParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private int mOrder;
    @ManyToOne(cascade = CascadeType.ALL)
    private MType mType;

    @ManyToMany(mappedBy = "mParameters", cascade = CascadeType.ALL)
    private Collection<_MInstanceMethod> instanceMethods;

    public _MInstanceParameter(){}
    public _MInstanceParameter(long id, String name, int mOrder, MType mType, Collection<_MInstanceMethod> instanceMethods) {
        Id = id;
        this.name = name;
        this.mOrder = mOrder;
        this.mType = mType;
        this.instanceMethods = instanceMethods;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MType getType() {
        return mType;
    }
    public void setType(MType type) {
        this.mType = type;
    }
    public int getOrder() {
        return mOrder;
    }
    public void setOrder(int order) {
        this.mOrder = order;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public int getmOrder() {
        return mOrder;
    }
    public void setmOrder(int mOrder) {
        this.mOrder = mOrder;
    }
    public MType getmType() {
        return mType;
    }
    public void setmType(MType mType) {
        this.mType = mType;
    }
    public Collection<_MInstanceMethod> getInstanceMethods() {
        return instanceMethods;
    }
    public void setInstanceMethods(Collection<_MInstanceMethod> instanceMethods) {
        this.instanceMethods = instanceMethods;
    }
}
