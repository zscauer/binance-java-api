package com.binance.api.client;

import com.binance.api.client.exception.BinanceApiException;
import okhttp3.Response;

/**
 * BinanceApiCallback is a functional interface used together with the BinanceApiAsyncClient to provide a non-blocking REST client.
 *
 * @param <T> the return type from the callback
 */
@FunctionalInterface
public interface BinanceApiCallback<T> {

    /**
     * Called whenever a response comes back from the Binance API.
     *
     * @param response the expected response object
     */
    void onResponse(T response);

    /**
     * Called whenever an error occurs.
     *
     * @param cause the cause of the failure
     */
    default void onFailure(Throwable cause) {
        System.out.printf("Exception in default onFailure(Throwable) method of BinanceApiCallback: %s", cause.getMessage());
        if (cause instanceof BinanceApiException exception) {
            System.out.printf("Error code: %s", exception.getError().getCode());
        } else {
            cause.printStackTrace(System.err);
        }
    }

    default void onFailure(Throwable cause, Response response) {
        System.out.println("Exception in default onFailure(Throwable, Response) method of BinanceApiCallback.\n" + cause.getMessage());
        if (response != null) {
            if (response.body() != null) {
                System.out.println("Response body:\n" + response.body());
            }
            System.out.println("Responce request\n" + response.request());
        }
        cause.printStackTrace(System.err);
    }
}