package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class r5 {
    public static final Intent a(Intent intent, Context context) {
        zq3.h(intent, "<this>");
        zq3.h(context, "context");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        zq3.g(queryIntentActivities, "queryIntentActivities(...)");
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return intent;
    }
}
