package com.nytimes.android.subauth.credentialmanager;

import android.content.Context;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.credentialmanager.network.SSONetworkManager;
import com.nytimes.android.subauth.credentialmanager.providers.GoogleSSOProviderImpl;
import defpackage.c04;
import defpackage.f77;
import defpackage.g98;
import defpackage.h98;
import defpackage.i77;
import defpackage.qs2;
import defpackage.sl3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class SubauthSSO implements h98 {
    private final g98 a;
    public SSONetworkManager b;
    private f77 c;

    public /* synthetic */ SubauthSSO(g98 g98Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(g98Var);
    }

    @Override // defpackage.h98
    public void a(Context context) {
        zq3.h(context, "context");
        this.c = new f77(context);
        Iterator it2 = c().entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).getValue();
        }
    }

    @Override // defpackage.h98
    public void b(SubauthEnvironment subauthEnvironment, Retrofit.Builder builder) {
        zq3.h(subauthEnvironment, "subauthEnvironment");
        zq3.h(builder, "basicRetrofitBuilder");
        f(new SSONetworkManager(subauthEnvironment, builder));
        Iterator it2 = c().entrySet().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            sl3 sl3Var = value instanceof sl3 ? (sl3) value : null;
            if (sl3Var != null) {
                sl3Var.b(e());
            }
        }
    }

    @Override // defpackage.h98
    public Map c() {
        return this.a.a();
    }

    public final SSONetworkManager e() {
        SSONetworkManager sSONetworkManager = this.b;
        if (sSONetworkManager != null) {
            return sSONetworkManager;
        }
        zq3.z("networkManager");
        return null;
    }

    public final void f(SSONetworkManager sSONetworkManager) {
        zq3.h(sSONetworkManager, "<set-?>");
        this.b = sSONetworkManager;
    }

    private SubauthSSO(g98 g98Var) {
        this.a = g98Var;
    }

    public static final class Builder {
        private g98 a;
        private List b;
        private final c04 c;

        public Builder(g98 g98Var, List list, c04 c04Var) {
            zq3.h(c04Var, "googleSSOProvider");
            this.a = g98Var;
            this.b = list;
            this.c = c04Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SubauthSSO a() {
            g98 g98Var = this.a;
            SubauthSSO subauthSSO = g98Var != null ? new SubauthSSO(g98Var, null) : new SubauthSSO(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            List<i77> list = this.b;
            if (list != null) {
                for (i77 i77Var : list) {
                    if (zq3.c(i77Var, i77.b.b)) {
                        subauthSSO.a.a().put(i77Var, this.c.getValue());
                    }
                }
            }
            return subauthSSO;
        }

        public final Builder b(List list) {
            zq3.h(list, "ssoTypes");
            this.b = list;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return zq3.c(this.a, builder.a) && zq3.c(this.b, builder.b) && zq3.c(this.c, builder.c);
        }

        public int hashCode() {
            g98 g98Var = this.a;
            int hashCode = (g98Var == null ? 0 : g98Var.hashCode()) * 31;
            List list = this.b;
            return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Builder(customSSOManager=" + this.a + ", ssoTypes=" + this.b + ", googleSSOProvider=" + this.c + ")";
        }

        public /* synthetic */ Builder(g98 g98Var, List list, c04 c04Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : g98Var, (i & 2) != 0 ? null : list, (i & 4) != 0 ? c.a(new qs2() { // from class: com.nytimes.android.subauth.credentialmanager.SubauthSSO.Builder.1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final GoogleSSOProviderImpl mo865invoke() {
                    return new GoogleSSOProviderImpl(null, null, null, null, null, 31, null);
                }
            }) : c04Var);
        }
    }

    /* synthetic */ SubauthSSO(g98 g98Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new g98(null, 1, null) : g98Var);
    }
}
