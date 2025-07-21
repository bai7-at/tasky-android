package zendesk.core;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements ba2 {
    private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

    public static ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory create() {
        return INSTANCE;
    }

    public static AcceptHeaderInterceptor providesAcceptHeaderInterceptor() {
        return (AcceptHeaderInterceptor) g16.c(ZendeskNetworkModule.providesAcceptHeaderInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public AcceptHeaderInterceptor get() {
        return providesAcceptHeaderInterceptor();
    }
}
