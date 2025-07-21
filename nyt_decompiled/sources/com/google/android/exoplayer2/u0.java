package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.u0;
import defpackage.hc5;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class u0 extends y1 {
    private static final String e = z19.t0(1);
    private static final String f = z19.t0(2);
    public static final g.a g = new g.a() { // from class: w73
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            u0 e2;
            e2 = u0.e(bundle);
            return e2;
        }
    };
    private final boolean c;
    private final boolean d;

    public u0() {
        this.c = false;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u0 e(Bundle bundle) {
        ur.a(bundle.getInt(y1.a, -1) == 0);
        return bundle.getBoolean(e, false) ? new u0(bundle.getBoolean(f, false)) : new u0();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.a, 0);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.d == u0Var.d && this.c == u0Var.c;
    }

    public int hashCode() {
        return hc5.b(Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public u0(boolean z) {
        this.c = true;
        this.d = z;
    }
}
