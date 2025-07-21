package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.subauth.core.di.SubauthNetworkModule;
import java.util.Set;
import okhttp3.Interceptor;

/* loaded from: classes4.dex */
public abstract class q88 implements ba2 {
    public static ApolloClient a(SubauthNetworkModule subauthNetworkModule, t68 t68Var, w13 w13Var, x13 x13Var, Set set, Interceptor interceptor, z86 z86Var, su4 su4Var) {
        return (ApolloClient) g16.e(subauthNetworkModule.l(t68Var, w13Var, x13Var, set, interceptor, z86Var, su4Var));
    }
}
