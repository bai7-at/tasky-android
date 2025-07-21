package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public interface mw0 {
    static Uri c(mw0 mw0Var) {
        String b = mw0Var.b("exo_redir", null);
        if (b == null) {
            return null;
        }
        return Uri.parse(b);
    }

    static long d(mw0 mw0Var) {
        return mw0Var.get("exo_len", -1L);
    }

    String b(String str, String str2);

    long get(String str, long j);
}
