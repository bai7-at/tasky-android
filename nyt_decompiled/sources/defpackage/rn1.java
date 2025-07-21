package defpackage;

import android.app.Application;
import android.content.Intent;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class rn1 {
    private final Application a;
    private final Set b;
    private final String c;
    private final String d;

    public rn1(Application application, Set set) {
        zq3.h(application, "application");
        zq3.h(set, "intents");
        this.a = application;
        this.b = set;
        this.c = "Dev Settings";
        this.d = "com.nyt.android.new.dev";
    }

    public final Intent a() {
        return (Intent) i.l0(this.b);
    }
}
