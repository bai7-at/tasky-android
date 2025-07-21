package defpackage;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.network.http.a;
import java.util.Iterator;
import java.util.List;
import kotlin.c;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public abstract class ud5 {
    private static final c04 a = c.a(new qs2() { // from class: td5
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Object mo865invoke() {
            OkHttpClient.Builder b;
            b = ud5.b();
            return b;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient.Builder b() {
        return new OkHttpClient.Builder();
    }

    public static final OkHttpClient.Builder c() {
        return (OkHttpClient.Builder) a.getValue();
    }

    public static final ApolloClient.a d(ApolloClient.a aVar, qs2 qs2Var) {
        zq3.h(aVar, "<this>");
        zq3.h(qs2Var, "callFactory");
        aVar.O(a.b(qs2Var));
        return aVar;
    }

    public static final Headers e(List list) {
        zq3.h(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            va3 va3Var = (va3) it2.next();
            builder.add(va3Var.a(), va3Var.b());
        }
        return builder.build();
    }
}
