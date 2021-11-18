package org.example.StructuralPatterns.bridge;

import org.example.StructuralPatterns.bridge.devices.Device;
import org.example.StructuralPatterns.bridge.devices.Radio;
import org.example.StructuralPatterns.bridge.devices.Tv;
import org.example.StructuralPatterns.bridge.remotes.AdvancedRemote;
import org.example.StructuralPatterns.bridge.remotes.BasicRemote;

public class BridgeService{

        public void exec(String strDevice) throws Exception {
            switch (strDevice.toUpperCase()){
                case ("ТВ"):
                    testDevice(new Tv());
                    break;
                case ("РАДИО"):
                    testDevice(new Radio());
                    break;
                default:
                    System.out.println(strDevice.toUpperCase());
                    throw new Exception("Такого устройства не найдено.");
            }
        }

        private void testDevice(Device device) {
            System.out.println("Tests with basic remote.");
            BasicRemote basicRemote = new BasicRemote(device);
            basicRemote.power();
            device.printStatus();
            System.out.println("Tests with advanced remote.");
            AdvancedRemote advancedRemote = new AdvancedRemote(device);
            advancedRemote.power();
            advancedRemote.mute();
            device.printStatus();
        }

}

