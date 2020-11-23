package backend.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Customers;

@Service
public class CustomersServicesImp implements CustomersServices{
	@Autowired
	CustomersRepository cr;

	@Override
	public <S extends Customers> S save(S entity) {
		return cr.save(entity);
	}

	@Override
	public Optional<Customers> findById(String id) {
		return cr.findById(id);
	}

	@Override
	public Iterable<Customers> findAll() {
		return cr.findAll();
	}

	@Override
	public void deleteById(String id) {
		cr.deleteById(id);
	}

	@Override
	public Integer findByUserName(String userName) {
		return cr.findByUserName(userName);
	}
		
}
