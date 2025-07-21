package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;

/* loaded from: classes4.dex */
public abstract class u88 implements ba2 {
    public static vz8 a(SubauthNetworkModule subauthNetworkModule, ApolloClient apolloClient, wz8 wz8Var, w88 w88Var, SubauthListenerManager subauthListenerManager) {
        return (vz8) g16.e(subauthNetworkModule.p(apolloClient, wz8Var, w88Var, subauthListenerManager));
    }
}
