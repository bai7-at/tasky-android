package com.datadog.android.core.configuration;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.datadog.android.DatadogSite;
import defpackage.cy8;
import defpackage.ir5;
import defpackage.j12;
import defpackage.j30;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.net.Proxy;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Authenticator;

/* loaded from: classes2.dex */
public final class Configuration {
    public static final b h = new b(null);
    private static final j30 i;
    private static final c j;
    private final c a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final Map g;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private Map e;
        private c f;
        private boolean g;
        private HostsSanitizer h;

        public a(String str, String str2, String str3, String str4) {
            zq3.h(str, "clientToken");
            zq3.h(str2, "env");
            zq3.h(str3, "variant");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = t.i();
            this.f = Configuration.h.a();
            this.g = true;
            this.h = new HostsSanitizer();
        }

        public final Configuration a() {
            return new Configuration(this.f, this.a, this.b, this.c, this.d, this.g, this.e);
        }

        public final a b(boolean z) {
            this.g = z;
            return this;
        }

        public final a c(boolean z) {
            this.f = c.b(this.f, false, z, null, null, null, null, null, null, null, null, null, null, null, 8189, null);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return Configuration.j;
        }

        private b() {
        }
    }

    public static final class c {
        private final boolean a;
        private final boolean b;
        private final Map c;
        private final BatchSize d;
        private final UploadFrequency e;
        private final Proxy f;
        private final Authenticator g;
        private final DatadogSite h;
        private final BatchProcessingLevel i;
        private final j30 j;
        private final cy8 k;

        public c(boolean z, boolean z2, Map map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, j12 j12Var, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ir5.b bVar, j30 j30Var, cy8 cy8Var) {
            zq3.h(map, "firstPartyHostsWithHeaderTypes");
            zq3.h(batchSize, "batchSize");
            zq3.h(uploadFrequency, "uploadFrequency");
            zq3.h(authenticator, "proxyAuth");
            zq3.h(datadogSite, "site");
            zq3.h(batchProcessingLevel, "batchProcessingLevel");
            zq3.h(j30Var, "backpressureStrategy");
            this.a = z;
            this.b = z2;
            this.c = map;
            this.d = batchSize;
            this.e = uploadFrequency;
            this.f = proxy;
            this.g = authenticator;
            this.h = datadogSite;
            this.i = batchProcessingLevel;
            this.j = j30Var;
            this.k = cy8Var;
        }

        public static /* synthetic */ c b(c cVar, boolean z, boolean z2, Map map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, j12 j12Var, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ir5.b bVar, j30 j30Var, cy8 cy8Var, int i, Object obj) {
            j12 j12Var2;
            boolean z3 = (i & 1) != 0 ? cVar.a : z;
            boolean z4 = (i & 2) != 0 ? cVar.b : z2;
            Map map2 = (i & 4) != 0 ? cVar.c : map;
            BatchSize batchSize2 = (i & 8) != 0 ? cVar.d : batchSize;
            UploadFrequency uploadFrequency2 = (i & 16) != 0 ? cVar.e : uploadFrequency;
            Proxy proxy2 = (i & 32) != 0 ? cVar.f : proxy;
            Authenticator authenticator2 = (i & 64) != 0 ? cVar.g : authenticator;
            ir5.b bVar2 = null;
            if ((i & 128) != 0) {
                cVar.getClass();
                j12Var2 = null;
            } else {
                j12Var2 = j12Var;
            }
            DatadogSite datadogSite2 = (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? cVar.h : datadogSite;
            BatchProcessingLevel batchProcessingLevel2 = (i & 512) != 0 ? cVar.i : batchProcessingLevel;
            if ((i & 1024) != 0) {
                cVar.getClass();
            } else {
                bVar2 = bVar;
            }
            return cVar.a(z3, z4, map2, batchSize2, uploadFrequency2, proxy2, authenticator2, j12Var2, datadogSite2, batchProcessingLevel2, bVar2, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? cVar.j : j30Var, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? cVar.k : cy8Var);
        }

        public final c a(boolean z, boolean z2, Map map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, j12 j12Var, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ir5.b bVar, j30 j30Var, cy8 cy8Var) {
            zq3.h(map, "firstPartyHostsWithHeaderTypes");
            zq3.h(batchSize, "batchSize");
            zq3.h(uploadFrequency, "uploadFrequency");
            zq3.h(authenticator, "proxyAuth");
            zq3.h(datadogSite, "site");
            zq3.h(batchProcessingLevel, "batchProcessingLevel");
            zq3.h(j30Var, "backpressureStrategy");
            return new c(z, z2, map, batchSize, uploadFrequency, proxy, authenticator, j12Var, datadogSite, batchProcessingLevel, bVar, j30Var, cy8Var);
        }

        public final j30 c() {
            return this.j;
        }

        public final BatchProcessingLevel d() {
            return this.i;
        }

        public final BatchSize e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && zq3.c(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && zq3.c(this.f, cVar.f) && zq3.c(this.g, cVar.g) && zq3.c(null, null) && this.h == cVar.h && this.i == cVar.i && zq3.c(null, null) && zq3.c(this.j, cVar.j) && zq3.c(this.k, cVar.k);
        }

        public final boolean f() {
            return this.b;
        }

        public final j12 g() {
            return null;
        }

        public final Map h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = ((((((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            Proxy proxy = this.f;
            int hashCode2 = (((((((((hashCode + (proxy == null ? 0 : proxy.hashCode())) * 31) + this.g.hashCode()) * 961) + this.h.hashCode()) * 31) + this.i.hashCode()) * 961) + this.j.hashCode()) * 31;
            cy8 cy8Var = this.k;
            return hashCode2 + (cy8Var != null ? cy8Var.hashCode() : 0);
        }

        public final boolean i() {
            return this.a;
        }

        public final ir5.b j() {
            return null;
        }

        public final Proxy k() {
            return this.f;
        }

        public final Authenticator l() {
            return this.g;
        }

        public final DatadogSite m() {
            return this.h;
        }

        public final UploadFrequency n() {
            return this.e;
        }

        public final cy8 o() {
            return this.k;
        }

        public String toString() {
            return "Core(needsClearTextHttp=" + this.a + ", enableDeveloperModeWhenDebuggable=" + this.b + ", firstPartyHostsWithHeaderTypes=" + this.c + ", batchSize=" + this.d + ", uploadFrequency=" + this.e + ", proxy=" + this.f + ", proxyAuth=" + this.g + ", encryption=" + ((Object) null) + ", site=" + this.h + ", batchProcessingLevel=" + this.i + ", persistenceStrategyFactory=" + ((Object) null) + ", backpressureStrategy=" + this.j + ", uploadSchedulerStrategy=" + this.k + ")";
        }
    }

    static {
        j30 j30Var = new j30(1024, new qs2() { // from class: com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m160invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m160invoke();
                return ww8.a;
            }
        }, new ss2() { // from class: com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m161invoke(Object obj) {
                zq3.h(obj, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m161invoke(obj);
                return ww8.a;
            }
        }, BackPressureMitigation.IGNORE_NEWEST);
        i = j30Var;
        j = new c(false, false, t.i(), BatchSize.MEDIUM, UploadFrequency.AVERAGE, null, Authenticator.NONE, null, DatadogSite.US1, BatchProcessingLevel.MEDIUM, null, j30Var, null);
    }

    public Configuration(c cVar, String str, String str2, String str3, String str4, boolean z, Map map) {
        zq3.h(cVar, "coreConfig");
        zq3.h(str, "clientToken");
        zq3.h(str2, "env");
        zq3.h(str3, "variant");
        zq3.h(map, "additionalConfig");
        this.a = cVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = map;
    }

    public static /* synthetic */ Configuration c(Configuration configuration, c cVar, String str, String str2, String str3, String str4, boolean z, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = configuration.a;
        }
        if ((i2 & 2) != 0) {
            str = configuration.b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = configuration.c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = configuration.d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = configuration.e;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            z = configuration.f;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            map = configuration.g;
        }
        return configuration.b(cVar, str5, str6, str7, str8, z2, map);
    }

    public final Configuration b(c cVar, String str, String str2, String str3, String str4, boolean z, Map map) {
        zq3.h(cVar, "coreConfig");
        zq3.h(str, "clientToken");
        zq3.h(str2, "env");
        zq3.h(str3, "variant");
        zq3.h(map, "additionalConfig");
        return new Configuration(cVar, str, str2, str3, str4, z, map);
    }

    public final Map d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return zq3.c(this.a, configuration.a) && zq3.c(this.b, configuration.b) && zq3.c(this.c, configuration.c) && zq3.c(this.d, configuration.d) && zq3.c(this.e, configuration.e) && this.f == configuration.f && zq3.c(this.g, configuration.g);
    }

    public final c f() {
        return this.a;
    }

    public final boolean g() {
        return this.f;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f)) * 31) + this.g.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "Configuration(coreConfig=" + this.a + ", clientToken=" + this.b + ", env=" + this.c + ", variant=" + this.d + ", service=" + this.e + ", crashReportsEnabled=" + this.f + ", additionalConfig=" + this.g + ")";
    }
}
