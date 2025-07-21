package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.subauth.core.purr.network.Environment;

/* loaded from: classes4.dex */
public abstract class f22 {
    public static final Environment a(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "<this>");
        String string = sharedPreferences.getString("nyt.purr.env_key", Environment.PRODUCTION.getUrl());
        for (Environment environment : Environment.values()) {
            if (zq3.c(environment.getUrl(), string)) {
                return environment;
            }
        }
        return null;
    }
}
