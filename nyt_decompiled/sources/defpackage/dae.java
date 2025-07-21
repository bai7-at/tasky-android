package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes3.dex */
public final class dae {
    public static final dae c = new dae(-1, -1);
    public static final dae d = new dae(0, 0);
    private final int a;
    private final int b;

    public dae(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        wad.d(z);
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof dae) {
            dae daeVar = (dae) obj;
            if (this.a == daeVar.a && this.b == daeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        return this.a + QueryKeys.SCROLL_POSITION_TOP + this.b;
    }
}
