package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class y0 {
    protected final tuc a;

    protected y0() {
        tuc tucVar = new tuc();
        this.a = tucVar;
        tucVar.r("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public y0 a(String str) {
        this.a.p(str);
        return c();
    }

    public y0 b(Class cls, Bundle bundle) {
        this.a.q(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.a.s("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return c();
    }

    protected abstract y0 c();

    public y0 d(String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.a.t(str);
        return c();
    }

    public final y0 e(String str) {
        this.a.r(str);
        return c();
    }

    public final y0 f(boolean z) {
        this.a.u(z);
        return c();
    }

    public final y0 g(boolean z) {
        this.a.a(z);
        return c();
    }
}
