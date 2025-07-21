package androidx.compose.foundation.layout;

import defpackage.bu1;
import defpackage.ov4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ov4 {
    private final float b;
    private final float c;

    public /* synthetic */ UnspecifiedConstraintsElement(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return bu1.j(this.b, unspecifiedConstraintsElement.b) && bu1.j(this.c, unspecifiedConstraintsElement.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (bu1.k(this.b) * 31) + bu1.k(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public UnspecifiedConstraintsNode l() {
        return new UnspecifiedConstraintsNode(this.b, this.c, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.f2(this.b);
        unspecifiedConstraintsNode.e2(this.c);
    }

    private UnspecifiedConstraintsElement(float f, float f2) {
        this.b = f;
        this.c = f2;
    }
}
