package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.di.SubauthModule;

/* loaded from: classes4.dex */
public abstract class u78 implements ba2 {
    public static s86 a(SubauthModule subauthModule, t68 t68Var, ApolloClient apolloClient, n96 n96Var, xe8 xe8Var, SubauthListenerManager subauthListenerManager, w88 w88Var) {
        return (s86) g16.e(subauthModule.g(t68Var, apolloClient, n96Var, xe8Var, subauthListenerManager, w88Var));
    }
}
