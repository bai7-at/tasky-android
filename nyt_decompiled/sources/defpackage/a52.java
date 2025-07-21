package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class a52 implements ca2 {
    private final p76 a;

    public a52(p76 p76Var) {
        this.a = p76Var;
    }

    public static a52 a(p76 p76Var) {
        return new a52(p76Var);
    }

    public static String c(Context context) {
        return (String) a16.c(y42.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.a.get());
    }
}
