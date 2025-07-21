package defpackage;

import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.purchase.network.api.PurchaseAPI;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class e98 {
    private final PurchaseAPI a;

    public e98(Retrofit.Builder builder, SubauthEnvironment subauthEnvironment) {
        zq3.h(builder, "retrofitBuilder");
        zq3.h(subauthEnvironment, "subAuthEnvironment");
        Object create = builder.baseUrl(subauthEnvironment.c()).build().create(PurchaseAPI.class);
        zq3.g(create, "create(...)");
        this.a = (PurchaseAPI) create;
    }

    public final PurchaseAPI a() {
        return this.a;
    }
}
