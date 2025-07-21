package com.nytimes.android.ads.network.model;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes2.dex */
public final class AlsTargetingData {
    public static final a Companion = new a(null);
    private final Map a;
    private final String b;
    private final Map c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AlsTargetingData(@bt3(name = "User") Map<String, String> map, @bt3(name = "als_test_clientside") String str, @bt3(name = "Asset") Map<String, String> map2) {
        this.a = map;
        this.b = str;
        this.c = map2;
    }

    public final String a() {
        return this.b;
    }

    public final Map b() {
        return this.c;
    }

    public final Map c() {
        Map i;
        Map i2;
        Map map = this.a;
        if (map != null) {
            i = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((CharSequence) entry.getValue()).length() > 0) {
                    i.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            i = t.i();
        }
        Map map2 = this.c;
        if (map2 != null) {
            i2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (((CharSequence) entry2.getValue()).length() > 0) {
                    i2.put(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            i2 = t.i();
        }
        Map x = t.x(t.p(i, i2));
        String str = this.b;
        if (str != null) {
            x.put("als_test_clientside", str);
        }
        return x;
    }

    public final AlsTargetingData copy(@bt3(name = "User") Map<String, String> map, @bt3(name = "als_test_clientside") String str, @bt3(name = "Asset") Map<String, String> map2) {
        return new AlsTargetingData(map, str, map2);
    }

    public final Map d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlsTargetingData)) {
            return false;
        }
        AlsTargetingData alsTargetingData = (AlsTargetingData) obj;
        return zq3.c(this.a, alsTargetingData.a) && zq3.c(this.b, alsTargetingData.b) && zq3.c(this.c, alsTargetingData.c);
    }

    public int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map2 = this.c;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "AlsTargetingData(userData=" + this.a + ", alsTestClientSide=" + this.b + ", assets=" + this.c + ")";
    }

    public /* synthetic */ AlsTargetingData(Map map, String str, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map2);
    }
}
