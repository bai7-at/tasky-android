package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class j {
    public static final l c = new l(null);
    public static final j d = new f();
    public static final j e = new i();
    public static final j f = new e();
    public static final j g = new h();
    public static final j h = new g();
    public static final j i = new d();
    public static final j j = new c();
    public static final j k = new b();
    public static final j l = new a();
    public static final j m = new k();
    public static final j n = new C0099j();
    private final boolean a;
    private final String b = "nav_type";

    public static final class a extends j {
        a() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "boolean[]";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] j(String str) {
            zq3.h(str, "value");
            return new boolean[]{((Boolean) j.k.j(str)).booleanValue()};
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] g(String str, boolean[] zArr) {
            boolean[] D;
            zq3.h(str, "value");
            return (zArr == null || (D = kotlin.collections.d.D(zArr, f(str))) == null) ? f(str) : D;
        }

        @Override // androidx.navigation.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, boolean[] zArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class b extends j {
        b() {
            super(false);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "boolean";
        }

        @Override // androidx.navigation.j
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean j(String str) {
            boolean z;
            zq3.h(str, "value");
            if (zq3.c(str, "true")) {
                z = true;
            } else {
                if (!zq3.c(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public void k(Bundle bundle, String str, boolean z) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putBoolean(str, z);
        }
    }

    public static final class c extends j {
        c() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "float[]";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] j(String str) {
            zq3.h(str, "value");
            return new float[]{((Number) j.i.j(str)).floatValue()};
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] g(String str, float[] fArr) {
            float[] x;
            zq3.h(str, "value");
            return (fArr == null || (x = kotlin.collections.d.x(fArr, f(str))) == null) ? f(str) : x;
        }

        @Override // androidx.navigation.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, float[] fArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putFloatArray(str, fArr);
        }
    }

    public static final class d extends j {
        d() {
            super(false);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "float";
        }

        @Override // androidx.navigation.j
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).floatValue());
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float j(String str) {
            zq3.h(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void k(Bundle bundle, String str, float f) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putFloat(str, f);
        }
    }

    public static final class e extends j {
        e() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "integer[]";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] j(String str) {
            zq3.h(str, "value");
            return new int[]{((Number) j.d.j(str)).intValue()};
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] g(String str, int[] iArr) {
            int[] z;
            zq3.h(str, "value");
            return (iArr == null || (z = kotlin.collections.d.z(iArr, f(str))) == null) ? f(str) : z;
        }

        @Override // androidx.navigation.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, int[] iArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putIntArray(str, iArr);
        }
    }

    public static final class f extends j {
        f() {
            super(false);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "integer";
        }

        @Override // androidx.navigation.j
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer j(String str) {
            int parseInt;
            zq3.h(str, "value");
            if (kotlin.text.h.K(str, "0x", false, 2, null)) {
                String substring = str.substring(2);
                zq3.g(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, kotlin.text.a.a(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void k(Bundle bundle, String str, int i) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putInt(str, i);
        }
    }

    public static final class g extends j {
        g() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "long[]";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] j(String str) {
            zq3.h(str, "value");
            return new long[]{((Number) j.g.j(str)).longValue()};
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] g(String str, long[] jArr) {
            long[] A;
            zq3.h(str, "value");
            return (jArr == null || (A = kotlin.collections.d.A(jArr, f(str))) == null) ? f(str) : A;
        }

        @Override // androidx.navigation.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, long[] jArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putLongArray(str, jArr);
        }
    }

    public static final class h extends j {
        h() {
            super(false);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "long";
        }

        @Override // androidx.navigation.j
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).longValue());
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long j(String str) {
            String str2;
            long parseLong;
            zq3.h(str, "value");
            if (kotlin.text.h.v(str, "L", false, 2, null)) {
                str2 = str.substring(0, str.length() - 1);
                zq3.g(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (kotlin.text.h.K(str, "0x", false, 2, null)) {
                String substring = str2.substring(2);
                zq3.g(substring, "this as java.lang.String).substring(startIndex)");
                parseLong = Long.parseLong(substring, kotlin.text.a.a(16));
            } else {
                parseLong = Long.parseLong(str2);
            }
            return Long.valueOf(parseLong);
        }

        public void k(Bundle bundle, String str, long j) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putLong(str, j);
        }
    }

    public static final class i extends j {
        i() {
            super(false);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "reference";
        }

        @Override // androidx.navigation.j
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer j(String str) {
            int parseInt;
            zq3.h(str, "value");
            if (kotlin.text.h.K(str, "0x", false, 2, null)) {
                String substring = str.substring(2);
                zq3.g(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, kotlin.text.a.a(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void k(Bundle bundle, String str, int i) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putInt(str, i);
        }
    }

    /* renamed from: androidx.navigation.j$j, reason: collision with other inner class name */
    public static final class C0099j extends j {
        C0099j() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "string[]";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] j(String str) {
            zq3.h(str, "value");
            return new String[]{str};
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] g(String str, String[] strArr) {
            String[] strArr2;
            zq3.h(str, "value");
            return (strArr == null || (strArr2 = (String[]) kotlin.collections.d.C(strArr, f(str))) == null) ? f(str) : strArr2;
        }

        @Override // androidx.navigation.j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, String[] strArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putStringArray(str, strArr);
        }
    }

    public static final class k extends j {
        k() {
            super(true);
        }

        @Override // androidx.navigation.j
        public String b() {
            return "string";
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String j(String str) {
            zq3.h(str, "value");
            if (zq3.c(str, Constants.NULL_VERSION_ID)) {
                return null;
            }
            return str;
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, String str2) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            bundle.putString(str, str2);
        }
    }

    public static final class l {
        public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Object obj) {
            if (obj instanceof Integer) {
                j jVar = j.d;
                zq3.f(jVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar;
            }
            if (obj instanceof int[]) {
                j jVar2 = j.f;
                zq3.f(jVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar2;
            }
            if (obj instanceof Long) {
                j jVar3 = j.g;
                zq3.f(jVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar3;
            }
            if (obj instanceof long[]) {
                j jVar4 = j.h;
                zq3.f(jVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar4;
            }
            if (obj instanceof Float) {
                j jVar5 = j.i;
                zq3.f(jVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar5;
            }
            if (obj instanceof float[]) {
                j jVar6 = j.j;
                zq3.f(jVar6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar6;
            }
            if (obj instanceof Boolean) {
                j jVar7 = j.k;
                zq3.f(jVar7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar7;
            }
            if (obj instanceof boolean[]) {
                j jVar8 = j.l;
                zq3.f(jVar8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar8;
            }
            if ((obj instanceof String) || obj == null) {
                j jVar9 = j.m;
                zq3.f(jVar9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                j jVar10 = j.n;
                zq3.f(jVar10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return jVar10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                zq3.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    zq3.f(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new n(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                zq3.e(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    zq3.f(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new p(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new o(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new m(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new q(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        private l() {
        }
    }

    public static final class m extends q {
        private final Class p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Class cls) {
            super(false, cls);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (cls.isEnum()) {
                this.p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.j.q, androidx.navigation.j
        public String b() {
            String name = this.p.getName();
            zq3.g(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.j.q
        /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum j(String str) {
            Object obj;
            zq3.h(str, "value");
            Object[] enumConstants = this.p.getEnumConstants();
            zq3.g(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (kotlin.text.h.w(((Enum) obj).name(), str, true)) {
                    break;
                }
                i++;
            }
            Enum r3 = (Enum) obj;
            if (r3 != null) {
                return r3;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.p.getName() + '.');
        }
    }

    public static final class n extends j {
        private final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class cls) {
            super(true);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                zq3.f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.o = cls2;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.j
        public String b() {
            String name = this.o.getName();
            zq3.g(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !zq3.c(n.class, obj.getClass())) {
                return false;
            }
            return zq3.c(this.o, ((n) obj).o);
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Parcelable[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        public Parcelable[] j(String str) {
            zq3.h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, Parcelable[] parcelableArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.o.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }
    }

    public static final class o extends j {
        private final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Class cls) {
            super(true);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.j
        public Object a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return bundle.get(str);
        }

        @Override // androidx.navigation.j
        public String b() {
            String name = this.o.getName();
            zq3.g(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !zq3.c(o.class, obj.getClass())) {
                return false;
            }
            return zq3.c(this.o, ((o) obj).o);
        }

        @Override // androidx.navigation.j
        /* renamed from: f */
        public Object j(String str) {
            zq3.h(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.j
        public void h(Bundle bundle, String str, Object obj) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.o.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.o.hashCode();
        }
    }

    public static final class p extends j {
        private final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Class cls) {
            super(true);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                zq3.f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.o = cls2;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.j
        public String b() {
            String name = this.o.getName();
            zq3.g(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !zq3.c(p.class, obj.getClass())) {
                return false;
            }
            return zq3.c(this.o, ((p) obj).o);
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Serializable[] a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.j
        public Serializable[] j(String str) {
            zq3.h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, Serializable[] serializableArr) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            this.o.cast(serializableArr);
            bundle.putSerializable(str, serializableArr);
        }
    }

    public j(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.a;
    }

    public final Object d(Bundle bundle, String str, String str2) {
        zq3.h(bundle, "bundle");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        Object j2 = j(str2);
        h(bundle, str, j2);
        return j2;
    }

    public final Object e(Bundle bundle, String str, String str2, Object obj) {
        zq3.h(bundle, "bundle");
        zq3.h(str, TransferTable.COLUMN_KEY);
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str2 == null) {
            return obj;
        }
        Object g2 = g(str2, obj);
        h(bundle, str, g2);
        return g2;
    }

    /* renamed from: f */
    public abstract Object j(String str);

    public Object g(String str, Object obj) {
        zq3.h(str, "value");
        return j(str);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String toString() {
        return b();
    }

    public static class q extends j {
        private final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Class cls) {
            super(true);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.j
        public String b() {
            String name = this.o.getName();
            zq3.g(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                return zq3.c(this.o, ((q) obj).o);
            }
            return false;
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // androidx.navigation.j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Serializable a(Bundle bundle, String str) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.j
        public Serializable j(String str) {
            zq3.h(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, Serializable serializable) {
            zq3.h(bundle, "bundle");
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(serializable, "value");
            this.o.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z, Class cls) {
            super(z);
            zq3.h(cls, TransferTable.COLUMN_TYPE);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
