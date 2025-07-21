package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import org.threeten.bp.Instant;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.DateTimeFormatterBuilder;

/* loaded from: classes4.dex */
public final class tj implements h8 {
    private final DateTimeFormatter a = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Instant fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Instant parse = Instant.parse(jsonReader.nextString());
        zq3.g(parse, "parse(...)");
        return parse;
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, Instant instant) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(instant, "value");
        String format = this.a.format(instant);
        zq3.g(format, "format(...)");
        lu3Var.value(format);
    }
}
