package defpackage;

import android.app.AppOpsManager$OnOpNotedCallback;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import com.nytimes.android.analytics.SensitiveDataUseError;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes2.dex */
public final class xj7 extends AppOpsManager$OnOpNotedCallback {
    public static /* synthetic */ void b(xj7 xj7Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        xj7Var.a(str, str2, str3);
    }

    public final void a(String str, String str2, String str3) {
        zq3.h(str, "opCode");
        NYTLogger.s(new SensitiveDataUseError("Private data access detected. Operation: " + str + ", Message: " + str3 + ", AttributionTag: " + str2));
    }

    public void onAsyncNoted(AsyncNotedAppOp asyncNotedAppOp) {
        String op;
        String attributionTag;
        String message;
        zq3.h(asyncNotedAppOp, "asyncNotedAppOp");
        op = asyncNotedAppOp.getOp();
        zq3.g(op, "getOp(...)");
        attributionTag = asyncNotedAppOp.getAttributionTag();
        message = asyncNotedAppOp.getMessage();
        a(op, attributionTag, message);
    }

    public void onNoted(SyncNotedAppOp syncNotedAppOp) {
        String op;
        String attributionTag;
        zq3.h(syncNotedAppOp, "syncNotedAppOp");
        op = syncNotedAppOp.getOp();
        zq3.g(op, "getOp(...)");
        attributionTag = syncNotedAppOp.getAttributionTag();
        b(this, op, attributionTag, null, 4, null);
    }

    public void onSelfNoted(SyncNotedAppOp syncNotedAppOp) {
        String op;
        String attributionTag;
        zq3.h(syncNotedAppOp, "syncNotedAppOp");
        op = syncNotedAppOp.getOp();
        zq3.g(op, "getOp(...)");
        attributionTag = syncNotedAppOp.getAttributionTag();
        b(this, op, attributionTag, null, 4, null);
    }
}
