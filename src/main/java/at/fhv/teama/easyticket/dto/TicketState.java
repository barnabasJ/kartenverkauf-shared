package at.fhv.teama.easyticket.dto;

import at.fhv.teama.easyticket.interfaces.ObjectWithId;

import java.io.Serializable;

public enum TicketState implements Serializable {
    FREE,
    RESERVERD,
    SOLD,
}
