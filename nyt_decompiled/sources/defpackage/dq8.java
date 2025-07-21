package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class dq8 implements g {
    private static final String c = z19.t0(0);
    private static final String d = z19.t0(1);
    public static final g.a e = new g.a() { // from class: cq8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            dq8 d2;
            d2 = dq8.d(bundle);
            return d2;
        }
    };
    public final up8 a;
    public final ImmutableList b;

    public dq8(up8 up8Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= up8Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = up8Var;
        this.b = ImmutableList.t(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dq8 d(Bundle bundle) {
        return new dq8((up8) up8.h.a((Bundle) ur.e(bundle.getBundle(c))), Ints.c((int[]) ur.e(bundle.getIntArray(d))));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBundle(c, this.a.a());
        bundle.putIntArray(d, Ints.l(this.b));
        return bundle;
    }

    public int c() {
        return this.a.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dq8.class != obj.getClass()) {
            return false;
        }
        dq8 dq8Var = (dq8) obj;
        return this.a.equals(dq8Var.a) && this.b.equals(dq8Var.b);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
