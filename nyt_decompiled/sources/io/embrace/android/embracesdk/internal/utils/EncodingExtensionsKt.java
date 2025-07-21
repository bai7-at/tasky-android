package io.embrace.android.embracesdk.internal.utils;

import defpackage.yj0;
import defpackage.zq3;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EncodingExtensionsKt {
    public static final String toUTF8String(byte[] bArr) {
        zq3.h(bArr, "$this$toUTF8String");
        byte[] bArr2 = new byte[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            if (i2 < 128) {
                bArr2[i] = (byte) i2;
                i++;
            } else {
                int i3 = i + 1;
                bArr2[i] = (byte) ((i2 >> 6) | 192);
                i += 2;
                bArr2[i3] = (byte) ((b & 63) | 128);
            }
        }
        byte[] copyOf = Arrays.copyOf(bArr2, i);
        zq3.g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return new String(copyOf, yj0.b);
    }
}
