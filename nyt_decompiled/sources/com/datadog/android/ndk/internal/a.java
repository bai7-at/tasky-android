package com.datadog.android.ndk.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {
    public static final C0160a g = new C0160a(null);
    private final int a;
    private final long b;
    private final Long c;
    private final String d;
    private final String e;
    private final String f;

    /* renamed from: com.datadog.android.ndk.internal.a$a, reason: collision with other inner class name */
    public static final class C0160a {
        public /* synthetic */ C0160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            zq3.h(str, "jsonString");
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            int asInt = asJsonObject.get("signal").getAsInt();
            long asLong = asJsonObject.get("timestamp").getAsLong();
            JsonElement jsonElement = asJsonObject.get("time_since_app_start_ms");
            Long l = null;
            if (jsonElement != null && !(jsonElement instanceof JsonNull)) {
                l = Long.valueOf(jsonElement.getAsLong());
            }
            String asString = asJsonObject.get("signal_name").getAsString();
            zq3.g(asString, "jsonObject.get(SIGNAL_NAME_KEY_NAME).asString");
            String asString2 = asJsonObject.get("message").getAsString();
            zq3.g(asString2, "jsonObject.get(MESSAGE_KEY_NAME).asString");
            String asString3 = asJsonObject.get("stacktrace").getAsString();
            zq3.g(asString3, "jsonObject.get(STACKTRACE_KEY_NAME).asString");
            return new a(asInt, asLong, l, asString, asString2, asString3);
        }

        private C0160a() {
        }
    }

    public a(int i, long j, Long l, String str, String str2, String str3) {
        zq3.h(str, "signalName");
        zq3.h(str2, "message");
        zq3.h(str3, "stacktrace");
        this.a = i;
        this.b = j;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final Long c() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        Long l = this.c;
        return ((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "NdkCrashLog(signal=" + this.a + ", timestamp=" + this.b + ", timeSinceAppStartMs=" + this.c + ", signalName=" + this.d + ", message=" + this.e + ", stacktrace=" + this.f + ")";
    }
}
