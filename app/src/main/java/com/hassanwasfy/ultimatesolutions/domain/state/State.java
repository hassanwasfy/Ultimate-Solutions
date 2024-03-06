package com.hassanwasfy.ultimatesolutions.domain.state;

public abstract class State<T> {
    public static class Success<T> extends State<T> {
        private final T data;

        public Success(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    public static class Error extends State {
        private final String message;

        public Error(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class Loading extends State {
        private Loading() {}

        public static Loading getInstance() {
            return new Loading();
        }
    }
}
