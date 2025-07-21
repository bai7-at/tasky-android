package defpackage;

import java.util.concurrent.ThreadFactory;
import rx.internal.util.RxThreadFactory;

/* loaded from: classes5.dex */
public class s47 {
    private static final s47 a = new s47();

    protected s47() {
    }

    public static eb7 a() {
        return b(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static eb7 b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new f42(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static eb7 c() {
        return d(new RxThreadFactory("RxIoScheduler-"));
    }

    public static eb7 d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new ug0(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static eb7 e() {
        return f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static eb7 f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new q55(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static s47 h() {
        return a;
    }

    public eb7 g() {
        return null;
    }

    public eb7 i() {
        return null;
    }

    public eb7 j() {
        return null;
    }

    public v3 k(v3 v3Var) {
        return v3Var;
    }
}
