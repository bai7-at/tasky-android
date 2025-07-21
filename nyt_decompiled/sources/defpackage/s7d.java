package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class s7d {
    private static final String c = Integer.toString(0, 36);
    private static final String d = Integer.toString(1, 36);
    public final String a;
    public final int b;

    public s7d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}
