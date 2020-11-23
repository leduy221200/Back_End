package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Voucher;

public interface VoucherService  {

	void deleteAll();

	void deleteAll(List<Voucher> entities);

	void delete(Voucher entity);

	void deleteById(String id);

	List<Voucher> findAllById(Iterable<String> ids);

	List<Voucher> findAll();

	Optional<Voucher> findById(String id);

	List<Voucher> saveAll(List<Voucher> entities);

	Voucher save(Voucher entity);

	

}
