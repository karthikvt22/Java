//package OOPS.packages.inter_faces;

public class Car implements Vehicle,Media{

    public void brake() {
        System.out.println("i brake like hell!");
    }

    @Override
    public void start() {
    System.out.println("Starting");
    }

    @Override
    public void stop() {
    System.out.println("Stopped");
    }

    @Override
    public void acc() {
    System.out.println("i accelerate like hell");
    }
    public void play(){
        System.out.println("Playing songs");
    }
}

