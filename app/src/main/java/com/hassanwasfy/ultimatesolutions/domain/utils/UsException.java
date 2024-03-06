package com.hassanwasfy.ultimatesolutions.domain.utils;

public abstract class UsException extends Throwable {
    public UsException(String message) {
        super(message);
    }

    public static class NoDataException extends UsException {
        public NoDataException(String message) {
            super(message);
        }
    }

    public static class RequestFailedException extends UsException {
        public RequestFailedException(String message) {
            super(message);
        }
    }

    public static class NoNetworkException extends UsException {
        public NoNetworkException(String message) {
            super(message);
        }
    }
}
