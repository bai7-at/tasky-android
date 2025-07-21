package com.google.android.gms.internal.ads;

import defpackage.fhe;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgbf extends zzfyc {
    final transient fhe f;

    zzgbf(Map map, fhe fheVar) {
        super(map);
        this.f = fheVar;
    }

    @Override // com.google.android.gms.internal.ads.q8
    final Map d() {
        return m();
    }

    @Override // com.google.android.gms.internal.ads.q8
    final Set e() {
        return n();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.zzfyt
    protected final /* bridge */ /* synthetic */ Collection g() {
        return this.f.zza();
    }
}
