package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class vm5 {
    private static final String a = h94.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i, boolean z) {
        return i == 0 ? z : i == 1;
    }

    public static void c(Context context, Class cls, boolean z) {
        try {
            if (z == b(a(context, cls.getName()), false)) {
                h94.e().a(a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            h94 e = h94.e();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            e.a(str, sb.toString());
        } catch (Exception e2) {
            h94 e3 = h94.e();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            e3.b(str2, sb2.toString(), e2);
        }
    }
}
