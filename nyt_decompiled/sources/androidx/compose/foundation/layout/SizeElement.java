package androidx.compose.foundation.layout;

import defpackage.bu1;
import defpackage.ov4;
import defpackage.ss2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class SizeElement extends ov4 {
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final boolean f;
    private final ss2 g;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, ss2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return bu1.j(this.b, sizeElement.b) && bu1.j(this.c, sizeElement.c) && bu1.j(this.d, sizeElement.d) && bu1.j(this.e, sizeElement.e) && this.f == sizeElement.f;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((((((bu1.k(this.b) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SizeNode l() {
        return new SizeNode(this.b, this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(SizeNode sizeNode) {
        sizeNode.j2(this.b);
        sizeNode.i2(this.c);
        sizeNode.h2(this.d);
        sizeNode.g2(this.e);
        sizeNode.f2(this.f);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? bu1.b.c() : f, (i & 2) != 0 ? bu1.b.c() : f2, (i & 4) != 0 ? bu1.b.c() : f3, (i & 8) != 0 ? bu1.b.c() : f4, z, ss2Var, null);
    }

    private SizeElement(float f, float f2, float f3, float f4, boolean z, ss2 ss2Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = ss2Var;
    }
}
