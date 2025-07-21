package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class is3 {
    private static final Logger a;
    private static final is3 b;

    static {
        Logger logger = Logger.getLogger(is3.class.getName());
        a = logger;
        is3 a2 = d41.a();
        b = a2;
        if (a2.getClass() != is3.class) {
            logger.log(Level.FINE, "Using the APIs optimized for: {0}", a2.c());
        }
    }

    public static is3 b() {
        return b;
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    String c() {
        return "Java 8";
    }
}
