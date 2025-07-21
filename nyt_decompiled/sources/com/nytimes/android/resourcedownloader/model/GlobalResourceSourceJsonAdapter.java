package com.nytimes.android.resourcedownloader.model;

import com.nytimes.android.resourcedownloader.model.GlobalResourceSource;
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
public final class GlobalResourceSourceJsonAdapter extends JsonAdapter<GlobalResourceSource> {
    private volatile Constructor<GlobalResourceSource> constructorRef;
    private final JsonAdapter<GlobalResourceSource.Global> globalAdapter;
    private final JsonReader.b options;

    public GlobalResourceSourceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("globalSource");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<GlobalResourceSource.Global> f = iVar.f(GlobalResourceSource.Global.class, b0.e(), "globalSource");
        zq3.g(f, "adapter(...)");
        this.globalAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GlobalResourceSource");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GlobalResourceSource fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        GlobalResourceSource.Global global = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                global = (GlobalResourceSource.Global) this.globalAdapter.fromJson(jsonReader);
                if (global == null) {
                    JsonDataException x = c29.x("globalSource", "globalSource", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -2) {
            zq3.f(global, "null cannot be cast to non-null type com.nytimes.android.resourcedownloader.model.GlobalResourceSource.Global");
            return new GlobalResourceSource(global);
        }
        Constructor<GlobalResourceSource> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GlobalResourceSource.class.getDeclaredConstructor(GlobalResourceSource.Global.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        GlobalResourceSource newInstance = constructor.newInstance(global, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GlobalResourceSource globalResourceSource) {
        zq3.h(hVar, "writer");
        if (globalResourceSource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("globalSource");
        this.globalAdapter.mo197toJson(hVar, globalResourceSource.getGlobalSource());
        hVar.l();
    }
}
