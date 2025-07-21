package com.google.android.gms.internal.ads;

import defpackage.b0g;
import defpackage.n1c;
import defpackage.uzf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class vo implements mo {
    public final uzf a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public vo(b0g b0gVar, boolean z) {
        this.a = new uzf(b0gVar, z);
    }

    public final void a(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final n1c zza() {
        return this.a.J();
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Object zzb() {
        return this.b;
    }
}
