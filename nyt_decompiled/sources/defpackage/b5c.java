package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.atv_ads_framework.b;
import com.google.android.gms.internal.atv_ads_framework.zza;

/* loaded from: classes3.dex */
public final class b5c {
    public static final zza a(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.tv.custom_launcher") ? zza.CUSTOM : context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE") ? zza.LAUNCHER_X : !context.getPackageManager().hasSystemFeature("android.software.leanback") ? zza.UNKNOWN : zza.TV_LAUNCHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r3 != 2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[EDGE_INSN: B:69:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:7:0x0030->B:10:0x0056], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.atv_ads_framework.zzae b(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5c.b(android.content.Context):com.google.android.gms.internal.atv_ads_framework.zzae");
    }

    private static void c(b bVar, Context context, String str, String str2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                bVar.a(str2, Long.toString(um5.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
