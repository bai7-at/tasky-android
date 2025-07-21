package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class CommentSummaryResponseJsonAdapter extends JsonAdapter<CommentSummaryResponse> {
    public static final int $stable = 8;
    private volatile Constructor<CommentSummaryResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public CommentSummaryResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("url", "commentQuestion", "totalCommentsFound", "totalReplyCommentsFound", "totalReporterReplyCommentsFound", "totalParentCommentsFound", "totalEditorsSelectionFound", "totalRecommendationsFound", "canSubmit", "sortBy", "totalRating", "userCount", "averageRating");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "url");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "totalCommentsFound");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "sortBy");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CommentSummaryResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CommentSummaryResponse fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str4 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        while (true) {
            String str5 = str4;
            Integer num11 = num8;
            Integer num12 = num7;
            Integer num13 = num6;
            Integer num14 = num5;
            Integer num15 = num4;
            Integer num16 = num3;
            Integer num17 = num2;
            Integer num18 = num;
            String str6 = str3;
            String str7 = str2;
            if (!jsonReader.hasNext()) {
                int i2 = i;
                jsonReader.h();
                if (i2 == -513) {
                    if (str7 == null) {
                        JsonDataException o = c29.o("url", "url", jsonReader);
                        zq3.g(o, "missingProperty(...)");
                        throw o;
                    }
                    if (str6 == null) {
                        JsonDataException o2 = c29.o("commentQuestion", "commentQuestion", jsonReader);
                        zq3.g(o2, "missingProperty(...)");
                        throw o2;
                    }
                    if (num18 == null) {
                        JsonDataException o3 = c29.o("totalCommentsFound", "totalCommentsFound", jsonReader);
                        zq3.g(o3, "missingProperty(...)");
                        throw o3;
                    }
                    int intValue = num18.intValue();
                    if (num17 == null) {
                        JsonDataException o4 = c29.o("totalReplyCommentsFound", "totalReplyCommentsFound", jsonReader);
                        zq3.g(o4, "missingProperty(...)");
                        throw o4;
                    }
                    int intValue2 = num17.intValue();
                    if (num16 == null) {
                        JsonDataException o5 = c29.o("totalReporterReplyCommentsFound", "totalReporterReplyCommentsFound", jsonReader);
                        zq3.g(o5, "missingProperty(...)");
                        throw o5;
                    }
                    int intValue3 = num16.intValue();
                    if (num15 == null) {
                        JsonDataException o6 = c29.o("totalParentCommentsFound", "totalParentCommentsFound", jsonReader);
                        zq3.g(o6, "missingProperty(...)");
                        throw o6;
                    }
                    int intValue4 = num15.intValue();
                    if (num14 == null) {
                        JsonDataException o7 = c29.o("totalEditorsSelectionFound", "totalEditorsSelectionFound", jsonReader);
                        zq3.g(o7, "missingProperty(...)");
                        throw o7;
                    }
                    int intValue5 = num14.intValue();
                    if (num13 == null) {
                        JsonDataException o8 = c29.o("totalRecommendationsFound", "totalRecommendationsFound", jsonReader);
                        zq3.g(o8, "missingProperty(...)");
                        throw o8;
                    }
                    int intValue6 = num13.intValue();
                    if (num12 == null) {
                        JsonDataException o9 = c29.o("canSubmit", "canSubmit", jsonReader);
                        zq3.g(o9, "missingProperty(...)");
                        throw o9;
                    }
                    int intValue7 = num12.intValue();
                    if (num11 == null) {
                        JsonDataException o10 = c29.o("totalRating", "totalRating", jsonReader);
                        zq3.g(o10, "missingProperty(...)");
                        throw o10;
                    }
                    int intValue8 = num11.intValue();
                    if (num9 == null) {
                        JsonDataException o11 = c29.o("userCount", "userCount", jsonReader);
                        zq3.g(o11, "missingProperty(...)");
                        throw o11;
                    }
                    int intValue9 = num9.intValue();
                    if (num10 != null) {
                        return new CommentSummaryResponse(str7, str6, intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, str5, intValue8, intValue9, num10.intValue());
                    }
                    JsonDataException o12 = c29.o("averageRating", "averageRating", jsonReader);
                    zq3.g(o12, "missingProperty(...)");
                    throw o12;
                }
                Constructor<CommentSummaryResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    str = "commentQuestion";
                    constructor = CommentSummaryResponse.class.getDeclaredConstructor(String.class, String.class, cls, cls, cls, cls, cls, cls, cls, String.class, cls, cls, cls, cls, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "also(...)");
                } else {
                    str = "commentQuestion";
                }
                Constructor<CommentSummaryResponse> constructor2 = constructor;
                if (str7 == null) {
                    JsonDataException o13 = c29.o("url", "url", jsonReader);
                    zq3.g(o13, "missingProperty(...)");
                    throw o13;
                }
                if (str6 == null) {
                    String str8 = str;
                    JsonDataException o14 = c29.o(str8, str8, jsonReader);
                    zq3.g(o14, "missingProperty(...)");
                    throw o14;
                }
                if (num18 == null) {
                    JsonDataException o15 = c29.o("totalCommentsFound", "totalCommentsFound", jsonReader);
                    zq3.g(o15, "missingProperty(...)");
                    throw o15;
                }
                if (num17 == null) {
                    JsonDataException o16 = c29.o("totalReplyCommentsFound", "totalReplyCommentsFound", jsonReader);
                    zq3.g(o16, "missingProperty(...)");
                    throw o16;
                }
                if (num16 == null) {
                    JsonDataException o17 = c29.o("totalReporterReplyCommentsFound", "totalReporterReplyCommentsFound", jsonReader);
                    zq3.g(o17, "missingProperty(...)");
                    throw o17;
                }
                if (num15 == null) {
                    JsonDataException o18 = c29.o("totalParentCommentsFound", "totalParentCommentsFound", jsonReader);
                    zq3.g(o18, "missingProperty(...)");
                    throw o18;
                }
                if (num14 == null) {
                    JsonDataException o19 = c29.o("totalEditorsSelectionFound", "totalEditorsSelectionFound", jsonReader);
                    zq3.g(o19, "missingProperty(...)");
                    throw o19;
                }
                if (num13 == null) {
                    JsonDataException o20 = c29.o("totalRecommendationsFound", "totalRecommendationsFound", jsonReader);
                    zq3.g(o20, "missingProperty(...)");
                    throw o20;
                }
                if (num12 == null) {
                    JsonDataException o21 = c29.o("canSubmit", "canSubmit", jsonReader);
                    zq3.g(o21, "missingProperty(...)");
                    throw o21;
                }
                if (num11 == null) {
                    JsonDataException o22 = c29.o("totalRating", "totalRating", jsonReader);
                    zq3.g(o22, "missingProperty(...)");
                    throw o22;
                }
                if (num9 == null) {
                    JsonDataException o23 = c29.o("userCount", "userCount", jsonReader);
                    zq3.g(o23, "missingProperty(...)");
                    throw o23;
                }
                if (num10 == null) {
                    JsonDataException o24 = c29.o("averageRating", "averageRating", jsonReader);
                    zq3.g(o24, "missingProperty(...)");
                    throw o24;
                }
                CommentSummaryResponse newInstance = constructor2.newInstance(str7, str6, num18, num17, num16, num15, num14, num13, num12, str5, num11, num9, num10, Integer.valueOf(i2), null);
                zq3.g(newInstance, "newInstance(...)");
                return newInstance;
            }
            int i3 = i;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("url", "url", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    i = i3;
                case 1:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("commentQuestion", "commentQuestion", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str2 = str7;
                    i = i3;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x3 = c29.x("totalCommentsFound", "totalCommentsFound", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 3:
                    num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x4 = c29.x("totalReplyCommentsFound", "totalReplyCommentsFound", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 4:
                    num3 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num3 == null) {
                        JsonDataException x5 = c29.x("totalReporterReplyCommentsFound", "totalReporterReplyCommentsFound", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 5:
                    num4 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num4 == null) {
                        JsonDataException x6 = c29.x("totalParentCommentsFound", "totalParentCommentsFound", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 6:
                    num5 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num5 == null) {
                        JsonDataException x7 = c29.x("totalEditorsSelectionFound", "totalEditorsSelectionFound", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 7:
                    num6 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num6 == null) {
                        JsonDataException x8 = c29.x("totalRecommendationsFound", "totalRecommendationsFound", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 8:
                    num7 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num7 == null) {
                        JsonDataException x9 = c29.x("canSubmit", "canSubmit", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    str4 = str5;
                    num8 = num11;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 9:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = -513;
                case 10:
                    num8 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num8 == null) {
                        JsonDataException x10 = c29.x("totalRating", "totalRating", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    str4 = str5;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 11:
                    num9 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num9 == null) {
                        JsonDataException x11 = c29.x("userCount", "userCount", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                case 12:
                    num10 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num10 == null) {
                        JsonDataException x12 = c29.x("averageRating", "averageRating", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
                default:
                    str4 = str5;
                    num8 = num11;
                    num7 = num12;
                    num6 = num13;
                    num5 = num14;
                    num4 = num15;
                    num3 = num16;
                    num2 = num17;
                    num = num18;
                    str3 = str6;
                    str2 = str7;
                    i = i3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CommentSummaryResponse commentSummaryResponse) {
        zq3.h(hVar, "writer");
        if (commentSummaryResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, commentSummaryResponse.getUrl());
        hVar.C("commentQuestion");
        this.stringAdapter.mo197toJson(hVar, commentSummaryResponse.getCommentQuestion());
        hVar.C("totalCommentsFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalCommentsFound()));
        hVar.C("totalReplyCommentsFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalReplyCommentsFound()));
        hVar.C("totalReporterReplyCommentsFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalReporterReplyCommentsFound()));
        hVar.C("totalParentCommentsFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalParentCommentsFound()));
        hVar.C("totalEditorsSelectionFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalEditorsSelectionFound()));
        hVar.C("totalRecommendationsFound");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalRecommendationsFound()));
        hVar.C("canSubmit");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getCanSubmit()));
        hVar.C("sortBy");
        this.nullableStringAdapter.mo197toJson(hVar, commentSummaryResponse.getSortBy());
        hVar.C("totalRating");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getTotalRating()));
        hVar.C("userCount");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getUserCount()));
        hVar.C("averageRating");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentSummaryResponse.getAverageRating()));
        hVar.l();
    }
}
