package com.joanna.springBootMongoDocker;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //konstruktor dla wszystkich argumentow
public class Producer {
    private String companyName;
    private String country;
}
