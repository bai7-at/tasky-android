package com.datadog.android.log.model;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LogEvent {
    public static final b m = new b(null);
    private static final String[] n = {"status", "service", "message", "date", "logger", "_dd", "usr", "network", "error", "build_id", "ddtags"};
    private Status a;
    private final String b;
    private String c;
    private final String d;
    private final f e;
    private final c f;
    private final j g;
    private final g h;
    private final e i;
    private final String j;
    private String k;
    private final Map l;

    public enum Status {
        CRITICAL("critical"),
        ERROR("error"),
        WARN("warn"),
        INFO("info"),
        DEBUG("debug"),
        TRACE("trace"),
        EMERGENCY("emergency");

        public static final a Companion = new a(null);
        private final String jsonValue;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status a(String str) {
                zq3.h(str, "jsonString");
                for (Status status : Status.values()) {
                    if (zq3.c(status.jsonValue, str)) {
                        return status;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }

            private a() {
            }
        }

        Status(String str) {
            this.jsonValue = str;
        }

        public static final Status fromJson(String str) {
            return Companion.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    public static final class a {
        public static final C0159a f = new C0159a(null);
        private final h a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        /* renamed from: com.datadog.android.log.model.LogEvent$a$a, reason: collision with other inner class name */
        public static final class C0159a {
            public /* synthetic */ C0159a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0159a() {
            }
        }

        public a(h hVar, String str, String str2, String str3, String str4) {
            zq3.h(str4, "connectivity");
            this.a = hVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            h hVar = this.a;
            if (hVar != null) {
                jsonObject.add("sim_carrier", hVar.a());
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
            jsonObject.addProperty("connectivity", this.e);
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e);
        }

        public int hashCode() {
            h hVar = this.a;
            int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "Client(simCarrier=" + this.a + ", signalStrength=" + this.b + ", downlinkKbps=" + this.c + ", uplinkKbps=" + this.d + ", connectivity=" + this.e + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {
        public static final a b = new a(null);
        private final d a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(d dVar) {
            zq3.h(dVar, "device");
            this.a = dVar;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("device", this.a.a());
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Dd(device=" + this.a + ")";
        }
    }

    public static final class d {
        public static final a b = new a(null);
        private final String a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d(String str) {
            zq3.h(str, "architecture");
            this.a = str;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("architecture", this.a);
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Device(architecture=" + this.a + ")";
        }
    }

    public static final class f {
        public static final a d = new a(null);
        private String a;
        private final String b;
        private final String c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public f(String str, String str2, String str3) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "version");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, this.a);
            String str = this.b;
            if (str != null) {
                jsonObject.addProperty("thread_name", str);
            }
            jsonObject.addProperty("version", this.c);
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
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Logger(name=" + this.a + ", threadName=" + this.b + ", version=" + this.c + ")";
        }
    }

    public static final class g {
        public static final a b = new a(null);
        private final a a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public g(a aVar) {
            zq3.h(aVar, "client");
            this.a = aVar;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("client", this.a.a());
            return jsonObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Network(client=" + this.a + ")";
        }
    }

    public static final class h {
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

        public h(String str, String str2) {
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
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
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

    public static final class i {
        public static final a e = new a(null);
        private final String a;
        private final boolean b;
        private final String c;
        private final String d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public i(String str, boolean z, String str2, String str3) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "stack");
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, this.a);
            jsonObject.addProperty("crashed", Boolean.valueOf(this.b));
            jsonObject.addProperty("stack", this.c);
            String str = this.d;
            if (str != null) {
                jsonObject.addProperty(TransferTable.COLUMN_STATE, str);
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
            return zq3.c(this.a, iVar.a) && this.b == iVar.b && zq3.c(this.c, iVar.c) && zq3.c(this.d, iVar.d);
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Thread(name=" + this.a + ", crashed=" + this.b + ", stack=" + this.c + ", state=" + this.d + ")";
        }
    }

    public static final class j {
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

        public j(String str, String str2, String str3, Map map) {
            zq3.h(map, "additionalProperties");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public static /* synthetic */ j b(j jVar, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jVar.a;
            }
            if ((i & 2) != 0) {
                str2 = jVar.b;
            }
            if ((i & 4) != 0) {
                str3 = jVar.c;
            }
            if ((i & 8) != 0) {
                map = jVar.d;
            }
            return jVar.a(str, str2, str3, map);
        }

        public final j a(String str, String str2, String str3, Map map) {
            zq3.h(map, "additionalProperties");
            return new j(str, str2, str3, map);
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
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && zq3.c(this.c, jVar.c) && zq3.c(this.d, jVar.d);
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

    public LogEvent(Status status, String str, String str2, String str3, f fVar, c cVar, j jVar, g gVar, e eVar, String str4, String str5, Map map) {
        zq3.h(status, "status");
        zq3.h(str, "service");
        zq3.h(str2, "message");
        zq3.h(str3, "date");
        zq3.h(fVar, "logger");
        zq3.h(cVar, "dd");
        zq3.h(str5, "ddtags");
        zq3.h(map, "additionalProperties");
        this.a = status;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = fVar;
        this.f = cVar;
        this.g = jVar;
        this.h = gVar;
        this.i = eVar;
        this.j = str4;
        this.k = str5;
        this.l = map;
    }

    public final LogEvent a(Status status, String str, String str2, String str3, f fVar, c cVar, j jVar, g gVar, e eVar, String str4, String str5, Map map) {
        zq3.h(status, "status");
        zq3.h(str, "service");
        zq3.h(str2, "message");
        zq3.h(str3, "date");
        zq3.h(fVar, "logger");
        zq3.h(cVar, "dd");
        zq3.h(str5, "ddtags");
        zq3.h(map, "additionalProperties");
        return new LogEvent(status, str, str2, str3, fVar, cVar, jVar, gVar, eVar, str4, str5, map);
    }

    public final Map c() {
        return this.l;
    }

    public final String d() {
        return this.k;
    }

    public final j e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        return this.a == logEvent.a && zq3.c(this.b, logEvent.b) && zq3.c(this.c, logEvent.c) && zq3.c(this.d, logEvent.d) && zq3.c(this.e, logEvent.e) && zq3.c(this.f, logEvent.f) && zq3.c(this.g, logEvent.g) && zq3.c(this.h, logEvent.h) && zq3.c(this.i, logEvent.i) && zq3.c(this.j, logEvent.j) && zq3.c(this.k, logEvent.k) && zq3.c(this.l, logEvent.l);
    }

    public final JsonElement f() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("status", this.a.toJson());
        jsonObject.addProperty("service", this.b);
        jsonObject.addProperty("message", this.c);
        jsonObject.addProperty("date", this.d);
        jsonObject.add("logger", this.e.a());
        jsonObject.add("_dd", this.f.a());
        j jVar = this.g;
        if (jVar != null) {
            jsonObject.add("usr", jVar.d());
        }
        g gVar = this.h;
        if (gVar != null) {
            jsonObject.add("network", gVar.a());
        }
        e eVar = this.i;
        if (eVar != null) {
            jsonObject.add("error", eVar.a());
        }
        String str = this.j;
        if (str != null) {
            jsonObject.addProperty("build_id", str);
        }
        jsonObject.addProperty("ddtags", this.k);
        for (Map.Entry entry : this.l.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!kotlin.collections.d.W(n, str2)) {
                jsonObject.add(str2, JsonSerializer.a.b(value));
            }
        }
        return jsonObject;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        j jVar = this.g;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        g gVar = this.h;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e eVar = this.i;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.j;
        return ((((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public String toString() {
        return "LogEvent(status=" + this.a + ", service=" + this.b + ", message=" + this.c + ", date=" + this.d + ", logger=" + this.e + ", dd=" + this.f + ", usr=" + this.g + ", network=" + this.h + ", error=" + this.i + ", buildId=" + this.j + ", ddtags=" + this.k + ", additionalProperties=" + this.l + ")";
    }

    public static final class e {
        public static final a g = new a(null);
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private final List f;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public e(String str, String str2, String str3, String str4, String str5, List list) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = list;
        }

        public final JsonElement a() {
            JsonObject jsonObject = new JsonObject();
            String str = this.a;
            if (str != null) {
                jsonObject.addProperty("kind", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jsonObject.addProperty("message", str2);
            }
            String str3 = this.c;
            if (str3 != null) {
                jsonObject.addProperty("stack", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jsonObject.addProperty("source_type", str4);
            }
            String str5 = this.e;
            if (str5 != null) {
                jsonObject.addProperty("fingerprint", str5);
            }
            List list = this.f;
            if (list != null) {
                JsonArray jsonArray = new JsonArray(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    jsonArray.add(((i) it2.next()).a());
                }
                jsonObject.add("threads", jsonArray);
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
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d) && zq3.c(this.e, eVar.e) && zq3.c(this.f, eVar.f);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List list = this.f;
            return hashCode5 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Error(kind=" + this.a + ", message=" + this.b + ", stack=" + this.c + ", sourceType=" + this.d + ", fingerprint=" + this.e + ", threads=" + this.f + ")";
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list);
        }
    }
}
