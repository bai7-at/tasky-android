package androidx.compose.foundation.layout;

import defpackage.bu1;
import defpackage.fb;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ov4 {
    private final fb b;
    private final float c;
    private final float d;
    private final ss2 e;

    public /* synthetic */ AlignmentLineOffsetDpElement(fb fbVar, float f, float f2, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fbVar, f, f2, ss2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return zq3.c(this.b, alignmentLineOffsetDpElement.b) && bu1.j(this.c, alignmentLineOffsetDpElement.c) && bu1.j(this.d, alignmentLineOffsetDpElement.d);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((this.b.hashCode() * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public a l() {
        return new a(this.b, this.c, this.d, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(a aVar) {
        aVar.f2(this.b);
        aVar.g2(this.c);
        aVar.e2(this.d);
    }

    private AlignmentLineOffsetDpElement(fb fbVar, float f, float f2, ss2 ss2Var) {
        this.b = fbVar;
        this.c = f;
        this.d = f2;
        this.e = ss2Var;
        if ((f < 0.0f && !bu1.j(f, bu1.b.c())) || (f2 < 0.0f && !bu1.j(f2, bu1.b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
