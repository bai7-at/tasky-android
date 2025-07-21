package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.c2;
import com.google.android.exoplayer2.g;
import defpackage.hc5;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class c2 extends y1 {
    private static final String e = z19.t0(1);
    private static final String f = z19.t0(2);
    public static final g.a g = new g.a() { // from class: k08
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            c2 e2;
            e2 = c2.e(bundle);
            return e2;
        }
    };
    private final int c;
    private final float d;

    public c2(int i) {
        ur.b(i > 0, "maxStars must be a positive integer");
        this.c = i;
        this.d = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c2 e(Bundle bundle) {
        ur.a(bundle.getInt(y1.a, -1) == 2);
        int i = bundle.getInt(e, 5);
        float f2 = bundle.getFloat(f, -1.0f);
        return f2 == -1.0f ? new c2(i) : new c2(i, f2);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.a, 2);
        bundle.putInt(e, this.c);
        bundle.putFloat(f, this.d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.c == c2Var.c && this.d == c2Var.d;
    }

    public int hashCode() {
        return hc5.b(Integer.valueOf(this.c), Float.valueOf(this.d));
    }

    public c2(int i, float f2) {
        boolean z = false;
        ur.b(i > 0, "maxStars must be a positive integer");
        if (f2 >= 0.0f && f2 <= i) {
            z = true;
        }
        ur.b(z, "starRating is out of range [0, maxStars]");
        this.c = i;
        this.d = f2;
    }
}
