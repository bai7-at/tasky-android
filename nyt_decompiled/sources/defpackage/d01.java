package defpackage;

import com.datadog.android.api.context.NetworkInfo;
import defpackage.cy7;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d01 implements kx0 {
    public static final a b = new a(null);
    private final boolean a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d01(boolean z) {
        this.a = z;
    }

    private final cy7.e c(ua1 ua1Var, y51 y51Var) {
        if (this.a) {
            NetworkInfo f = ua1Var.f();
            cy7.i f2 = f(f);
            Long e = f.e();
            String l = e != null ? e.toString() : null;
            Long d = f.d();
            String l2 = d != null ? d.toString() : null;
            Long f3 = f.f();
            new cy7.g(new cy7.b(f2, l, l2, f3 != null ? f3.toString() : null, f.c().toString()));
        }
        j09 l3 = ua1Var.l();
        new cy7.l(l3.d(), l3.e(), l3.c(), t.x(l3.b()));
        ua1Var.j();
        throw null;
    }

    private final cy7.f d(y51 y51Var) {
        e(y51Var);
        throw null;
    }

    private final Map e(y51 y51Var) {
        throw null;
    }

    private final cy7.i f(NetworkInfo networkInfo) {
        if (networkInfo.a() == null && networkInfo.b() == null) {
            return null;
        }
        Long a2 = networkInfo.a();
        return new cy7.i(a2 != null ? a2.toString() : null, networkInfo.b());
    }

    @Override // defpackage.kx0
    public /* bridge */ /* synthetic */ Object a(ua1 ua1Var, Object obj) {
        lh4.a(obj);
        return b(ua1Var, null);
    }

    public cy7 b(ua1 ua1Var, y51 y51Var) {
        zq3.h(ua1Var, "datadogContext");
        zq3.h(y51Var, "model");
        ua1Var.k().b();
        d(y51Var);
        c(ua1Var, y51Var);
        throw null;
    }
}
