package androidx.compose.foundation.layout;

import defpackage.ov4;
import defpackage.ss2;

/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ov4 {
    private final IntrinsicSize b;
    private final boolean c;
    private final ss2 d;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, boolean z, ss2 ss2Var) {
        this.b = intrinsicSize;
        this.c = z;
        this.d = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.b == intrinsicHeightElement.b && this.c == intrinsicHeightElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public i l() {
        return new i(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(i iVar) {
        iVar.h2(this.b);
        iVar.g2(this.c);
    }
}
