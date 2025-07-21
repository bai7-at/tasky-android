package defpackage;

import android.app.Application;
import com.nytimes.android.utils.ShareOrigin;

/* loaded from: classes4.dex */
public final class zp7 extends zn3 {
    private final Application b;
    private final uq7 c;

    public zp7(Application application, uq7 uq7Var) {
        zq3.h(application, "context");
        zq3.h(uq7Var, "shareManager");
        this.b = application;
        this.c = uq7Var;
    }

    private final void e(String str, String str2) {
        uq7.n(this.c, this.b, str2, str, null, ShareOrigin.NOTIFICATION_ACTIONS, null, null, null, null, false, null, null, 4064, null);
    }

    @Override // defpackage.zn3
    public void c(String str, String str2) {
        zq3.h(str, "title");
        zq3.h(str2, "uri");
        e(str, str2);
    }

    @Override // defpackage.zn3
    public void d(String str, String str2) {
        zq3.h(str, "title");
        zq3.h(str2, "url");
        e(str, str2);
    }
}
