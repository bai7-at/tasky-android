package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class ydb implements via {
    private final Context a;
    private final Object b;
    private final String c;
    private boolean d;

    public ydb(Context context, String str) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = str;
        this.d = false;
        this.b = new Object();
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        c(uiaVar.j);
    }

    public final String a() {
        return this.c;
    }

    public final void c(boolean z) {
        if (dyf.p().p(this.a)) {
            synchronized (this.b) {
                try {
                    if (this.d == z) {
                        return;
                    }
                    this.d = z;
                    if (TextUtils.isEmpty(this.c)) {
                        return;
                    }
                    if (this.d) {
                        dyf.p().f(this.a, this.c);
                    } else {
                        dyf.p().g(this.a, this.c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
