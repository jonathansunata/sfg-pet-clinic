package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Optional<Owner> findOwnerByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
