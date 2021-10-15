package com.interview.sega.gametransactions.controller;

import com.interview.sega.gametransactions.Game;
import com.interview.sega.gametransactions.repository.GameRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@WebMvcTest(GameController.class)
@AutoConfigureMockMvc
public class GameControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private GameController gameController;

    @Autowired
    private GameRepository gameRepository;

   // @Test
    public void getTransactions() throws Exception {
        Game game1 = new Game();
        game1.setUserId("432432");
        game1.setTransactionId("wqrwq");
        game1.setProduct("4324re2");
        game1.setAmount("£345");

        Game game2 = new Game();
        game2.setUserId("432er32");
        game2.setTransactionId("wqrrerwq");
        game2.setProduct("rerre");
        game2.setAmount("£300");

        gameRepository.save(game1);
        gameRepository.save(game2);

        List<Game> gameList = (List<Game>) gameRepository.findAll();
        assertEquals("wqrwq", gameList.get(1).getTransactionId());
    }

}

