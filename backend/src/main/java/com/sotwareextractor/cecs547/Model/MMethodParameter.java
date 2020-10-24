package com.sotwareextractor.cecs547.Model;


import javax.persistence.*;

@Entity
public class MMethodParameter {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private int mOrder;
    @ManyToOne(cascade = CascadeType.ALL)
    private MType mType;
    @ManyToOne(cascade = CascadeType.ALL)
    private MMethod mMethod;

    public MMethodParameter() {
    }
    public MMethodParameter(String name, int mOrder, MType mType, MMethod mMethod) {
        this.name = name;
        this.mOrder = mOrder;
        this.mType = mType;
        this.mMethod = mMethod;
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
    public MMethod getmMethod() {
        return mMethod;
    }
    public void setmMethod(MMethod mMethod) {
        this.mMethod = mMethod;
    }
}
