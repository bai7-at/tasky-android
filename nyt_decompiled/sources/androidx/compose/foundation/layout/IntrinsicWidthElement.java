package androidx.compose.foundation.layout;

import defpackage.ov4;
import defpackage.ss2;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends ov4 {
    private final IntrinsicSize b;
    private final boolean c;
    private final ss2 d;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, boolean z, ss2 ss2Var) {
        this.b = intrinsicSize;
        this.c = z;
        this.d = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.b == intrinsicWidthElement.b && this.c == intrinsicWidthElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j l() {
        return new j(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(j jVar) {
        jVar.h2(this.b);
        jVar.g2(this.c);
    }
}
