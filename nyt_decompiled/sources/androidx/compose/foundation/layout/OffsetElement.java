package androidx.compose.foundation.layout;

import defpackage.bu1;
import defpackage.ov4;
import defpackage.ss2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class OffsetElement extends ov4 {
    private final float b;
    private final float c;
    private final boolean d;
    private final ss2 e;

    public /* synthetic */ OffsetElement(float f, float f2, boolean z, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z, ss2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return bu1.j(this.b, offsetElement.b) && bu1.j(this.c, offsetElement.c) && this.d == offsetElement.d;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((bu1.k(this.b) * 31) + bu1.k(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public OffsetNode l() {
        return new OffsetNode(this.b, this.c, this.d, null);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) bu1.l(this.b)) + ", y=" + ((Object) bu1.l(this.c)) + ", rtlAware=" + this.d + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(OffsetNode offsetNode) {
        offsetNode.i2(this.b);
        offsetNode.j2(this.c);
        offsetNode.h2(this.d);
    }

    private OffsetElement(float f, float f2, boolean z, ss2 ss2Var) {
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = ss2Var;
    }
}
