package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class os4 implements ca2 {
    private final p76 a;
    private final p76 b;

    public os4(p76 p76Var, p76 p76Var2) {
        this.a = p76Var;
        this.b = p76Var2;
    }

    public static os4 a(p76 p76Var, p76 p76Var2) {
        return new os4(p76Var, p76Var2);
    }

    public static ns4 c(Context context, Object obj) {
        return new ns4(context, (r21) obj);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ns4 get() {
        return c((Context) this.a.get(), this.b.get());
    }
}
