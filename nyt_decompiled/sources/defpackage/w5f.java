package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class w5f {
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;

    private w5f(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, d7f d7fVar) {
        this.a = null;
        this.b = uri;
        this.c = "";
        this.d = "";
        this.e = z;
        this.f = false;
        this.g = z3;
        this.h = false;
    }

    public final w5f a() {
        return new w5f(null, this.b, this.c, this.d, this.e, false, true, false, null);
    }

    public final w5f b() {
        if (this.c.isEmpty()) {
            return new w5f(null, this.b, this.c, this.d, true, false, this.g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final d6f c(String str, double d) {
        return new p5f(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final d6f d(String str, long j) {
        return new l5f(this, str, Long.valueOf(j), true);
    }

    public final d6f e(String str, String str2) {
        return new s5f(this, str, str2, true);
    }

    public final d6f f(String str, boolean z) {
        return new m5f(this, str, Boolean.valueOf(z), true);
    }

    public w5f(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
