package com.app.login.repository;

import com.app.login.modal.UserModal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModal, String> {
    UserModal findById(long id);

    @Query(value="SELECT * FROM login_db.user_modal WHERE email = :email AND password = :password", nativeQuery = true)
    public UserModal login(String email, String password);
}
