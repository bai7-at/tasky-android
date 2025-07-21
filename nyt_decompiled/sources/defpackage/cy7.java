package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.reactivex.annotations.SchedulerSupport;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class cy7 {
    public static final c m = new c(null);
    private final String a;
    private final String b;
    private final String c;
    private String d;
    private String e;
    private final String f;
    private final long g;
    private final long h;
    private final long i;
    private final f j;
    private final e k;
    private final String l;

    public static final class a {
        public static final C0475a b = new C0475a(null);
        private final String a;

        /* renamed from: cy7$a$a, reason: collision with other inner class name */
        public static final class C0475a {
            public /* synthetic */ C0475a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0475a() {
            }
        }

        public a(String str) {
            this.a = str;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Application(id=" + this.a + ")";
        }
    }

    public static final class b {
        public static final a f = new a(null);
        private final i a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(i iVar, String str, String str2, String str3, String str4) {
            this.a = iVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            i iVar = this.a;
            if (iVar != null) {
                jsonObject.add("sim_carrier", iVar.a());
            }
            String str = this.b;
            if (str != null) {
                jsonObject.addProperty("signal_strength", str);
            }
            String str2 = this.c;
            if (str2 != null) {
                jsonObject.addProperty("downlink_kbps", str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                jsonObject.addProperty("uplink_kbps", str3);
            }
            String str4 = this.e;
            if (str4 != null) {
                jsonObject.addProperty("connectivity", str4);
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e);
        }

        public int hashCode() {
            i iVar = this.a;
            int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Client(simCarrier=" + this.a + ", signalStrength=" + this.b + ", downlinkKbps=" + this.c + ", uplinkKbps=" + this.d + ", connectivity=" + this.e + ")";
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d {
        public static final a e = new a(null);
        private final String a;
        private final a b;
        private final h c;
        private final m d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d(String str, a aVar, h hVar, m mVar) {
            this.a = str;
            this.b = aVar;
            this.c = hVar;
            this.d = mVar;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("source", str);
            }
            a aVar = this.b;
            if (aVar != null) {
                jsonObject.add("application", aVar.a());
            }
            h hVar = this.c;
            if (hVar != null) {
                jsonObject.add("session", hVar.a());
            }
            m mVar = this.d;
            if (mVar != null) {
                jsonObject.add("view", mVar.a());
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            a aVar = this.b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            m mVar = this.d;
            return hashCode3 + (mVar != null ? mVar.hashCode() : 0);
        }

        public String toString() {
            return "Dd(source=" + this.a + ", application=" + this.b + ", session=" + this.c + ", view=" + this.d + ")";
        }
    }

    public static final class e {
        public static final a h = new a(null);
        private static final String[] i = {"version", "_dd", "span", "tracer", "usr", "network"};
        private final String a;
        private final d b;
        private final j c;
        private final k d;
        private final l e;
        private final g f;
        private final Map g;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public e(String str, d dVar, j jVar, k kVar, l lVar, g gVar, Map map) {
            zq3.h(str, "version");
            zq3.h(dVar, "dd");
            zq3.h(jVar, "span");
            zq3.h(kVar, "tracer");
            zq3.h(lVar, "usr");
            zq3.h(map, "additionalProperties");
            this.a = str;
            this.b = dVar;
            this.c = jVar;
            this.d = kVar;
            this.e = lVar;
            this.f = gVar;
            this.g = map;
        }

        public static /* synthetic */ e b(e eVar, String str, d dVar, j jVar, k kVar, l lVar, g gVar, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = eVar.a;
            }
            if ((i2 & 2) != 0) {
                dVar = eVar.b;
            }
            d dVar2 = dVar;
            if ((i2 & 4) != 0) {
                jVar = eVar.c;
            }
            j jVar2 = jVar;
            if ((i2 & 8) != 0) {
                kVar = eVar.d;
            }
            k kVar2 = kVar;
            if ((i2 & 16) != 0) {
                lVar = eVar.e;
            }
            l lVar2 = lVar;
            if ((i2 & 32) != 0) {
                gVar = eVar.f;
            }
            g gVar2 = gVar;
            if ((i2 & 64) != 0) {
                map = eVar.g;
            }
            return eVar.a(str, dVar2, jVar2, kVar2, lVar2, gVar2, map);
        }

        public final e a(String str, d dVar, j jVar, k kVar, l lVar, g gVar, Map map) {
            zq3.h(str, "version");
            zq3.h(dVar, "dd");
            zq3.h(jVar, "span");
            zq3.h(kVar, "tracer");
            zq3.h(lVar, "usr");
            zq3.h(map, "additionalProperties");
            return new e(str, dVar, jVar, kVar, lVar, gVar, map);
        }

        public final l c() {
            return this.e;
        }

        public final JsonElement d() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("version", this.a);
            jsonObject.add("_dd", this.b.a());
            jsonObject.add("span", this.c.a());
            jsonObject.add("tracer", this.d.a());
            jsonObject.add("usr", this.e.d());
            g gVar = this.f;
            if (gVar != null) {
                jsonObject.add("network", gVar.a());
            }
            for (Map.Entry entry : this.g.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!kotlin.collections.d.W(i, str)) {
                    jsonObject.addProperty(str, str2);
                }
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d) && zq3.c(this.e, eVar.e) && zq3.c(this.f, eVar.f) && zq3.c(this.g, eVar.g);
        }

        public int hashCode() {
            int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            g gVar = this.f;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.g.hashCode();
        }

        public String toString() {
            return "Meta(version=" + this.a + ", dd=" + this.b + ", span=" + this.c + ", tracer=" + this.d + ", usr=" + this.e + ", network=" + this.f + ", additionalProperties=" + this.g + ")";
        }
    }

    public static final class f {
        public static final a c = new a(null);
        private static final String[] d = {"_top_level"};
        private final Long a;
        private final Map b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public f(Long l, Map map) {
            zq3.h(map, "additionalProperties");
            this.a = l;
            this.b = map;
        }

        public static /* synthetic */ f b(f fVar, Long l, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                l = fVar.a;
            }
            if ((i & 2) != 0) {
                map = fVar.b;
            }
            return fVar.a(l, map);
        }

        public final f a(Long l, Map map) {
            zq3.h(map, "additionalProperties");
            return new f(l, map);
        }

        public final Map c() {
            return this.b;
        }

        public final JsonElement d() {
            JsonObject jsonObject = new JsonObject();
            Long l = this.a;
            if (l != null) {
                jsonObject.addProperty("_top_level", Long.valueOf(l.longValue()));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                String str = (String) entry.getKey();
                Number number = (Number) entry.getValue();
                if (!kotlin.collections.d.W(d, str)) {
                    jsonObject.addProperty(str, number);
                }
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            Long l = this.a;
            return ((l == null ? 0 : l.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Metrics(topLevel=" + this.a + ", additionalProperties=" + this.b + ")";
        }
    }

    public static final class g {
        public static final a b = new a(null);
        private final b a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public g(b bVar) {
            this.a = bVar;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            b bVar = this.a;
            if (bVar != null) {
                jsonObject.add("client", bVar.a());
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Network(client=" + this.a + ")";
        }
    }

    public static final class h {
        public static final a b = new a(null);
        private final String a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public h(String str) {
            this.a = str;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Session(id=" + this.a + ")";
        }
    }

    public static final class i {
        public static final a c = new a(null);
        private final String a;
        private final String b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public i(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SimCarrier(id=" + this.a + ", name=" + this.b + ")";
        }
    }

    public static final class j {
        public static final a b = new a(null);
        private final String a = "client";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("kind", this.a);
            return jsonObject;
        }
    }

    public static final class k {
        public static final a b = new a(null);
        private final String a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public k(String str) {
            zq3.h(str, "version");
            this.a = str;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("version", this.a);
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && zq3.c(this.a, ((k) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Tracer(version=" + this.a + ")";
        }
    }

    public static final class l {
        public static final a e = new a(null);
        private static final String[] f = {"id", AuthenticationTokenClaims.JSON_KEY_NAME, "email"};
        private final String a;
        private final String b;
        private final String c;
        private final Map d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public l(String str, String str2, String str3, Map map) {
            zq3.h(map, "additionalProperties");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public static /* synthetic */ l b(l lVar, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.a;
            }
            if ((i & 2) != 0) {
                str2 = lVar.b;
            }
            if ((i & 4) != 0) {
                str3 = lVar.c;
            }
            if ((i & 8) != 0) {
                map = lVar.d;
            }
            return lVar.a(str, str2, str3, map);
        }

        public final l a(String str, String str2, String str3, Map map) {
            zq3.h(map, "additionalProperties");
            return new l(str, str2, str3, map);
        }

        public final Map c() {
            return this.d;
        }

        public final JsonElement d() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = this.c;
            if (str3 != null) {
                jsonObject.addProperty("email", str3);
            }
            for (Map.Entry entry : this.d.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!kotlin.collections.d.W(f, str4)) {
                    jsonObject.add(str4, JsonSerializer.a.b(value));
                }
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b) && zq3.c(this.c, lVar.c) && zq3.c(this.d, lVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Usr(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
        }
    }

    public static final class m {
        public static final a b = new a(null);
        private final String a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public m(String str) {
            this.a = str;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && zq3.c(this.a, ((m) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "View(id=" + this.a + ")";
        }
    }

    public cy7(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, long j4, f fVar, e eVar) {
        zq3.h(str, "traceId");
        zq3.h(str2, "spanId");
        zq3.h(str3, "parentId");
        zq3.h(str4, "resource");
        zq3.h(str5, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str6, "service");
        zq3.h(fVar, "metrics");
        zq3.h(eVar, "meta");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = fVar;
        this.k = eVar;
        this.l = SchedulerSupport.CUSTOM;
    }

    public final cy7 a(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, long j4, f fVar, e eVar) {
        zq3.h(str, "traceId");
        zq3.h(str2, "spanId");
        zq3.h(str3, "parentId");
        zq3.h(str4, "resource");
        zq3.h(str5, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str6, "service");
        zq3.h(fVar, "metrics");
        zq3.h(eVar, "meta");
        return new cy7(str, str2, str3, str4, str5, str6, j2, j3, j4, fVar, eVar);
    }

    public final e c() {
        return this.k;
    }

    public final f d() {
        return this.j;
    }

    public final JsonElement e() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("trace_id", this.a);
        jsonObject.addProperty("span_id", this.b);
        jsonObject.addProperty("parent_id", this.c);
        jsonObject.addProperty("resource", this.d);
        jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, this.e);
        jsonObject.addProperty("service", this.f);
        jsonObject.addProperty("duration", Long.valueOf(this.g));
        jsonObject.addProperty("start", Long.valueOf(this.h));
        jsonObject.addProperty("error", Long.valueOf(this.i));
        jsonObject.addProperty(TransferTable.COLUMN_TYPE, this.l);
        jsonObject.add("metrics", this.j.d());
        jsonObject.add("meta", this.k.d());
        return jsonObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy7)) {
            return false;
        }
        cy7 cy7Var = (cy7) obj;
        return zq3.c(this.a, cy7Var.a) && zq3.c(this.b, cy7Var.b) && zq3.c(this.c, cy7Var.c) && zq3.c(this.d, cy7Var.d) && zq3.c(this.e, cy7Var.e) && zq3.c(this.f, cy7Var.f) && this.g == cy7Var.g && this.h == cy7Var.h && this.i == cy7Var.i && zq3.c(this.j, cy7Var.j) && zq3.c(this.k, cy7Var.k);
    }

    public int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public String toString() {
        return "SpanEvent(traceId=" + this.a + ", spanId=" + this.b + ", parentId=" + this.c + ", resource=" + this.d + ", name=" + this.e + ", service=" + this.f + ", duration=" + this.g + ", start=" + this.h + ", error=" + this.i + ", metrics=" + this.j + ", meta=" + this.k + ")";
    }
}
