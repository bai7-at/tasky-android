package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.g;

/* loaded from: classes2.dex */
public final class z89 implements g {
    public static final z89 e = new z89(0, 0);
    private static final String f = z19.t0(0);
    private static final String g = z19.t0(1);
    private static final String h = z19.t0(2);
    private static final String i = z19.t0(3);
    public static final g.a j = new g.a() { // from class: y89
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            z89 c;
            c = z89.c(bundle);
            return c;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public z89(int i2, int i3) {
        this(i2, i3, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z89 c(Bundle bundle) {
        return new z89(bundle.getInt(f, 0), bundle.getInt(g, 0), bundle.getInt(h, 0), bundle.getFloat(i, 1.0f));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putInt(g, this.b);
        bundle.putInt(h, this.c);
        bundle.putFloat(i, this.d);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z89)) {
            return false;
        }
        z89 z89Var = (z89) obj;
        return this.a == z89Var.a && this.b == z89Var.b && this.c == z89Var.c && this.d == z89Var.d;
    }

    public int hashCode() {
        return ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }

    public z89(int i2, int i3, int i4, float f2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }
}
