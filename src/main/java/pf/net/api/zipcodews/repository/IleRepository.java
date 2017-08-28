package pf.net.api.zipcodews.repository;

import org.springframework.data.repository.CrudRepository;
import pf.net.api.zipcodews.domains.Ile;

import javax.persistence.Cacheable;

@Cacheable
public interface IleRepository extends CrudRepository<Ile, Long> {
}
