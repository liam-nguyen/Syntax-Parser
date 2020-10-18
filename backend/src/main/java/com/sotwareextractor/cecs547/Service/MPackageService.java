package com.sotwareextractor.cecs547.Service;

import com.sotwareextractor.cecs547.Model.MPackage;
import com.sotwareextractor.cecs547.Repository.MPackageRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MPackageService {
    private MPackageRepository mPackageRepository;
    @Autowired
    public void setPackageRepository(MPackageRepository mPackageRepository) {
        this.mPackageRepository = mPackageRepository;
    }

    public MPackage addPackage(String name) {
        List<MPackage> existing = mPackageRepository.findByName(name);
        if (existing.size() == 0) {
            return mPackageRepository.save(new MPackage(name));
        } else {
            System.out.println("Package already exists.");
            return null;
        }
    }
}