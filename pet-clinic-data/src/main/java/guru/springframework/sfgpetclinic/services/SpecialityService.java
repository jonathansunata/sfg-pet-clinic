package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Speciality;

import java.util.Set;

public interface SpecialityService {
    Speciality findById(Long id);
    Speciality save(Speciality pet);
    Set<Speciality> findAll();
}
