package defpackage;

import com.datadog.android.api.InternalLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class al5 implements ol9 {
    public static final a f = new a(null);
    private final jb2 a;
    private final kx0 b;
    private final h42 c;
    private final lx0 d;
    private final InternalLogger e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public al5(jb2 jb2Var, kx0 kx0Var, h42 h42Var, lx0 lx0Var, InternalLogger internalLogger) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(kx0Var, "ddSpanToSpanEventMapper");
        zq3.h(h42Var, "eventMapper");
        zq3.h(lx0Var, "serializer");
        zq3.h(internalLogger, "internalLogger");
        this.a = jb2Var;
        this.b = kx0Var;
        this.c = h42Var;
        this.d = lx0Var;
        this.e = internalLogger;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
