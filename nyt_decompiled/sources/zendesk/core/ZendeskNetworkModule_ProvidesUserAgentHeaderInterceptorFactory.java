package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements ba2 {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        return (UserAgentAndClientHeadersInterceptor) g16.c(zendeskNetworkModule.providesUserAgentHeaderInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}
