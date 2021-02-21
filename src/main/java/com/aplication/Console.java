package com.aplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;

public class Console {

    Questions questions = new Questions();

    public void jsonToObj() {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Questions questions = mapper.readValue
                    (Paths.get("E:\\Java_programy\\Milionerzy\\src\\main\\resources\\questions.json").
                                    toFile(),
                            Questions.class);

            System.out.println(questions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test(){

        questions.readTresc();

    }


}
