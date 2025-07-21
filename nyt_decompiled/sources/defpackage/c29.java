package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c29 {
    public static final Set a = Collections.emptySet();
    public static final Type[] b = new Type[0];
    public static final Class c;
    private static final Class d;
    private static final Map e;

    public static final class a implements GenericArrayType {
        private final Type a;

        public a(Type type2) {
            this.a = c29.a(type2);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && j.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return c29.v(this.a) + "[]";
        }
    }

    public static final class b implements ParameterizedType {
        private final Type a;
        private final Type b;
        public final Type[] c;

        public b(Type type2, Type type3, Type... typeArr) {
            if (type3 instanceof Class) {
                Class<?> enclosingClass = ((Class) type3).getEnclosingClass();
                if (type2 != null) {
                    if (enclosingClass == null || j.g(type2) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type3 + ": " + type2);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type3 + ": null");
                }
            }
            this.a = type2 == null ? null : c29.a(type2);
            this.b = c29.a(type3);
            this.c = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.c;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                c29.b(this.c[i]);
                Type[] typeArr3 = this.c;
                typeArr3[i] = c29.a(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && j.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.b;
        }

        public int hashCode() {
            return c29.g(this.a) ^ (Arrays.hashCode(this.c) ^ this.b.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.c.length + 1) * 30);
            sb.append(c29.v(this.b));
            if (this.c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(c29.v(this.c[0]));
            for (int i = 1; i < this.c.length; i++) {
                sb.append(", ");
                sb.append(c29.v(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements WildcardType {
        private final Type a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c29.b(typeArr[0]);
                this.b = null;
                this.a = c29.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            c29.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.b = c29.a(typeArr2[0]);
            this.a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && j.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type2 = this.b;
            return type2 != null ? new Type[]{type2} : c29.b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public int hashCode() {
            Type type2 = this.b;
            return (this.a.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
        }

        public String toString() {
            if (this.b != null) {
                return "? super " + c29.v(this.b);
            }
            if (this.a == Object.class) {
                return "?";
            }
            return "? extends " + c29.v(this.a);
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        d = cls;
        c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type2) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type2 instanceof ParameterizedType) {
            if (type2 instanceof b) {
                return type2;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            return type2 instanceof a ? type2 : new a(((GenericArrayType) type2).getGenericComponentType());
        }
        if (!(type2 instanceof WildcardType) || (type2 instanceof c)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type2 + ". Use the boxed type.");
        }
    }

    static Class c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static JsonAdapter d(i iVar, Type type2, Class cls) {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        et3 et3Var = (et3) cls.getAnnotation(et3.class);
        Class<?> cls3 = null;
        if (et3Var == null || !et3Var.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(j.e(cls.getName()), true, cls.getClassLoader());
            } catch (NoSuchMethodException e2) {
                e = e2;
            }
            try {
                if (type2 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(i.class, Type[].class);
                        objArr = new Object[]{iVar, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        objArr = new Object[]{iVar};
                        declaredConstructor = cls2.getDeclaredConstructor(i.class);
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(null);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (NoSuchMethodException e3) {
                e = e3;
                cls3 = cls2;
                if ((type2 instanceof ParameterizedType) || cls3.getTypeParameters().length == 0) {
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                }
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls3.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e6);
        } catch (InvocationTargetException e7) {
            throw t(e7);
        }
    }

    public static Type e(Type type2, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type2;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    static int h(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class cls) {
        Class<? extends Annotation> cls2 = d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(cu3.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : a;
    }

    public static String m(String str, bt3 bt3Var) {
        if (bt3Var == null) {
            return str;
        }
        String name = bt3Var.name();
        return "\u0000".equals(name) ? str : name;
    }

    public static String n(String str, AnnotatedElement annotatedElement) {
        return m(str, (bt3) annotatedElement.getAnnotation(bt3.class));
    }

    public static JsonDataException o(String str, String str2, JsonReader jsonReader) {
        String path = jsonReader.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static Type p(Type type2) {
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        if (wildcardType.getLowerBounds().length != 0) {
            return type2;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type q(Type type2, Class cls, Type type3) {
        return r(type2, cls, type3, new LinkedHashSet());
    }

    private static Type r(Type type2, Class cls, Type type3, Collection collection) {
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            if (collection.contains(typeVariable)) {
                return type3;
            }
            collection.add(typeVariable);
            type3 = s(type2, cls, typeVariable);
            if (type3 == typeVariable) {
                return type3;
            }
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type r = r(type2, cls, componentType, collection);
                return componentType == r ? cls2 : j.b(r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type r2 = r(type2, cls, genericComponentType, collection);
            return genericComponentType == r2 ? genericArrayType : j.b(r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type r3 = r(type2, cls, ownerType, collection);
            boolean z = r3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type r4 = r(type2, cls, actualTypeArguments[i], collection);
                if (r4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = r4;
                }
            }
            return z ? new b(r3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type r5 = r(type2, cls, lowerBounds[0], collection);
                type4 = wildcardType;
                if (r5 != lowerBounds[0]) {
                    return j.m(r5);
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type r6 = r(type2, cls, upperBounds[0], collection);
                    type4 = wildcardType;
                    if (r6 != upperBounds[0]) {
                        return j.l(r6);
                    }
                }
            }
        }
        return type4;
    }

    static Type s(Type type2, Class cls, TypeVariable typeVariable) {
        Class c2 = c(typeVariable);
        if (c2 == null) {
            return typeVariable;
        }
        Type e2 = e(type2, cls, c2);
        if (!(e2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e2).getActualTypeArguments()[h(c2.getTypeParameters(), typeVariable)];
    }

    public static RuntimeException t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String u(Type type2, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type2);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    static String v(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    public static boolean w(Type type2, Type type3) {
        return j.d(type2, type3);
    }

    public static JsonDataException x(String str, String str2, JsonReader jsonReader) {
        String path = jsonReader.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }
}
