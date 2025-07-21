package defpackage;

import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import java.util.Map;

/* loaded from: classes4.dex */
public final class rv3 {
    private final qv3 a;
    private final Map b;

    public rv3(qv3 qv3Var, Map map) {
        zq3.h(qv3Var, "default");
        zq3.h(map, "map");
        this.a = qv3Var;
        this.b = map;
    }

    public final qv3 a(GraphQlEnvironment graphQlEnvironment) {
        if (graphQlEnvironment != null) {
            Object obj = this.b.get(graphQlEnvironment);
            if (obj == null) {
                obj = this.a;
            }
            qv3 qv3Var = (qv3) obj;
            if (qv3Var != null) {
                return qv3Var;
            }
        }
        return this.a;
    }
}
