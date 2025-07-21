package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.a5;
import com.google.android.gms.measurement.internal.z6;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class a extends c {
    private final a5 a;
    private final z6 b;

    public a(a5 a5Var) {
        super(null);
        Preconditions.checkNotNull(a5Var);
        this.a = a5Var;
        this.b = a5Var.H();
    }

    @Override // defpackage.a8f
    public final void E(String str) {
        this.a.x().h(str, this.a.p().elapsedRealtime());
    }

    @Override // defpackage.a8f
    public final void R(String str) {
        this.a.x().i(str, this.a.p().elapsedRealtime());
    }

    @Override // defpackage.a8f
    public final int a(String str) {
        this.b.S(str);
        return 25;
    }

    @Override // defpackage.a8f
    public final void b(String str, String str2, Bundle bundle) {
        this.b.r(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final List c(String str, String str2) {
        return this.b.b0(str, str2);
    }

    @Override // defpackage.a8f
    public final Map d(String str, String str2, boolean z) {
        return this.b.c0(str, str2, z);
    }

    @Override // defpackage.a8f
    public final void e(Bundle bundle) {
        this.b.D(bundle);
    }

    @Override // defpackage.a8f
    public final void f(String str, String str2, Bundle bundle) {
        this.a.H().k(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final long zzb() {
        return this.a.M().q0();
    }

    @Override // defpackage.a8f
    public final String zzh() {
        return this.b.X();
    }

    @Override // defpackage.a8f
    public final String zzi() {
        return this.b.Y();
    }

    @Override // defpackage.a8f
    public final String zzj() {
        return this.b.Z();
    }

    @Override // defpackage.a8f
    public final String zzk() {
        return this.b.X();
    }
}
