package com.google.android.gms.internal.pal;

import defpackage.z7f;
import java.util.List;

/* loaded from: classes3.dex */
final class zziy extends zziz {
    final transient int c;
    final transient int d;
    final /* synthetic */ zziz zzc;

    zziy(zziz zzizVar, int i, int i2) {
        this.zzc = zzizVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int c() {
        return this.zzc.e() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final int e() {
        return this.zzc.e() + this.c;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    final Object[] f() {
        return this.zzc.f();
    }

    @Override // com.google.android.gms.internal.pal.zziz
    /* renamed from: g */
    public final zziz subList(int i, int i2) {
        z7f.c(i, i2, this.d);
        zziz zzizVar = this.zzc;
        int i3 = this.c;
        return zzizVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        z7f.a(i, this.d, "index");
        return this.zzc.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.pal.zziz, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
