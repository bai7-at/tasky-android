package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class n4 {
    final a5 a;

    n4(r9 r9Var) {
        this.a = r9Var.a0();
    }

    final boolean a() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.a.zzau());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.o().u().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.o().u().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
