package com.binance.api.client;

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
        System.out.println("Exception in default onFailure(Throwable) method of BinanceApiCallback.\n" + cause.getMessage());
        cause.printStackTrace(System.err);
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