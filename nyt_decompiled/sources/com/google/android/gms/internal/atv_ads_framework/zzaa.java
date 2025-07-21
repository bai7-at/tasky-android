package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;
import java.util.List;

/* loaded from: classes3.dex */
final class zzaa extends zzab {
    final transient int c;
    final transient int d;
    final /* synthetic */ zzab zzc;

    zzaa(zzab zzabVar, int i, int i2) {
        this.zzc = zzabVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int c() {
        return this.zzc.e() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final int e() {
        return this.zzc.e() + this.c;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aif.a(i, this.d, "index");
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    final Object[] j() {
        return this.zzc.j();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab
    /* renamed from: k */
    public final zzab subList(int i, int i2) {
        aif.d(i, i2, this.d);
        zzab zzabVar = this.zzc;
        int i3 = this.c;
        return zzabVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
