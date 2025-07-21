package defpackage;

import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import java.util.Map;

/* loaded from: classes4.dex */
public final class fw3 {
    private final String a;
    private final Map b;

    public fw3(String str, Map map) {
        zq3.h(str, "default");
        zq3.h(map, "passphrases");
        this.a = str;
        this.b = map;
    }

    public final String a(GraphQlEnvironment graphQlEnvironment) {
        if (graphQlEnvironment != null) {
            Object obj = this.b.get(graphQlEnvironment);
            if (obj == null) {
                obj = this.a;
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return this.a;
    }
}
