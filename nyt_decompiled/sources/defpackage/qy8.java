package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class qy8 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;
    private final p76 e;
    private final p76 f;
    private final p76 g;
    private final p76 h;
    private final p76 i;

    public qy8(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
        this.e = p76Var5;
        this.f = p76Var6;
        this.g = p76Var7;
        this.h = p76Var8;
        this.i = p76Var9;
    }

    public static qy8 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4, p76 p76Var5, p76 p76Var6, p76 p76Var7, p76 p76Var8, p76 p76Var9) {
        return new qy8(p76Var, p76Var2, p76Var3, p76Var4, p76Var5, p76Var6, p76Var7, p76Var8, p76Var9);
    }

    public static py8 c(Context context, o30 o30Var, w42 w42Var, bk9 bk9Var, Executor executor, md8 md8Var, ul0 ul0Var, ul0 ul0Var2, nl0 nl0Var) {
        return new py8(context, o30Var, w42Var, bk9Var, executor, md8Var, ul0Var, ul0Var2, nl0Var);
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public py8 get() {
        return c((Context) this.a.get(), (o30) this.b.get(), (w42) this.c.get(), (bk9) this.d.get(), (Executor) this.e.get(), (md8) this.f.get(), (ul0) this.g.get(), (ul0) this.h.get(), (nl0) this.i.get());
    }
}
