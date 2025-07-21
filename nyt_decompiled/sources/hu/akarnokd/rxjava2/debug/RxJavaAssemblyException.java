package hu.akarnokd.rxjava2.debug;

/* loaded from: classes4.dex */
public final class RxJavaAssemblyException extends RuntimeException {
    private static final long serialVersionUID = -6757520270386306081L;
    final String stacktrace = a();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        sb.append("RxJavaAssemblyException: assembled\r\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (b(stackTraceElement)) {
                sb.append("at ");
                sb.append(stackTraceElement);
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    private static boolean b(StackTraceElement stackTraceElement) {
        if (stackTraceElement.getLineNumber() == 1) {
            return false;
        }
        String className = stackTraceElement.getClassName();
        return (className.contains("java.lang.Thread") || className.contains("junit.runner") || className.contains("org.junit.internal") || className.contains("junit4.runner") || className.contains("java.lang.reflect") || className.contains("sun.reflect") || className.contains(".RxJavaAssemblyException") || className.contains("OnAssembly") || className.contains("RxJavaAssemblyTracking") || className.contains("RxJavaPlugins")) ? false : true;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
