package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfzz extends zzgaa {
    final transient int d;
    final transient int e;
    final /* synthetic */ zzgaa zzc;

    zzfzz(zzgaa zzgaaVar, int i, int i2) {
        this.zzc = zzgaaVar;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int c() {
        return this.zzc.e() + this.d + this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final int e() {
        return this.zzc.e() + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tge.a(i, this.e, "index");
        return this.zzc.get(i + this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    final Object[] k() {
        return this.zzc.k();
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    /* renamed from: n */
    public final zzgaa subList(int i, int i2) {
        tge.h(i, i2, this.e);
        int i3 = this.d;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
