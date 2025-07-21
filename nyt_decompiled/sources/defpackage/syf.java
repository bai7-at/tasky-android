package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class syf implements y0g, fwf {
    private final Object a;
    private x0g b;
    private ewf c;
    final /* synthetic */ dzf d;

    public syf(dzf dzfVar, Object obj) {
        this.d = dzfVar;
        this.b = dzfVar.r(null);
        this.c = dzfVar.p(null);
        this.a = obj;
    }

    private final vzf a(vzf vzfVar, zzf zzfVar) {
        dzf dzfVar = this.d;
        Object obj = this.a;
        long j = vzfVar.c;
        dzfVar.D(obj, j, zzfVar);
        dzf dzfVar2 = this.d;
        Object obj2 = this.a;
        long j2 = vzfVar.d;
        dzfVar2.D(obj2, j2, zzfVar);
        return (j == vzfVar.c && j2 == vzfVar.d) ? vzfVar : new vzf(1, vzfVar.a, vzfVar.b, 0, null, j, j2);
    }

    private final boolean b(int i, zzf zzfVar) {
        zzf zzfVar2;
        if (zzfVar != null) {
            zzfVar2 = this.d.E(this.a, zzfVar);
            if (zzfVar2 == null) {
                return false;
            }
        } else {
            zzfVar2 = null;
        }
        this.d.C(this.a, 0);
        x0g x0gVar = this.b;
        int i2 = x0gVar.a;
        if (!khe.f(x0gVar.b, zzfVar2)) {
            this.b = this.d.s(0, zzfVar2);
        }
        ewf ewfVar = this.c;
        int i3 = ewfVar.a;
        if (khe.f(ewfVar.b, zzfVar2)) {
            return true;
        }
        this.c = this.d.q(0, zzfVar2);
        return true;
    }

    @Override // defpackage.y0g
    public final void A(int i, zzf zzfVar, mzf mzfVar, vzf vzfVar) {
        if (b(0, zzfVar)) {
            this.b.e(mzfVar, a(vzfVar, zzfVar));
        }
    }

    @Override // defpackage.y0g
    public final void B(int i, zzf zzfVar, mzf mzfVar, vzf vzfVar) {
        if (b(0, zzfVar)) {
            this.b.d(mzfVar, a(vzfVar, zzfVar));
        }
    }

    @Override // defpackage.y0g
    public final void R(int i, zzf zzfVar, mzf mzfVar, vzf vzfVar, IOException iOException, boolean z) {
        if (b(0, zzfVar)) {
            this.b.f(mzfVar, a(vzfVar, zzfVar), iOException, z);
        }
    }

    @Override // defpackage.y0g
    public final void T(int i, zzf zzfVar, vzf vzfVar) {
        if (b(0, zzfVar)) {
            this.b.c(a(vzfVar, zzfVar));
        }
    }

    @Override // defpackage.y0g
    public final void o(int i, zzf zzfVar, mzf mzfVar, vzf vzfVar) {
        if (b(0, zzfVar)) {
            this.b.g(mzfVar, a(vzfVar, zzfVar));
        }
    }
}
