package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import java.lang.reflect.Constructor;
import kotlin.Pair;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class TapBreadcrumbJsonAdapter extends JsonAdapter<TapBreadcrumb> {
    private volatile Constructor<TapBreadcrumb> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TapBreadcrumb.TapBreadcrumbType> nullableTapBreadcrumbTypeAdapter;
    private final JsonReader.b options;

    public TapBreadcrumbJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tt", "ts", QueryKeys.TOKEN, "tl");
        zq3.g(a, "JsonReader.Options.of(\"tt\", \"ts\", \"t\", \"tl\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "tappedElementName");
        zq3.g(f, "moshi.adapter(String::cl…t(), \"tappedElementName\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f2;
        JsonAdapter<TapBreadcrumb.TapBreadcrumbType> f3 = iVar.f(TapBreadcrumb.TapBreadcrumbType.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f3, "moshi.adapter(TapBreadcr…java, emptySet(), \"type\")");
        this.nullableTapBreadcrumbTypeAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TapBreadcrumb");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TapBreadcrumb fromJson(JsonReader jsonReader) {
        TapBreadcrumb tapBreadcrumb;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Long l = null;
        TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType = null;
        boolean z = false;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                Long l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x = c29.x("timestamp", "ts", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                    throw x;
                }
                l = l2;
            } else if (P == 2) {
                tapBreadcrumbType = (TapBreadcrumb.TapBreadcrumbType) this.nullableTapBreadcrumbTypeAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                z = true;
            }
        }
        jsonReader.h();
        if (-1 != ((int) 4294967295L)) {
            Constructor<TapBreadcrumb> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = TapBreadcrumb.class.getDeclaredConstructor(Pair.class, String.class, Long.TYPE, TapBreadcrumb.TapBreadcrumbType.class, Integer.TYPE, c29.c);
                this.constructorRef = constructor;
                zq3.g(constructor, "TapBreadcrumb::class.jav…his.constructorRef = it }");
            }
            Constructor<TapBreadcrumb> constructor2 = constructor;
            if (l == null) {
                JsonDataException o = c29.o("timestamp", "ts", jsonReader);
                zq3.g(o, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
                throw o;
            }
            TapBreadcrumb newInstance = constructor2.newInstance(null, str, l, tapBreadcrumbType, -1, null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            tapBreadcrumb = newInstance;
        } else {
            if (l == null) {
                JsonDataException o2 = c29.o("timestamp", "ts", jsonReader);
                zq3.g(o2, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
                throw o2;
            }
            tapBreadcrumb = new TapBreadcrumb(null, str, l.longValue(), tapBreadcrumbType, 1, null);
        }
        if (!z) {
            str2 = tapBreadcrumb.getLocation();
        }
        tapBreadcrumb.setLocation(str2);
        return tapBreadcrumb;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TapBreadcrumb tapBreadcrumb) {
        zq3.h(hVar, "writer");
        if (tapBreadcrumb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tt");
        this.nullableStringAdapter.mo197toJson(hVar, tapBreadcrumb.getTappedElementName());
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(tapBreadcrumb.getTimestamp$embrace_android_sdk_release()));
        hVar.C(QueryKeys.TOKEN);
        this.nullableTapBreadcrumbTypeAdapter.mo197toJson(hVar, tapBreadcrumb.getType());
        hVar.C("tl");
        this.nullableStringAdapter.mo197toJson(hVar, tapBreadcrumb.getLocation());
        hVar.l();
    }
}
