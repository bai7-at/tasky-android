package defpackage;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class k6 {
    public static final a Companion = new a(null);
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final String f;
    private final String g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k6 a(Map map) {
            zq3.h(map, "<this>");
            Object obj = map.get("hasClientside");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = map.get("hasCriticalTargeting");
            Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Object obj3 = map.get("bt_null");
            Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            Object obj4 = map.get("bt_empty");
            Boolean bool4 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            return new k6(booleanValue, booleanValue2, booleanValue3, bool4 != null ? bool4.booleanValue() : false, String.valueOf(map.get("position")), String.valueOf(map.get("pageType")), String.valueOf(map.get("id")));
        }

        private a() {
        }
    }

    public k6(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3) {
        zq3.h(str3, "id");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return this.a == k6Var.a && this.b == k6Var.b && this.c == k6Var.c && this.d == k6Var.d && zq3.c(this.e, k6Var.e) && zq3.c(this.f, k6Var.f) && zq3.c(this.g, k6Var.g);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "AdEventData(hasAlsClientSide=" + this.a + ", hasCriticalTargeting=" + this.b + ", btNull=" + this.c + ", btEmpty=" + this.d + ", position=" + this.e + ", pageType=" + this.f + ", id=" + this.g + ")";
    }
}
