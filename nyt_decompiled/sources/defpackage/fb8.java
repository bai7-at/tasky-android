package defpackage;

import com.nytimes.android.ad.BaseAdParamKey;
import com.nytimes.android.entitlements.a;

/* loaded from: classes2.dex */
public final class fb8 {
    private final a a;

    public fb8(a aVar) {
        zq3.h(aVar, "eCommClient");
        this.a = aVar;
    }

    public BaseAdParamKey a() {
        return BaseAdParamKey.SUBSCRIBER;
    }

    public String b() {
        return this.a.a() ? "sub" : this.a.q() ? "reg" : "anon";
    }
}
