package at.fhv.teama.kartenverkauf.rmi;

import at.fhv.teama.kartenverkauf.dto.AddressDto;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EasyTicketService extends Remote {
    void saveAddress(AddressDto addressDto) throws RemoteException;
}
