package at.fhv.teama.easyticket.rmi;

import at.fhv.teama.easyticket.dto.AddressDto;
import at.fhv.teama.easyticket.dto.ProgramDto;

public interface EasyTicketService {
    void saveAddress(AddressDto addressDto);

    void saveProgram(ProgramDto programDto);
}
