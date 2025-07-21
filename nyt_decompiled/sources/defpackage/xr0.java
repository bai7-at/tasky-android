package defpackage;

import androidx.compose.runtime.Composer;
import defpackage.g26;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class xr0 {
    public static final xr0 a = new xr0();

    private xr0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean a(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            Class cls = clsArr[i];
            int i3 = i2 + 1;
            Class cls2 = clsArr2[i2];
            if (!zq3.c(ou3.c(cls), ou3.c(cls2)) && !cls.isAssignableFrom(cls2)) {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
            i++;
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((Boolean) it2.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final int b(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    private final int c(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    private final Method d(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methodArr[i];
            if (!zq3.c(str, method2.getName())) {
                if (!h.K(method2.getName(), str + '-', false, 2, null)) {
                    continue;
                    i++;
                }
            }
            if (a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method e(Class cls, String str, Object... objArr) {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            method = null;
            method = null;
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int b = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                an3 u = uo6.u(0, b);
                ArrayList arrayList2 = new ArrayList(i.w(u, 10));
                Iterator it2 = u.iterator();
                while (it2.hasNext()) {
                    ((qm3) it2).c();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                mz7 mz7Var = new mz7(3);
                mz7Var.b(clsArr);
                mz7Var.a(Composer.class);
                mz7Var.b(clsArr2);
                return d(declaredMethods, str, (Class[]) mz7Var.d(new Class[mz7Var.c()]));
            } catch (ReflectiveOperationException unused) {
                return method;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (!zq3.c(method2.getName(), str)) {
                    if (!h.K(method2.getName(), str + '-', false, 2, null)) {
                    }
                }
                method = method2;
                break;
            }
            return method;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object f(Class cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }

    private final Object h(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (zq3.c(parameterTypes[length], Composer.class)) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        int i3 = i + 1;
        int b = b(i, obj != null ? 1 : 0) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != b ? c(i) : 0) + b != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i4 = 0;
        while (i4 < length2) {
            if (i4 >= 0 && i4 < i) {
                obj2 = (i4 < 0 || i4 > d.e0(objArr)) ? a.f(method.getParameterTypes()[i4]) : objArr[i4];
            } else if (i4 == i) {
                obj2 = composer;
            } else if (i3 <= i4 && i4 < b) {
                obj2 = 0;
            } else {
                if (b > i4 || i4 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                obj2 = 2097151;
            }
            objArr2[i4] = obj2;
            i4++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void g(String str, String str2, Composer composer, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method e = e(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (e != null) {
                e.setAccessible(true);
                if (Modifier.isStatic(e.getModifiers())) {
                    h(e, null, composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    h(e, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e2) {
            g26.a.c(g26.a, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e2;
        }
    }
}
