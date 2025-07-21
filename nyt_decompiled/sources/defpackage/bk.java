package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.apolloschema.ApolloSchemaModule;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import io.reactivex.Single;

/* loaded from: classes3.dex */
public abstract class bk implements ba2 {
    public static w13 a(SharedPreferences sharedPreferences, Resources resources, GraphQlEnvironment graphQlEnvironment, Single single) {
        return (w13) g16.e(ApolloSchemaModule.a.c(sharedPreferences, resources, graphQlEnvironment, single));
    }
}
