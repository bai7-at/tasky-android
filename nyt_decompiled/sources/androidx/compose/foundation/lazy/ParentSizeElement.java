package androidx.compose.foundation.lazy;

import defpackage.ov4;
import defpackage.x08;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class ParentSizeElement extends ov4 {
    private final float b;
    private final x08 c;
    private final x08 d;
    private final String e;

    public /* synthetic */ ParentSizeElement(float f, x08 x08Var, x08 x08Var2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : x08Var, (i & 4) != 0 ? null : x08Var2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.b == parentSizeElement.b && zq3.c(this.c, parentSizeElement.c) && zq3.c(this.d, parentSizeElement.d);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        x08 x08Var = this.c;
        int hashCode = (x08Var != null ? x08Var.hashCode() : 0) * 31;
        x08 x08Var2 = this.d;
        return ((hashCode + (x08Var2 != null ? x08Var2.hashCode() : 0)) * 31) + Float.hashCode(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ParentSizeNode l() {
        return new ParentSizeNode(this.b, this.c, this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(ParentSizeNode parentSizeNode) {
        parentSizeNode.e2(this.b);
        parentSizeNode.g2(this.c);
        parentSizeNode.f2(this.d);
    }

    public ParentSizeElement(float f, x08 x08Var, x08 x08Var2, String str) {
        this.b = f;
        this.c = x08Var;
        this.d = x08Var2;
        this.e = str;
    }
}
