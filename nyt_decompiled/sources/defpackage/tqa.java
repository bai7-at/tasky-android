package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class tqa {
    private j51 a;
    private g51 b;
    private i51 c;
    private rqa d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(m4f.a(context));
                    }
                }
            }
        }
        return false;
    }

    public final j51 a() {
        g51 g51Var = this.b;
        if (g51Var == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = g51Var.c(null);
        }
        return this.a;
    }

    public final void b(Activity activity) {
        String a;
        if (this.b == null && (a = m4f.a(activity)) != null) {
            n4f n4fVar = new n4f(this);
            this.c = n4fVar;
            g51.a(activity, a, n4fVar);
        }
    }

    public final void c(g51 g51Var) {
        this.b = g51Var;
        g51Var.e(0L);
        rqa rqaVar = this.d;
        if (rqaVar != null) {
            rqaVar.zza();
        }
    }

    public final void d() {
        this.b = null;
        this.a = null;
    }

    public final void e(rqa rqaVar) {
        this.d = rqaVar;
    }

    public final void f(Activity activity) {
        i51 i51Var = this.c;
        if (i51Var == null) {
            return;
        }
        activity.unbindService(i51Var);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
