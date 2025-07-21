package defpackage;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.widget.Toast;
import com.nytimes.android.logging.NYTLogger;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class tp6 implements f98 {
    private final Application a;
    private final yc2 b;

    public tp6(Application application, yc2 yc2Var) {
        zq3.h(application, "application");
        zq3.h(yc2Var, "launcher");
        this.a = application;
        this.b = yc2Var;
    }

    @Override // defpackage.f98
    public void a(String str, String str2) {
        zq3.h(str2, "errorMessage");
        try {
            this.a.startActivity(this.b.a(i.G0(i.e(str2), "Log Reference = " + str)));
        } catch (ActivityNotFoundException e) {
            NYTLogger.h(e);
            String string = this.a.getString(xk6.settings_privacy_opt_out_error);
            zq3.g(string, "getString(...)");
            Toast.makeText(this.a, string, 0).show();
        }
    }
}
