package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.activity.ComponentActivity;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import defpackage.c58;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public final class s63 {
    private final tr3 a;
    private final DestinationEventTracker b;
    private final Application c;

    public s63(tr3 tr3Var, DestinationEventTracker destinationEventTracker, Application application) {
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(application, "application");
        this.a = tr3Var;
        this.b = destinationEventTracker;
        this.c = application;
    }

    public final void a(c58.e eVar, ComponentActivity componentActivity) {
        y25 f;
        zq3.h(eVar, "subBrand");
        tr3 tr3Var = this.a;
        f = t63.f(eVar);
        tr3Var.a(componentActivity, f);
    }

    public final void b(RibbonConfig ribbonConfig, c58.d dVar) {
        String a;
        s42 d;
        zq3.h(ribbonConfig, "config");
        zq3.h(dVar, "subBrand");
        String c = dVar.c();
        boolean e = t63.e(dVar, this.c.getPackageManager());
        if (zq3.c(dVar, c58.b.a) ? true : zq3.c(dVar, c58.c.a)) {
            a = "the " + dVar.a();
        } else {
            if (!zq3.c(dVar, c58.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a = dVar.a();
        }
        DestinationEventTracker destinationEventTracker = this.b;
        d = t63.d(dVar, a, e);
        destinationEventTracker.q(ribbonConfig, d);
        if (e) {
            Application application = this.c;
            Intent launchIntentForPackage = application.getPackageManager().getLaunchIntentForPackage(c);
            if (launchIntentForPackage != null) {
                if (Build.VERSION.SDK_INT < 33) {
                    launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
                }
                launchIntentForPackage.setFlags(268435456);
            } else {
                launchIntentForPackage = null;
            }
            application.startActivity(launchIntentForPackage);
            return;
        }
        Application application2 = this.c;
        Intent flags = new Intent("android.intent.action.VIEW").setFlags(268435456);
        flags.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + c));
        flags.setPackage("com.android.vending");
        application2.startActivity(flags);
    }
}
