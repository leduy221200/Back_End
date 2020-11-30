package backend.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Bills;

@Service
public class BillsServices implements BillsServicesImp{
	@Autowired
	BillsRepository br;

	@Override
	public <S extends Bills> S save(S entity) {
		return br.save(entity);
	}

	@Override
	public Optional<Bills> findById(String id) {
		return br.findById(id);
	}

	@Override
	public Iterable<Bills> findAll() {
		return br.findAll();
	}

	@Override
	public void deleteById(String id) {
		br.deleteById(id);
	}
	
	
}
