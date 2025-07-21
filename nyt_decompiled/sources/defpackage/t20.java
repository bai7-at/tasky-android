package defpackage;

import com.nytimes.android.ad.BaseAdParamKey;

/* loaded from: classes2.dex */
public final class t20 {
    private final g00 a;

    public t20(g00 g00Var) {
        zq3.h(g00Var, "autoPlayPrefManager");
        this.a = g00Var;
    }

    public BaseAdParamKey a() {
        return BaseAdParamKey.AUTOPLAY;
    }

    public String b() {
        return this.a.d() ? "allow" : "block";
    }
}
