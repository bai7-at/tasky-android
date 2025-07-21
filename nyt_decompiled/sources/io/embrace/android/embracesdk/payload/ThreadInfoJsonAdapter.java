package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.Thread;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class ThreadInfoJsonAdapter extends JsonAdapter<ThreadInfo> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Thread.State> nullableStateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public ThreadInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("threadId", TransferTable.COLUMN_STATE, QueryKeys.IS_NEW_USER, "p", "tt");
        zq3.g(a, "JsonReader.Options.of(\"t…e\", \"n\", \"p\",\n      \"tt\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "threadId");
        zq3.g(f, "moshi.adapter(Long::clas…ySet(),\n      \"threadId\")");
        this.longAdapter = f;
        JsonAdapter<Thread.State> f2 = iVar.f(Thread.State.class, b0.e(), TransferTable.COLUMN_STATE);
        zq3.g(f2, "moshi.adapter(Thread.Sta…ava, emptySet(), \"state\")");
        this.nullableStateAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f3, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.TYPE, b0.e(), "priority");
        zq3.g(f4, "moshi.adapter(Int::class…, emptySet(), \"priority\")");
        this.intAdapter = f4;
        JsonAdapter<List<String>> f5 = iVar.f(j.j(List.class, String.class), b0.e(), "lines");
        zq3.g(f5, "moshi.adapter(Types.newP…mptySet(),\n      \"lines\")");
        this.nullableListOfStringAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ThreadInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public ThreadInfo fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Integer num = null;
        Thread.State state = null;
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("threadId", "threadId", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"thr…      \"threadId\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                state = (Thread.State) this.nullableStateAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("priority", "p", jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"pri… \"p\",\n            reader)");
                    throw x2;
                }
            } else if (P == 4) {
                list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (l == null) {
            JsonDataException o = c29.o("threadId", "threadId", jsonReader);
            zq3.g(o, "Util.missingProperty(\"th…dId\", \"threadId\", reader)");
            throw o;
        }
        long longValue = l.longValue();
        if (num != null) {
            return new ThreadInfo(longValue, state, str, num.intValue(), list);
        }
        JsonDataException o2 = c29.o("priority", "p", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"priority\", \"p\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ThreadInfo threadInfo) {
        zq3.h(hVar, "writer");
        if (threadInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("threadId");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(threadInfo.getThreadId()));
        hVar.C(TransferTable.COLUMN_STATE);
        this.nullableStateAdapter.mo197toJson(hVar, threadInfo.getState());
        hVar.C(QueryKeys.IS_NEW_USER);
        this.nullableStringAdapter.mo197toJson(hVar, threadInfo.getName());
        hVar.C("p");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(threadInfo.getPriority()));
        hVar.C("tt");
        this.nullableListOfStringAdapter.mo197toJson(hVar, threadInfo.getLines());
        hVar.l();
    }
}
