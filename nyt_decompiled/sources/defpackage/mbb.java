package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class mbb extends ila {
    private final jgb c;
    private final String d;

    public mbb(Context context, String str, String str2) {
        this.c = new jgb(dyf.r().E(context, str));
        this.d = str2;
    }

    @Override // defpackage.ila
    public final void a() {
        this.c.a(this.d);
    }
}
