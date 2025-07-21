package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.preference.Preference;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
public abstract class p16 {
    public static final Activity a(Preference preference, Context context) {
        zq3.h(preference, "<this>");
        zq3.h(context, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            zq3.g(context, "getBaseContext(...)");
        }
        return null;
    }
}
