package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "petType")
    private Set<Pet> pets = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
