package com.kaya.myhome.repository;

import com.kaya.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
