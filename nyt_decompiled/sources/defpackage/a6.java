package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;

/* loaded from: classes2.dex */
public final class a6 {
    public static final a6 a = new a6();

    private a6() {
    }

    public final g7 a(Context context) {
        zq3.h(context, "context");
        SharedPreferences b = g.b(context);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        return new h7(b);
    }
}
