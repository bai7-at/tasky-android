package kotlinx.coroutines.internal;

import defpackage.ss2;
import defpackage.zq3;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes5.dex */
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<ss2>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ ss2 computeValue(Class cls) {
            return computeValue2((Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        protected ss2 computeValue2(Class<?> cls) {
            ss2 createConstructor;
            zq3.f(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            createConstructor = ExceptionsConstructorKt.createConstructor(cls);
            return createConstructor;
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public ss2 get(Class<? extends Throwable> cls) {
        Object obj;
        obj = cache.get(cls);
        return (ss2) obj;
    }
}
