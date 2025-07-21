package com.nytimes.android.dailyfive.domain;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class DailyFiveChannelJsonAdapter extends JsonAdapter<DailyFiveChannel> {
    public static final int $stable = 8;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public DailyFiveChannelJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("uri", AuthenticationTokenClaims.JSON_KEY_NAME, "description", "shortDescription", "promoMedia");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "description");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<Image> f3 = iVar.f(Image.class, b0.e(), "promoMedia");
        zq3.g(f3, "adapter(...)");
        this.nullableImageAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DailyFiveChannel fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Image image = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("uri", "uri", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 4) {
                image = (Image) this.nullableImageAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("uri", "uri", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 != null) {
            return new DailyFiveChannel(str, str2, str3, str4, image);
        }
        JsonDataException o2 = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DailyFiveChannel dailyFiveChannel) {
        zq3.h(hVar, "writer");
        if (dailyFiveChannel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, dailyFiveChannel.e());
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, dailyFiveChannel.b());
        hVar.C("description");
        this.nullableStringAdapter.mo197toJson(hVar, dailyFiveChannel.a());
        hVar.C("shortDescription");
        this.nullableStringAdapter.mo197toJson(hVar, dailyFiveChannel.d());
        hVar.C("promoMedia");
        this.nullableImageAdapter.mo197toJson(hVar, dailyFiveChannel.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DailyFiveChannel");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
