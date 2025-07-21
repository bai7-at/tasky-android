package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.fwf;
import defpackage.kod;
import defpackage.mzf;
import defpackage.qgf;
import defpackage.vzf;
import defpackage.y0g;
import defpackage.zzf;
import java.io.IOException;

/* loaded from: classes3.dex */
final class to implements y0g, fwf {
    private final vo a;
    final /* synthetic */ wo b;

    public to(wo woVar, vo voVar) {
        this.b = woVar;
        this.a = voVar;
    }

    private final Pair a(int i, zzf zzfVar) {
        zzf zzfVar2;
        zzf zzfVar3 = null;
        if (zzfVar != null) {
            vo voVar = this.a;
            int i2 = 0;
            while (true) {
                if (i2 >= voVar.c.size()) {
                    zzfVar2 = null;
                    break;
                }
                if (((zzf) voVar.c.get(i2)).d == zzfVar.d) {
                    zzfVar2 = zzfVar.a(Pair.create(voVar.b, zzfVar.a));
                    break;
                }
                i2++;
            }
            if (zzfVar2 == null) {
                return null;
            }
            zzfVar3 = zzfVar2;
        }
        return Pair.create(Integer.valueOf(this.a.d), zzfVar3);
    }

    @Override // defpackage.y0g
    public final void A(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        kod kodVar;
        final Pair a = a(0, zzfVar);
        if (a != null) {
            kodVar = this.b.i;
            kodVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.so
                @Override // java.lang.Runnable
                public final void run() {
                    qgf qgfVar;
                    Pair pair = a;
                    qgfVar = to.this.b.h;
                    qgfVar.A(((Integer) pair.first).intValue(), (zzf) pair.second, mzfVar, vzfVar);
                }
            });
        }
    }

    @Override // defpackage.y0g
    public final void B(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        kod kodVar;
        final Pair a = a(0, zzfVar);
        if (a != null) {
            kodVar = this.b.i;
            kodVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.po
                @Override // java.lang.Runnable
                public final void run() {
                    qgf qgfVar;
                    Pair pair = a;
                    qgfVar = to.this.b.h;
                    qgfVar.B(((Integer) pair.first).intValue(), (zzf) pair.second, mzfVar, vzfVar);
                }
            });
        }
    }

    @Override // defpackage.y0g
    public final void R(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar, final IOException iOException, final boolean z) {
        kod kodVar;
        final Pair a = a(0, zzfVar);
        if (a != null) {
            kodVar = this.b.i;
            kodVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.oo
                @Override // java.lang.Runnable
                public final void run() {
                    qgf qgfVar;
                    Pair pair = a;
                    qgfVar = to.this.b.h;
                    qgfVar.R(((Integer) pair.first).intValue(), (zzf) pair.second, mzfVar, vzfVar, iOException, z);
                }
            });
        }
    }

    @Override // defpackage.y0g
    public final void T(int i, zzf zzfVar, final vzf vzfVar) {
        kod kodVar;
        final Pair a = a(0, zzfVar);
        if (a != null) {
            kodVar = this.b.i;
            kodVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.ro
                @Override // java.lang.Runnable
                public final void run() {
                    qgf qgfVar;
                    Pair pair = a;
                    qgfVar = to.this.b.h;
                    qgfVar.T(((Integer) pair.first).intValue(), (zzf) pair.second, vzfVar);
                }
            });
        }
    }

    @Override // defpackage.y0g
    public final void o(int i, zzf zzfVar, final mzf mzfVar, final vzf vzfVar) {
        kod kodVar;
        final Pair a = a(0, zzfVar);
        if (a != null) {
            kodVar = this.b.i;
            kodVar.e(new Runnable() { // from class: com.google.android.gms.internal.ads.qo
                @Override // java.lang.Runnable
                public final void run() {
                    qgf qgfVar;
                    Pair pair = a;
                    qgfVar = to.this.b.h;
                    qgfVar.o(((Integer) pair.first).intValue(), (zzf) pair.second, mzfVar, vzfVar);
                }
            });
        }
    }
}
