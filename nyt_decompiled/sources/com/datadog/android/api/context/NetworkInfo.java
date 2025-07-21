package com.datadog.android.api.context;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import defpackage.zq3;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NetworkInfo {
    public static final a h = new a(null);
    private final Connectivity a;
    private final String b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final String g;

    public enum Connectivity {
        NETWORK_NOT_CONNECTED("network_not_connected"),
        NETWORK_ETHERNET("network_ethernet"),
        NETWORK_WIFI("network_wifi"),
        NETWORK_WIMAX("network_wimax"),
        NETWORK_BLUETOOTH("network_bluetooth"),
        NETWORK_2G("network_2G"),
        NETWORK_3G("network_3G"),
        NETWORK_4G("network_4G"),
        NETWORK_5G("network_5G"),
        NETWORK_MOBILE_OTHER("network_mobile_other"),
        NETWORK_CELLULAR("network_cellular"),
        NETWORK_OTHER("network_other");

        public static final a Companion = new a(null);
        private final String jsonValue;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Connectivity a(String str) {
                zq3.h(str, "jsonString");
                try {
                    for (Connectivity connectivity : Connectivity.values()) {
                        if (zq3.c(connectivity.jsonValue, str)) {
                            return connectivity;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (NoSuchElementException e) {
                    throw new JsonParseException("Unable to parse json into type NetworkInfo.Connectivity", e);
                }
            }

            private a() {
            }
        }

        Connectivity(String str) {
            this.jsonValue = str;
        }

        public static final Connectivity fromJson(String str) throws JsonParseException {
            return Companion.a(str);
        }

        public final JsonElement toJson$dd_sdk_android_core_release() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkInfo a(String str) {
            zq3.h(str, "jsonString");
            try {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                zq3.g(asJsonObject, "jsonObject");
                return b(asJsonObject);
            } catch (IllegalStateException e) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e);
            }
        }

        public final NetworkInfo b(JsonObject jsonObject) {
            zq3.h(jsonObject, "jsonObject");
            try {
                Connectivity.a aVar = Connectivity.Companion;
                String asString = jsonObject.get("connectivity").getAsString();
                zq3.g(asString, "jsonObject.get(\"connectivity\").asString");
                Connectivity a = aVar.a(asString);
                JsonElement jsonElement = jsonObject.get("carrier_name");
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("carrier_id");
                Long valueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                JsonElement jsonElement3 = jsonObject.get("up_kbps");
                Long valueOf2 = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
                JsonElement jsonElement4 = jsonObject.get("down_kbps");
                Long valueOf3 = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
                JsonElement jsonElement5 = jsonObject.get("strength");
                Long valueOf4 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
                JsonElement jsonElement6 = jsonObject.get("cellular_technology");
                return new NetworkInfo(a, asString2, valueOf, valueOf2, valueOf3, valueOf4, jsonElement6 != null ? jsonElement6.getAsString() : null);
            } catch (IllegalStateException e) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e);
            } catch (NullPointerException e2) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e2);
            } catch (NumberFormatException e3) {
                throw new JsonParseException("Unable to parse json into type NetworkInfo", e3);
            }
        }

        private a() {
        }
    }

    public NetworkInfo(Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        zq3.h(connectivity, "connectivity");
        this.a = connectivity;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str2;
    }

    public final Long a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final Connectivity c() {
        return this.a;
    }

    public final Long d() {
        return this.e;
    }

    public final Long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        return this.a == networkInfo.a && zq3.c(this.b, networkInfo.b) && zq3.c(this.c, networkInfo.c) && zq3.c(this.d, networkInfo.d) && zq3.c(this.e, networkInfo.e) && zq3.c(this.f, networkInfo.f) && zq3.c(this.g, networkInfo.g);
    }

    public final Long f() {
        return this.d;
    }

    public final JsonElement g() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("connectivity", this.a.toJson$dd_sdk_android_core_release());
        String str = this.b;
        if (str != null) {
            jsonObject.addProperty("carrier_name", str);
        }
        Long l = this.c;
        if (l != null) {
            jsonObject.addProperty("carrier_id", Long.valueOf(l.longValue()));
        }
        Long l2 = this.d;
        if (l2 != null) {
            jsonObject.addProperty("up_kbps", Long.valueOf(l2.longValue()));
        }
        Long l3 = this.e;
        if (l3 != null) {
            jsonObject.addProperty("down_kbps", Long.valueOf(l3.longValue()));
        }
        Long l4 = this.f;
        if (l4 != null) {
            jsonObject.addProperty("strength", Long.valueOf(l4.longValue()));
        }
        String str2 = this.g;
        if (str2 != null) {
            jsonObject.addProperty("cellular_technology", str2);
        }
        return jsonObject;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NetworkInfo(connectivity=" + this.a + ", carrierName=" + this.b + ", carrierId=" + this.c + ", upKbps=" + this.d + ", downKbps=" + this.e + ", strength=" + this.f + ", cellularTechnology=" + this.g + ")";
    }

    public /* synthetic */ NetworkInfo(Connectivity connectivity, String str, Long l, Long l2, Long l3, Long l4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Connectivity.NETWORK_NOT_CONNECTED : connectivity, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) == 0 ? str2 : null);
    }
}
