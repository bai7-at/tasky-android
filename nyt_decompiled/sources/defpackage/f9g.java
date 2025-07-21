package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class f9g {
    private final Context a;
    private njc b;
    private ksb c;
    private vr9 d;
    private boolean e;

    public f9g(Context context) {
        this.a = context;
    }

    public final f9g c(vr9 vr9Var) {
        this.d = vr9Var;
        return this;
    }

    public final ar9 d() {
        wad.f(!this.e);
        yq9 yq9Var = null;
        if (this.c == null) {
            if (this.b == null) {
                this.b = new p9g(null);
            }
            this.c = new r9g(this.b);
        }
        if (this.d == null) {
            this.d = new vr9(this.a, new j9g(null), 0L);
        }
        ar9 ar9Var = new ar9(this, yq9Var);
        this.e = true;
        return ar9Var;
    }
}
