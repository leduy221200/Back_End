package backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import backend.models.Bills;

public interface BillsRepository extends CrudRepository<Bills, String>{


	@Query(value = "select * from bills"  , nativeQuery = true)
	List<Bills> thongKeDoanhThu();
	
	@Query(value = "select * from bills"  , nativeQuery = true)
	List<String> getAllBill();
}
