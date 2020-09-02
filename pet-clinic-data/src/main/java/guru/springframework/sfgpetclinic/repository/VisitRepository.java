package guru.springframework.sfgpetclinic.repository;

import ch.qos.logback.classic.ViewStatusMessagesServlet;
import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {


}
