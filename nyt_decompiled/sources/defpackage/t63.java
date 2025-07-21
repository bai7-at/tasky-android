package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.navigation.NavigationSource;
import defpackage.c58;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class t63 {
    public static final s42 c(c58.d dVar, boolean z) {
        zq3.h(dVar, "<this>");
        return new s42("go to the app", z ? "app downloaded" : "no app downloaded", null, null, null, null, null, null, dVar.a() + " panel", 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s42 d(c58.d dVar, String str, boolean z) {
        return new s42("open", "go to " + str + " app", null, null, null, null, null, new y32(null, null, null, z ? "app downloaded" : "no app downloaded", null, null, 55, null), dVar.a() + " panel", 124, null);
    }

    public static final boolean e(c58.d dVar, PackageManager packageManager) {
        PackageManager.PackageInfoFlags of;
        zq3.h(dVar, "<this>");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                if (packageManager != null) {
                    String c = dVar.c();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageManager.getPackageInfo(c, of);
                }
            } else if (packageManager != null) {
                packageManager.getPackageInfo(dVar.c(), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            NYTLogger.m(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y25 f(c58.e eVar) {
        z25 z25Var;
        if (eVar instanceof c58.g) {
            z25Var = new z25("go to wirecutter", "wirecutter panel", "open", null, 8, null);
        } else {
            if (!(eVar instanceof c58.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z25Var = new z25("view all audio", "audio panel", "view all", "nyt://legacycollection/1693fba8-9aeb-5a68-9d85-d86946e9ee6a");
        }
        return new y25(eVar.c(), AssetConstants.ARTICLE_TYPE, z25Var.d(), "", "", false, false, null, null, NavigationSource.XPN_CTA, null, z25Var.b(), z25Var.a(), null, null, z25Var.c(), null, null, null, 483584, null);
    }
}
