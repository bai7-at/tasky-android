package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzbg extends IOException {
    zzbg() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzbg(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzbg(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
