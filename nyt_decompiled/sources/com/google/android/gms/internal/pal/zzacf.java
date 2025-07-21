package com.google.android.gms.internal.pal;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzacf extends IOException {
    zzacf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzacf(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzacf(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
