package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class w4b extends b4b {
    private final sw8 a;

    public w4b(sw8 sw8Var) {
        this.a = sw8Var;
    }

    @Override // defpackage.c4b
    public final void N3(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        HashMap hashMap = (HashMap) fc5.Q1(ee3Var2);
        HashMap hashMap2 = (HashMap) fc5.Q1(ee3Var3);
        this.a.E((View) fc5.Q1(ee3Var), hashMap, hashMap2);
    }

    @Override // defpackage.c4b
    public final void X5(ee3 ee3Var) {
        this.a.q((View) fc5.Q1(ee3Var));
    }

    @Override // defpackage.c4b
    public final List a() {
        List<r15> j = this.a.j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (r15 r15Var : j) {
                arrayList.add(new usa(r15Var.a(), r15Var.c(), r15Var.b(), r15Var.e(), r15Var.d()));
            }
        }
        return arrayList;
    }

    @Override // defpackage.c4b
    public final String c() {
        return this.a.p();
    }

    @Override // defpackage.c4b
    public final void e() {
        this.a.s();
    }

    @Override // defpackage.c4b
    public final String g() {
        return this.a.n();
    }

    @Override // defpackage.c4b
    public final void j5(ee3 ee3Var) {
        this.a.F((View) fc5.Q1(ee3Var));
    }

    @Override // defpackage.c4b
    public final boolean o() {
        return this.a.l();
    }

    @Override // defpackage.c4b
    public final boolean v() {
        return this.a.m();
    }

    @Override // defpackage.c4b
    public final double zze() {
        if (this.a.o() != null) {
            return this.a.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // defpackage.c4b
    public final float zzf() {
        return this.a.k();
    }

    @Override // defpackage.c4b
    public final float zzg() {
        return this.a.e();
    }

    @Override // defpackage.c4b
    public final float zzh() {
        return this.a.f();
    }

    @Override // defpackage.c4b
    public final Bundle zzi() {
        return this.a.g();
    }

    @Override // defpackage.c4b
    public final znc zzj() {
        if (this.a.H() != null) {
            return this.a.H().b();
        }
        return null;
    }

    @Override // defpackage.c4b
    public final fta zzk() {
        return null;
    }

    @Override // defpackage.c4b
    public final mta zzl() {
        r15 i = this.a.i();
        if (i != null) {
            return new usa(i.a(), i.c(), i.b(), i.e(), i.d());
        }
        return null;
    }

    @Override // defpackage.c4b
    public final ee3 zzm() {
        View a = this.a.a();
        if (a == null) {
            return null;
        }
        return fc5.l3(a);
    }

    @Override // defpackage.c4b
    public final ee3 zzn() {
        View G = this.a.G();
        if (G == null) {
            return null;
        }
        return fc5.l3(G);
    }

    @Override // defpackage.c4b
    public final ee3 zzo() {
        Object I = this.a.I();
        if (I == null) {
            return null;
        }
        return fc5.l3(I);
    }

    @Override // defpackage.c4b
    public final String zzp() {
        return this.a.b();
    }

    @Override // defpackage.c4b
    public final String zzq() {
        return this.a.c();
    }

    @Override // defpackage.c4b
    public final String zzr() {
        return this.a.d();
    }

    @Override // defpackage.c4b
    public final String zzs() {
        return this.a.h();
    }
}
