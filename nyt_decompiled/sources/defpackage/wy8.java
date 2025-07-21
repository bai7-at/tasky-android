package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class wy8 implements qw3 {
    @Override // defpackage.qw3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Uri uri, uk5 uk5Var) {
        if (!zq3.c(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        sb.append(s.k(uk5Var.g().getResources().getConfiguration()));
        return sb.toString();
    }
}
