package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g;
import defpackage.hc5;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class f2 extends y1 {
    private static final String e = z19.t0(1);
    private static final String f = z19.t0(2);
    public static final g.a g = new g.a() { // from class: nl8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            f2 e2;
            e2 = f2.e(bundle);
            return e2;
        }
    };
    private final boolean c;
    private final boolean d;

    public f2() {
        this.c = false;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f2 e(Bundle bundle) {
        ur.a(bundle.getInt(y1.a, -1) == 3);
        return bundle.getBoolean(e, false) ? new f2(bundle.getBoolean(f, false)) : new f2();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(y1.a, 3);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.d == f2Var.d && this.c == f2Var.c;
    }

    public int hashCode() {
        return hc5.b(Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public f2(boolean z) {
        this.c = true;
        this.d = z;
    }
}
