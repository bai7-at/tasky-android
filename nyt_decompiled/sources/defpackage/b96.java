package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class b96 implements c96 {
    private final Context a;
    private final boolean b;

    public b96(Context context, boolean z) {
        zq3.h(context, "context");
        this.a = context;
        this.b = z;
    }

    @Override // defpackage.c96
    public String a() {
        if (this.b) {
            return d96.Companion.b(this.a).getCountry();
        }
        return null;
    }

    @Override // defpackage.c96
    public String getRegion() {
        if (this.b) {
            return d96.Companion.b(this.a).getRegion();
        }
        return null;
    }
}
