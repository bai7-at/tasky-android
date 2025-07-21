package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class k extends j {
    private final byte[] b;

    k(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // com.google.android.gms.common.j
    final byte[] Q1() {
        return this.b;
    }
}
