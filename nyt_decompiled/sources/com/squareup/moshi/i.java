package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import defpackage.c29;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class i {
    static final List e;
    private final List a;
    private final int b;
    private final ThreadLocal c = new ThreadLocal();
    private final Map d = new LinkedHashMap();

    class a implements JsonAdapter.e {
        final /* synthetic */ Type a;
        final /* synthetic */ JsonAdapter b;

        a(Type type2, JsonAdapter jsonAdapter) {
            this.a = type2;
            this.b = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            if (set.isEmpty() && c29.w(this.a, type2)) {
                return this.b;
            }
            return null;
        }
    }

    public static final class b {
        final List a = new ArrayList();
        int b = 0;

        public b a(JsonAdapter.e eVar) {
            if (eVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            list.add(i, eVar);
            return this;
        }

        public b b(Object obj) {
            if (obj != null) {
                return a(com.squareup.moshi.a.c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public b c(Type type2, JsonAdapter jsonAdapter) {
            return a(i.h(type2, jsonAdapter));
        }

        public i d() {
            return new i(this);
        }
    }

    static final class c extends JsonAdapter {
        final Type a;
        final String b;
        final Object c;
        JsonAdapter d;

        c(Type type2, String str, Object obj) {
            this.a = type2;
            this.b = str;
            this.c = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            JsonAdapter jsonAdapter = this.d;
            if (jsonAdapter != null) {
                return jsonAdapter.fromJson(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            JsonAdapter jsonAdapter = this.d;
            if (jsonAdapter == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            jsonAdapter.mo197toJson(hVar, obj);
        }

        public String toString() {
            JsonAdapter jsonAdapter = this.d;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }

    final class d {
        final List a = new ArrayList();
        final Deque b = new ArrayDeque();
        boolean c;

        d() {
        }

        void a(JsonAdapter jsonAdapter) {
            ((c) this.b.getLast()).d = jsonAdapter;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.c) {
                return illegalArgumentException;
            }
            this.c = true;
            if (this.b.size() == 1 && ((c) this.b.getFirst()).b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator descendingIterator = this.b.descendingIterator();
            while (descendingIterator.hasNext()) {
                c cVar = (c) descendingIterator.next();
                sb.append("\nfor ");
                sb.append(cVar.a);
                if (cVar.b != null) {
                    sb.append(' ');
                    sb.append(cVar.b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        void c(boolean z) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                i.this.c.remove();
                if (z) {
                    synchronized (i.this.d) {
                        try {
                            int size = this.a.size();
                            for (int i = 0; i < size; i++) {
                                c cVar = (c) this.a.get(i);
                                JsonAdapter jsonAdapter = (JsonAdapter) i.this.d.put(cVar.c, cVar.d);
                                if (jsonAdapter != null) {
                                    cVar.d = jsonAdapter;
                                    i.this.d.put(cVar.c, jsonAdapter);
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }

        JsonAdapter d(Type type2, String str, Object obj) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                c cVar = (c) this.a.get(i);
                if (cVar.c.equals(obj)) {
                    this.b.add(cVar);
                    JsonAdapter jsonAdapter = cVar.d;
                    return jsonAdapter != null ? jsonAdapter : cVar;
                }
            }
            c cVar2 = new c(type2, str, obj);
            this.a.add(cVar2);
            this.b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(StandardJsonAdapters.a);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    i(b bVar) {
        int size = bVar.a.size();
        List list = e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.a);
        arrayList.addAll(list);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = bVar.b;
    }

    private Object g(Type type2, Set set) {
        return set.isEmpty() ? type2 : Arrays.asList(type2, set);
    }

    static JsonAdapter.e h(Type type2, JsonAdapter jsonAdapter) {
        if (type2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (jsonAdapter != null) {
            return new a(type2, jsonAdapter);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    public JsonAdapter c(Class cls) {
        return e(cls, c29.a);
    }

    public JsonAdapter d(Type type2) {
        return e(type2, c29.a);
    }

    public JsonAdapter e(Type type2, Set set) {
        return f(type2, set, null);
    }

    public JsonAdapter f(Type type2, Set set, String str) {
        if (type2 == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type p = c29.p(c29.a(type2));
        Object g = g(p, set);
        synchronized (this.d) {
            try {
                JsonAdapter jsonAdapter = (JsonAdapter) this.d.get(g);
                if (jsonAdapter != null) {
                    return jsonAdapter;
                }
                d dVar = (d) this.c.get();
                if (dVar == null) {
                    dVar = new d();
                    this.c.set(dVar);
                }
                JsonAdapter d2 = dVar.d(p, str, g);
                try {
                    if (d2 != null) {
                        return d2;
                    }
                    try {
                        int size = this.a.size();
                        for (int i = 0; i < size; i++) {
                            JsonAdapter create = ((JsonAdapter.e) this.a.get(i)).create(p, set, this);
                            if (create != null) {
                                dVar.a(create);
                                dVar.c(true);
                                return create;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + c29.u(p, set));
                    } catch (IllegalArgumentException e2) {
                        throw dVar.b(e2);
                    }
                } finally {
                    dVar.c(false);
                }
            } finally {
            }
        }
    }

    public JsonAdapter i(JsonAdapter.e eVar, Type type2, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type p = c29.p(c29.a(type2));
        int indexOf = this.a.indexOf(eVar);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        int size = this.a.size();
        for (int i = indexOf + 1; i < size; i++) {
            JsonAdapter create = ((JsonAdapter.e) this.a.get(i)).create(p, set, this);
            if (create != null) {
                return create;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + c29.u(p, set));
    }
}
