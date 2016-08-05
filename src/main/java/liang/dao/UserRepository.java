package liang.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import liang.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
}
