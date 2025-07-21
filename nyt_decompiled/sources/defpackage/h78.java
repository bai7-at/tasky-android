package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;

/* loaded from: classes4.dex */
public final class h78 {
    private final Context a;
    private final SharedPreferences b;

    public h78(Context context) {
        zq3.h(context, "context");
        this.a = context;
        SharedPreferences b = g.b(context);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        this.b = b;
    }

    public final boolean a() {
        String string = this.a.getString(hm6.subauth_override_delete_account_usecase);
        zq3.g(string, "getString(...)");
        return this.b.getBoolean(string, false);
    }
}
