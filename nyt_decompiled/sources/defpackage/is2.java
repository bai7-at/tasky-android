package defpackage;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.FullscreenMediaActivity;

/* loaded from: classes4.dex */
public final class is2 {
    public static final is2 a = new is2();

    private is2() {
    }

    public final sn3 a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        return new sn3(FullscreenMediaActivity.class, context).c(str).h();
    }

    public Intent b(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        return a(context, str).d(str2).f("saveMgr").r("Saved for Later").q("Saved for Later").e();
    }

    public Intent c(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "assetUri");
        return a(context, str).s(str2).e();
    }
}
