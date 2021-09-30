package net.ibxnjadev.vmesseger.universal;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Contain the data for a interceptor of a object
 */

public interface DataInterceptor<T> {

    /**
     * @return The class object interceptor
     */

    Class<T> getClazz();

    /**
     * @return The interceptor
     */

    Interceptor<T> getInterceptor();

}
