package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.e5;

/* loaded from: classes.dex */
public class f5 extends e5 {
    @Override // defpackage.e5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "input");
        Intent type2 = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        zq3.g(type2, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type2;
    }

    @Override // defpackage.e5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final e5.a b(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "input");
        return null;
    }

    @Override // defpackage.e5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
