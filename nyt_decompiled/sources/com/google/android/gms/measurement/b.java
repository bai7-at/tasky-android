package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a8f;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class b extends c {
    private final a8f a;

    public b(a8f a8fVar) {
        super(null);
        Preconditions.checkNotNull(a8fVar);
        this.a = a8fVar;
    }

    @Override // defpackage.a8f
    public final void E(String str) {
        this.a.E(str);
    }

    @Override // defpackage.a8f
    public final void R(String str) {
        this.a.R(str);
    }

    @Override // defpackage.a8f
    public final int a(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.a8f
    public final void b(String str, String str2, Bundle bundle) {
        this.a.b(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final List c(String str, String str2) {
        return this.a.c(str, str2);
    }

    @Override // defpackage.a8f
    public final Map d(String str, String str2, boolean z) {
        return this.a.d(str, str2, z);
    }

    @Override // defpackage.a8f
    public final void e(Bundle bundle) {
        this.a.e(bundle);
    }

    @Override // defpackage.a8f
    public final void f(String str, String str2, Bundle bundle) {
        this.a.f(str, str2, bundle);
    }

    @Override // defpackage.a8f
    public final long zzb() {
        return this.a.zzb();
    }

    @Override // defpackage.a8f
    public final String zzh() {
        return this.a.zzh();
    }

    @Override // defpackage.a8f
    public final String zzi() {
        return this.a.zzi();
    }

    @Override // defpackage.a8f
    public final String zzj() {
        return this.a.zzj();
    }

    @Override // defpackage.a8f
    public final String zzk() {
        return this.a.zzk();
    }
}
