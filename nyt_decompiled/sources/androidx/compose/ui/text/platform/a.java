package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import defpackage.x08;
import defpackage.zq3;

/* loaded from: classes.dex */
final class a {
    private final x08 a;
    private final a b;
    private final Object c;

    public a(x08 x08Var, a aVar) {
        this.a = x08Var;
        this.b = aVar;
        this.c = x08Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.c;
        zq3.f(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        a aVar;
        return this.a.getValue() != this.c || ((aVar = this.b) != null && aVar.b());
    }
}
