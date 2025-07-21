package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.coroutinesutils.d;
import com.nytimes.android.dailyfive.di.DailyFiveModule;
import com.nytimes.android.utils.MoshiFileSystemPersister;

/* loaded from: classes4.dex */
public abstract class e81 implements ba2 {
    public static d a(ApolloClient apolloClient, MoshiFileSystemPersister moshiFileSystemPersister, k81 k81Var) {
        return (d) g16.e(DailyFiveModule.a.e(apolloClient, moshiFileSystemPersister, k81Var));
    }
}
