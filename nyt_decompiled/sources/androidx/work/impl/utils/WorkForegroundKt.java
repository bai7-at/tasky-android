package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import defpackage.ap2;
import defpackage.by0;
import defpackage.dk9;
import defpackage.h94;
import defpackage.rg8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.Executor;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes.dex */
public abstract class WorkForegroundKt {
    private static final String a;

    static {
        String i = h94.i("WorkForegroundRunnable");
        zq3.g(i, "tagWithPrefix(\"WorkForegroundRunnable\")");
        a = i;
    }

    public static final Object b(Context context, dk9 dk9Var, androidx.work.b bVar, ap2 ap2Var, rg8 rg8Var, by0 by0Var) {
        if (!dk9Var.q || Build.VERSION.SDK_INT >= 31) {
            return ww8.a;
        }
        Executor a2 = rg8Var.a();
        zq3.g(a2, "taskExecutor.mainThreadExecutor");
        Object withContext = BuildersKt.withContext(ExecutorsKt.from(a2), new WorkForegroundKt$workForeground$2(bVar, dk9Var, ap2Var, context, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }
}
