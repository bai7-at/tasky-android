package com.nytimes.android.comments.comments.data.remote.getallcomments;

import com.comscore.streaming.EventType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class CommentResponseJsonAdapter extends JsonAdapter<CommentResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CommentResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CommentResponse>> listOfCommentResponseAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public CommentResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("userID", "userDisplayName", "userLocation", "userTitle", "userURL", "trusted", "commentID", "status", "commentSequence", "commentTitle", "commentBody", "createDate", "updateDate", "approveDate", "recommendations", "replyCount", "replies", "editorsSelection", "parentID", "parentUserDisplayName", "depth", "commentType", "recommendedFlag", "reportAbuseFlag", "permID", "picURL", "timespeople", "sharing");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "userID");
        zq3.g(f, "adapter(...)");
        this.nullableIntAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "userDisplayName");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "userURL");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
        JsonAdapter<Long> f4 = iVar.f(Long.TYPE, b0.e(), "commentID");
        zq3.g(f4, "adapter(...)");
        this.longAdapter = f4;
        JsonAdapter<Integer> f5 = iVar.f(Integer.TYPE, b0.e(), "approveDate");
        zq3.g(f5, "adapter(...)");
        this.intAdapter = f5;
        JsonAdapter<List<CommentResponse>> f6 = iVar.f(j.j(List.class, CommentResponse.class), b0.e(), "replies");
        zq3.g(f6, "adapter(...)");
        this.listOfCommentResponseAdapter = f6;
        JsonAdapter<Boolean> f7 = iVar.f(Boolean.TYPE, b0.e(), "editorsSelection");
        zq3.g(f7, "adapter(...)");
        this.booleanAdapter = f7;
        JsonAdapter<Long> f8 = iVar.f(Long.class, b0.e(), "parentID");
        zq3.g(f8, "adapter(...)");
        this.nullableLongAdapter = f8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CommentResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CommentResponse fromJson(JsonReader jsonReader) {
        String str;
        int i;
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        List list = null;
        int i2 = -1;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num7 = null;
        String str6 = null;
        Integer num8 = null;
        String str7 = null;
        String str8 = null;
        Long l4 = null;
        String str9 = null;
        Integer num9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Long l5 = null;
        Integer num10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    num6 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("userDisplayName", "userDisplayName", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    continue;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("userLocation", "userLocation", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    continue;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x3 = c29.x("userTitle", "userTitle", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    continue;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    num7 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x4 = c29.x("commentID", "commentID", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    continue;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    num8 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x5 = c29.x("commentBody", "commentBody", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    continue;
                case 11:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        JsonDataException x6 = c29.x("createDate", "createDate", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    continue;
                case 12:
                    l3 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l3 == null) {
                        JsonDataException x7 = c29.x("updateDate", "updateDate", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    continue;
                case 13:
                    num5 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num5 == null) {
                        JsonDataException x8 = c29.x("approveDate", "approveDate", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    continue;
                case 14:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x9 = c29.x("recommendations", "recommendations", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i2 &= -16385;
                    continue;
                case 15:
                    num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x10 = c29.x("replyCount", "replyCount", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i = -32769;
                    break;
                case 16:
                    list = (List) this.listOfCommentResponseAdapter.fromJson(jsonReader);
                    if (list == null) {
                        JsonDataException x11 = c29.x("replies", "replies", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    i = -65537;
                    break;
                case 17:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x12 = c29.x("editorsSelection", "editorsSelection", jsonReader);
                        zq3.g(x12, "unexpectedNull(...)");
                        throw x12;
                    }
                    i = -131073;
                    break;
                case 18:
                    l4 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i = -262145;
                    break;
                case 19:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
                case 20:
                    num9 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i = -1048577;
                    break;
                case 21:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -2097153;
                    break;
                case 22:
                    num3 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num3 == null) {
                        JsonDataException x13 = c29.x("recommendedFlag", "recommendedFlag", jsonReader);
                        zq3.g(x13, "unexpectedNull(...)");
                        throw x13;
                    }
                    i = -4194305;
                    break;
                case 23:
                    num4 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num4 == null) {
                        JsonDataException x14 = c29.x("reportAbuseFlag", "reportAbuseFlag", jsonReader);
                        zq3.g(x14, "unexpectedNull(...)");
                        throw x14;
                    }
                    i = -8388609;
                    break;
                case 24:
                    str11 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -16777217;
                    break;
                case EventType.SUBS /* 25 */:
                    str12 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -33554433;
                    break;
                case EventType.CDN /* 26 */:
                    l5 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i = -67108865;
                    break;
                case 27:
                    num10 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i = -134217729;
                    break;
            }
            i2 &= i;
        }
        jsonReader.h();
        if (i2 == -268420018) {
            if (str2 == null) {
                JsonDataException o = c29.o("userDisplayName", "userDisplayName", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            if (str3 == null) {
                JsonDataException o2 = c29.o("userLocation", "userLocation", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            if (str4 == null) {
                JsonDataException o3 = c29.o("userTitle", "userTitle", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            if (l == null) {
                JsonDataException o4 = c29.o("commentID", "commentID", jsonReader);
                zq3.g(o4, "missingProperty(...)");
                throw o4;
            }
            long longValue = l.longValue();
            if (str8 == null) {
                JsonDataException o5 = c29.o("commentBody", "commentBody", jsonReader);
                zq3.g(o5, "missingProperty(...)");
                throw o5;
            }
            if (l2 == null) {
                JsonDataException o6 = c29.o("createDate", "createDate", jsonReader);
                zq3.g(o6, "missingProperty(...)");
                throw o6;
            }
            long longValue2 = l2.longValue();
            if (l3 == null) {
                JsonDataException o7 = c29.o("updateDate", "updateDate", jsonReader);
                zq3.g(o7, "missingProperty(...)");
                throw o7;
            }
            long longValue3 = l3.longValue();
            if (num5 == null) {
                JsonDataException o8 = c29.o("approveDate", "approveDate", jsonReader);
                zq3.g(o8, "missingProperty(...)");
                throw o8;
            }
            int intValue = num5.intValue();
            int intValue2 = num.intValue();
            int intValue3 = num2.intValue();
            zq3.f(list, "null cannot be cast to non-null type kotlin.collections.List<com.nytimes.android.comments.comments.data.remote.getallcomments.CommentResponse>");
            return new CommentResponse(num6, str2, str3, str4, str5, num7, longValue, str6, num8, str7, str8, longValue2, longValue3, intValue, intValue2, intValue3, list, bool.booleanValue(), l4, str9, num9, str10, num3.intValue(), num4.intValue(), str11, str12, l5, num10);
        }
        Constructor<CommentResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            str = "userDisplayName";
            constructor = CommentResponse.class.getDeclaredConstructor(Integer.class, String.class, String.class, String.class, String.class, Integer.class, cls, String.class, Integer.class, String.class, String.class, cls, cls, cls2, cls2, cls2, List.class, Boolean.TYPE, Long.class, String.class, Integer.class, String.class, cls2, cls2, String.class, String.class, Long.class, Integer.class, cls2, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        } else {
            str = "userDisplayName";
        }
        if (str2 == null) {
            String str13 = str;
            JsonDataException o9 = c29.o(str13, str13, jsonReader);
            zq3.g(o9, "missingProperty(...)");
            throw o9;
        }
        if (str3 == null) {
            JsonDataException o10 = c29.o("userLocation", "userLocation", jsonReader);
            zq3.g(o10, "missingProperty(...)");
            throw o10;
        }
        if (str4 == null) {
            JsonDataException o11 = c29.o("userTitle", "userTitle", jsonReader);
            zq3.g(o11, "missingProperty(...)");
            throw o11;
        }
        if (l == null) {
            JsonDataException o12 = c29.o("commentID", "commentID", jsonReader);
            zq3.g(o12, "missingProperty(...)");
            throw o12;
        }
        if (str8 == null) {
            JsonDataException o13 = c29.o("commentBody", "commentBody", jsonReader);
            zq3.g(o13, "missingProperty(...)");
            throw o13;
        }
        if (l2 == null) {
            JsonDataException o14 = c29.o("createDate", "createDate", jsonReader);
            zq3.g(o14, "missingProperty(...)");
            throw o14;
        }
        if (l3 == null) {
            JsonDataException o15 = c29.o("updateDate", "updateDate", jsonReader);
            zq3.g(o15, "missingProperty(...)");
            throw o15;
        }
        if (num5 == null) {
            JsonDataException o16 = c29.o("approveDate", "approveDate", jsonReader);
            zq3.g(o16, "missingProperty(...)");
            throw o16;
        }
        CommentResponse newInstance = constructor.newInstance(num6, str2, str3, str4, str5, num7, l, str6, num8, str7, str8, l2, l3, num5, num, num2, list, bool, l4, str9, num9, str10, num3, num4, str11, str12, l5, num10, Integer.valueOf(i2), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, CommentResponse commentResponse) {
        zq3.h(hVar, "writer");
        if (commentResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("userID");
        this.nullableIntAdapter.mo197toJson(hVar, commentResponse.getUserID());
        hVar.C("userDisplayName");
        this.stringAdapter.mo197toJson(hVar, commentResponse.getUserDisplayName());
        hVar.C("userLocation");
        this.stringAdapter.mo197toJson(hVar, commentResponse.getUserLocation());
        hVar.C("userTitle");
        this.stringAdapter.mo197toJson(hVar, commentResponse.getUserTitle());
        hVar.C("userURL");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getUserURL());
        hVar.C("trusted");
        this.nullableIntAdapter.mo197toJson(hVar, commentResponse.getTrusted());
        hVar.C("commentID");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(commentResponse.getCommentID()));
        hVar.C("status");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getStatus());
        hVar.C("commentSequence");
        this.nullableIntAdapter.mo197toJson(hVar, commentResponse.getCommentSequence());
        hVar.C("commentTitle");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getCommentTitle());
        hVar.C("commentBody");
        this.stringAdapter.mo197toJson(hVar, commentResponse.getCommentBody());
        hVar.C("createDate");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(commentResponse.getCreateDate()));
        hVar.C("updateDate");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(commentResponse.getUpdateDate()));
        hVar.C("approveDate");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentResponse.getApproveDate()));
        hVar.C("recommendations");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentResponse.getRecommendations()));
        hVar.C("replyCount");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentResponse.getReplyCount()));
        hVar.C("replies");
        this.listOfCommentResponseAdapter.mo197toJson(hVar, commentResponse.getReplies());
        hVar.C("editorsSelection");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(commentResponse.getEditorsSelection()));
        hVar.C("parentID");
        this.nullableLongAdapter.mo197toJson(hVar, commentResponse.getParentID());
        hVar.C("parentUserDisplayName");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getParentUserDisplayName());
        hVar.C("depth");
        this.nullableIntAdapter.mo197toJson(hVar, commentResponse.getDepth());
        hVar.C("commentType");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getCommentType());
        hVar.C("recommendedFlag");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentResponse.getRecommendedFlag()));
        hVar.C("reportAbuseFlag");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(commentResponse.getReportAbuseFlag()));
        hVar.C("permID");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getPermID());
        hVar.C("picURL");
        this.nullableStringAdapter.mo197toJson(hVar, commentResponse.getPicURL());
        hVar.C("timespeople");
        this.nullableLongAdapter.mo197toJson(hVar, commentResponse.getTimespeople());
        hVar.C("sharing");
        this.nullableIntAdapter.mo197toJson(hVar, commentResponse.getSharing());
        hVar.l();
    }
}
