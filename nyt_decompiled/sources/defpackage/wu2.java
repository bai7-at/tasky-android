package defpackage;

import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class wu2 {
    private final Map a;
    private final Map b;

    public wu2(Map map, Map map2) {
        zq3.h(map2, "abraConfig");
        this.a = map;
        this.b = map2;
    }

    public final Map a() {
        return this.b;
    }

    public final Map b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu2)) {
            return false;
        }
        wu2 wu2Var = (wu2) obj;
        return zq3.c(this.a, wu2Var.a) && zq3.c(this.b, wu2Var.b);
    }

    public int hashCode() {
        Map map = this.a;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "GamesHybridConfig(adRequirements=" + this.a + ", abraConfig=" + this.b + ")";
    }

    public /* synthetic */ wu2(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? t.i() : map2);
    }
}
