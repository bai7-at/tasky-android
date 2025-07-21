package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class s9d {
    private static final String d = Integer.toString(0, 36);
    private static final String e = Integer.toString(1, 36);
    private static final String f = Integer.toString(2, 36);
    public final int a;
    public final int b;
    public final int c;

    public s9d(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putInt(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
