package com.nytimes.android.logging;

import defpackage.b22;
import defpackage.yj0;
import java.util.ArrayList;
import kotlin.collections.i;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Secrets {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Secrets[] $VALUES;
    private final byte[] value;
    public static final Secrets SECRET_KEY = new Secrets("SECRET_KEY", 0, new byte[]{-71, 27, 121, 97, -92, 82, 44, 17, -92, 39, -115, 118, -44, -95, -42, 104, -108, 79, 109, 8, Byte.MIN_VALUE, -77, -42, -67, 0, -119, 86, 5, -47, 126, -8, 103, 3, 51, -117, 68, -74, 74, 63, 27});
    public static final Secrets ACCESS_KEY = new Secrets("ACCESS_KEY", 1, new byte[]{-74, 42, 68, 108, -69, 33, 40, 26, -58, 113, -86, 19, -18, -97, -61, 72, -86, 79, 65, 54});

    private static final /* synthetic */ Secrets[] $values() {
        return new Secrets[]{SECRET_KEY, ACCESS_KEY};
    }

    static {
        Secrets[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Secrets(String str, int i, byte[] bArr) {
        this.value = bArr;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Secrets valueOf(String str) {
        return (Secrets) Enum.valueOf(Secrets.class, str);
    }

    public static Secrets[] values() {
        return (Secrets[]) $VALUES.clone();
    }

    public final String decode() {
        byte[] bArr = this.value;
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (salt()[i2 % salt().length].byteValue() ^ bArr[i])));
            i++;
            i2++;
        }
        return new String(i.R0(arrayList), yj0.b);
    }

    public final byte[] getValue() {
        return this.value;
    }

    public final Byte[] salt() {
        return new Byte[]{(byte) -9, (byte) 97, (byte) 13, (byte) 45, (byte) -23, (byte) 103, (byte) 102, (byte) 41, (byte) -112, (byte) 70, (byte) -29, (byte) 69, (byte) -91, (byte) -41, (byte) -123, (byte) 9, (byte) -13, (byte) 10, (byte) 3, (byte) 112, (byte) -21, (byte) -34, (byte) -96, (byte) -42, (byte) 101, (byte) -54, (byte) 58, (byte) 78, (byte) -80, (byte) 61, (byte) -112, (byte) 14, (byte) 119, (byte) 117, (byte) -32, (byte) 17, (byte) -6, (byte) 4, (byte) 77, (byte) 116, (byte) 16, (byte) -16, (byte) 72, (byte) -101, (byte) -42, (byte) 4, (byte) -3, (byte) 80, (byte) 27, (byte) -60, (byte) 14, (byte) -21, (byte) 7, (byte) 112, (byte) 30, (byte) 76, (byte) -44, (byte) 123, (byte) 124, (byte) 95, (byte) 53, (byte) -39, (byte) 69, (byte) -7};
    }
}
