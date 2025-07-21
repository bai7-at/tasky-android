package com.comscore.util;

/* loaded from: classes2.dex */
public class ArrayUtils {
    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
