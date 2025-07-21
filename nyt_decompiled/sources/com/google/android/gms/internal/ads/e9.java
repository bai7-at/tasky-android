package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class e9 {
    static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
