package com.nytimes.android.hybrid.bridge;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.i;
import defpackage.et3;
import defpackage.zq3;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class JavascriptEventParameter {
    public static final b Companion = new b(null);
    private static final JsonAdapter.e d;
    private static final JsonAdapter e;
    private final int a;
    private final String b;
    private final Map c;

    public static final class a implements JsonAdapter.e {

        /* renamed from: com.nytimes.android.hybrid.bridge.JavascriptEventParameter$a$a, reason: collision with other inner class name */
        public static final class C0330a extends JsonAdapter {
            final /* synthetic */ JsonAdapter a;

            C0330a(JsonAdapter jsonAdapter) {
                this.a = jsonAdapter;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(JsonReader jsonReader) {
                zq3.h(jsonReader, "reader");
                if (jsonReader.r() != JsonReader.Token.NUMBER) {
                    return this.a.fromJson(jsonReader);
                }
                String nextString = jsonReader.nextString();
                zq3.e(nextString);
                Long n = h.n(nextString);
                return n == null ? h.i(nextString) : n;
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo197toJson(com.squareup.moshi.h hVar, Object obj) {
                zq3.h(hVar, "writer");
                this.a.mo197toJson(hVar, obj);
            }
        }

        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            zq3.h(type2, TransferTable.COLUMN_TYPE);
            zq3.h(set, "annotations");
            zq3.h(iVar, "moshi");
            if (type2 != Object.class) {
                return null;
            }
            JsonAdapter i = iVar.i(this, Object.class, set);
            zq3.g(i, "nextAdapter(...)");
            return new C0330a(i);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavascriptEventParameter a(String str) {
            zq3.h(str, "json");
            return (JavascriptEventParameter) JavascriptEventParameter.e.fromJson(str);
        }

        public final String b(JavascriptEventParameter javascriptEventParameter) {
            zq3.h(javascriptEventParameter, "eventParameter");
            String json = JavascriptEventParameter.e.toJson(javascriptEventParameter);
            zq3.g(json, "toJson(...)");
            return json;
        }

        private b() {
        }
    }

    static {
        a aVar = new a();
        d = aVar;
        i d2 = new i.b().a(aVar).d();
        zq3.g(d2, "build(...)");
        JsonAdapter c = d2.c(JavascriptEventParameter.class);
        zq3.g(c, "adapter(...)");
        e = c;
    }

    public JavascriptEventParameter(int i, String str, Map map) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.a = i;
        this.b = str;
        this.c = map;
    }

    public final int b() {
        return this.a;
    }

    public final Map c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavascriptEventParameter)) {
            return false;
        }
        JavascriptEventParameter javascriptEventParameter = (JavascriptEventParameter) obj;
        return this.a == javascriptEventParameter.a && zq3.c(this.b, javascriptEventParameter.b) && zq3.c(this.c, javascriptEventParameter.c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "JavascriptEventParameter(id=" + this.a + ", type=" + this.b + ", options=" + this.c + ")";
    }

    public /* synthetic */ JavascriptEventParameter(int i, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : map);
    }
}
