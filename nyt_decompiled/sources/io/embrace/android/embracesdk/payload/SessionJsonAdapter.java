package io.embrace.android.embracesdk.payload;

import com.appsflyer.oaid.BuildConfig;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.EventType;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SessionJsonAdapter extends JsonAdapter<Session> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Session> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<BetaFeatures> nullableBetaFeaturesAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<LegacyExceptionError> nullableLegacyExceptionErrorAdapter;
    private final JsonAdapter<Session.LifeEventType> nullableLifeEventTypeAdapter;
    private final JsonAdapter<List<Orientation>> nullableListOfOrientationAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<List<WebViewInfo>> nullableListOfWebViewInfoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public SessionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "st", "sn", "ty", "as", "cs", "et", "ht", "tt", "ce", "tr", "ss", "il", "wl", "el", "nc", "lic", "lwc", "lec", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "ri", Tag.EM, "sm", "oc", "sp", QueryKeys.SITE_VISIT_DEPTH, "sdt", "si", "ue", "bf", "sb", "wvi_beta");
        zq3.g(a, "JsonReader.Options.of(\"i…, \"bf\", \"sb\", \"wvi_beta\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sessionId");
        zq3.g(f, "moshi.adapter(String::cl…Set(),\n      \"sessionId\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.TYPE, b0.e(), "number");
        zq3.g(f3, "moshi.adapter(Int::class…va, emptySet(), \"number\")");
        this.intAdapter = f3;
        JsonAdapter<Boolean> f4 = iVar.f(Boolean.TYPE, b0.e(), "isColdStart");
        zq3.g(f4, "moshi.adapter(Boolean::c…t(),\n      \"isColdStart\")");
        this.booleanAdapter = f4;
        JsonAdapter<Long> f5 = iVar.f(Long.class, b0.e(), "endTime");
        zq3.g(f5, "moshi.adapter(Long::clas…   emptySet(), \"endTime\")");
        this.nullableLongAdapter = f5;
        JsonAdapter<Boolean> f6 = iVar.f(Boolean.class, b0.e(), "isEndedCleanly");
        zq3.g(f6, "moshi.adapter(Boolean::c…ySet(), \"isEndedCleanly\")");
        this.nullableBooleanAdapter = f6;
        JsonAdapter<List<String>> f7 = iVar.f(j.j(List.class, String.class), b0.e(), "eventIds");
        zq3.g(f7, "moshi.adapter(Types.newP…ySet(),\n      \"eventIds\")");
        this.nullableListOfStringAdapter = f7;
        JsonAdapter<Integer> f8 = iVar.f(Integer.class, b0.e(), "infoLogsAttemptedToSend");
        zq3.g(f8, "moshi.adapter(Int::class…infoLogsAttemptedToSend\")");
        this.nullableIntAdapter = f8;
        JsonAdapter<LegacyExceptionError> f9 = iVar.f(LegacyExceptionError.class, b0.e(), "exceptionError");
        zq3.g(f9, "moshi.adapter(LegacyExce…ySet(), \"exceptionError\")");
        this.nullableLegacyExceptionErrorAdapter = f9;
        JsonAdapter<String> f10 = iVar.f(String.class, b0.e(), "crashReportId");
        zq3.g(f10, "moshi.adapter(String::cl…tySet(), \"crashReportId\")");
        this.nullableStringAdapter = f10;
        JsonAdapter<Session.LifeEventType> f11 = iVar.f(Session.LifeEventType.class, b0.e(), "endType");
        zq3.g(f11, "moshi.adapter(Session.Li…a, emptySet(), \"endType\")");
        this.nullableLifeEventTypeAdapter = f11;
        JsonAdapter<List<Orientation>> f12 = iVar.f(j.j(List.class, Orientation.class), b0.e(), "orientations");
        zq3.g(f12, "moshi.adapter(Types.newP…ptySet(), \"orientations\")");
        this.nullableListOfOrientationAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "properties");
        zq3.g(f13, "moshi.adapter(Types.newP…emptySet(), \"properties\")");
        this.nullableMapOfStringStringAdapter = f13;
        JsonAdapter<BetaFeatures> f14 = iVar.f(BetaFeatures.class, b0.e(), "betaFeatures");
        zq3.g(f14, "moshi.adapter(BetaFeatur…ptySet(), \"betaFeatures\")");
        this.nullableBetaFeaturesAdapter = f14;
        JsonAdapter<List<WebViewInfo>> f15 = iVar.f(j.j(List.class, WebViewInfo.class), b0.e(), "webViewInfo");
        zq3.g(f15, "moshi.adapter(Types.newP…mptySet(), \"webViewInfo\")");
        this.nullableListOfWebViewInfoAdapter = f15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Session");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Session fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        Long l = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        LegacyExceptionError legacyExceptionError = null;
        String str5 = null;
        Session.LifeEventType lifeEventType = null;
        Session.LifeEventType lifeEventType2 = null;
        List list6 = null;
        Map map = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        Integer num5 = null;
        BetaFeatures betaFeatures = null;
        Map map2 = null;
        List list7 = null;
        while (true) {
            Boolean bool4 = bool2;
            Long l8 = l4;
            Long l9 = l3;
            Long l10 = l2;
            Boolean bool5 = bool;
            String str6 = str4;
            String str7 = str3;
            Integer num6 = num;
            Long l11 = l;
            String str8 = str2;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == 63) {
                    if (str8 == null) {
                        JsonDataException o = c29.o("sessionId", "id", jsonReader);
                        zq3.g(o, "Util.missingProperty(\"sessionId\", \"id\", reader)");
                        throw o;
                    }
                    if (l11 == null) {
                        JsonDataException o2 = c29.o("startTime", "st", jsonReader);
                        zq3.g(o2, "Util.missingProperty(\"startTime\", \"st\", reader)");
                        throw o2;
                    }
                    long longValue = l11.longValue();
                    if (num6 == null) {
                        JsonDataException o3 = c29.o("number", "sn", jsonReader);
                        zq3.g(o3, "Util.missingProperty(\"number\", \"sn\", reader)");
                        throw o3;
                    }
                    int intValue = num6.intValue();
                    if (str7 == null) {
                        JsonDataException o4 = c29.o("messageType", "ty", jsonReader);
                        zq3.g(o4, "Util.missingProperty(\"messageType\", \"ty\", reader)");
                        throw o4;
                    }
                    if (str6 == null) {
                        JsonDataException o5 = c29.o("appState", "as", jsonReader);
                        zq3.g(o5, "Util.missingProperty(\"appState\", \"as\", reader)");
                        throw o5;
                    }
                    if (bool5 != null) {
                        return new Session(str8, longValue, intValue, str7, str6, bool5.booleanValue(), l10, l9, l8, bool4, bool3, list, list2, list3, list4, list5, num2, num3, num4, legacyExceptionError, str5, lifeEventType, lifeEventType2, list6, map, l5, l6, l7, num5, betaFeatures, map2, list7);
                    }
                    JsonDataException o6 = c29.o("isColdStart", "cs", jsonReader);
                    zq3.g(o6, "Util.missingProperty(\"isColdStart\", \"cs\", reader)");
                    throw o6;
                }
                Constructor<Session> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Long.TYPE;
                    Class cls2 = Integer.TYPE;
                    str = "Util.missingProperty(\"number\", \"sn\", reader)";
                    constructor = Session.class.getDeclaredConstructor(String.class, cls, cls2, String.class, String.class, Boolean.TYPE, Long.class, Long.class, Long.class, Boolean.class, Boolean.class, List.class, List.class, List.class, List.class, List.class, Integer.class, Integer.class, Integer.class, LegacyExceptionError.class, String.class, Session.LifeEventType.class, Session.LifeEventType.class, List.class, Map.class, Long.class, Long.class, Long.class, Integer.class, BetaFeatures.class, Map.class, List.class, cls2, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "Session::class.java.getD…his.constructorRef = it }");
                } else {
                    str = "Util.missingProperty(\"number\", \"sn\", reader)";
                }
                Constructor<Session> constructor2 = constructor;
                if (str8 == null) {
                    JsonDataException o7 = c29.o("sessionId", "id", jsonReader);
                    zq3.g(o7, "Util.missingProperty(\"sessionId\", \"id\", reader)");
                    throw o7;
                }
                if (l11 == null) {
                    JsonDataException o8 = c29.o("startTime", "st", jsonReader);
                    zq3.g(o8, "Util.missingProperty(\"startTime\", \"st\", reader)");
                    throw o8;
                }
                if (num6 == null) {
                    JsonDataException o9 = c29.o("number", "sn", jsonReader);
                    zq3.g(o9, str);
                    throw o9;
                }
                if (str7 == null) {
                    JsonDataException o10 = c29.o("messageType", "ty", jsonReader);
                    zq3.g(o10, "Util.missingProperty(\"messageType\", \"ty\", reader)");
                    throw o10;
                }
                if (str6 == null) {
                    JsonDataException o11 = c29.o("appState", "as", jsonReader);
                    zq3.g(o11, "Util.missingProperty(\"appState\", \"as\", reader)");
                    throw o11;
                }
                if (bool5 == null) {
                    JsonDataException o12 = c29.o("isColdStart", "cs", jsonReader);
                    zq3.g(o12, "Util.missingProperty(\"isColdStart\", \"cs\", reader)");
                    throw o12;
                }
                Session newInstance = constructor2.newInstance(str8, l11, num6, str7, str6, bool5, l10, l9, l8, bool4, bool3, list, list2, list3, list4, list5, num2, num3, num4, legacyExceptionError, str5, lifeEventType, lifeEventType2, list6, map, l5, l6, l7, num5, betaFeatures, map2, list7, Integer.valueOf(i), null);
                zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("sessionId", "id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"ses…            \"id\", reader)");
                        throw x;
                    }
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                case 1:
                    Long l12 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l12 == null) {
                        JsonDataException x2 = c29.x("startTime", "st", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                        throw x2;
                    }
                    l = l12;
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    str2 = str8;
                case 2:
                    Integer num7 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num7 == null) {
                        JsonDataException x3 = c29.x("number", "sn", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"num…\"sn\",\n            reader)");
                        throw x3;
                    }
                    num = num7;
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    l = l11;
                    str2 = str8;
                case 3:
                    String str9 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        JsonDataException x4 = c29.x("messageType", "ty", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"messageType\", \"ty\", reader)");
                        throw x4;
                    }
                    str3 = str9;
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 4:
                    String str10 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        JsonDataException x5 = c29.x("appState", "as", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"app…            \"as\", reader)");
                        throw x5;
                    }
                    str4 = str10;
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 5:
                    Boolean bool6 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool6 == null) {
                        JsonDataException x6 = c29.x("isColdStart", "cs", jsonReader);
                        zq3.g(x6, "Util.unexpectedNull(\"isColdStart\", \"cs\", reader)");
                        throw x6;
                    }
                    bool = bool6;
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 6:
                    i &= (int) 4294967231L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 7:
                    i &= (int) 4294967167L;
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 8:
                    i &= (int) 4294967039L;
                    l4 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 9:
                    i &= (int) 4294966783L;
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 10:
                    i &= (int) 4294966271L;
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 11:
                    i &= (int) 4294965247L;
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 12:
                    i &= (int) 4294963199L;
                    list2 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 13:
                    i &= (int) 4294959103L;
                    list3 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 14:
                    i &= (int) 4294950911L;
                    list4 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 15:
                    i &= (int) 4294934527L;
                    list5 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 16:
                    i &= (int) 4294901759L;
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 17:
                    i &= (int) 4294836223L;
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 18:
                    i &= (int) 4294705151L;
                    num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 19:
                    i &= (int) 4294443007L;
                    legacyExceptionError = (LegacyExceptionError) this.nullableLegacyExceptionErrorAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 20:
                    i &= (int) 4293918719L;
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 21:
                    i &= (int) 4292870143L;
                    lifeEventType = (Session.LifeEventType) this.nullableLifeEventTypeAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 22:
                    i &= (int) 4290772991L;
                    lifeEventType2 = (Session.LifeEventType) this.nullableLifeEventTypeAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 23:
                    i &= (int) 4286578687L;
                    list6 = (List) this.nullableListOfOrientationAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 24:
                    i &= (int) 4278190079L;
                    map = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case EventType.SUBS /* 25 */:
                    i &= (int) 4261412863L;
                    l5 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case EventType.CDN /* 26 */:
                    i &= (int) 4227858431L;
                    l6 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 27:
                    i &= (int) 4160749567L;
                    l7 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 28:
                    i &= (int) 4026531839L;
                    num5 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case BuildConfig.VERSION_CODE /* 29 */:
                    i &= (int) 3758096383L;
                    betaFeatures = (BetaFeatures) this.nullableBetaFeaturesAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 30:
                    i &= (int) 3221225471L;
                    map2 = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                case 31:
                    i &= Integer.MAX_VALUE;
                    list7 = (List) this.nullableListOfWebViewInfoAdapter.fromJson(jsonReader);
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
                default:
                    bool2 = bool4;
                    l4 = l8;
                    l3 = l9;
                    l2 = l10;
                    bool = bool5;
                    str4 = str6;
                    str3 = str7;
                    num = num6;
                    l = l11;
                    str2 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Session session) {
        zq3.h(hVar, "writer");
        if (session == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, session.getSessionId());
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(session.getStartTime()));
        hVar.C("sn");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(session.getNumber()));
        hVar.C("ty");
        this.stringAdapter.mo197toJson(hVar, session.getMessageType());
        hVar.C("as");
        this.stringAdapter.mo197toJson(hVar, session.getAppState());
        hVar.C("cs");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(session.isColdStart()));
        hVar.C("et");
        this.nullableLongAdapter.mo197toJson(hVar, session.getEndTime());
        hVar.C("ht");
        this.nullableLongAdapter.mo197toJson(hVar, session.getLastHeartbeatTime());
        hVar.C("tt");
        this.nullableLongAdapter.mo197toJson(hVar, session.getTerminationTime());
        hVar.C("ce");
        this.nullableBooleanAdapter.mo197toJson(hVar, session.isEndedCleanly());
        hVar.C("tr");
        this.nullableBooleanAdapter.mo197toJson(hVar, session.isReceivedTermination());
        hVar.C("ss");
        this.nullableListOfStringAdapter.mo197toJson(hVar, session.getEventIds());
        hVar.C("il");
        this.nullableListOfStringAdapter.mo197toJson(hVar, session.getInfoLogIds());
        hVar.C("wl");
        this.nullableListOfStringAdapter.mo197toJson(hVar, session.getWarningLogIds());
        hVar.C("el");
        this.nullableListOfStringAdapter.mo197toJson(hVar, session.getErrorLogIds());
        hVar.C("nc");
        this.nullableListOfStringAdapter.mo197toJson(hVar, session.getNetworkLogIds());
        hVar.C("lic");
        this.nullableIntAdapter.mo197toJson(hVar, session.getInfoLogsAttemptedToSend());
        hVar.C("lwc");
        this.nullableIntAdapter.mo197toJson(hVar, session.getWarnLogsAttemptedToSend());
        hVar.C("lec");
        this.nullableIntAdapter.mo197toJson(hVar, session.getErrorLogsAttemptedToSend());
        hVar.C(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        this.nullableLegacyExceptionErrorAdapter.mo197toJson(hVar, session.getExceptionError());
        hVar.C("ri");
        this.nullableStringAdapter.mo197toJson(hVar, session.getCrashReportId());
        hVar.C(Tag.EM);
        this.nullableLifeEventTypeAdapter.mo197toJson(hVar, session.getEndType());
        hVar.C("sm");
        this.nullableLifeEventTypeAdapter.mo197toJson(hVar, session.getStartType());
        hVar.C("oc");
        this.nullableListOfOrientationAdapter.mo197toJson(hVar, session.getOrientations());
        hVar.C("sp");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, session.getProperties());
        hVar.C(QueryKeys.SITE_VISIT_DEPTH);
        this.nullableLongAdapter.mo197toJson(hVar, session.getStartupDuration());
        hVar.C("sdt");
        this.nullableLongAdapter.mo197toJson(hVar, session.getStartupThreshold());
        hVar.C("si");
        this.nullableLongAdapter.mo197toJson(hVar, session.getSdkStartupDuration());
        hVar.C("ue");
        this.nullableIntAdapter.mo197toJson(hVar, session.getUnhandledExceptions());
        hVar.C("bf");
        this.nullableBetaFeaturesAdapter.mo197toJson(hVar, session.getBetaFeatures());
        hVar.C("sb");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, session.getSymbols());
        hVar.C("wvi_beta");
        this.nullableListOfWebViewInfoAdapter.mo197toJson(hVar, session.getWebViewInfo());
        hVar.l();
    }
}
