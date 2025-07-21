package defpackage;

import android.content.Context;
import com.datadog.android.error.internal.DatadogExceptionHandler;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b11 implements ya2 {
    public static final a e = new a(null);
    private final jb2 a;
    private final AtomicBoolean b;
    private Thread.UncaughtExceptionHandler c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b11(jb2 jb2Var) {
        zq3.h(jb2Var, "sdkCore");
        this.a = jb2Var;
        this.b = new AtomicBoolean(false);
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        this.d = "crash";
    }

    private final void c() {
        Thread.setDefaultUncaughtExceptionHandler(this.c);
    }

    private final void f(Context context) {
        this.c = Thread.getDefaultUncaughtExceptionHandler();
        new DatadogExceptionHandler(this.a, context).c();
    }

    @Override // defpackage.ya2
    public void a() {
        c();
        this.b.set(false);
    }

    @Override // defpackage.ya2
    public void d(Context context) {
        zq3.h(context, "appContext");
        f(context);
        this.b.set(true);
    }

    @Override // defpackage.ya2
    public String getName() {
        return this.d;
    }
}
