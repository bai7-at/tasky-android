package com.google.android.gms.internal.measurement;

import defpackage.k7f;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class o1 {
    public static k7f a(k7f k7fVar) {
        return ((k7fVar instanceof n1) || (k7fVar instanceof zzig)) ? k7fVar : k7fVar instanceof Serializable ? new zzig(k7fVar) : new n1(k7fVar);
    }

    public static k7f b(Object obj) {
        return new zzii(obj);
    }
}
