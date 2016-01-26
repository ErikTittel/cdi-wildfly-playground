package numberguess;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Logging
public class LoggingInterceptor implements Serializable {

    private static final Logger LOG = Logger.getLogger(LoggingInterceptor.class.getName());

    @Inject
    private MessageHolder messageHolder;

    @AroundInvoke
    public Object doLog(InvocationContext ctx) throws Exception {
        LOG.info("Method got called: " + ctx.getMethod() + ", Parameter value: '" + ctx.getParameters()[0] + '\'');
        return ctx.proceed();
    }

}
