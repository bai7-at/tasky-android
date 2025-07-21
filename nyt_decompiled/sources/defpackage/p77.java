package defpackage;

import android.app.Application;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.internal.graphql.apollo.ApolloClientFactory;
import com.nytimes.android.internal.graphql.exceptions.SamizdatApolloSetupException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;

/* loaded from: classes4.dex */
public final class p77 {
    private Application a;
    private String b;
    private qs2 c;
    private x13 d;
    private ss2 e;
    private Set f;
    private Map g;
    private List h;
    private boolean i;
    private boolean j;

    public p77(Application application, String str, qs2 qs2Var, x13 x13Var, ss2 ss2Var, Set set, Map map, List list, boolean z, boolean z2) {
        zq3.h(set, "optInToConditionalGetOperations");
        zq3.h(map, "customTypeAdapters");
        zq3.h(list, "interceptors");
        this.a = application;
        this.b = str;
        this.c = qs2Var;
        this.d = x13Var;
        this.e = ss2Var;
        this.f = set;
        this.g = map;
        this.h = list;
        this.i = z;
        this.j = z2;
    }

    public final p77 a(Interceptor interceptor) {
        zq3.h(interceptor, "interceptor");
        this.h = i.G0(this.h, interceptor);
        return this;
    }

    public final p77 b(ss2 ss2Var) {
        zq3.h(ss2Var, "analyticsTrackingId");
        this.e = ss2Var;
        return this;
    }

    public final p77 c(Application application) {
        zq3.h(application, "application");
        this.a = application;
        return this;
    }

    public final ApolloClient d() {
        String str = this.b;
        zq3.e(str);
        ss2 ss2Var = this.e;
        zq3.e(ss2Var);
        w13 w13Var = new w13(str, ss2Var);
        if (!this.f.isEmpty() && this.d == null) {
            throw new SamizdatApolloSetupException("You have specified that you want to use Conditional GETs for " + this.f + ". Please make sure you also provide a GraphQLHeadersHolder to the Builder.");
        }
        qs2 qs2Var = this.c;
        zq3.e(qs2Var);
        ApolloClientFactory apolloClientFactory = new ApolloClientFactory(w13Var, qs2Var, this.d, this.j);
        Set set = this.f;
        Map map = this.g;
        boolean z = this.i;
        List list = this.h;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add((Interceptor) it2.next());
        }
        Interceptor[] interceptorArr = (Interceptor[]) arrayList.toArray(new Interceptor[0]);
        return apolloClientFactory.h(set, map, z, (Interceptor[]) Arrays.copyOf(interceptorArr, interceptorArr.length));
    }

    public final p77 e(Map map) {
        zq3.h(map, "customTypeAdapters");
        this.g = map;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p77)) {
            return false;
        }
        p77 p77Var = (p77) obj;
        return zq3.c(this.a, p77Var.a) && zq3.c(this.b, p77Var.b) && zq3.c(this.c, p77Var.c) && zq3.c(this.d, p77Var.d) && zq3.c(this.e, p77Var.e) && zq3.c(this.f, p77Var.f) && zq3.c(this.g, p77Var.g) && zq3.c(this.h, p77Var.h) && this.i == p77Var.i && this.j == p77Var.j;
    }

    public final p77 f(x13 x13Var) {
        zq3.h(x13Var, "headersHolder");
        this.d = x13Var;
        return this;
    }

    public final p77 g() {
        this.j = true;
        return this;
    }

    public final p77 h(qs2 qs2Var) {
        zq3.h(qs2Var, "okHttpClientProvider");
        this.c = qs2Var;
        return this;
    }

    public int hashCode() {
        Application application = this.a;
        int hashCode = (application == null ? 0 : application.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qs2 qs2Var = this.c;
        int hashCode3 = (hashCode2 + (qs2Var == null ? 0 : qs2Var.hashCode())) * 31;
        x13 x13Var = this.d;
        int hashCode4 = (hashCode3 + (x13Var == null ? 0 : x13Var.hashCode())) * 31;
        ss2 ss2Var = this.e;
        return ((((((((((hashCode4 + (ss2Var != null ? ss2Var.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.j);
    }

    public final p77 i(Set set) {
        zq3.h(set, "optInToConditionalGetOperations");
        this.f = set;
        return this;
    }

    public final p77 j(String str) {
        zq3.h(str, "serverUrl");
        this.b = str;
        return this;
    }

    public final p77 k() {
        this.i = true;
        return this;
    }

    public String toString() {
        return "Builder(application=" + this.a + ", serverUrl=" + this.b + ", okHttpClientProvider=" + this.c + ", headersHolder=" + this.d + ", analyticsTrackingIdLambda=" + this.e + ", optInToConditionalGetOperations=" + this.f + ", customTypeAdapters=" + this.g + ", interceptors=" + this.h + ", useHttpGetMethodForPersistedQueries=" + this.i + ", isDebug=" + this.j + ")";
    }

    public /* synthetic */ p77(Application application, String str, qs2 qs2Var, x13 x13Var, ss2 ss2Var, Set set, Map map, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : application, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : qs2Var, (i & 8) != 0 ? null : x13Var, (i & 16) != 0 ? null : ss2Var, (i & 32) != 0 ? b0.e() : set, (i & 64) != 0 ? t.i() : map, (i & 128) != 0 ? i.l() : list, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z, (i & 512) != 0 ? false : z2);
    }
}
