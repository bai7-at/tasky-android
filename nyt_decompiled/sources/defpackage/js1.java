package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import defpackage.oq1;

/* loaded from: classes.dex */
public final class js1 implements fu7 {
    private final Context b;

    public js1(Context context) {
        this.b = context;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js1) && zq3.c(this.b, ((js1) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.fu7
    public Object r(by0 by0Var) {
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        oq1.a a = g.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new au7(a, a);
    }
}
