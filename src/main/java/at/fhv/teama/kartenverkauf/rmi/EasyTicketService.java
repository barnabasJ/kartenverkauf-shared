package at.fhv.teama.kartenverkauf.rmi;

import at.fhv.teama.kartenverkauf.dto.AddressDto;

public interface EasyTicketService {
    void saveAddress(AddressDto addressDto);
}
