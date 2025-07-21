package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class bl0 implements vu3, al0 {
    public static final a b = new a(null);
    private static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private static final HashMap f;
    private static final Map g;
    private final Class a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class cls) {
            String str;
            zq3.h(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) bl0.f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) bl0.f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r1 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(java.lang.Class r6) {
            /*
                r5 = this;
                java.lang.String r5 = "jClass"
                defpackage.zq3.h(r6, r5)
                boolean r5 = r6.isAnonymousClass()
                r0 = 0
                if (r5 == 0) goto Le
                goto Lb3
            Le:
                boolean r5 = r6.isLocalClass()
                if (r5 == 0) goto L6a
                java.lang.String r5 = r6.getSimpleName()
                java.lang.reflect.Method r1 = r6.getEnclosingMethod()
                r2 = 2
                r3 = 36
                if (r1 == 0) goto L41
                defpackage.zq3.e(r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = r1.getName()
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                java.lang.String r1 = kotlin.text.h.Q0(r5, r1, r0, r2, r0)
                if (r1 != 0) goto L3e
                goto L41
            L3e:
                r0 = r1
                goto Lb3
            L41:
                java.lang.reflect.Constructor r6 = r6.getEnclosingConstructor()
                if (r6 == 0) goto L62
                defpackage.zq3.e(r5)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                r1.append(r3)
                java.lang.String r6 = r1.toString()
                java.lang.String r0 = kotlin.text.h.Q0(r5, r6, r0, r2, r0)
                goto Lb3
            L62:
                defpackage.zq3.e(r5)
                java.lang.String r0 = kotlin.text.h.P0(r5, r3, r0, r2, r0)
                goto Lb3
            L6a:
                boolean r5 = r6.isArray()
                if (r5 == 0) goto L9e
                java.lang.Class r5 = r6.getComponentType()
                boolean r6 = r5.isPrimitive()
                java.lang.String r1 = "Array"
                if (r6 == 0) goto L9b
                java.util.Map r6 = defpackage.bl0.h()
                java.lang.String r5 = r5.getName()
                java.lang.Object r5 = r6.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                if (r5 == 0) goto L9b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r1)
                java.lang.String r0 = r6.toString()
            L9b:
                if (r0 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r5 = defpackage.bl0.h()
                java.lang.String r0 = r6.getName()
                java.lang.Object r5 = r5.get(r0)
                r0 = r5
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto Lb3
                java.lang.String r0 = r6.getSimpleName()
            Lb3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bl0.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class cls) {
            zq3.h(cls, "jClass");
            Map map = bl0.c;
            zq3.f(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return ku8.m(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = ou3.b(ou3.c(cls));
            }
            return cls.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List o = i.o(qs2.class, ss2.class, gt2.class, it2.class, kt2.class, mt2.class, nt2.class, ot2.class, pt2.class, qt2.class, rs2.class, ts2.class, us2.class, vs2.class, ws2.class, xs2.class, ys2.class, zs2.class, at2.class, bt2.class, dt2.class, et2.class, ft2.class);
        ArrayList arrayList = new ArrayList(i.w(o, 10));
        int i = 0;
        for (Object obj : o) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            arrayList.add(du8.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = t.t(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        zq3.g(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            zq3.e(str);
            sb.append(h.T0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Pair a2 = du8.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry entry : c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), h.T0((String) entry2.getValue(), '.', null, 2, null));
        }
        g = linkedHashMap;
    }

    public bl0(Class cls) {
        zq3.h(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.al0
    public Class a() {
        return this.a;
    }

    @Override // defpackage.vu3
    public boolean b(Object obj) {
        return b.c(obj, a());
    }

    @Override // defpackage.vu3
    public String c() {
        return b.a(a());
    }

    @Override // defpackage.vu3
    public String d() {
        return b.b(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof bl0) && zq3.c(ou3.b(this), ou3.b((vu3) obj));
    }

    public int hashCode() {
        return ou3.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
