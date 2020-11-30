package backend.repositories;

import java.util.Optional;

import backend.models.Bill_Detail;

public interface BillDetailServicesImp {

	void deleteById(String id);

	Iterable<Bill_Detail> findAll();

	Optional<Bill_Detail> findById(String id);

	<S extends Bill_Detail> S save(S entity);

}
