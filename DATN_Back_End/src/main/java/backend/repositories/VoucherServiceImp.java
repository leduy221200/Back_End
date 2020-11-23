package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import backend.models.Voucher;


@Service
public class VoucherServiceImp implements VoucherService {

	@Autowired
	VoucherRepository voucherRepository;

	@Override
	public Voucher save(Voucher entity) {
		return voucherRepository.save(entity);
	}

	@Override
	public List<Voucher> saveAll(List<Voucher> entities) {
		return (List<Voucher>)voucherRepository.saveAll(entities);
	}

	@Override
	public Optional<Voucher> findById(String id) {
		return voucherRepository.findById(id);
	}

	@Override
	public List<Voucher> findAll() {
		return (List<Voucher>)voucherRepository.findAll();
	}

	@Override
	public List<Voucher> findAllById(Iterable<String> ids) {
		return (List<Voucher>)voucherRepository.findAllById(ids);
	}

	@Override
	public void deleteById(String id) {
		voucherRepository.deleteById(id);
	}

	@Override
	public void delete(Voucher entity) {
		voucherRepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Voucher> entities) {
		voucherRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		voucherRepository.deleteAll();
	}

	
	
	
	
	
}
