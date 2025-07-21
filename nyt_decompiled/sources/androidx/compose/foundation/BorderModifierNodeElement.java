package androidx.compose.foundation;

import defpackage.bu1;
import defpackage.no7;
import defpackage.ov4;
import defpackage.yc0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ov4 {
    private final float b;
    private final yc0 c;
    private final no7 d;

    public /* synthetic */ BorderModifierNodeElement(float f, yc0 yc0Var, no7 no7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, yc0Var, no7Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return bu1.j(this.b, borderModifierNodeElement.b) && zq3.c(this.c, borderModifierNodeElement.c) && zq3.c(this.d, borderModifierNodeElement.d);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((bu1.k(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public BorderModifierNode l() {
        return new BorderModifierNode(this.b, this.c, this.d, null);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) bu1.l(this.b)) + ", brush=" + this.c + ", shape=" + this.d + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(BorderModifierNode borderModifierNode) {
        borderModifierNode.r2(this.b);
        borderModifierNode.q2(this.c);
        borderModifierNode.e1(this.d);
    }

    private BorderModifierNodeElement(float f, yc0 yc0Var, no7 no7Var) {
        this.b = f;
        this.c = yc0Var;
        this.d = no7Var;
    }
}
