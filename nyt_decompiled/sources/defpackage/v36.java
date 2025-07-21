package defpackage;

import android.content.Context;
import androidx.work.a;

/* loaded from: classes.dex */
public abstract class v36 {
    private static final String a;

    static {
        String i = h94.i("ProcessUtils");
        zq3.g(i, "tagWithPrefix(\"ProcessUtils\")");
        a = i;
    }

    private static final String a(Context context) {
        return fj.a.a();
    }

    public static final boolean b(Context context, a aVar) {
        zq3.h(context, "context");
        zq3.h(aVar, "configuration");
        String a2 = a(context);
        String c = aVar.c();
        return (c == null || c.length() == 0) ? zq3.c(a2, context.getApplicationInfo().processName) : zq3.c(a2, aVar.c());
    }
}
