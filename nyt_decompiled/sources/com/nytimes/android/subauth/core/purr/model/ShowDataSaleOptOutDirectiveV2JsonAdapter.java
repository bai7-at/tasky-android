package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ShowDataSaleOptOutDirectiveV2JsonAdapter extends JsonAdapter<ShowDataSaleOptOutDirectiveV2> {
    private final JsonAdapter<DataSaleOptOutDirectiveValueV2> dataSaleOptOutDirectiveValueV2Adapter;
    private final JsonReader.b options;

    public ShowDataSaleOptOutDirectiveV2JsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<DataSaleOptOutDirectiveValueV2> f = iVar.f(DataSaleOptOutDirectiveValueV2.class, b0.e(), "value");
        zq3.g(f, "adapter(...)");
        this.dataSaleOptOutDirectiveValueV2Adapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ShowDataSaleOptOutDirectiveV2");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ShowDataSaleOptOutDirectiveV2 fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        DataSaleOptOutDirectiveValueV2 dataSaleOptOutDirectiveValueV2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (dataSaleOptOutDirectiveValueV2 = (DataSaleOptOutDirectiveValueV2) this.dataSaleOptOutDirectiveValueV2Adapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("value__", "value", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (dataSaleOptOutDirectiveValueV2 != null) {
            return new ShowDataSaleOptOutDirectiveV2(dataSaleOptOutDirectiveValueV2);
        }
        JsonDataException o = c29.o("value__", "value", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2) {
        zq3.h(hVar, "writer");
        if (showDataSaleOptOutDirectiveV2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("value");
        this.dataSaleOptOutDirectiveValueV2Adapter.mo197toJson(hVar, showDataSaleOptOutDirectiveV2.getValue());
        hVar.l();
    }
}
