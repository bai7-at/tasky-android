package com.google.gson.internal;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class Primitives {
    private Primitives() {
    }

    public static boolean isPrimitive(Type type2) {
        return (type2 instanceof Class) && ((Class) type2).isPrimitive();
    }

    public static boolean isWrapperType(Type type2) {
        return type2 == Integer.class || type2 == Float.class || type2 == Byte.class || type2 == Double.class || type2 == Long.class || type2 == Character.class || type2 == Boolean.class || type2 == Short.class || type2 == Void.class;
    }

    public static <T> Class<T> unwrap(Class<T> cls) {
        return cls == Integer.class ? Integer.TYPE : cls == Float.class ? Float.TYPE : cls == Byte.class ? Byte.TYPE : cls == Double.class ? Double.TYPE : cls == Long.class ? Long.TYPE : cls == Character.class ? Character.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Short.class ? Short.TYPE : cls == Void.class ? Void.TYPE : cls;
    }

    public static <T> Class<T> wrap(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
