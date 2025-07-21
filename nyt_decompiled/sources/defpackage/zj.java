package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.apolloschema.ApolloSchemaModule;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zj implements ba2 {
    public static ApolloClient a(w13 w13Var, b04 b04Var, c05 c05Var, x13 x13Var, Set set, Map map, boolean z) {
        return (ApolloClient) g16.e(ApolloSchemaModule.a.a(w13Var, b04Var, c05Var, x13Var, set, map, z));
    }
}
