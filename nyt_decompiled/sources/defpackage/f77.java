package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class f77 {
    private final String a;

    public f77(Context context) {
        zq3.h(context, "context");
        String string = context.getString(im6.subauth_provider_error, context.getString(im6.subauth_provider_facebook));
        zq3.g(string, "getString(...)");
        this.a = string;
    }
}
