package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class f5f {
    private static final so a = new so();

    public static synchronized Uri a(String str) {
        synchronized (f5f.class) {
            so soVar = a;
            Uri uri = (Uri) soVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            soVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
