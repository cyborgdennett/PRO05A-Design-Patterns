package com.example.Usecases;

public class RaceUsecase implements Usecase {
    @Override
    public void defaultMode() {
        System.out.println("Default mode enabled!");
    }

    public void raceMode() {
        System.out.println("Race mode enabled!");
    }
}