package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xb7 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;

    public xb7(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
    }

    public static xb7 a(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new xb7(p76Var, p76Var2, p76Var3);
    }

    public static wb7 c(Context context, String str, int i) {
        return new wb7(context, str, i);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wb7 get() {
        return c((Context) this.a.get(), (String) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
