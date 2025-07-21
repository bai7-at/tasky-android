package androidx.compose.ui.focus;

import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class FocusRequesterElement extends ov4 {
    private final FocusRequester b;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.b = focusRequester;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && zq3.c(this.b, ((FocusRequesterElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public g l() {
        return new g(this.b);
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(g gVar) {
        gVar.e2().d().w(gVar);
        gVar.f2(this.b);
        gVar.e2().d().b(gVar);
    }
}
