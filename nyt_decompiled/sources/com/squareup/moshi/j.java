package com.squareup.moshi;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.c29;
import defpackage.cu3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class j {
    static Type a(Type type2) {
        if (type2 instanceof GenericArrayType) {
            return ((GenericArrayType) type2).getGenericComponentType();
        }
        if (type2 instanceof Class) {
            return ((Class) type2).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type2) {
        return new c29.a(type2);
    }

    public static Type c(Type type2, Class cls) {
        Type h = h(type2, cls, Collection.class);
        if (h instanceof WildcardType) {
            h = ((WildcardType) h).getUpperBounds()[0];
        }
        return h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean d(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type3 instanceof GenericArrayType ? d(((Class) type2).getComponentType(), ((GenericArrayType) type3).getGenericComponentType()) : type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof c29.b ? ((c29.b) parameterizedType).c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof c29.b ? ((c29.b) parameterizedType2).c : parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof Class) {
                return d(((Class) type3).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            if (type3 instanceof GenericArrayType) {
                return d(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String e(String str) {
        return str.replace("$", QueryKeys.END_MARKER) + "JsonAdapter";
    }

    static Type f(Type type2) {
        Class g = g(type2);
        return c29.q(type2, g, g.getGenericSuperclass());
    }

    public static Class g(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type2).getRawType();
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) g(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return g(((WildcardType) type2).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + (type2 == null ? Constants.NULL_VERSION_ID : type2.getClass().getName()));
    }

    static Type h(Type type2, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return c29.q(type2, cls, c29.e(type2, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static Type[] i(Type type2, Class cls) {
        if (type2 == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type h = h(type2, cls, Map.class);
        return h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static ParameterizedType j(Type type2, Type... typeArr) {
        if (typeArr.length != 0) {
            return new c29.b(null, type2, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type2);
    }

    public static Set k(Set set, Class cls) {
        if (!cls.isAnnotationPresent(cu3.class)) {
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
        if (set.isEmpty()) {
            return null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            Annotation annotation = (Annotation) it2.next();
            if (cls.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static WildcardType l(Type type2) {
        return new c29.c(type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds() : new Type[]{type2}, c29.b);
    }

    public static WildcardType m(Type type2) {
        return new c29.c(new Type[]{Object.class}, type2 instanceof WildcardType ? ((WildcardType) type2).getLowerBounds() : new Type[]{type2});
    }
}
