package com.interview.sega.gametransactions.repository;

import com.interview.sega.gametransactions.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
}
