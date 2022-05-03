package nttdata.bootcamp.microservicios.representante.empresarial.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import nttdata.bootcamp.microservicios.representante.empresarial.document.BusinessRepresentative;
import reactor.core.publisher.Flux;

@Repository
public interface BusinessRepresentativeRepository extends ReactiveMongoRepository<BusinessRepresentative, String> {

	Flux<BusinessRepresentative> findByCorporateClientId(String CorporateClientId);

}
