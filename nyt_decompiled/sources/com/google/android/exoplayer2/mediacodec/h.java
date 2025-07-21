package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.mediacodec.q;
import defpackage.a84;
import defpackage.ku4;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class h implements j.b {
    private int a = 0;
    private boolean b;

    @Override // com.google.android.exoplayer2.mediacodec.j.b
    public j a(j.a aVar) {
        int i;
        int i2 = z19.a;
        if (i2 < 23 || ((i = this.a) != 1 && (i != 0 || i2 < 31))) {
            return new q.b().a(aVar);
        }
        int k = ku4.k(aVar.c.l);
        a84.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + z19.n0(k));
        return new b.C0182b(k, this.b).a(aVar);
    }
}
