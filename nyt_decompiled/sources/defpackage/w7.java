package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.a;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class w7 {
    public final AdConfig.Builder a(Context context, a aVar) {
        zq3.h(context, "context");
        zq3.h(aVar, "adClient");
        SharedPreferences b = g.b(context);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        return new AdConfig.Builder(b, aVar, Dispatchers.getIO());
    }
}
