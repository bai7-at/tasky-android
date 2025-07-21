package defpackage;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class wk1 implements cy8 {
    public static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    private final ka1 a;
    private final ConcurrentHashMap b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public wk1(ka1 ka1Var) {
        zq3.h(ka1Var, "uploadConfiguration");
        this.a = ka1Var;
        this.b = new ConcurrentHashMap();
    }

    private final long b(long j) {
        return Math.max(this.a.d(), dg4.e(j * 0.9d));
    }

    private final long c(long j, Throwable th) {
        return th instanceof IOException ? d : Math.min(this.a.c(), dg4.e(j * 1.1d));
    }

    @Override // defpackage.cy8
    public long a(String str, int i, Integer num, Throwable th) {
        long c2;
        Object putIfAbsent;
        zq3.h(str, "featureName");
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = Long.valueOf(this.a.a())))) != null) {
            obj = putIfAbsent;
        }
        Long l = (Long) obj;
        if (i <= 0 || th != null || num == null || num.intValue() != 202) {
            zq3.g(l, "previousDelay");
            c2 = c(l.longValue(), th);
        } else {
            zq3.g(l, "previousDelay");
            c2 = b(l.longValue());
        }
        this.b.put(str, Long.valueOf(c2));
        return c2;
    }
}
