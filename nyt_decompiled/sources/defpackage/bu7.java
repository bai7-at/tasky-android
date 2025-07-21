package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
public final class bu7 {
    public static final bu7 c = new bu7(-1, -1);
    public static final bu7 d = new bu7(0, 0);
    private final int a;
    private final int b;

    public bu7(int i, int i2) {
        ur.a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu7)) {
            return false;
        }
        bu7 bu7Var = (bu7) obj;
        return this.a == bu7Var.a && this.b == bu7Var.b;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return ((i2 >>> 16) | (i2 << 16)) ^ i;
    }

    public String toString() {
        return this.a + QueryKeys.SCROLL_POSITION_TOP + this.b;
    }
}
