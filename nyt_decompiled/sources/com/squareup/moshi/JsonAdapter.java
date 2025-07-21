package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import defpackage.ad0;
import defpackage.qd0;
import defpackage.sd0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class JsonAdapter<T> {

    class a extends JsonAdapter {
        final /* synthetic */ JsonAdapter a;

        a(JsonAdapter jsonAdapter) {
            this.a = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            return this.a.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            boolean r = hVar.r();
            hVar.t0(true);
            try {
                this.a.mo197toJson(hVar, obj);
            } finally {
                hVar.t0(r);
            }
        }

        public String toString() {
            return this.a + ".serializeNulls()";
        }
    }

    class b extends JsonAdapter {
        final /* synthetic */ JsonAdapter a;

        b(JsonAdapter jsonAdapter) {
            this.a = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            boolean j = jsonReader.j();
            jsonReader.e0(true);
            try {
                return this.a.fromJson(jsonReader);
            } finally {
                jsonReader.e0(j);
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            boolean s = hVar.s();
            hVar.m0(true);
            try {
                this.a.mo197toJson(hVar, obj);
            } finally {
                hVar.m0(s);
            }
        }

        public String toString() {
            return this.a + ".lenient()";
        }
    }

    class c extends JsonAdapter {
        final /* synthetic */ JsonAdapter a;

        c(JsonAdapter jsonAdapter) {
            this.a = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            boolean i = jsonReader.i();
            jsonReader.c0(true);
            try {
                return this.a.fromJson(jsonReader);
            } finally {
                jsonReader.c0(i);
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            this.a.mo197toJson(hVar, obj);
        }

        public String toString() {
            return this.a + ".failOnUnknown()";
        }
    }

    class d extends JsonAdapter {
        final /* synthetic */ JsonAdapter a;
        final /* synthetic */ String b;

        d(JsonAdapter jsonAdapter, String str) {
            this.a = jsonAdapter;
            this.b = str;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            return this.a.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        boolean isLenient() {
            return this.a.isLenient();
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            String m = hVar.m();
            hVar.f0(this.b);
            try {
                this.a.mo197toJson(hVar, obj);
            } finally {
                hVar.f0(m);
            }
        }

        public String toString() {
            return this.a + ".indent(\"" + this.b + "\")";
        }
    }

    public interface e {
        JsonAdapter create(Type type2, Set set, i iVar);
    }

    public final JsonAdapter<T> failOnUnknown() {
        return new c(this);
    }

    public abstract Object fromJson(JsonReader jsonReader);

    public final T fromJson(sd0 sd0Var) throws IOException {
        return (T) fromJson(JsonReader.m(sd0Var));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return (T) fromJson(new f(obj));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public JsonAdapter<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final JsonAdapter<T> lenient() {
        return new b(this);
    }

    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> serializeNulls() {
        return new a(this);
    }

    /* renamed from: toJson */
    public abstract void mo197toJson(h hVar, Object obj);

    public final void toJson(qd0 qd0Var, T t) throws IOException {
        mo197toJson(h.L(qd0Var), t);
    }

    public final Object toJsonValue(T t) {
        g gVar = new g();
        try {
            mo197toJson(gVar, t);
            return gVar.u1();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final T fromJson(String str) throws IOException {
        JsonReader m = JsonReader.m(new ad0().V(str));
        T t = (T) fromJson(m);
        if (isLenient() || m.r() == JsonReader.Token.END_DOCUMENT) {
            return t;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        ad0 ad0Var = new ad0();
        try {
            toJson((qd0) ad0Var, (ad0) t);
            return ad0Var.i1();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
