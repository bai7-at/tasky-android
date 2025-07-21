package defpackage;

import java.util.StringJoiner;

/* loaded from: classes5.dex */
public abstract class d99 {
    d99() {
    }

    public static h99 a() {
        return new h99();
    }

    static d99 b(String str, String str2, bb bbVar, jv jvVar, int i) {
        return new k20(str, str2, bbVar, jvVar, i);
    }

    public abstract bb c();

    abstract jv d();

    abstract int e();

    public abstract String f();

    public abstract String g();

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        if (g() != null) {
            stringJoiner.add("name=" + g());
        }
        if (f() != null) {
            stringJoiner.add("description=" + f());
        }
        stringJoiner.add("aggregation=" + c());
        stringJoiner.add("attributesProcessor=" + d());
        stringJoiner.add("cardinalityLimit=" + e());
        return stringJoiner.toString();
    }
}
