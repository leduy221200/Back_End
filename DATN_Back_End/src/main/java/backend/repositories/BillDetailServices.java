package backend.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Bill_Detail;

@Service
public class BillDetailServices implements BillDetailServicesImp{
	
	@Autowired
	BillDetailRepository dbr;

	@Override
	public <S extends Bill_Detail> S save(S entity) {
		return dbr.save(entity);
	}

	@Override
	public Optional<Bill_Detail> findById(String id) {
		return dbr.findById(id);
	}

	@Override
	public Iterable<Bill_Detail> findAll() {
		return dbr.findAll();
	}

	@Override
	public void deleteById(String id) {
		dbr.deleteById(id);
	}
	
	
}
