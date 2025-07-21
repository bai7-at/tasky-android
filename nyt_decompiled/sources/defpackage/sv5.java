package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
public final class sv5 {
    public static final sv5 b;
    private final a a;

    private static final class a {
        public static final a b;
        public final LogSessionId a;

        static {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            b = new a(logSessionId);
        }

        public a(LogSessionId logSessionId) {
            this.a = logSessionId;
        }
    }

    static {
        b = z19.a < 31 ? new sv5() : new sv5(a.b);
    }

    public sv5() {
        this((a) null);
        ur.g(z19.a < 31);
    }

    public LogSessionId a() {
        return ((a) ur.e(this.a)).a;
    }

    public sv5(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private sv5(a aVar) {
        this.a = aVar;
    }
}
