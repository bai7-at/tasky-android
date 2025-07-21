package com.google.android.gms.internal.ads;

import defpackage.b0g;
import defpackage.n1c;
import defpackage.uzf;

/* loaded from: classes3.dex */
final class vn implements mo {
    private final Object a;
    private final b0g b;
    private n1c c;

    public vn(Object obj, uzf uzfVar) {
        this.a = obj;
        this.b = uzfVar;
        this.c = uzfVar.J();
    }

    public final void a(n1c n1cVar) {
        this.c = n1cVar;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final n1c zza() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Object zzb() {
        return this.a;
    }
}
