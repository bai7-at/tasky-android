package androidx.compose.ui;

import defpackage.et0;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends ov4 {
    private final et0 b;

    public CompositionLocalMapInjectionElement(et0 et0Var) {
        this.b = et0Var;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && zq3.c(((CompositionLocalMapInjectionElement) obj).b, this.b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public e l() {
        return new e(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(e eVar) {
        eVar.e2(this.b);
    }
}
