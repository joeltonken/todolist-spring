package br.com.joelton.todolist.task.repository;

import br.com.joelton.todolist.task.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ITaskRepository extends JpaRepository <TaskModel, UUID> {

    List<TaskModel> findByIdUser(UUID idUser);
}
