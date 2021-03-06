package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Bills;

public interface BillsServicesImp {

	void deleteById(String id);

	Iterable<Bills> findAll();

	Optional<Bills> findById(String id);

	<S extends Bills> S save(S entity);

	List<Bills> thongKeDoanhThu();

	List<String> getAllBill();

}
