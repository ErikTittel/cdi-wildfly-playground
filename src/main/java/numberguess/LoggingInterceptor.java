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
        messageHolder.setMessage("Message from Interceptor");
        LOG.info("Info-Log-Message from Logging Interceptor: I'm in the method: " + ctx.getMethod());
        return ctx.proceed();
    }

}
