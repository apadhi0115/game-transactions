package com.interview.sega.gametransactions;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Game {
    private @Id String userId;
    @Column(unique = true)
    private String transactionId;
    private String product;
    private String amount;
}
