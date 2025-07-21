package defpackage;

import android.net.Uri;

/* loaded from: classes4.dex */
public abstract class id1 implements dd1 {
    private final String a;

    public id1(String str) {
        zq3.h(str, "prefix");
        this.a = str;
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        return jd1.b(uri, this.a);
    }

    public final String c() {
        return this.a;
    }
}
