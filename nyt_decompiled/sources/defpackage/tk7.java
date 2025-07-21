package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
abstract /* synthetic */ class tk7 {
    private static final KSerializer a(uk7 uk7Var, GenericArrayType genericArrayType, boolean z) {
        KSerializer b;
        vu3 vu3Var;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            zq3.g(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) d.a0(upperBounds);
        }
        zq3.e(genericComponentType);
        if (z) {
            b = sk7.a(uk7Var, genericComponentType);
        } else {
            b = sk7.b(uk7Var, genericComponentType);
            if (b == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            zq3.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            vu3Var = ou3.c((Class) rawType);
        } else {
            if (!(genericComponentType instanceof vu3)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + zt6.b(genericComponentType.getClass()));
            }
            vu3Var = (vu3) genericComponentType;
        }
        zq3.f(vu3Var, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer a = he0.a(vu3Var, b);
        zq3.f(a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a;
    }

    private static final Class b(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            zq3.g(rawType, "getRawType(...)");
            return b(rawType);
        }
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            zq3.g(upperBounds, "getUpperBounds(...)");
            Object a0 = d.a0(upperBounds);
            zq3.g(a0, "first(...)");
            return b((Type) a0);
        }
        if (type2 instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
            zq3.g(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type2 + " has type " + zt6.b(type2.getClass()));
    }

    private static final KSerializer c(uk7 uk7Var, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer b = nu5.b(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (b != null) {
            return b;
        }
        vu3 c = ou3.c(cls);
        KSerializer b2 = w26.b(c);
        return b2 == null ? uk7Var.b(c, list) : b2;
    }

    public static final KSerializer d(uk7 uk7Var, Type type2) {
        zq3.h(uk7Var, "<this>");
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        KSerializer e = e(uk7Var, type2, true);
        if (e != null) {
            return e;
        }
        nu5.l(b(type2));
        throw new KotlinNothingValueException();
    }

    private static final KSerializer e(uk7 uk7Var, Type type2, boolean z) {
        ArrayList<KSerializer> arrayList;
        if (type2 instanceof GenericArrayType) {
            return a(uk7Var, (GenericArrayType) type2, z);
        }
        if (type2 instanceof Class) {
            return h(uk7Var, (Class) type2, z);
        }
        if (!(type2 instanceof ParameterizedType)) {
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                zq3.g(upperBounds, "getUpperBounds(...)");
                Object a0 = d.a0(upperBounds);
                zq3.g(a0, "first(...)");
                return f(uk7Var, (Type) a0, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type2 + " has type " + zt6.b(type2.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        Type rawType = parameterizedType.getRawType();
        zq3.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        zq3.e(actualTypeArguments);
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                zq3.e(type3);
                arrayList.add(sk7.a(uk7Var, type3));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type4 : actualTypeArguments) {
                zq3.e(type4);
                KSerializer b = sk7.b(uk7Var, type4);
                if (b == null) {
                    return null;
                }
                arrayList.add(b);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            KSerializer n = he0.n((KSerializer) arrayList.get(0));
            zq3.f(n, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return n;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            KSerializer h = he0.h((KSerializer) arrayList.get(0));
            zq3.f(h, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return h;
        }
        if (Map.class.isAssignableFrom(cls)) {
            KSerializer k = he0.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            zq3.f(k, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return k;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            KSerializer j = he0.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            zq3.f(j, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return j;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            KSerializer m = he0.m((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            zq3.f(m, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return m;
        }
        if (Triple.class.isAssignableFrom(cls)) {
            KSerializer p = he0.p((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
            zq3.f(p, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return p;
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        for (KSerializer kSerializer : arrayList) {
            zq3.f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(kSerializer);
        }
        return c(uk7Var, cls, arrayList2);
    }

    static /* synthetic */ KSerializer f(uk7 uk7Var, Type type2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return e(uk7Var, type2, z);
    }

    public static final KSerializer g(uk7 uk7Var, Type type2) {
        zq3.h(uk7Var, "<this>");
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        return e(uk7Var, type2, false);
    }

    private static final KSerializer h(uk7 uk7Var, Class cls, boolean z) {
        KSerializer b;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            zq3.f(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(uk7Var, cls, i.l());
        }
        Class<?> componentType = cls.getComponentType();
        zq3.g(componentType, "getComponentType(...)");
        if (z) {
            b = sk7.a(uk7Var, componentType);
        } else {
            b = sk7.b(uk7Var, componentType);
            if (b == null) {
                return null;
            }
        }
        vu3 c = ou3.c(componentType);
        zq3.f(c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer a = he0.a(c, b);
        zq3.f(a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return a;
    }
}
