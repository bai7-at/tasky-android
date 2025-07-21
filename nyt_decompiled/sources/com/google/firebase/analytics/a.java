package com.google.firebase.analytics;

import android.os.Bundle;
import defpackage.a8f;
import defpackage.j4d;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class a implements a8f {
    final /* synthetic */ j4d a;

    a(j4d j4dVar) {
        this.a = j4dVar;
    }

    @Override // defpackage.a8f
    public final void E(String str) {
        this.a.H(str);
    }

    @Override // defpackage.a8f
    public final void R(String str) {
        this.a.J(str);
    }

    @Override // defpackage.a8f
    public final int a(String str) {
        return this.a.p(str);
    }

    @Override // defpackage.a8f
    public final void b(String str, String str2, Bundle bundle) {
        this.a.L(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final List c(String str, String str2) {
        return this.a.C(str, str2);
    }

    @Override // defpackage.a8f
    public final Map d(String str, String str2, boolean z) {
        return this.a.D(str, str2, z);
    }

    @Override // defpackage.a8f
    public final void e(Bundle bundle) {
        this.a.c(bundle);
    }

    @Override // defpackage.a8f
    public final void f(String str, String str2, Bundle bundle) {
        this.a.I(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final long zzb() {
        return this.a.q();
    }

    @Override // defpackage.a8f
    public final String zzh() {
        return this.a.y();
    }

    @Override // defpackage.a8f
    public final String zzi() {
        return this.a.z();
    }

    @Override // defpackage.a8f
    public final String zzj() {
        return this.a.A();
    }

    @Override // defpackage.a8f
    public final String zzk() {
        return this.a.B();
    }
}
