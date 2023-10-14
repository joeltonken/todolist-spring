package br.com.joelton.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ITaskRepository extends JpaRepository <TaskModel, UUID> {
}
