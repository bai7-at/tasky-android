package com.squareup.moshi;

import defpackage.c29;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
abstract class b {

    class a extends b {
        final /* synthetic */ Constructor a;
        final /* synthetic */ Class b;

        a(Constructor constructor, Class cls) {
            this.a = constructor;
            this.b = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.a.newInstance(null);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    /* renamed from: com.squareup.moshi.b$b, reason: collision with other inner class name */
    class C0470b extends b {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;
        final /* synthetic */ Class c;

        C0470b(Method method, Object obj, Class cls) {
            this.a = method;
            this.b = obj;
            this.c = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.a.invoke(this.b, this.c);
        }

        public String toString() {
            return this.c.getName();
        }
    }

    class c extends b {
        final /* synthetic */ Method a;
        final /* synthetic */ Class b;
        final /* synthetic */ int c;

        c(Method method, Class cls, int i) {
            this.a = method;
            this.b = cls;
            this.c = i;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.a.invoke(null, this.b, Integer.valueOf(this.c));
        }

        public String toString() {
            return this.b.getName();
        }
    }

    class d extends b {
        final /* synthetic */ Method a;
        final /* synthetic */ Class b;

        d(Method method, Class cls) {
            this.a = method;
            this.b = cls;
        }

        @Override // com.squareup.moshi.b
        public Object b() {
            return this.a.invoke(null, this.b, Object.class);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    b() {
    }

    public static b a(Class cls) {
        try {
            try {
                try {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new C0470b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new c(declaredMethod2, cls, intValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e) {
            throw c29.t(e);
        }
    }

    abstract Object b();
}
