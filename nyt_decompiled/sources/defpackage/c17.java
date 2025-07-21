package defpackage;

import com.nytimes.android.api.retrofit.CookingApi;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class c17 {
    public final CookingApi a(Retrofit.Builder builder) {
        zq3.h(builder, "retrofitBuilder");
        Object create = builder.baseUrl("https://cooking.nytimes.com/api/v5/homepage/").build().create(CookingApi.class);
        zq3.g(create, "create(...)");
        return (CookingApi) create;
    }
}
