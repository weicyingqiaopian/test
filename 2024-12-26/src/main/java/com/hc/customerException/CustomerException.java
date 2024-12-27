package com.hc.customerException;

/**
*@description 自定义异常
*@author hc
*@date 2024/12/24  10:10
*/
public class CustomerException extends RuntimeException{
    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public CustomerException(String message) {
        super(message);
    }
}
