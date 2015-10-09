package com.example;


import java.util.Random;

public class JokeLib {
    String[] jokeArray = {"Here is Joke 1", "Here is Joke 2","Here is Joke 3"};

    public String getJoke(){
        int numJokes = jokeArray.length;
        int randomJokeIndex = new Random().nextInt(numJokes);
        return jokeArray[randomJokeIndex];
    }
}
