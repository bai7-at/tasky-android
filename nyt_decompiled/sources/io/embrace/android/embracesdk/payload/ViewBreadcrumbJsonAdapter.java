package io.embrace.android.embracesdk.payload;

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
public final class ViewBreadcrumbJsonAdapter extends JsonAdapter<ViewBreadcrumb> {
    private volatile Constructor<ViewBreadcrumb> constructorRef;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ViewBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("vn", "st", Session.MESSAGE_TYPE_END);
        zq3.g(a, "JsonReader.Options.of(\"vn\", \"st\", \"en\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "screen");
        zq3.g(f, "moshi.adapter(String::cl…ptySet(),\n      \"screen\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "start");
        zq3.g(f2, "moshi.adapter(Long::clas…     emptySet(), \"start\")");
        this.nullableLongAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ViewBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ViewBreadcrumb fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        Long l2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("screen", "vn", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"scr…\"vn\",\n            reader)");
                    throw x;
                }
            } else if (P == 1) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                i &= (int) 4294967291L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967291L)) {
            if (str != null) {
                return new ViewBreadcrumb(str, l, l2);
            }
            JsonDataException o = c29.o("screen", "vn", jsonReader);
            zq3.g(o, "Util.missingProperty(\"screen\", \"vn\", reader)");
            throw o;
        }
        Constructor<ViewBreadcrumb> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ViewBreadcrumb.class.getDeclaredConstructor(String.class, Long.class, Long.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "ViewBreadcrumb::class.ja…his.constructorRef = it }");
        }
        if (str != null) {
            ViewBreadcrumb newInstance = constructor.newInstance(str, l, l2, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException o2 = c29.o("screen", "vn", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"screen\", \"vn\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ViewBreadcrumb viewBreadcrumb) {
        zq3.h(hVar, "writer");
        if (viewBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("vn");
        this.stringAdapter.mo197toJson(hVar, viewBreadcrumb.getScreen());
        hVar.C("st");
        this.nullableLongAdapter.mo197toJson(hVar, viewBreadcrumb.getStart());
        hVar.C(Session.MESSAGE_TYPE_END);
        this.nullableLongAdapter.mo197toJson(hVar, viewBreadcrumb.getEnd());
        hVar.l();
    }
}
