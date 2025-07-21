package zendesk.core;

import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
class ZendeskRestServiceProvider implements RestServiceProvider {
    private final OkHttpClient coreOkHttpClient;
    private final OkHttpClient mediaHttpClient;
    final Retrofit retrofit;
    final OkHttpClient standardOkHttpClient;

    ZendeskRestServiceProvider(Retrofit retrofit, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        this.retrofit = retrofit;
        this.mediaHttpClient = okHttpClient;
        this.standardOkHttpClient = okHttpClient2;
        this.coreOkHttpClient = okHttpClient3;
    }

    private OkHttpClient.Builder createNonAuthenticatedOkHttpClient() {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        Iterator<Interceptor> it2 = newBuilder.interceptors().iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof ZendeskAuthHeaderInterceptor) {
                it2.remove();
            }
        }
        return newBuilder;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2) {
        return (E) this.retrofit.newBuilder().client(this.standardOkHttpClient.newBuilder().addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2)).build()).build().create(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createUnauthenticatedRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder createNonAuthenticatedOkHttpClient = createNonAuthenticatedOkHttpClient();
        customNetworkConfig.configureOkHttpClient(createNonAuthenticatedOkHttpClient);
        createNonAuthenticatedOkHttpClient.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        Retrofit.Builder newBuilder = this.retrofit.newBuilder();
        customNetworkConfig.configureRetrofit(newBuilder);
        return (E) newBuilder.client(createNonAuthenticatedOkHttpClient.build()).build().create(cls);
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getCoreOkHttpClient() {
        return this.coreOkHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public OkHttpClient getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    @Override // zendesk.core.RestServiceProvider
    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        customNetworkConfig.configureOkHttpClient(newBuilder);
        newBuilder.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        Retrofit.Builder newBuilder2 = this.retrofit.newBuilder();
        customNetworkConfig.configureRetrofit(newBuilder2);
        return (E) newBuilder2.client(newBuilder.build()).build().create(cls);
    }
}
