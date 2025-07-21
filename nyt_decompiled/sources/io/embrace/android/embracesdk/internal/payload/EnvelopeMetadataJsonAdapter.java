package io.embrace.android.embracesdk.internal.payload;

import com.facebook.AccessToken;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EnvelopeMetadataJsonAdapter extends JsonAdapter<EnvelopeMetadata> {
    private volatile Constructor<EnvelopeMetadata> constructorRef;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public EnvelopeMetadataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AccessToken.USER_ID_KEY, "email", "username", "personas", "timezone_description", "locale");
        zq3.g(a, "JsonReader.Options.of(\"u…e_description\", \"locale\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "userId");
        zq3.g(f, "moshi.adapter(String::cl…    emptySet(), \"userId\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Set<String>> f2 = iVar.f(j.j(Set.class, String.class), b0.e(), "personas");
        zq3.g(f2, "moshi.adapter(Types.newP…ySet(),\n      \"personas\")");
        this.nullableSetOfStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EnvelopeMetadata");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EnvelopeMetadata fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        Set set = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967232L)) {
            return new EnvelopeMetadata(str, str2, str3, set, str4, str5);
        }
        Constructor<EnvelopeMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EnvelopeMetadata.class.getDeclaredConstructor(String.class, String.class, String.class, Set.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "EnvelopeMetadata::class.…his.constructorRef = it }");
        }
        EnvelopeMetadata newInstance = constructor.newInstance(str, str2, str3, set, str4, str5, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EnvelopeMetadata envelopeMetadata) {
        zq3.h(hVar, "writer");
        if (envelopeMetadata == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AccessToken.USER_ID_KEY);
        this.nullableStringAdapter.mo197toJson(hVar, envelopeMetadata.getUserId());
        hVar.C("email");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeMetadata.getEmail());
        hVar.C("username");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeMetadata.getUsername());
        hVar.C("personas");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, envelopeMetadata.getPersonas());
        hVar.C("timezone_description");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeMetadata.getTimezoneDescription());
        hVar.C("locale");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeMetadata.getLocale());
        hVar.l();
    }
}
