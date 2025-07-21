package com.google.ads.interactivemedia.v3.internal;

import defpackage.hzf;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzue {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!hzf.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
