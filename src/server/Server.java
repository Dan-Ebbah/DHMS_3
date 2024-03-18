package server;

import database.MontrealHashMap;
import database.QuebecHashMap;
import database.SherbrookeHashMap;

public class Server {
    public static void main(String[] args) {
        try {

            MontrealServerImpl montrealServer = new MontrealServerImpl(new MontrealHashMap());
            QuebecServerImpl quebecServer = new QuebecServerImpl(new QuebecHashMap());
            SherbrookeServerImpl sherbrookeServer = new SherbrookeServerImpl(new SherbrookeHashMap());
            ServerImpl[] servers = { montrealServer, quebecServer, sherbrookeServer};

//            for(ServerImpl server : servers) {
//                Object ref = rootpoa.servant_to_reference(server);
//                HealthCareSystem healthCareSystem = HealthCareSystemHelper.narrow(ref);
//                NameComponent[] path = ncRef.to_name(server.getServerName() + "_Server");
//                ncRef.rebind(path, healthCareSystem);
//            }

            System.out.println("All Servers are running ...");


        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
