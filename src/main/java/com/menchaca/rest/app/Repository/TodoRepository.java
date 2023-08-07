package com.menchaca.rest.app.Repository;

import com.menchaca.rest.app.MODEL.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Task, Long> {

}
