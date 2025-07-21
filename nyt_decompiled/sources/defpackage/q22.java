package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q22 {
    private final String a;
    private final List b;
    private final List c;
    private final Map d;
    private final Map e;

    public static final class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return "Location(line = " + this.a + ", column = " + this.b + ')';
        }
    }

    public q22(String str, List list, List list2, Map map, Map map2) {
        zq3.h(str, "message");
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = map;
        this.e = map2;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.e;
    }

    public String toString() {
        return "Error(message = " + this.a + ", locations = " + this.b + ", path=" + this.c + ", extensions = " + this.d + ", nonStandardFields = " + this.e + ')';
    }
}
