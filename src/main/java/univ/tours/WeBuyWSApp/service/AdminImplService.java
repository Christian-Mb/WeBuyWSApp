package univ.tours.WeBuyWSApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.tours.WeBuyWSApp.dao.AdminJPARepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AdminImplService implements IAdminService{

    @Autowired
    AdminJPARepository adminRepo;

    @Override
    public void retrogradeAdmin(int id) {
        adminRepo.retrogradeUser(id);
    }
}
