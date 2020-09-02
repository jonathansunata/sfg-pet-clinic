package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;

import java.util.Set;

public interface PetTypeService  {
    PetType findById(Long id);
    PetType save(PetType pet);
    Set<PetType> findAll();
}
