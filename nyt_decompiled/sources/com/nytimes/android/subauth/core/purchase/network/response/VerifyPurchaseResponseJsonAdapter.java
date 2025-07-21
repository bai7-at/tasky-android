package com.nytimes.android.subauth.core.purchase.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class VerifyPurchaseResponseJsonAdapter extends JsonAdapter<VerifyPurchaseResponse> {
    private final JsonReader.b options;
    private final JsonAdapter<VerifyPurchaseData> verifyPurchaseDataAdapter;
    private final JsonAdapter<VerifyPurchaseMetadata> verifyPurchaseMetadataAdapter;

    public VerifyPurchaseResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<VerifyPurchaseData> f = iVar.f(VerifyPurchaseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.verifyPurchaseDataAdapter = f;
        JsonAdapter<VerifyPurchaseMetadata> f2 = iVar.f(VerifyPurchaseMetadata.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.verifyPurchaseMetadataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerifyPurchaseResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        VerifyPurchaseData verifyPurchaseData = null;
        VerifyPurchaseMetadata verifyPurchaseMetadata = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                verifyPurchaseData = (VerifyPurchaseData) this.verifyPurchaseDataAdapter.fromJson(jsonReader);
                if (verifyPurchaseData == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (verifyPurchaseMetadata = (VerifyPurchaseMetadata) this.verifyPurchaseMetadataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("meta", "meta", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (verifyPurchaseData == null) {
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (verifyPurchaseMetadata != null) {
            return new VerifyPurchaseResponse(verifyPurchaseData, verifyPurchaseMetadata);
        }
        JsonDataException o2 = c29.o("meta", "meta", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VerifyPurchaseResponse verifyPurchaseResponse) {
        zq3.h(hVar, "writer");
        if (verifyPurchaseResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.verifyPurchaseDataAdapter.mo197toJson(hVar, verifyPurchaseResponse.a());
        hVar.C("meta");
        this.verifyPurchaseMetadataAdapter.mo197toJson(hVar, verifyPurchaseResponse.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyPurchaseResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
