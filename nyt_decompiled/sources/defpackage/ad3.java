package defpackage;

import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class ad3 implements ba2 {
    private final mc3 a;

    public ad3(mc3 mc3Var) {
        this.a = mc3Var;
    }

    public static ad3 a(mc3 mc3Var) {
        return new ad3(mc3Var);
    }

    public static i c(mc3 mc3Var) {
        return (i) g16.e(mc3Var.a());
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.a);
    }
}
