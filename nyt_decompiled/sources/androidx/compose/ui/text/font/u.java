package androidx.compose.ui.text.font;

import defpackage.dn2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u implements d {
    private final int a;
    private final o b;
    private final int c;
    private final dn2 d;
    private final int e;

    public /* synthetic */ u(int i, o oVar, int i2, dn2 dn2Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, oVar, i2, dn2Var, i3);
    }

    @Override // androidx.compose.ui.text.font.d
    public o a() {
        return this.b;
    }

    @Override // androidx.compose.ui.text.font.d
    public int b() {
        return this.e;
    }

    @Override // androidx.compose.ui.text.font.d
    public int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final dn2 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && zq3.c(a(), uVar.a()) && l.f(c(), uVar.c()) && zq3.c(this.d, uVar.d) && j.e(b(), uVar.b());
    }

    public int hashCode() {
        return (((((((this.a * 31) + a().hashCode()) * 31) + l.g(c())) * 31) + j.f(b())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + a() + ", style=" + ((Object) l.h(c())) + ", loadingStrategy=" + ((Object) j.g(b())) + ')';
    }

    private u(int i, o oVar, int i2, dn2 dn2Var, int i3) {
        this.a = i;
        this.b = oVar;
        this.c = i2;
        this.d = dn2Var;
        this.e = i3;
    }
}
