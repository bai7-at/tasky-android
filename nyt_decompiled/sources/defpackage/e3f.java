package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final class e3f extends j3f {
    final String a;

    public e3f(String str) {
        this.a = str;
    }

    @Override // defpackage.j3f
    public final void a(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
