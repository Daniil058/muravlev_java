package org.example.StructuralPatterns.bridge.devices;

public interface Device {
    boolean isEnabled();
    int getVolume();
    int getChannel();

    void enable();
    void disable();
    void setVolume(int percent);
    void setChannel(int channel);
    void printStatus();
}
