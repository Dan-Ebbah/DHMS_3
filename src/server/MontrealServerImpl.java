package server;

import database.HashMapImpl;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import util.LoggerUtil;

import java.net.SocketException;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class MontrealServerImpl extends ServerImpl{
    public MontrealServerImpl(HashMapImpl database) throws SocketException {
        super(database, 5052, LoggerUtil.getLogger(MontrealServerImpl.class.getName(), "Montreal"));
    }

    @Override
    public String getServerName() {
        return "Montreal";
    }
}
