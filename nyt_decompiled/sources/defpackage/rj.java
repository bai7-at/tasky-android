package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class rj {
    private static final Logger a = Logger.getLogger(rj.class.getName());

    public static void a(String str) {
        b(str, Level.FINEST);
    }

    public static void b(String str, Level level) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            logger.log(level, str, (Throwable) new AssertionError());
        }
    }
}
