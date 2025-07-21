package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class jl8 {
    private static final TimeUnit e = TimeUnit.MINUTES;
    private final Logger a;
    private final AtomicBoolean b;
    private final yo6 c;
    private final yo6 d;

    public jl8(Logger logger) {
        this(logger, yl0.a());
    }

    jl8(Logger logger, yl0 yl0Var) {
        this.b = new AtomicBoolean(false);
        this.a = logger;
        TimeUnit timeUnit = e;
        this.c = new yo6(5.0d / timeUnit.toSeconds(1L), 5.0d, yl0Var);
        this.d = new yo6(5.0d / timeUnit.toSeconds(1L), 1.0d, yl0Var);
    }
}
