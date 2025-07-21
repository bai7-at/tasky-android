package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import java.util.Calendar;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class b15 {
    public static final b15 a = new b15();

    private b15() {
    }

    public final void a(Context context, String str, String str2) {
        zq3.h(str, "logIdentifier");
        zq3.h(str2, "status");
        if (context != null) {
            ul8.a.z("NYTLOGAWS").a("Save Log Identifier: " + str + " Status: " + str2, new Object[0]);
            SharedPreferences b = g.b(context);
            Set<String> stringSet = b.getStringSet("nyt_log_ids", b0.e());
            if (stringSet == null) {
                stringSet = b0.e();
            } else {
                zq3.e(stringSet);
            }
            b.edit().putStringSet("nyt_log_ids", b0.n(stringSet, str + " (" + Calendar.getInstance().getTime() + ") Status: " + str2)).apply();
        }
    }
}
