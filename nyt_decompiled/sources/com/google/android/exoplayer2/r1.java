package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.r1;
import defpackage.hc5;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class r1 extends y1 {
    private static final String d = z19.t0(1);
    public static final g.a e = new g.a() { // from class: zq5
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            r1 e2;
            e2 = r1.e(bundle);
            return e2;
        }
    };
    private final float c;

    public r1() {
        this.c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r1 e(Bundle bundle) {
        ur.a(bundle.getInt(y1.a, -1) == 1);
        float f = bundle.getFloat(d, -1.0f);
        return f == -1.0f ? new r1() : new r1(f);
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.a, 1);
        bundle.putFloat(d, this.c);
        return bundle;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r1) && this.c == ((r1) obj).c;
    }

    public int hashCode() {
        return hc5.b(Float.valueOf(this.c));
    }

    public r1(float f) {
        ur.b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.c = f;
    }
}
