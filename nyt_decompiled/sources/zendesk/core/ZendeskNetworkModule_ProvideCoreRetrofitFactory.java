package zendesk.core;

import com.google.gson.Gson;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvideCoreRetrofitFactory implements ba2 {
    private final p76 configurationProvider;
    private final p76 gsonProvider;
    private final p76 okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreRetrofitFactory(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        this.configurationProvider = p76Var;
        this.gsonProvider = p76Var2;
        this.okHttpClientProvider = p76Var3;
    }

    public static ZendeskNetworkModule_ProvideCoreRetrofitFactory create(p76 p76Var, p76 p76Var2, p76 p76Var3) {
        return new ZendeskNetworkModule_ProvideCoreRetrofitFactory(p76Var, p76Var2, p76Var3);
    }

    public static Retrofit provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient) {
        return (Retrofit) g16.c(ZendeskNetworkModule.provideCoreRetrofit(applicationConfiguration, gson, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public Retrofit get() {
        return provideCoreRetrofit((ApplicationConfiguration) this.configurationProvider.get(), (Gson) this.gsonProvider.get(), (OkHttpClient) this.okHttpClientProvider.get());
    }
}
