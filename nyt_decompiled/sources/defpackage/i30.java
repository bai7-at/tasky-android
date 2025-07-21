package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.thread.BackPressuredBlockingQueue;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i30 extends ThreadPoolExecutor implements ol2 {
    public static final a b = new a(null);
    private static final long c = TimeUnit.SECONDS.toMillis(5);
    private final InternalLogger a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(InternalLogger internalLogger, String str, j30 j30Var) {
        super(1, 1, c, TimeUnit.MILLISECONDS, new BackPressuredBlockingQueue(internalLogger, str, j30Var), new lb1(str));
        zq3.h(internalLogger, "logger");
        zq3.h(str, "executorContext");
        zq3.h(j30Var, "backpressureStrategy");
        this.a = internalLogger;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        ThreadExtKt.a(runnable, th, this.a);
    }
}
