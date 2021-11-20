package org.example.StructuralPatterns.bridge;

import org.example.StructuralPatterns.bridge.devices.Device;
import org.example.StructuralPatterns.bridge.devices.Radio;
import org.example.StructuralPatterns.bridge.devices.Tv;
import org.example.StructuralPatterns.bridge.remotes.AdvancedRemote;
import org.example.StructuralPatterns.bridge.remotes.BasicRemote;

public class BridgeService{

        public Device exec(String strDevice) throws Exception {
            Device device;
            switch (strDevice.toUpperCase()){
                case ("ТВ"):
                    device = new Tv();
                    testDevice(device);
                    break;
                case ("РАДИО"):
                    device = new Radio();
                    testDevice(device);
                    break;
                default:
                    System.out.println(strDevice.toUpperCase());
                    throw new Exception("Такого устройства не найдено.");
            }
            return device;
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

