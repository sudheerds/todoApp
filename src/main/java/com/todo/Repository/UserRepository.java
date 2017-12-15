package com.todo.Repository;

/**
 * Created by sudheerds on 15/12/17.
 */
import com.todo.Model.User;
import org.springframework.data.repository.CrudRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}