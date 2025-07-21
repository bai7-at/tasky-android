package zendesk.support;

import okhttp3.OkHttpClient;
import zendesk.core.CustomNetworkConfig;

/* loaded from: classes5.dex */
class HelpCenterCachingNetworkConfig extends CustomNetworkConfig {
    private HelpCenterCachingInterceptor interceptor;

    HelpCenterCachingNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        this.interceptor = helpCenterCachingInterceptor;
    }

    @Override // zendesk.core.CustomNetworkConfig
    public void configureOkHttpClient(OkHttpClient.Builder builder) {
        builder.addNetworkInterceptor(this.interceptor);
    }
}
