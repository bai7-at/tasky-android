package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.nytimes.android.IntentFilterActivity;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class zs1 {
    private final Activity a;
    private final id9 b;
    private boolean c;

    public zs1(Activity activity, id9 id9Var) {
        zq3.h(activity, "activity");
        zq3.h(id9Var, "webActivityNavigator");
        this.a = activity;
        this.b = id9Var;
        this.c = true;
    }

    public final void a(String str) {
        if (str == null || h.d0(str)) {
            NYTLogger.g("GMAX: DockDeepLinkHandler unable to handle link: " + str, new Object[0]);
            this.c = false;
            return;
        }
        DeepLinkManager.a aVar = DeepLinkManager.g;
        if (aVar.b(str)) {
            Intent intent = new Intent(this.a, (Class<?>) IntentFilterActivity.class);
            intent.setFlags(268435456);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.a.startActivity(intent);
            NYTLogger.d("DockHandlerDeepLink " + str, new Object[0]);
            return;
        }
        if (aVar.d(str)) {
            NYTLogger.l("DockHandlerInternal URL - path: %s " + str, new Object[0]);
            this.b.c(this.a, str);
            return;
        }
        if (aVar.c(str)) {
            NYTLogger.l("DockHandlerExternal URL - path: %s " + str, new Object[0]);
            if (URLUtil.isValidUrl(str)) {
                this.a.startActivity(this.b.b(str));
                return;
            }
            NYTLogger.g("GMAX: DockDeepLinkHandler unable to handle link: " + str, new Object[0]);
            this.c = false;
        }
    }

    public final boolean b() {
        return this.c;
    }
}
