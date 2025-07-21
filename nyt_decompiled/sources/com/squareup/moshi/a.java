package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.c29;
import defpackage.er2;
import defpackage.um8;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
final class a implements JsonAdapter.e {
    private final List a;
    private final List b;

    /* renamed from: com.squareup.moshi.a$a, reason: collision with other inner class name */
    class C0469a extends JsonAdapter {
        final /* synthetic */ f a;
        final /* synthetic */ JsonAdapter b;
        final /* synthetic */ i c;
        final /* synthetic */ f d;
        final /* synthetic */ Set e;
        final /* synthetic */ Type f;

        C0469a(f fVar, JsonAdapter jsonAdapter, i iVar, f fVar2, Set set, Type type2) {
            this.a = fVar;
            this.b = jsonAdapter;
            this.c = iVar;
            this.d = fVar2;
            this.e = set;
            this.f = type2;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            f fVar = this.d;
            if (fVar == null) {
                return this.b.fromJson(jsonReader);
            }
            if (!fVar.g && jsonReader.r() == JsonReader.Token.NULL) {
                jsonReader.l();
                return null;
            }
            try {
                return this.d.b(this.c, jsonReader);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + jsonReader.getPath(), cause);
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            f fVar = this.a;
            if (fVar == null) {
                this.b.mo197toJson(hVar, obj);
                return;
            }
            if (!fVar.g && obj == null) {
                hVar.G();
                return;
            }
            try {
                fVar.e(this.c, hVar, obj);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + hVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.e + "(" + this.f + ")";
        }
    }

    class b extends f {
        b(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type2, set, obj, method, i, i2, z);
        }

        @Override // com.squareup.moshi.a.f
        public void e(i iVar, h hVar, Object obj) {
            d(hVar, obj);
        }
    }

    class c extends f {
        private JsonAdapter h;
        final /* synthetic */ Type[] i;
        final /* synthetic */ Type j;
        final /* synthetic */ Set k;
        final /* synthetic */ Set l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type3, Set set2, Set set3) {
            super(type2, set, obj, method, i, i2, z);
            this.i = typeArr;
            this.j = type3;
            this.k = set2;
            this.l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(i iVar, JsonAdapter.e eVar) {
            super.a(iVar, eVar);
            this.h = (j.d(this.i[0], this.j) && this.k.equals(this.l)) ? iVar.i(eVar, this.j, this.l) : iVar.e(this.j, this.l);
        }

        @Override // com.squareup.moshi.a.f
        public void e(i iVar, h hVar, Object obj) {
            this.h.mo197toJson(hVar, c(obj));
        }
    }

    class d extends f {
        d(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type2, set, obj, method, i, i2, z);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(i iVar, JsonReader jsonReader) {
            return c(jsonReader);
        }
    }

    class e extends f {
        JsonAdapter h;
        final /* synthetic */ Type[] i;
        final /* synthetic */ Type j;
        final /* synthetic */ Set k;
        final /* synthetic */ Set l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type3, Set set2, Set set3) {
            super(type2, set, obj, method, i, i2, z);
            this.i = typeArr;
            this.j = type3;
            this.k = set2;
            this.l = set3;
        }

        @Override // com.squareup.moshi.a.f
        public void a(i iVar, JsonAdapter.e eVar) {
            super.a(iVar, eVar);
            this.h = (j.d(this.i[0], this.j) && this.k.equals(this.l)) ? iVar.i(eVar, this.i[0], this.k) : iVar.e(this.i[0], this.k);
        }

        @Override // com.squareup.moshi.a.f
        public Object b(i iVar, JsonReader jsonReader) {
            return c(this.h.fromJson(jsonReader));
        }
    }

    static abstract class f {
        final Type a;
        final Set b;
        final Object c;
        final Method d;
        final int e;
        final JsonAdapter[] f;
        final boolean g;

        f(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z) {
            this.a = c29.a(type2);
            this.b = set;
            this.c = obj;
            this.d = method;
            this.e = i2;
            this.f = new JsonAdapter[i - i2];
            this.g = z;
        }

        public void a(i iVar, JsonAdapter.e eVar) {
            if (this.f.length > 0) {
                Type[] genericParameterTypes = this.d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.e; i < length; i++) {
                    Type type2 = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set l = c29.l(parameterAnnotations[i]);
                    this.f[i - this.e] = (j.d(this.a, type2) && this.b.equals(l)) ? iVar.i(eVar, type2, l) : iVar.e(type2, l);
                }
            }
        }

        public Object b(i iVar, JsonReader jsonReader) {
            throw new AssertionError();
        }

        protected Object c(Object obj) {
            JsonAdapter[] jsonAdapterArr = this.f;
            Object[] objArr = new Object[jsonAdapterArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) {
            JsonAdapter[] jsonAdapterArr = this.f;
            Object[] objArr = new Object[jsonAdapterArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
            try {
                return this.d.invoke(this.c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(i iVar, h hVar, Object obj) {
            throw new AssertionError();
        }
    }

    a(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    static f a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set k = c29.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == JsonReader.class && genericReturnType != Void.TYPE && d(1, genericParameterTypes)) {
            return new d(genericReturnType, k, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            return new e(genericReturnType, k, obj, method, genericParameterTypes.length, 1, c29.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, c29.l(parameterAnnotations[0]), k);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static f b(List list, Type type2, Set set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f fVar = (f) list.get(i);
            if (j.d(fVar.a, type2) && fVar.b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(um8.class)) {
                    f e2 = e(obj, method);
                    f b2 = b(arrayList, e2.a, e2.b);
                    if (b2 != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + b2.d + "\n    " + e2.d);
                    }
                    arrayList.add(e2);
                }
                if (method.isAnnotationPresent(er2.class)) {
                    f a = a(obj, method);
                    f b3 = b(arrayList2, a.a, a.b);
                    if (b3 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + b3.d + "\n    " + a.d);
                    }
                    arrayList2.add(a);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    private static boolean d(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            Type type2 = typeArr[i];
            if (!(type2 instanceof ParameterizedType) || ((ParameterizedType) type2).getRawType() != JsonAdapter.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    static f e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == h.class && genericReturnType == Void.TYPE && d(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], c29.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            Set k = c29.k(method);
            Set l = c29.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], l, obj, method, genericParameterTypes.length, 1, c29.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l, k);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // com.squareup.moshi.JsonAdapter.e
    public JsonAdapter create(Type type2, Set set, i iVar) {
        f b2 = b(this.a, type2, set);
        f b3 = b(this.b, type2, set);
        JsonAdapter jsonAdapter = null;
        if (b2 == null && b3 == null) {
            return null;
        }
        if (b2 == null || b3 == null) {
            try {
                jsonAdapter = iVar.i(this, type2, set);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("No " + (b2 == null ? "@ToJson" : "@FromJson") + " adapter for " + c29.u(type2, set), e2);
            }
        }
        JsonAdapter jsonAdapter2 = jsonAdapter;
        if (b2 != null) {
            b2.a(iVar, this);
        }
        if (b3 != null) {
            b3.a(iVar, this);
        }
        return new C0469a(b2, jsonAdapter2, iVar, b3, set, type2);
    }
}
