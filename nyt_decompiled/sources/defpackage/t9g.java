package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class t9g implements tt9 {
    private final Context a;
    private final ar9 b;

    public t9g(Context context, ar9 ar9Var, otb otbVar) {
        this.a = context;
        this.b = ar9Var;
        int i = khe.a;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && i == 30) {
            String str = khe.d;
            if (!yfe.c(str, "moto g(20)")) {
                yfe.c(str, "rmx3231");
            }
        }
        throw null;
    }
}
