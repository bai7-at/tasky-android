package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzid implements Serializable {
    zzid() {
    }

    public static zzid c() {
        return zzib.a;
    }

    public static zzid d(Object obj) {
        return new zzie(obj);
    }

    public abstract Object a();

    public abstract boolean b();
}
