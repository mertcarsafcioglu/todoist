package com.mertcarsafcioglu.todoist.repository;

import com.mertcarsafcioglu.todoist.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
