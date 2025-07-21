package io.embrace.android.embracesdk.anr.ndk;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.ndk.NativeAnrOtelMapper;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeAnrOtelMapper_NativeAnrSampleFrameJsonAdapter extends JsonAdapter<NativeAnrOtelMapper.NativeAnrSampleFrame> {
    private volatile Constructor<NativeAnrOtelMapper.NativeAnrSampleFrame> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NativeAnrOtelMapper_NativeAnrSampleFrameJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("program_counter", "so_load_addr", "so_name", "result");
        zq3.g(a, "JsonReader.Options.of(\"p…     \"so_name\", \"result\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "programCounter");
        zq3.g(f, "moshi.adapter(String::cl…ySet(), \"programCounter\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "result");
        zq3.g(f2, "moshi.adapter(Int::class…    emptySet(), \"result\")");
        this.nullableIntAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeAnrOtelMapper.NativeAnrSampleFrame");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeAnrOtelMapper.NativeAnrSampleFrame fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
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
                } else if (P == 2) {
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            return new NativeAnrOtelMapper.NativeAnrSampleFrame(str, str2, str3, num);
        }
        Constructor<NativeAnrOtelMapper.NativeAnrSampleFrame> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NativeAnrOtelMapper.NativeAnrSampleFrame.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NativeAnrOtelMapper.Nati…his.constructorRef = it }");
        }
        NativeAnrOtelMapper.NativeAnrSampleFrame newInstance = constructor.newInstance(str, str2, str3, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeAnrOtelMapper.NativeAnrSampleFrame nativeAnrSampleFrame) {
        zq3.h(hVar, "writer");
        if (nativeAnrSampleFrame == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("program_counter");
        this.nullableStringAdapter.mo197toJson(hVar, nativeAnrSampleFrame.getProgramCounter());
        hVar.C("so_load_addr");
        this.nullableStringAdapter.mo197toJson(hVar, nativeAnrSampleFrame.getSoLoadAddr());
        hVar.C("so_name");
        this.nullableStringAdapter.mo197toJson(hVar, nativeAnrSampleFrame.getSoName());
        hVar.C("result");
        this.nullableIntAdapter.mo197toJson(hVar, nativeAnrSampleFrame.getResult());
        hVar.l();
    }
}
