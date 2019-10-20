package at.fhv.teama.kartenverkauf.rmi;

import at.fhv.teama.kartenverkauf.dto.AddressDto;
import java.rmi.Remote;

public interface EasyTicketService extends Remote {
    void saveAddress(AddressDto addressDto);
}
