package proxy.gumballMachine;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
//        String[] locations = {"rmi://santafe.mightygumball.com/gumballmachine",
//                "rmi://boulder.mightygumball.com/gumballmachine", "rmi://seattle.mightygumball.com/gumballmachine"};
//
//        GumballMonitor[] monitors = new GumballMonitor[locations.length];
//
//        for (int i = 0; i < locations.length; i++) {
//            try {
//                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
//                monitors[i] = new GumballMonitor(machine);
//                System.out.println(monitors[i]);
//                monitors[i].report();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        // Localhost running
        String location = "rmi://localhost/gumballmachine";
        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor =  new GumballMonitor(machine);
            monitor.report();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
