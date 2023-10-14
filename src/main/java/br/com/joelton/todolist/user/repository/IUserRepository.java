package br.com.joelton.todolist.user.repository;

import br.com.joelton.todolist.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUserName(String username);
}
