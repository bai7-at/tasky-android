package defpackage;

import android.content.Context;
import android.content.Intent;
import com.nytimes.android.SectionActivity;

/* loaded from: classes4.dex */
public final class ne7 implements oe7 {
    public static final ne7 a = new ne7();

    private ne7() {
    }

    @Override // defpackage.oe7
    public Intent a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "referringSource");
        return sn3.u(new sn3(SectionActivity.class, context).q(str).s("saved").i("Saved for Later"), false, 1, null).e();
    }

    public Intent b(Context context, String str, String str2, String str3) {
        zq3.h(context, "context");
        zq3.h(str, "sectionName");
        zq3.h(str2, "sectionTitle");
        zq3.h(str3, "referringSource");
        return new sn3(SectionActivity.class, context).q(str3).s(str).i(str2).e();
    }
}
