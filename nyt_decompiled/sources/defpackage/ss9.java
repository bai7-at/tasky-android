package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ss9 {
    /* synthetic */ ss9(pq9 pq9Var) {
    }

    public abstract CookieManager a(Context context);

    public abstract WebResourceResponse b(String str, String str2, int i, String str3, Map map, InputStream inputStream);

    public abstract emb c(wlb wlbVar, ina inaVar, boolean z, l8d l8dVar);

    public abstract boolean d(Activity activity, Configuration configuration);

    public abstract Intent e(Activity activity);

    public abstract void f(Context context, String str, String str2);

    public abstract boolean g(Context context, String str);

    public abstract int h(Context context, TelephonyManager telephonyManager);

    public abstract int i(AudioManager audioManager);

    public abstract void j(Activity activity);

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
