package defpackage;

import android.app.Application;
import com.nytimes.android.hybrid.HybridScriptInflater;

/* loaded from: classes4.dex */
public final class tb3 {
    public static final tb3 a = new tb3();

    private tb3() {
    }

    public final xb3 a(Application application) {
        zq3.h(application, "app");
        return zb3.a(application);
    }

    public final bc3 b(xb3 xb3Var) {
        zq3.h(xb3Var, "component");
        return xb3Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HybridScriptInflater c() {
        return new HybridScriptInflater(null, 1, 0 == true ? 1 : 0);
    }
}
