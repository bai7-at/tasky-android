package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class z8e {
    private static final z8e b = new z8e();
    private Context a;

    private z8e() {
    }

    public static z8e b() {
        return b;
    }

    public final Context a() {
        return this.a;
    }

    public final void c(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
