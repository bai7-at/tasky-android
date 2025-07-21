package defpackage;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class tt5 {
    private final boolean a;
    private Configuration b;

    public tt5(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tt5(boolean z, Configuration configuration) {
        this(z);
        zq3.h(configuration, "newConfig");
        this.b = configuration;
    }
}
