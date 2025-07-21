package defpackage;

import io.opentelemetry.sdk.metrics.InstrumentType;
import java.util.StringJoiner;

/* loaded from: classes5.dex */
public abstract class fm3 {
    fm3() {
    }

    public static gm3 a() {
        return new gm3();
    }

    static fm3 b(InstrumentType instrumentType, String str, String str2, String str3, String str4, String str5) {
        return new t10(instrumentType, str, str2, str3, str4, str5);
    }

    public abstract String c();

    public abstract InstrumentType d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "InstrumentSelector{", "}");
        if (d() != null) {
            stringJoiner.add("instrumentType=" + d());
        }
        if (c() != null) {
            stringJoiner.add("instrumentName=" + c());
        }
        if (e() != null) {
            stringJoiner.add("instrumentUnit=" + e());
        }
        if (f() != null) {
            stringJoiner.add("meterName=" + f());
        }
        if (h() != null) {
            stringJoiner.add("meterVersion=" + h());
        }
        if (g() != null) {
            stringJoiner.add("meterSchemaUrl=" + g());
        }
        return stringJoiner.toString();
    }
}
