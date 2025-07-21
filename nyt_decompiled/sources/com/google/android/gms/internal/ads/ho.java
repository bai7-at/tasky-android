package com.google.android.gms.internal.ads;

import defpackage.sdf;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ho {
    public final long a;
    public final float b;
    public final long c;

    /* synthetic */ ho(go goVar, sdf sdfVar) {
        long j;
        float f;
        long j2;
        j = goVar.a;
        this.a = j;
        f = goVar.b;
        this.b = f;
        j2 = goVar.c;
        this.c = j2;
    }

    public final go a() {
        return new go(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return this.a == hoVar.a && this.b == hoVar.b && this.c == hoVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
