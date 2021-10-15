package com.interview.sega.gametransactions.controller;

import com.interview.sega.gametransactions.Game;
import com.interview.sega.gametransactions.repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private final GameRepository repository;

    GameController(GameRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/transaction")
    Game newGame(@RequestBody Game newGame) {
        return repository.save(newGame);
    }

    @GetMapping("/transactions")
    List<Game> allTransactions() {
        return repository.findAll();
    }

}
