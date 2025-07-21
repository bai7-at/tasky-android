package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class s21 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;

    public s21(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
    }

    public static s21 a(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new s21(p76Var, p76Var2, p76Var3);
    }

    public static r21 c(Context context, ul0 ul0Var, ul0 ul0Var2) {
        return new r21(context, ul0Var, ul0Var2);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r21 get() {
        return c((Context) this.a.get(), (ul0) this.b.get(), (ul0) this.c.get());
    }
}
