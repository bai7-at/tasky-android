package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements ba2 {
    private final p76 contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(p76 p76Var) {
        this.contextProvider = p76Var;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(p76 p76Var) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(p76Var);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) g16.c(ZendeskProvidersModule.providerConnectivityManager(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ConnectivityManager get() {
        return providerConnectivityManager((Context) this.contextProvider.get());
    }
}
