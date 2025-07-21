package defpackage;

import android.content.res.Resources;
import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import defpackage.xv3;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class w77 {
    private final Resources a;
    private final rv3 b;
    private final fw3 c;

    public w77(Resources resources, rv3 rv3Var, fw3 fw3Var) {
        zq3.h(resources, "resources");
        zq3.h(rv3Var, "keyConfigurationProvider");
        zq3.h(fw3Var, "passphrasesProvider");
        this.a = resources;
        this.b = rv3Var;
        this.c = fw3Var;
    }

    public xv3 a(GraphQlEnvironment graphQlEnvironment) {
        qv3 a = this.b.a(graphQlEnvironment);
        String a2 = this.c.a(graphQlEnvironment);
        InputStream openRawResource = this.a.openRawResource(a.b());
        zq3.g(openRawResource, "openRawResource(...)");
        return new xv3.a(aw3.a.a(openRawResource, a.a(), a2, a.c()));
    }
}
