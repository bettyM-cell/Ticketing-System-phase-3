package com.ticket.exception;

public class InvalidSeatException extends RuntimeException {
    public InvalidSeatException(String m){
        super(m);
    }
}
