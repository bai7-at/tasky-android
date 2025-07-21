package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.nytimes.android.hybrid.HybridConfig;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class mc3 {
    public final i a() {
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        return d;
    }

    public final JsonAdapter b(i iVar) {
        zq3.h(iVar, "moshi");
        JsonAdapter c = iVar.c(HybridConfig.class);
        zq3.g(c, "adapter(...)");
        return c;
    }

    public final SharedPreferences c(Application application) {
        zq3.h(application, "application");
        SharedPreferences b = g.b(application);
        zq3.g(b, "getDefaultSharedPreferences(...)");
        return b;
    }
}
