package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzun extends zzuk {
    /* synthetic */ zzun(zzum zzumVar) {
        super(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuk
    final int zza(zzuo zzuoVar) {
        int i;
        int i2;
        synchronized (zzuoVar) {
            i = zzuoVar.remaining;
            i2 = i - 1;
            zzuoVar.remaining = i2;
        }
        return i2;
    }

    private zzun() {
        super(null);
    }
}
