package io.embrace.android.embracesdk.internal.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AttributeJsonAdapter extends JsonAdapter<Attribute> {
    private volatile Constructor<Attribute> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AttributeJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(TransferTable.COLUMN_KEY, "value");
        zq3.g(a, "JsonReader.Options.of(\"key\", \"value\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), TransferTable.COLUMN_KEY);
        zq3.g(f, "moshi.adapter(String::cl…\n      emptySet(), \"key\")");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Attribute");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Attribute fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967292L)) {
            return new Attribute(str, str2);
        }
        Constructor<Attribute> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Attribute.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "Attribute::class.java.ge…his.constructorRef = it }");
        }
        Attribute newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Attribute attribute) {
        zq3.h(hVar, "writer");
        if (attribute == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(TransferTable.COLUMN_KEY);
        this.nullableStringAdapter.mo197toJson(hVar, attribute.getKey());
        hVar.C("value");
        this.nullableStringAdapter.mo197toJson(hVar, attribute.getData());
        hVar.l();
    }
}
