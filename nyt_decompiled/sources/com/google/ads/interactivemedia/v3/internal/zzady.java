package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzady extends IOException {
    zzady() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzady(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzady(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
