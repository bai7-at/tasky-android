package defpackage;

import com.apollographql.apollo.api.json.JsonReader;

/* loaded from: classes2.dex */
public abstract class j8 {
    public static final h8 a;
    public static final h8 b;
    public static final h8 c;
    public static final h8 d;
    public static final h8 e;
    public static final h8 f;
    public static final h8 g;
    public static final h8 h;
    public static final ya5 i;
    public static final ya5 j;
    public static final ya5 k;
    public static final ya5 l;
    public static final ya5 m;
    public static final wj n;
    public static final wj o;
    public static final wj p;
    public static final wj q;
    public static final wj r;

    public static final class a implements h8 {
        a() {
        }

        public final Object a(JsonReader jsonReader) {
            zq3.h(jsonReader, "reader");
            Object d = com.apollographql.apollo.api.json.a.d(jsonReader);
            zq3.e(d);
            return d;
        }

        public final void b(lu3 lu3Var, Object obj) {
            zq3.h(lu3Var, "writer");
            zq3.h(obj, "value");
            k.a(lu3Var, obj);
        }

        @Override // defpackage.h8
        public Object fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return a(jsonReader);
        }

        @Override // defpackage.h8
        public void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            zq3.h(obj, "value");
            b(lu3Var, obj);
        }
    }

    public static final class b implements h8 {
        b() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        public void b(lu3 lu3Var, w41 w41Var, boolean z) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            lu3Var.value(z);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            b(lu3Var, w41Var, ((Boolean) obj).booleanValue());
        }
    }

    public static final class c implements h8 {
        c() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return Double.valueOf(jsonReader.nextDouble());
        }

        public void b(lu3 lu3Var, w41 w41Var, double d) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            lu3Var.value(d);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            b(lu3Var, w41Var, ((Number) obj).doubleValue());
        }
    }

    public static final class d implements h8 {
        d() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        public void b(lu3 lu3Var, w41 w41Var, float f) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            lu3Var.value(f);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            b(lu3Var, w41Var, ((Number) obj).floatValue());
        }
    }

    public static final class e implements h8 {
        e() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return Integer.valueOf(jsonReader.nextInt());
        }

        public void b(lu3 lu3Var, w41 w41Var, int i) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            lu3Var.D(i);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            b(lu3Var, w41Var, ((Number) obj).intValue());
        }
    }

    public static final class f implements h8 {
        f() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            return Long.valueOf(jsonReader.nextLong());
        }

        public void b(lu3 lu3Var, w41 w41Var, long j) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            lu3Var.value(j);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            b(lu3Var, w41Var, ((Number) obj).longValue());
        }
    }

    public static final class g implements h8 {
        g() {
        }

        @Override // defpackage.h8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            String nextString = jsonReader.nextString();
            zq3.e(nextString);
            return nextString;
        }

        @Override // defpackage.h8
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(lu3 lu3Var, w41 w41Var, String str) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            zq3.h(str, "value");
            lu3Var.value(str);
        }
    }

    public static final class h implements h8 {
        h() {
        }

        public ay8 a(JsonReader jsonReader, w41 w41Var) {
            zq3.h(jsonReader, "reader");
            zq3.h(w41Var, "customScalarAdapters");
            throw new IllegalStateException("File Upload used in output position");
        }

        public void b(lu3 lu3Var, w41 w41Var, ay8 ay8Var) {
            zq3.h(lu3Var, "writer");
            zq3.h(w41Var, "customScalarAdapters");
            zq3.h(ay8Var, "value");
            lu3Var.A(ay8Var);
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, w41 w41Var) {
            a(jsonReader, w41Var);
            return null;
        }

        @Override // defpackage.h8
        public /* bridge */ /* synthetic */ void toJson(lu3 lu3Var, w41 w41Var, Object obj) {
            lh4.a(obj);
            b(lu3Var, w41Var, null);
        }
    }

    static {
        g gVar = new g();
        a = gVar;
        e eVar = new e();
        b = eVar;
        c cVar = new c();
        c = cVar;
        d = new d();
        e = new f();
        b bVar = new b();
        f = bVar;
        a aVar = new a();
        g = aVar;
        h = new h();
        i = b(gVar);
        j = b(cVar);
        k = b(eVar);
        l = b(bVar);
        m = b(aVar);
        n = new wj(gVar);
        o = new wj(cVar);
        p = new wj(eVar);
        q = new wj(bVar);
        r = new wj(aVar);
    }

    public static final s54 a(h8 h8Var) {
        zq3.h(h8Var, "<this>");
        return new s54(h8Var);
    }

    public static final ya5 b(h8 h8Var) {
        zq3.h(h8Var, "<this>");
        return new ya5(h8Var);
    }

    public static final ub5 c(h8 h8Var, boolean z) {
        zq3.h(h8Var, "<this>");
        return new ub5(h8Var, z);
    }

    public static /* synthetic */ ub5 d(h8 h8Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return c(h8Var, z);
    }

    public static final a26 e(h8 h8Var) {
        zq3.h(h8Var, "<this>");
        return new a26(h8Var);
    }
}
