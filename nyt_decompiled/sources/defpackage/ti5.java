package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.JsonDataException;
import defpackage.yj;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class ti5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final yj a(JsonReader jsonReader, ii5 ii5Var, UUID uuid, w41 w41Var, Set set) {
        yj b;
        ?? r8;
        zq3.h(jsonReader, "<this>");
        zq3.h(ii5Var, "operation");
        zq3.h(w41Var, "customScalarAdapters");
        yj th = null;
        try {
            b = s07.a.a(jsonReader, ii5Var, uuid, w41Var, set);
        } catch (Throwable th2) {
            if (uuid == null) {
                try {
                    uuid = UUID.randomUUID();
                    zq3.g(uuid, "randomUUID(...)");
                } catch (Throwable th3) {
                    try {
                        jsonReader.close();
                        r8 = th3;
                    } catch (Throwable th4) {
                        g62.a(th3, th4);
                        r8 = th3;
                    }
                }
            }
            b = new yj.a(ii5Var, uuid).e(c(th2)).g(true).b();
        }
        if (jsonReader.peek() != JsonReader.Token.END_DOCUMENT) {
            throw new JsonDataException("Expected END_DOCUMENT but was " + jsonReader.peek());
        }
        try {
            jsonReader.close();
        } catch (Throwable th5) {
            th = th5;
        }
        r8 = th;
        th = b;
        if (r8 == 0) {
            return th;
        }
        throw r8;
    }

    public static /* synthetic */ yj b(JsonReader jsonReader, ii5 ii5Var, UUID uuid, w41 w41Var, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            w41Var = w41.i;
        }
        if ((i & 8) != 0) {
            set = null;
        }
        return a(jsonReader, ii5Var, uuid, w41Var, set);
    }

    private static final ApolloException c(Throwable th) {
        return th instanceof ApolloException ? (ApolloException) th : new ApolloNetworkException("Error while reading JSON response", th);
    }
}
