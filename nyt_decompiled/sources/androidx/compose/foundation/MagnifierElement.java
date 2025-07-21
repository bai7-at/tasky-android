package androidx.compose.foundation;

import defpackage.bu1;
import defpackage.fu1;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class MagnifierElement extends ov4 {
    private final ss2 b;
    private final ss2 c;
    private final ss2 d;
    private final float e;
    private final boolean f;
    private final long g;
    private final float h;
    private final float i;
    private final boolean j;
    private final j k;

    public /* synthetic */ MagnifierElement(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, float f, boolean z, long j, float f2, float f3, boolean z2, j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, ss2Var2, ss2Var3, f, z, j, f2, f3, z2, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return zq3.c(this.b, magnifierElement.b) && zq3.c(this.c, magnifierElement.c) && this.e == magnifierElement.e && this.f == magnifierElement.f && fu1.f(this.g, magnifierElement.g) && bu1.j(this.h, magnifierElement.h) && bu1.j(this.i, magnifierElement.i) && this.j == magnifierElement.j && zq3.c(this.d, magnifierElement.d) && zq3.c(this.k, magnifierElement.k);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ss2 ss2Var = this.c;
        int hashCode2 = (((((((((((((hashCode + (ss2Var != null ? ss2Var.hashCode() : 0)) * 31) + Float.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + fu1.i(this.g)) * 31) + bu1.k(this.h)) * 31) + bu1.k(this.i)) * 31) + Boolean.hashCode(this.j)) * 31;
        ss2 ss2Var2 = this.d;
        return ((hashCode2 + (ss2Var2 != null ? ss2Var2.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public MagnifierNode l() {
        return new MagnifierNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(MagnifierNode magnifierNode) {
        magnifierNode.p2(this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.d, this.k);
    }

    private MagnifierElement(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, float f, boolean z, long j, float f2, float f3, boolean z2, j jVar) {
        this.b = ss2Var;
        this.c = ss2Var2;
        this.d = ss2Var3;
        this.e = f;
        this.f = z;
        this.g = j;
        this.h = f2;
        this.i = f3;
        this.j = z2;
        this.k = jVar;
    }
}
