package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityMapService specialityMapService;

    public VetMapService(SpecialityMapService specialityMapService) {
        this.specialityMapService = specialityMapService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialities() != null && vet.getSpecialities().size() > 0)
        {
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null)
                {
                    Speciality savedSpeciality = specialityMapService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }
}
