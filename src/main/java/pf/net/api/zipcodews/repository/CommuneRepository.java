package pf.net.api.zipcodews.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.zipcodews.domains.Commune;

import javax.persistence.Cacheable;

@Cacheable
public interface CommuneRepository extends CrudRepository<Commune, Long> {
}
