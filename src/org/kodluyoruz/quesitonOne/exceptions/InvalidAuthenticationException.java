package org.kodluyoruz.quesitonOne.exceptions;

public class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
