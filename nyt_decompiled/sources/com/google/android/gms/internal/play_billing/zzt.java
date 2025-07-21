package com.google.android.gms.internal.play_billing;

import defpackage.aff;
import java.util.List;

/* loaded from: classes3.dex */
final class zzt extends zzu {
    final transient int d;
    final transient int e;
    final /* synthetic */ zzu zzc;

    zzt(zzu zzuVar, int i, int i2) {
        this.zzc = zzuVar;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int c() {
        return this.zzc.e() + this.d + this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final int e() {
        return this.zzc.e() + this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aff.a(i, this.e, "index");
        return this.zzc.get(i + this.d);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    final Object[] j() {
        return this.zzc.j();
    }

    @Override // com.google.android.gms.internal.play_billing.zzu
    /* renamed from: k */
    public final zzu subList(int i, int i2) {
        aff.d(i, i2, this.e);
        zzu zzuVar = this.zzc;
        int i3 = this.d;
        return zzuVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
