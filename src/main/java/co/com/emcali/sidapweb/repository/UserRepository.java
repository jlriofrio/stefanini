package co.com.emcali.sidapweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.emcali.sidapweb.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
