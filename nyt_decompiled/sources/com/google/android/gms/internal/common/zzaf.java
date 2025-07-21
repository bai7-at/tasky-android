package com.google.android.gms.internal.common;

import defpackage.twf;
import java.util.List;

/* loaded from: classes3.dex */
final class zzaf extends zzag {
    final transient int c;
    final transient int d;
    final /* synthetic */ zzag zzc;

    zzaf(zzag zzagVar, int i, int i2) {
        this.zzc = zzagVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int c() {
        return this.zzc.e() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int e() {
        return this.zzc.e() + this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        twf.a(i, this.d, "index");
        return this.zzc.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] j() {
        return this.zzc.j();
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* renamed from: k */
    public final zzag subList(int i, int i2) {
        twf.c(i, i2, this.d);
        zzag zzagVar = this.zzc;
        int i3 = this.c;
        return zzagVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
