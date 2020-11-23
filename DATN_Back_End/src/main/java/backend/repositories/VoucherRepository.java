package backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.models.Voucher;

@Repository
public interface VoucherRepository extends CrudRepository<Voucher, String> {

}
