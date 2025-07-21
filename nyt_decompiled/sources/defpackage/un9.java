package defpackage;

import java.util.Map;
import okhttp3.Call;

/* loaded from: classes.dex */
public final class un9 {
    private final Call a;
    private final Map b;
    private final String c;

    public un9(Call call, Map map, String str) {
        zq3.i(call, "call");
        zq3.i(map, "headers");
        zq3.i(str, "data");
        this.a = call;
        this.b = map;
        this.c = str;
    }

    public final Call a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un9)) {
            return false;
        }
        un9 un9Var = (un9) obj;
        return zq3.c(this.a, un9Var.a) && zq3.c(this.b, un9Var.b) && zq3.c(this.c, un9Var.c);
    }

    public int hashCode() {
        Call call = this.a;
        int hashCode = (call != null ? call.hashCode() : 0) * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SDKCallModel(call=" + this.a + ", headers=" + this.b + ", data=" + this.c + ")";
    }
}
