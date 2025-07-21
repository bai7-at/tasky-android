package defpackage;

import android.content.Context;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.WorkManagerUtilsKt;
import defpackage.r36;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class q36 implements r36.a {
    private final String a;
    private final InternalLogger b;
    private final Reference c;

    public q36(Context context, String str, InternalLogger internalLogger) {
        zq3.h(context, "appContext");
        zq3.h(str, "instanceName");
        zq3.h(internalLogger, "internalLogger");
        this.a = str;
        this.b = internalLogger;
        this.c = new WeakReference(context);
    }

    @Override // r36.a
    public void b() {
        Context context = (Context) this.c.get();
        if (context == null || !mj9.j()) {
            return;
        }
        WorkManagerUtilsKt.a(context, this.a, this.b);
    }

    @Override // r36.a
    public void c() {
    }

    @Override // r36.a
    public void d() {
    }

    @Override // r36.a
    public void f() {
        Context context = (Context) this.c.get();
        if (context == null || !mj9.j()) {
            return;
        }
        WorkManagerUtilsKt.b(context, this.a, this.b);
    }
}
