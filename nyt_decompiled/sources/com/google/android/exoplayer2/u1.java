package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.u1;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class u1 implements g {
    public static final u1 d = new u1(1.0f);
    private static final String e = z19.t0(0);
    private static final String f = z19.t0(1);
    public static final g.a g = new g.a() { // from class: nv5
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            u1 d2;
            d2 = u1.d(bundle);
            return d2;
        }
    };
    public final float a;
    public final float b;
    private final int c;

    public u1(float f2) {
        this(f2, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u1 d(Bundle bundle) {
        return new u1(bundle.getFloat(e, 1.0f), bundle.getFloat(f, 1.0f));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(e, this.a);
        bundle.putFloat(f, this.b);
        return bundle;
    }

    public long c(long j) {
        return j * this.c;
    }

    public u1 e(float f2) {
        return new u1(f2, this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.a == u1Var.a && this.b == u1Var.b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.a)) * 31) + Float.floatToRawIntBits(this.b);
    }

    public String toString() {
        return z19.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public u1(float f2, float f3) {
        ur.a(f2 > 0.0f);
        ur.a(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
