package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.apolloschema.ApolloSchemaModule;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;

/* loaded from: classes3.dex */
public abstract class ck implements ba2 {
    public static GraphQlEnvironment a(SharedPreferences sharedPreferences, Resources resources) {
        return (GraphQlEnvironment) g16.e(ApolloSchemaModule.a.d(sharedPreferences, resources));
    }
}
