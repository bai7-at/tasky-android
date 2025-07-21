package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import co.datadome.sdk.e;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qn9 {
    public static final qn9 b = new qn9();
    private static final Map a = new LinkedHashMap();

    private qn9() {
    }

    public final void a(Context context) {
        zq3.i(context, "context");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        zq3.d(applicationInfo, "context.packageManager.g…r.GET_META_DATA\n        )");
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            for (e eVar : e.values()) {
                a.put(eVar, Boolean.valueOf(bundle.getBoolean(eVar.a(), false)));
            }
        }
    }

    public final boolean b(e eVar) {
        zq3.i(eVar, "feature");
        return zq3.c((Boolean) a.get(eVar), Boolean.TRUE);
    }
}
