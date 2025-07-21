package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class ma5 implements dd1 {
    private final ms a;

    public ma5(ms msVar) {
        zq3.h(msVar, "wrapper");
        this.a = msVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        ms msVar = this.a;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return msVar.g(context, path, str);
    }

    @Override // defpackage.dd1
    public boolean b(Uri uri) {
        zq3.h(uri, "uri");
        return uri.toString().equals("nytimes://notifications") || uri.toString().equals("nytimes://reader/lp/notifications");
    }
}
