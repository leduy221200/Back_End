package backend.repositories;

import java.util.List;
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
	public Optional<Customers> findById(Integer id) {
		return cr.findById(id);
	}

	@Override
	public Iterable<Customers> findAll() {
		return cr.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		cr.deleteById(id);
	}

	@Override
	public List<Customers> findByUserName(String userName) {
		return cr.findByUserName(userName);
	}
	
	@Override
	public List<Customers> loginCustomer(String userName, String passWord) {
		return cr.loginCustomer(userName, passWord);
	}
	
	@Override
	public Optional<Customers> findCustomerByEmailUserName(String userName, String email) {
		return cr.findCustomerByEmailUserName(userName, email);
	}	
}
