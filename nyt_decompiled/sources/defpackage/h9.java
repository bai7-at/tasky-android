package defpackage;

import android.content.Context;
import defpackage.yn1;

/* loaded from: classes2.dex */
public final class h9 {
    public static final h9 a = new h9();

    private h9() {
    }

    public final yn1.b a(Context context) {
        zq3.h(context, "context");
        String string = context.getString(yj6.advertising_section);
        zq3.g(string, "getString(...)");
        return new yn1.b(string);
    }
}
