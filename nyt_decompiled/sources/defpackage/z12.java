package defpackage;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes4.dex */
public final class z12 {
    public static final z12 a = new z12();

    private z12() {
    }

    public static final Object a(Activity activity, Class cls) {
        zq3.h(activity, "activity");
        zq3.h(cls, "entryPoint");
        return a22.a(activity, cls);
    }

    public static final Object b(Context context, Class cls) {
        zq3.h(context, "context");
        zq3.h(cls, "entryPoint");
        return a22.a(yx0.a(context.getApplicationContext()), cls);
    }
}
