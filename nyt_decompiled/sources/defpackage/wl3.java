package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
class wl3 {
    private String a;

    wl3() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.a == null) {
                this.a = b(context);
            }
        } finally {
        }
        return "".equals(this.a) ? null : this.a;
    }
}
