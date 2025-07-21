package com.google.android.gms.internal.ads;

import defpackage.gge;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzfwz implements Serializable {
    zzfwz() {
    }

    public static zzfwz c() {
        return zzfwi.a;
    }

    public static zzfwz d(Object obj) {
        return obj == null ? zzfwi.a : new zzfxj(obj);
    }

    public abstract zzfwz a(gge ggeVar);

    public abstract Object b(Object obj);
}
