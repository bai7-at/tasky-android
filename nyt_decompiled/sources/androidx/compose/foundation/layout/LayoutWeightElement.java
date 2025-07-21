package androidx.compose.foundation.layout;

import defpackage.a04;
import defpackage.ov4;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends ov4 {
    private final float b;
    private final boolean c;

    public LayoutWeightElement(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.b == layoutWeightElement.b && this.c == layoutWeightElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public a04 l() {
        return new a04(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(a04 a04Var) {
        a04Var.g2(this.b);
        a04Var.f2(this.c);
    }
}
