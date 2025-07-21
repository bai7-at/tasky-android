package androidx.navigation;

import androidx.navigation.h;
import defpackage.ah;
import defpackage.ss2;
import defpackage.vz5;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class i {
    private boolean b;
    private boolean c;
    private String e;
    private boolean f;
    private boolean g;
    private final h.a a = new h.a();
    private int d = -1;

    private final void g(String str) {
        if (str != null) {
            if (kotlin.text.h.d0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.e = str;
            this.f = false;
        }
    }

    public final void a(ss2 ss2Var) {
        zq3.h(ss2Var, "animBuilder");
        ah ahVar = new ah();
        ss2Var.invoke(ahVar);
        this.a.b(ahVar.a()).c(ahVar.b()).e(ahVar.c()).f(ahVar.d());
    }

    public final h b() {
        h.a aVar = this.a;
        aVar.d(this.b);
        aVar.j(this.c);
        String str = this.e;
        if (str != null) {
            aVar.h(str, this.f, this.g);
        } else {
            aVar.g(this.d, this.f, this.g);
        }
        return aVar.a();
    }

    public final void c(int i, ss2 ss2Var) {
        zq3.h(ss2Var, "popUpToBuilder");
        f(i);
        g(null);
        vz5 vz5Var = new vz5();
        ss2Var.invoke(vz5Var);
        this.f = vz5Var.a();
        this.g = vz5Var.b();
    }

    public final void d(String str, ss2 ss2Var) {
        zq3.h(str, "route");
        zq3.h(ss2Var, "popUpToBuilder");
        g(str);
        f(-1);
        vz5 vz5Var = new vz5();
        ss2Var.invoke(vz5Var);
        this.f = vz5Var.a();
        this.g = vz5Var.b();
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public final void f(int i) {
        this.d = i;
        this.f = false;
    }

    public final void h(boolean z) {
        this.c = z;
    }
}
