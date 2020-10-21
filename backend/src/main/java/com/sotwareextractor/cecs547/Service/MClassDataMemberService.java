package com.sotwareextractor.cecs547.Service;

import com.sotwareextractor.cecs547.DAO.DClassField;
import com.sotwareextractor.cecs547.Model.MAccess;
import com.sotwareextractor.cecs547.Model.MClassDataMember;
import com.sotwareextractor.cecs547.Model.MPackage;
import com.sotwareextractor.cecs547.Model.MType;
import com.sotwareextractor.cecs547.Repository.MClassDataMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MClassDataMemberService {
    private MAccessService mAccessService;
    private MClassDataMemberRepository mClassDataMemberRepository;
    private MTypeService mTypeService;

    @Autowired
    public MClassDataMemberService(MAccessService mAccessService, MClassDataMemberRepository mClassDataMemberRepository, MTypeService mTypeService) {
        this.mAccessService = mAccessService;
        this.mClassDataMemberRepository = mClassDataMemberRepository;
        this.mTypeService = mTypeService;
    }

    public MClassDataMember add(DClassField field) {
        List<MClassDataMember> existing = mClassDataMemberRepository.findByName(field.getName());
        for (var instance : existing) {
            if (instance.getmAccess() != null &&
                    instance.getmAccess().getAccessName().equals(field.getName()) &&
                    instance.getmType() != null &&
                    instance.getmType().getName().equals(field.getType())) {
                return instance;
            }
        }
        String name = field.getName();
        MAccess mAccess = mAccessService.getOrCreate(field.getModifier());
        MType mType = mTypeService.getOrCreate(field.getType());
        return mClassDataMemberRepository.save(new MClassDataMember(name, mAccess, mType));
    }
}
