package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class FragmentBreadcrumbJsonAdapter extends JsonAdapter<FragmentBreadcrumb> {
    private volatile Constructor<FragmentBreadcrumb> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public FragmentBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.IS_NEW_USER, "st", Session.MESSAGE_TYPE_END);
        zq3.g(a, "JsonReader.Options.of(\"n\", \"st\", \"en\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "start");
        zq3.g(f2, "moshi.adapter(Long::clas…ava, emptySet(), \"start\")");
        this.longAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "endTime");
        zq3.g(f3, "moshi.adapter(Long::clas…   emptySet(), \"endTime\")");
        this.nullableLongAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FragmentBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public FragmentBreadcrumb fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i = -1;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"name\", \"n\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x2 = c29.x("start", "st", jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"sta…\"st\",\n            reader)");
                    throw x2;
                }
            } else if (P == 2) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                i &= (int) 4294967291L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967291L)) {
            if (str2 == null) {
                JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
                zq3.g(o, "Util.missingProperty(\"name\", \"n\", reader)");
                throw o;
            }
            if (l != null) {
                return new FragmentBreadcrumb(str2, l.longValue(), l2);
            }
            JsonDataException o2 = c29.o("start", "st", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"start\", \"st\", reader)");
            throw o2;
        }
        Constructor<FragmentBreadcrumb> constructor = this.constructorRef;
        if (constructor == null) {
            str = "Util.missingProperty(\"name\", \"n\", reader)";
            constructor = FragmentBreadcrumb.class.getDeclaredConstructor(String.class, Long.TYPE, Long.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "FragmentBreadcrumb::clas…his.constructorRef = it }");
        } else {
            str = "Util.missingProperty(\"name\", \"n\", reader)";
        }
        if (str2 == null) {
            JsonDataException o3 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, QueryKeys.IS_NEW_USER, jsonReader);
            zq3.g(o3, str);
            throw o3;
        }
        if (l != null) {
            FragmentBreadcrumb newInstance = constructor.newInstance(str2, l, l2, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException o4 = c29.o("start", "st", jsonReader);
        zq3.g(o4, "Util.missingProperty(\"start\", \"st\", reader)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, FragmentBreadcrumb fragmentBreadcrumb) {
        zq3.h(hVar, "writer");
        if (fragmentBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.IS_NEW_USER);
        this.stringAdapter.mo197toJson(hVar, fragmentBreadcrumb.getName());
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(fragmentBreadcrumb.getStart()));
        hVar.C(Session.MESSAGE_TYPE_END);
        this.nullableLongAdapter.mo197toJson(hVar, fragmentBreadcrumb.getEndTime());
        hVar.l();
    }
}
