package com.example.Usecases;

public class ArmyUsecase implements Usecase {
    @Override
    public void defaultMode() {
        System.out.println("Default mode enabled!");
    }

    public void fightMode() {
        System.out.println("Fight mode enabled!");
    }
}