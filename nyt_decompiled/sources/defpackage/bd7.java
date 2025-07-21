package defpackage;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class bd7 implements q94, Closeable {
    private static final Logger d = Logger.getLogger(bd7.class.getName());
    private final ba4 a;
    private final pr0 b;
    private final boolean c;

    bd7(bz6 bz6Var, Supplier supplier, List list, yl0 yl0Var) {
        u84 c = u84.c(list);
        this.a = new ba4(bz6Var, supplier, c, yl0Var);
        this.b = new pr0(new Function() { // from class: ad7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                yc7 j;
                j = bd7.this.j((lm3) obj);
                return j;
            }
        });
        this.c = c instanceof j85;
    }

    public static dd7 h() {
        return new dd7();
    }

    private static String i(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        d.fine("Logger requested without instrumentation scope name.");
        return DatasetUtils.UNKNOWN_IDENTITY_ID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yc7 j(lm3 lm3Var) {
        return new yc7(this.a, lm3Var);
    }

    @Override // defpackage.q94
    public o94 b(String str) {
        return this.c ? q94.a().b(str) : new zc7(this.b, i(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().e(10L, TimeUnit.SECONDS);
    }

    public gq0 shutdown() {
        if (!this.a.e()) {
            return this.a.f();
        }
        d.log(Level.INFO, "Calling shutdown() multiple times.");
        return gq0.i();
    }

    public String toString() {
        return "SdkLoggerProvider{clock=" + this.a.a() + ", resource=" + this.a.d() + ", logLimits=" + this.a.b() + ", logRecordProcessor=" + this.a.c() + '}';
    }
}
