package defpackage;

import com.nytimes.android.internal.auth.graphql.GraphQlEnvironment;
import com.nytimes.android.internal.auth.key.data.KeystoreType;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class iv6 implements e22 {
    private final int a;
    private final String b;
    private final String c;
    private final String d;

    public iv6(int i, String str, String str2, String str3) {
        zq3.h(str, "alphaRndr");
        zq3.h(str2, "betaRndr");
        zq3.h(str3, "gammaRndr");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.e22
    public qv3 a() {
        return new qv3(this.a, pv3.Companion.a(), KeystoreType.BKS);
    }

    @Override // defpackage.e22
    public Map b() {
        return t.f(du8.a(GraphQlEnvironment.PRODUCTION, d()));
    }

    @Override // defpackage.e22
    public Map c() {
        return t.f(du8.a(GraphQlEnvironment.PRODUCTION, a()));
    }

    @Override // defpackage.e22
    public String d() {
        return this.b + this.c + this.d;
    }
}
