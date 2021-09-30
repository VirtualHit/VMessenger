package net.ibxnjadev.vmesseger.universal;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * The messenger for can send message and intercept
 */

public interface Messenger {

    /**
     * Send the message
     * @param subChannel the subChannel
     * @param object the object that send
     */

    <T> void sendMessage(String subChannel, T object);

    /**
     * intercept when is received the message
     * @param subChannel the subChannel
     * @param clazz the object clazz
     * @param interceptor the interceptor
     */

    default <T> void intercept(String subChannel, Class<T> clazz, Interceptor<T> interceptor) {
        getInterceptorHandler()
                .register(subChannel, new DefaultInterceptorData<>(clazz, interceptor));
    }

    /**
     * This is executed when message is received
     * @param subChannel the subChannel
     * @param content the content message that be will serialized
     */

    default void call(String subChannel, String content) {
        getInterceptorHandler()
                .call(subChannel, content);
    }

    /**
     * unregister all interceptors
     */

    default void unregisterAll() {
        getInterceptorHandler()
                .unregisterAll();
    }

    /**
     * @return the channel name
     */

    String getChannelName();

    /**
     * @return the interceptor handler
     */

    InterceptorHandler getInterceptorHandler();

}
