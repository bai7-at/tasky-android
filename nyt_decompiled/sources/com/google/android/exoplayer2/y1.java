package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.y1;
import defpackage.z19;

/* loaded from: classes2.dex */
public abstract class y1 implements g {
    static final String a = z19.t0(0);
    public static final g.a b = new g.a() { // from class: ap6
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            y1 c;
            c = y1.c(bundle);
            return c;
        }
    };

    y1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y1 c(Bundle bundle) {
        int i = bundle.getInt(a, -1);
        if (i == 0) {
            return (y1) u0.g.a(bundle);
        }
        if (i == 1) {
            return (y1) r1.e.a(bundle);
        }
        if (i == 2) {
            return (y1) c2.g.a(bundle);
        }
        if (i == 3) {
            return (y1) f2.g.a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }
}
