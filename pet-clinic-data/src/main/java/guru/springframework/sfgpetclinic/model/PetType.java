package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "petType")
    private Set<Pet> pets = new HashSet<>();
}
