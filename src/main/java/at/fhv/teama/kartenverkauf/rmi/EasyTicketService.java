package at.fhv.teama.kartenverkauf.rmi;

import at.fhv.teama.kartenverkauf.dto.AddressDto;
import at.fhv.teama.kartenverkauf.dto.ProgramDto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EasyTicketService extends Remote {
    void saveAddress(AddressDto addressDto) throws RemoteException;

    void saveProgram(ProgramDto programDto) throws RemoteException;
}
