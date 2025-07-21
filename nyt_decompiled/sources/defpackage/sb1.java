package defpackage;

import com.amazonaws.util.DateUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class sb1 implements JsonDeserializer {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Date a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d(str), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Date parse = simpleDateFormat.parse(str, new ParsePosition(0));
        zq3.g(parse, "parse(...)");
        return parse;
    }

    private final Date b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date parse = simpleDateFormat.parse(str, new ParsePosition(0));
        zq3.g(parse, "parse(...)");
        return parse;
    }

    private final String d(String str) {
        return h.b0(str, " ", 0, false, 6, null) == 3 ? "MMM d, yyyy HH:mm:ss" : "yyyy-MM-dd HH:mm:ss";
    }

    private final boolean e(String str) {
        return h.b0(str, " ", 0, false, 6, null) < 0;
    }

    private final boolean f(String str) {
        return h.P(str, QueryKeys.MEMFLY_API_VERSION, false, 2, null);
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Date deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        zq3.h(jsonElement, "json");
        String asString = jsonElement.getAsString();
        zq3.e(asString);
        return f(asString) ? b(asString) : e(asString) ? new Date(jsonElement.getAsLong()) : a(asString);
    }
}
