package androidx.compose.foundation.layout;

import defpackage.ov4;
import defpackage.ss2;

/* loaded from: classes.dex */
final class AspectRatioElement extends ov4 {
    private final float b;
    private final boolean c;
    private final ss2 d;

    public AspectRatioElement(float f, boolean z, ss2 ss2Var) {
        this.b = f;
        this.c = z;
        this.d = ss2Var;
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        return this.b == aspectRatioElement.b && this.c == ((AspectRatioElement) obj).c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (Float.hashCode(this.b) * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AspectRatioNode l() {
        return new AspectRatioNode(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(AspectRatioNode aspectRatioNode) {
        aspectRatioNode.f2(this.b);
        aspectRatioNode.g2(this.c);
    }
}
