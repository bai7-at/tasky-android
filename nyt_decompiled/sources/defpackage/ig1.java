package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class ig1 implements dd1 {
    private final ms a;

    public ig1(ms msVar) {
        zq3.h(msVar, "wrapper");
        this.a = msVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        ms msVar = this.a;
        String uri2 = uri.toString();
        zq3.g(uri2, "toString(...)");
        return ns.a(msVar, context, uri2, str, z);
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        return true;
    }
}
