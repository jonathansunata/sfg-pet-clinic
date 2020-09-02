package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import javassist.bytecode.stackmap.BasicBlock;

import java.util.*;

public class AbstractMapService <T extends BaseEntity, ID extends Long> {

    Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        if(map.get(id) == null)
            throw new RuntimeException("There is no such id");
        return map.get(id);
    }

    T save(T object)
    {
        if(object != null) {

            if(object.getId() == null)
            {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id)
    {
        if(map.get(id) == null)
            throw new RuntimeException("There is no such object");

        map.remove(id);
    }

    void delete(T object)
    {
        map.entrySet().removeIf(entry -> entry.equals(object));
    }


    private Long getNextId() {

        Long nextId = null;

        try
        {
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch (Exception e)
        {
            nextId = 1L;
        }

        return nextId;
    }

}
