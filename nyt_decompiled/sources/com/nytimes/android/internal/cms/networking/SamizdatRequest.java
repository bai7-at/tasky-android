package com.nytimes.android.internal.cms.networking;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.c04;
import defpackage.is7;
import defpackage.qs2;
import defpackage.r77;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SamizdatRequest {
    public static final a Companion = new a(null);
    private final String a;
    private final long b;
    private final r77 c;
    private final boolean d;
    private final c04 e;
    private final c04 f;
    private final String g;
    private final c04 h;
    private final String i;
    private final c04 j;
    private final c04 k;
    private final c04 l;
    private final c04 m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SamizdatRequest(String str, long j, r77 r77Var, boolean z) {
        zq3.h(str, "url");
        zq3.h(r77Var, "samizdatClientConfig");
        this.a = str;
        this.b = j;
        this.c = r77Var;
        this.d = z;
        this.e = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$timestamp$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Long mo865invoke() {
                return Long.valueOf((System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) + SamizdatRequest.this.n());
            }
        });
        this.f = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$headerTimestamp$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                z38 z38Var = z38.a;
                String format = String.format(Locale.US, "%s", Arrays.copyOf(new Object[]{Long.valueOf(SamizdatRequest.this.m())}, 1));
                zq3.g(format, "format(...)");
                return format;
            }
        });
        String format = new SimpleDateFormat(QueryKeys.MEMFLY_API_VERSION, Locale.getDefault()).format(new Date());
        zq3.g(format, "format(...)");
        this.g = format;
        this.h = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$headerDeviceId$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return SamizdatRequest.this.k().b();
            }
        });
        this.i = "embed";
        this.j = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$headerRsaSignature$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                SamizdatRequest.this.k().e();
                return null;
            }
        });
        this.k = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$headerCookie$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                if ((SamizdatRequest.this.k().e() instanceof is7) && SamizdatRequest.this.l()) {
                    return SamizdatRequest.this.k().e().a(SamizdatRequest.this.o(), SamizdatRequest.this.m());
                }
                return null;
            }
        });
        this.l = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$queryDeviceId$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return SamizdatRequest.this.k().b();
            }
        });
        this.m = c.a(new qs2() { // from class: com.nytimes.android.internal.cms.networking.SamizdatRequest$queryTemplate$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                if (SamizdatRequest.this.k().d()) {
                    return "hybrid";
                }
                return null;
            }
        });
    }

    public static /* synthetic */ SamizdatRequest b(SamizdatRequest samizdatRequest, String str, long j, r77 r77Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = samizdatRequest.a;
        }
        if ((i & 2) != 0) {
            j = samizdatRequest.b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            r77Var = samizdatRequest.c;
        }
        r77 r77Var2 = r77Var;
        if ((i & 8) != 0) {
            z = samizdatRequest.d;
        }
        return samizdatRequest.a(str, j2, r77Var2, z);
    }

    public final SamizdatRequest a(String str, long j, r77 r77Var, boolean z) {
        zq3.h(str, "url");
        zq3.h(r77Var, "samizdatClientConfig");
        return new SamizdatRequest(str, j, r77Var, z);
    }

    public final String c() {
        return (String) this.k.getValue();
    }

    public final String d() {
        return (String) this.h.getValue();
    }

    public final String e() {
        return (String) this.j.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamizdatRequest)) {
            return false;
        }
        SamizdatRequest samizdatRequest = (SamizdatRequest) obj;
        return zq3.c(this.a, samizdatRequest.a) && this.b == samizdatRequest.b && zq3.c(this.c, samizdatRequest.c) && this.d == samizdatRequest.d;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return (String) this.f.getValue();
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public final String i() {
        return (String) this.l.getValue();
    }

    public final String j() {
        return (String) this.m.getValue();
    }

    public final r77 k() {
        return this.c;
    }

    public final boolean l() {
        return this.d;
    }

    public final long m() {
        return ((Number) this.e.getValue()).longValue();
    }

    public final long n() {
        return this.b;
    }

    public final String o() {
        return this.a;
    }

    public String toString() {
        return "SamizdatRequest(url=" + this.a + ", timestampSkew=" + this.b + ", samizdatClientConfig=" + this.c + ", sign=" + this.d + ")";
    }
}
