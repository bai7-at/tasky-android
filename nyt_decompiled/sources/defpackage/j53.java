package defpackage;

import android.app.Application;
import com.nytimes.android.growthui.paywall.models.remoteconfig.PaywallConfigRepository;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public abstract class j53 implements ba2 {
    public static PaywallConfigRepository a(y43 y43Var, Application application, p53 p53Var, i iVar) {
        return (PaywallConfigRepository) g16.e(y43Var.l(application, p53Var, iVar));
    }
}
