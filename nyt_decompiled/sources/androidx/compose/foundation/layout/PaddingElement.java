package androidx.compose.foundation.layout;

import defpackage.bu1;
import defpackage.ov4;
import defpackage.ss2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class PaddingElement extends ov4 {
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final ss2 g;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, ss2Var);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && bu1.j(this.b, paddingElement.b) && bu1.j(this.c, paddingElement.c) && bu1.j(this.d, paddingElement.d) && bu1.j(this.e, paddingElement.e) && this.f == paddingElement.f;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((((((bu1.k(this.b) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public PaddingNode l() {
        return new PaddingNode(this.b, this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(PaddingNode paddingNode) {
        paddingNode.k2(this.b);
        paddingNode.l2(this.c);
        paddingNode.i2(this.d);
        paddingNode.h2(this.e);
        paddingNode.j2(this.f);
    }

    private PaddingElement(float f, float f2, float f3, float f4, boolean z, ss2 ss2Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = ss2Var;
        if (f >= 0.0f || bu1.j(f, bu1.b.c())) {
            float f5 = this.c;
            if (f5 >= 0.0f || bu1.j(f5, bu1.b.c())) {
                float f6 = this.d;
                if (f6 >= 0.0f || bu1.j(f6, bu1.b.c())) {
                    float f7 = this.e;
                    if (f7 >= 0.0f || bu1.j(f7, bu1.b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
