package androidx.lifecycle;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c44;
import defpackage.ei1;
import defpackage.lh4;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();
    private static final Map b = new HashMap();
    private static final Map c = new HashMap();

    private i() {
    }

    private final c a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            zq3.g(newInstance, "{\n            constructo…tance(`object`)\n        }");
            lh4.a(newInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r3 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r3 != null ? r3.getName() : "";
            zq3.g(name, "fullPackage");
            if (name.length() != 0) {
                zq3.g(canonicalName, AuthenticationTokenClaims.JSON_KEY_NAME);
                canonicalName = canonicalName.substring(name.length() + 1);
                zq3.g(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            zq3.g(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c2 = c(canonicalName);
            if (name.length() != 0) {
                c2 = name + '.' + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            zq3.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String c(String str) {
        zq3.h(str, "className");
        return kotlin.text.h.F(str, InstructionFileId.DOT, QueryKeys.END_MARKER, false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    private final boolean e(Class cls) {
        return cls != null && c44.class.isAssignableFrom(cls);
    }

    public static final g f(Object obj) {
        zq3.h(obj, "object");
        boolean z = obj instanceof g;
        boolean z2 = obj instanceof ei1;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((ei1) obj, (g) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((ei1) obj, null);
        }
        if (z) {
            return (g) obj;
        }
        Class<?> cls = obj.getClass();
        i iVar = a;
        if (iVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = c.get(cls);
        zq3.e(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            iVar.a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        c[] cVarArr = new c[size];
        for (int i = 0; i < size; i++) {
            a.a((Constructor) list.get(i), obj);
            cVarArr[i] = null;
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b2 = b(cls);
        if (b2 != null) {
            c.put(cls, kotlin.collections.i.e(b2));
            return 2;
        }
        if (b.c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            zq3.g(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = c.get(superclass);
            zq3.e(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        zq3.g(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                zq3.g(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = c.get(cls2);
                zq3.e(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        c.put(cls, arrayList);
        return 2;
    }
}
