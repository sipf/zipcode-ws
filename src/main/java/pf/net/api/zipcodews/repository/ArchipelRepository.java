package pf.net.api.zipcodews.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.zipcodews.domains.Archipel;

import javax.persistence.Cacheable;

@Cacheable
public interface ArchipelRepository extends CrudRepository<Archipel, Long> {
}
