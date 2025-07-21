package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class wv9 {
    public static Bundle a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle b(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv9.b(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static void c(Context context) {
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            pde k = pde.k(context);
            qde j = qde.j(context);
            k.l();
            k.m();
            j.k();
            if (((Boolean) pla.c().a(mpa.P2)).booleanValue()) {
                j.l();
            }
            if (((Boolean) pla.c().a(mpa.Q2)).booleanValue()) {
                j.m();
            }
        } catch (IOException e) {
            dyf.q().w(e, "clearStorageOnIdlessMode");
        }
    }
}
