package io.embrace.android.embracesdk.internal.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EnvelopeJsonAdapter<T> extends JsonAdapter<Envelope<T>> {
    private volatile Constructor<Envelope<T>> constructorRef;
    private final JsonAdapter<EnvelopeMetadata> nullableEnvelopeMetadataAdapter;
    private final JsonAdapter<EnvelopeResource> nullableEnvelopeResourceAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<T> tNullableAnyAdapter;

    public EnvelopeJsonAdapter(i iVar, Type[] typeArr) {
        zq3.h(iVar, "moshi");
        zq3.h(typeArr, "types");
        if (typeArr.length != 1) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
            zq3.g(str, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalArgumentException(str.toString());
        }
        JsonReader.b a = JsonReader.b.a("resource", "metadata", "version", TransferTable.COLUMN_TYPE, "data");
        zq3.g(a, "JsonReader.Options.of(\"r…n\",\n      \"type\", \"data\")");
        this.options = a;
        JsonAdapter<EnvelopeResource> f = iVar.f(EnvelopeResource.class, b0.e(), "resource");
        zq3.g(f, "moshi.adapter(EnvelopeRe…, emptySet(), \"resource\")");
        this.nullableEnvelopeResourceAdapter = f;
        JsonAdapter<EnvelopeMetadata> f2 = iVar.f(EnvelopeMetadata.class, b0.e(), "metadata");
        zq3.g(f2, "moshi.adapter(EnvelopeMe…, emptySet(), \"metadata\")");
        this.nullableEnvelopeMetadataAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "version");
        zq3.g(f3, "moshi.adapter(String::cl…   emptySet(), \"version\")");
        this.nullableStringAdapter = f3;
        JsonAdapter<T> f4 = iVar.f(typeArr[0], b0.e(), "data");
        zq3.g(f4, "moshi.adapter(types[0], emptySet(), \"data\")");
        this.tNullableAnyAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Envelope");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Envelope<T> fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        EnvelopeResource envelopeResource = null;
        EnvelopeMetadata envelopeMetadata = null;
        String str = null;
        String str2 = null;
        Object obj = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                envelopeResource = (EnvelopeResource) this.nullableEnvelopeResourceAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            } else if (P == 1) {
                i &= (int) 4294967293L;
                envelopeMetadata = (EnvelopeMetadata) this.nullableEnvelopeMetadataAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                i &= (int) 4294967291L;
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                i &= (int) 4294967287L;
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                Object fromJson = this.tNullableAnyAdapter.fromJson(jsonReader);
                if (fromJson == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"dat…          \"data\", reader)");
                    throw x;
                }
                obj = fromJson;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            if (obj != null) {
                return new Envelope<>(envelopeResource, envelopeMetadata, str, str2, obj);
            }
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "Util.missingProperty(\"data_\", \"data\", reader)");
            throw o;
        }
        Constructor<Envelope<T>> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Envelope.class.getDeclaredConstructor(EnvelopeResource.class, EnvelopeMetadata.class, String.class, String.class, Object.class, Integer.TYPE, c29.c);
            if (constructor == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Constructor<io.embrace.android.embracesdk.internal.payload.Envelope<T>>");
            }
            this.constructorRef = constructor;
        }
        if (obj == null) {
            JsonDataException o2 = c29.o("data_", "data", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"data_\", \"data\", reader)");
            throw o2;
        }
        Envelope<T> newInstance = constructor.newInstance(envelopeResource, envelopeMetadata, str, str2, obj, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Envelope<T> envelope) {
        zq3.h(hVar, "writer");
        if (envelope == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("resource");
        this.nullableEnvelopeResourceAdapter.mo197toJson(hVar, envelope.getResource());
        hVar.C("metadata");
        this.nullableEnvelopeMetadataAdapter.mo197toJson(hVar, envelope.getMetadata());
        hVar.C("version");
        this.nullableStringAdapter.mo197toJson(hVar, envelope.getVersion());
        hVar.C(TransferTable.COLUMN_TYPE);
        this.nullableStringAdapter.mo197toJson(hVar, envelope.getType());
        hVar.C("data");
        this.tNullableAnyAdapter.mo197toJson(hVar, envelope.getData());
        hVar.l();
    }
}
