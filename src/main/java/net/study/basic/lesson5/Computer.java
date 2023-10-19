package net.study.basic.lesson5;

import java.util.Objects;

public class Computer {

    public static int counter;
    public int numberOfCores;
    public int frequency;
    public int memoryVolume;
    public int hardDiskVolume;

    public Computer(int numberOfCores, int frequency, int memoryVolume, int hardDiskVolume) {
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.memoryVolume = memoryVolume;
        this.hardDiskVolume = hardDiskVolume;
        counter ++;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", memoryVolume=" + memoryVolume +
                ", hardDiskVolume=" + hardDiskVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return numberOfCores == computer.numberOfCores && frequency == computer.frequency && memoryVolume == computer.memoryVolume && hardDiskVolume == computer.hardDiskVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCores, frequency, memoryVolume, hardDiskVolume);
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public int getHardDiskVolume() {
        return hardDiskVolume;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setMemoryVolume(int memoryVolume) {
        this.memoryVolume = memoryVolume;
    }

    public void setHardDiskVolume(int hardDiskVolume) {
        this.hardDiskVolume = hardDiskVolume;
    }


}
