package defpackage;

import androidx.compose.ui.text.g;

/* loaded from: classes.dex */
public final class ng0 {
    private final g a;

    public ng0(g gVar) {
        this.a = gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        g gVar = this.a;
        ng0 ng0Var = (ng0) obj;
        return zq3.c(gVar.j(), ng0Var.a.j()) && gVar.i().K(ng0Var.a.i()) && zq3.c(gVar.g(), ng0Var.a.g()) && gVar.e() == ng0Var.a.e() && gVar.h() == ng0Var.a.h() && kj8.e(gVar.f(), ng0Var.a.f()) && zq3.c(gVar.b(), ng0Var.a.b()) && gVar.d() == ng0Var.a.d() && gVar.c() == ng0Var.a.c() && fv0.n(gVar.a()) == fv0.n(ng0Var.a.a()) && fv0.m(gVar.a()) == fv0.m(ng0Var.a.a());
    }

    public int hashCode() {
        g gVar = this.a;
        return (((((((((((((((((((gVar.j().hashCode() * 31) + gVar.i().L()) * 31) + gVar.g().hashCode()) * 31) + gVar.e()) * 31) + Boolean.hashCode(gVar.h())) * 31) + kj8.f(gVar.f())) * 31) + gVar.b().hashCode()) * 31) + gVar.d().hashCode()) * 31) + gVar.c().hashCode()) * 31) + Integer.hashCode(fv0.n(gVar.a()))) * 31) + Integer.hashCode(fv0.m(gVar.a()));
    }
}
