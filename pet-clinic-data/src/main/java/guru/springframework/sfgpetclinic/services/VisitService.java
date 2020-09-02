package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Visit;

import java.util.Set;

public interface VisitService {
    Visit findById(Long id);
    Visit save(Visit pet);
    Set<Visit> findAll();
}
