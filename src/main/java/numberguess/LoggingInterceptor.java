package numberguess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Logging
public class LoggingInterceptor implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Inject
    private MessageHolder messageHolder;

    @AroundInvoke
    public Object doLog(InvocationContext ctx) throws Exception {
        LOG.info("Method got called: " + ctx.getMethod() + ", Parameter value: '" + ctx.getParameters()[0] + '\'');
        return ctx.proceed();
    }

}
