package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.EnumSerializer;

/* loaded from: classes5.dex */
public abstract class nu5 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final KSerializer b(Class cls, KSerializer... kSerializerArr) {
        KSerializer g;
        zq3.h(cls, "<this>");
        zq3.h(kSerializerArr, "args");
        if (cls.isEnum() && j(cls)) {
            return c(cls);
        }
        if (cls.isInterface() && (g = g(cls)) != null) {
            return g;
        }
        KSerializer i = i(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (i != null) {
            return i;
        }
        KSerializer f = f(cls);
        if (f != null) {
            return f;
        }
        KSerializer d = d(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (d != null) {
            return d;
        }
        if (k(cls)) {
            return new PolymorphicSerializer(ou3.c(cls));
        }
        return null;
    }

    private static final KSerializer c(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        zq3.g(canonicalName, "getCanonicalName(...)");
        zq3.f(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final KSerializer d(Class cls, KSerializer... kSerializerArr) {
        Field field;
        KSerializer h;
        Object e = e(cls);
        if (e != null && (h = h(e, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return h;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            zq3.g(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (zq3.c(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (!z) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object e(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        zq3.g(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(k15.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        zq3.g(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        if (r4 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        if (r5 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlinx.serialization.KSerializer f(java.lang.Class r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "getDeclaredFields(...)"
            defpackage.zq3.g(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Lf:
            r7 = 1
            if (r4 >= r1) goto L3d
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = defpackage.zq3.c(r9, r10)
            if (r9 == 0) goto L3a
            java.lang.Class r9 = r8.getType()
            boolean r9 = defpackage.zq3.c(r9, r11)
            if (r9 == 0) goto L3a
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L3a
            if (r5 == 0) goto L38
        L36:
            r6 = r2
            goto L40
        L38:
            r5 = r7
            r6 = r8
        L3a:
            int r4 = r4 + 1
            goto Lf
        L3d:
            if (r5 != 0) goto L40
            goto L36
        L40:
            if (r6 != 0) goto L43
            return r2
        L43:
            java.lang.Object r0 = r6.get(r2)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "getMethods(...)"
            defpackage.zq3.g(r11, r1)
            int r1 = r11.length
            r5 = r2
            r4 = r3
        L53:
            if (r3 >= r1) goto L84
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = defpackage.zq3.c(r8, r9)
            if (r8 == 0) goto L81
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            defpackage.zq3.g(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L81
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = defpackage.zq3.c(r8, r9)
            if (r8 == 0) goto L81
            if (r4 == 0) goto L7f
        L7d:
            r5 = r2
            goto L87
        L7f:
            r5 = r6
            r4 = r7
        L81:
            int r3 = r3 + 1
            goto L53
        L84:
            if (r4 != 0) goto L87
            goto L7d
        L87:
            if (r5 != 0) goto L8a
            return r2
        L8a:
            java.lang.Object r11 = r5.invoke(r0, r2)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto L95
            r2 = r11
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.f(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    private static final KSerializer g(Class cls) {
        lk7 lk7Var = (lk7) cls.getAnnotation(lk7.class);
        if (lk7Var == null || zq3.c(zt6.b(lk7Var.with()), zt6.b(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(ou3.c(cls));
        }
        return null;
    }

    private static final KSerializer h(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final KSerializer i(Class cls, KSerializer... kSerializerArr) {
        Object a = a(cls, "Companion");
        if (a == null) {
            return null;
        }
        return h(a, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final boolean j(Class cls) {
        return cls.getAnnotation(lk7.class) == null && cls.getAnnotation(gz5.class) == null;
    }

    private static final boolean k(Class cls) {
        if (cls.getAnnotation(gz5.class) != null) {
            return true;
        }
        lk7 lk7Var = (lk7) cls.getAnnotation(lk7.class);
        return lk7Var != null && zq3.c(zt6.b(lk7Var.with()), zt6.b(PolymorphicSerializer.class));
    }

    public static final Void l(Class cls) {
        zq3.h(cls, "<this>");
        throw new SerializationException(cv5.c(ou3.c(cls)));
    }

    public static final Object[] m(ArrayList arrayList, vu3 vu3Var) {
        zq3.h(arrayList, "<this>");
        zq3.h(vu3Var, "eClass");
        Object newInstance = Array.newInstance((Class<?>) ou3.a(vu3Var), arrayList.size());
        zq3.f(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        zq3.g(array, "toArray(...)");
        return array;
    }
}
