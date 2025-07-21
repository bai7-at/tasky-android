package kotlinx.coroutines.internal;

import defpackage.du8;
import defpackage.ou3;
import defpackage.ss2;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.CopyableThrowable;

/* loaded from: classes5.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> ss2 createConstructor(Class<E> cls) {
        Object obj;
        ss2 ss2Var;
        Pair a;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // defpackage.ss2
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                a = du8.a(safeCtor(new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(null);
                        zq3.f(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) newInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 0);
            } else if (length2 != 1) {
                a = length2 != 2 ? du8.a(null, -1) : (zq3.c(parameterTypes[0], String.class) && zq3.c(parameterTypes[1], Throwable.class)) ? du8.a(safeCtor(new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th.getMessage(), th);
                        zq3.f(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) newInstance;
                    }
                }), 3) : du8.a(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                a = zq3.c(cls2, String.class) ? du8.a(safeCtor(new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th.getMessage());
                        zq3.f(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        Throwable th2 = (Throwable) newInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 2) : zq3.c(cls2, Throwable.class) ? du8.a(safeCtor(new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public final Throwable invoke(Throwable th) {
                        Object newInstance = constructor.newInstance(th);
                        zq3.f(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        return (Throwable) newInstance;
                    }
                }), 1) : du8.a(null, -1);
            }
            arrayList.add(a);
            i++;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Pair) obj).d()).intValue();
                do {
                    Object next = it2.next();
                    int intValue2 = ((Number) ((Pair) next).d()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        }
        Pair pair = (Pair) obj;
        return (pair == null || (ss2Var = (ss2) pair.c()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : ss2Var;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    static /* synthetic */ int fieldsCount$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object b;
        ou3.c(cls);
        try {
            Result.a aVar = Result.a;
            b = Result.b(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (Result.g(b)) {
            b = valueOf;
        }
        return ((Number) b).intValue();
    }

    private static final ss2 safeCtor(final ss2 ss2Var) {
        return new ss2() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Throwable invoke(Throwable th) {
                Object b;
                ss2 ss2Var2 = ss2.this;
                try {
                    Result.a aVar = Result.a;
                    Throwable th2 = (Throwable) ss2Var2.invoke(th);
                    if (!zq3.c(th.getMessage(), th2.getMessage()) && !zq3.c(th2.getMessage(), th.toString())) {
                        th2 = null;
                    }
                    b = Result.b(th2);
                } catch (Throwable th3) {
                    Result.a aVar2 = Result.a;
                    b = Result.b(f.a(th3));
                }
                return (Throwable) (Result.g(b) ? null : b);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e) {
        Object b;
        if (!(e instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e.getClass()).invoke(e);
        }
        try {
            Result.a aVar = Result.a;
            b = Result.b(((CopyableThrowable) e).createCopy());
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (Result.g(b)) {
            b = null;
        }
        return (E) b;
    }
}
