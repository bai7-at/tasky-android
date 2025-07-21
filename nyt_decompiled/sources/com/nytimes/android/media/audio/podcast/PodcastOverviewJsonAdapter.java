package com.nytimes.android.media.audio.podcast;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PodcastOverviewJsonAdapter extends JsonAdapter<PodcastOverview> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Subscription>> listOfSubscriptionAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<PodcastTypeInfo> podcastTypeInfoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PodcastOverviewJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "title", "description", "uri", "imageUrl", "heroImageUrl", TransferTable.COLUMN_TYPE, "subscriptions");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<PodcastTypeInfo> f2 = iVar.f(PodcastTypeInfo.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f2, "adapter(...)");
        this.podcastTypeInfoAdapter = f2;
        JsonAdapter<List<Subscription>> f3 = iVar.f(j.j(List.class, Subscription.class), b0.e(), "subscriptions");
        zq3.g(f3, "adapter(...)");
        this.listOfSubscriptionAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PodcastOverview fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        PodcastTypeInfo podcastTypeInfo = null;
        List list = null;
        while (true) {
            List list2 = list;
            PodcastTypeInfo podcastTypeInfo2 = podcastTypeInfo;
            String str7 = str6;
            if (!jsonReader.hasNext()) {
                String str8 = str5;
                jsonReader.h();
                if (str == null) {
                    JsonDataException o = c29.o("id", "id", jsonReader);
                    zq3.g(o, "missingProperty(...)");
                    throw o;
                }
                if (str2 == null) {
                    JsonDataException o2 = c29.o("title", "title", jsonReader);
                    zq3.g(o2, "missingProperty(...)");
                    throw o2;
                }
                if (str3 == null) {
                    JsonDataException o3 = c29.o("description", "description", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                if (str4 == null) {
                    JsonDataException o4 = c29.o("uri", "uri", jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                if (str8 == null) {
                    JsonDataException o5 = c29.o("imageUrl", "imageUrl", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                if (str7 == null) {
                    JsonDataException o6 = c29.o("heroImageUrl", "heroImageUrl", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                if (podcastTypeInfo2 == null) {
                    JsonDataException o7 = c29.o(TransferTable.COLUMN_TYPE, TransferTable.COLUMN_TYPE, jsonReader);
                    zq3.g(o7, "missingProperty(...)");
                    throw o7;
                }
                if (list2 != null) {
                    return new PodcastOverview(str, str2, str3, str4, str8, str7, podcastTypeInfo2, list2);
                }
                JsonDataException o8 = c29.o("subscriptions", "subscriptions", jsonReader);
                zq3.g(o8, "missingProperty(...)");
                throw o8;
            }
            String str9 = str5;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("id", "id", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("title", "title", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("description", "description", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("uri", "uri", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                case 4:
                    String str10 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        JsonDataException x5 = c29.x("imageUrl", "imageUrl", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    str5 = str10;
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x6 = c29.x("heroImageUrl", "heroImageUrl", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str5 = str9;
                case 6:
                    PodcastTypeInfo podcastTypeInfo3 = (PodcastTypeInfo) this.podcastTypeInfoAdapter.fromJson(jsonReader);
                    if (podcastTypeInfo3 == null) {
                        JsonDataException x7 = c29.x(TransferTable.COLUMN_TYPE, TransferTable.COLUMN_TYPE, jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    podcastTypeInfo = podcastTypeInfo3;
                    list = list2;
                    str6 = str7;
                    str5 = str9;
                case 7:
                    list = (List) this.listOfSubscriptionAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x8 = c29.x("subscriptions", "subscriptions", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
                default:
                    list = list2;
                    podcastTypeInfo = podcastTypeInfo2;
                    str6 = str7;
                    str5 = str9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PodcastOverview podcastOverview) {
        zq3.h(hVar, "writer");
        if (podcastOverview == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.getId());
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.getTitle());
        hVar.C("description");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.getDescription());
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.d());
        hVar.C("imageUrl");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.a());
        hVar.C("heroImageUrl");
        this.stringAdapter.mo197toJson(hVar, podcastOverview.b());
        hVar.C(TransferTable.COLUMN_TYPE);
        this.podcastTypeInfoAdapter.mo197toJson(hVar, podcastOverview.getType());
        hVar.C("subscriptions");
        this.listOfSubscriptionAdapter.mo197toJson(hVar, podcastOverview.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PodcastOverview");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
