package com.hassanwasfy.ultimatesolutions.domain.state;

public abstract class State<T> {


    public static final class Success<T> extends State<T> {
        private final T data;

        public Success(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    public static final class Loading<T> extends State<T> {
        public Loading() {}

        public static <T> Loading<T> getInstance() {
            return new Loading<>();
        }
    }

    public static final class Error<T> extends State<T> {
        private final String errorMessage;

        public Error(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getErrorMessage() {
            return errorMessage;
        }
    }
}
