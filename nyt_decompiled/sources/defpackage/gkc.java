package defpackage;

import android.view.View;
import java.util.Map;

/* loaded from: classes3.dex */
final class gkc implements via {
    final /* synthetic */ String a;
    final /* synthetic */ jkc b;

    gkc(jkc jkcVar, String str) {
        this.a = str;
        this.b = jkcVar;
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        Map map;
        qmc qmcVar;
        qmc qmcVar2;
        qmc qmcVar3;
        qmc qmcVar4;
        Map map2;
        qmc qmcVar5;
        qmc qmcVar6;
        qmc qmcVar7;
        if (!((Boolean) pla.c().a(mpa.J1)).booleanValue()) {
            if (uiaVar.j) {
                jkc jkcVar = this.b;
                String str = this.a;
                map = jkcVar.E;
                map.put(str, Boolean.TRUE);
                jkc jkcVar2 = this.b;
                qmcVar = jkcVar2.u;
                View zzf = qmcVar.zzf();
                qmcVar2 = this.b.u;
                Map zzl = qmcVar2.zzl();
                qmcVar3 = this.b.u;
                jkcVar2.h(zzf, zzl, qmcVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (uiaVar.j) {
                    jkc jkcVar3 = this.b;
                    qmcVar4 = jkcVar3.u;
                    if (qmcVar4 == null) {
                        return;
                    }
                    map2 = jkcVar3.E;
                    map2.put(this.a, Boolean.TRUE);
                    jkc jkcVar4 = this.b;
                    qmcVar5 = jkcVar4.u;
                    View zzf2 = qmcVar5.zzf();
                    qmcVar6 = this.b.u;
                    Map zzl2 = qmcVar6.zzl();
                    qmcVar7 = this.b.u;
                    jkcVar4.h(zzf2, zzl2, qmcVar7.zzm(), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
