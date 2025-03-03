package com.sio.restdata;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
