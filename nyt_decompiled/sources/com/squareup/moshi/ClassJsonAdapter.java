package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.bt3;
import defpackage.c29;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes4.dex */
final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.e FACTORY = new a();
    private final com.squareup.moshi.b classFactory;
    private final b[] fieldsArray;
    private final JsonReader.b options;

    class a implements JsonAdapter.e {
        a() {
        }

        private void a(i iVar, Type type2, Map map) {
            bt3 bt3Var;
            Class g = j.g(type2);
            boolean j = c29.j(g);
            for (Field field : g.getDeclaredFields()) {
                if (b(j, field.getModifiers()) && ((bt3Var = (bt3) field.getAnnotation(bt3.class)) == null || !bt3Var.ignore())) {
                    Type q = c29.q(type2, g, field.getGenericType());
                    Set k = c29.k(field);
                    String name = field.getName();
                    JsonAdapter f = iVar.f(q, k, name);
                    field.setAccessible(true);
                    String m = c29.m(name, bt3Var);
                    b bVar = new b(m, field, f);
                    b bVar2 = (b) map.put(m, bVar);
                    if (bVar2 != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVar2.b + "\n    " + bVar.b);
                    }
                }
            }
        }

        private boolean b(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }

        private void c(Type type2, Class cls) {
            Class<?> g = j.g(type2);
            if (cls.isAssignableFrom(g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type2 + ", you should probably use " + cls.getSimpleName() + " instead of " + g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                return null;
            }
            Class g = j.g(type2);
            if (g.isInterface() || g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (c29.j(g)) {
                c(type2, List.class);
                c(type2, Set.class);
                c(type2, Map.class);
                c(type2, Collection.class);
                String str = "Platform " + g;
                if (type2 instanceof ParameterizedType) {
                    str = str + " in " + type2;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g.getName());
            }
            if (g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g.getName());
            }
            if (g.getEnclosingClass() != null && !Modifier.isStatic(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g.getName());
            }
            if (Modifier.isAbstract(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g.getName());
            }
            if (c29.i(g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            com.squareup.moshi.b a = com.squareup.moshi.b.a(g);
            TreeMap treeMap = new TreeMap();
            while (type2 != Object.class) {
                a(iVar, type2, treeMap);
                type2 = j.f(type2);
            }
            return new ClassJsonAdapter(a, treeMap).nullSafe();
        }
    }

    static class b {
        final String a;
        final Field b;
        final JsonAdapter c;

        b(String str, Field field, JsonAdapter jsonAdapter) {
            this.a = str;
            this.b = field;
            this.c = jsonAdapter;
        }

        void a(JsonReader jsonReader, Object obj) {
            this.b.set(obj, this.c.fromJson(jsonReader));
        }

        void b(h hVar, Object obj) {
            this.c.mo197toJson(hVar, this.b.get(obj));
        }
    }

    ClassJsonAdapter(com.squareup.moshi.b bVar, Map<String, b> map) {
        this.classFactory = bVar;
        this.fieldsArray = (b[]) map.values().toArray(new b[map.size()]);
        this.options = JsonReader.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader) {
        try {
            Object b2 = this.classFactory.b();
            try {
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    int P = jsonReader.P(this.options);
                    if (P == -1) {
                        jsonReader.f0();
                        jsonReader.skipValue();
                    } else {
                        this.fieldsArray[P].a(jsonReader, b2);
                    }
                }
                jsonReader.h();
                return b2;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw c29.t(e2);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo197toJson(h hVar, Object obj) {
        try {
            hVar.d();
            for (b bVar : this.fieldsArray) {
                hVar.C(bVar.a);
                bVar.b(hVar, obj);
            }
            hVar.l();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.classFactory + ")";
    }
}
