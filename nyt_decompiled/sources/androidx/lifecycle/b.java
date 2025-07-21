package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class b {
    static b c = new b();
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    static class a {
        final Map a = new HashMap();
        final Map b;

        a(Map map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(event, list);
                }
                list.add((C0084b) entry.getKey());
            }
        }

        private static void b(List list, d44 d44Var, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0084b) list.get(size)).a(d44Var, event, obj);
                }
            }
        }

        void a(d44 d44Var, Lifecycle.Event event, Object obj) {
            b((List) this.a.get(event), d44Var, event, obj);
            b((List) this.a.get(Lifecycle.Event.ON_ANY), d44Var, event, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0084b {
        final int a;
        final Method b;

        C0084b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        void a(d44 d44Var, Lifecycle.Event event, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, null);
                } else if (i == 1) {
                    this.b.invoke(obj, d44Var);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.b.invoke(obj, d44Var, event);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0084b)) {
                return false;
            }
            C0084b c0084b = (C0084b) obj;
            return this.a == c0084b.a && this.b.getName().equals(c0084b.b.getName());
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i;
        a c2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c2 = c(superclass)) != null) {
            hashMap.putAll(c2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).b.entrySet()) {
                e(hashMap, (C0084b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            k kVar = (k) method.getAnnotation(k.class);
            if (kVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!d44.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event value = kVar.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0084b(i, method), value, cls);
                z = true;
            }
        }
        a aVar = new a(hashMap);
        this.a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    private void e(Map map, C0084b c0084b, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(c0084b);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(c0084b, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0084b.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    a c(Class cls) {
        a aVar = (a) this.a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = b(cls);
        for (Method method : b) {
            if (((k) method.getAnnotation(k.class)) != null) {
                a(cls, b);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }
}
