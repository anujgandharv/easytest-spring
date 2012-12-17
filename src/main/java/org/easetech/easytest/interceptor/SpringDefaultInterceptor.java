
package org.easetech.easytest.interceptor;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * A default interceptor that simply Logs the time taken by a method in nano seconds to the attached logger.
 * 
 * @author Anuj Kumar
 *
 */
public class SpringDefaultInterceptor implements MethodInterceptor {
    
    /**
     * An instance of logger associated with the test framework.
     */
    protected static final Logger LOG = LoggerFactory.getLogger(SpringDefaultInterceptor.class);

    /**
     * Intercept the method with the advice
     * @param invocation 
     * @return returned value
     * @throws Throwable
     */

    public Object invoke(MethodInvocation invocation) throws Throwable {
        long startTime = System.nanoTime();
        Object result = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
        long duration = System.nanoTime() - startTime;
        LOG.debug("Method {} took {} nanoseconds", invocation.getMethod().getName(), duration);
        return result;
    }



    


}
