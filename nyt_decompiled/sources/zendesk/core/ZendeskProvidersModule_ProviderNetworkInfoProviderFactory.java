package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements ba2 {
    private final p76 connectivityManagerProvider;
    private final p76 contextProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(p76 p76Var, p76 p76Var2) {
        this.contextProvider = p76Var;
        this.connectivityManagerProvider = p76Var2;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(p76 p76Var, p76 p76Var2) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(p76Var, p76Var2);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(Context context, ConnectivityManager connectivityManager) {
        return (NetworkInfoProvider) g16.c(ZendeskProvidersModule.providerNetworkInfoProvider(context, connectivityManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider((Context) this.contextProvider.get(), (ConnectivityManager) this.connectivityManagerProvider.get());
    }
}
