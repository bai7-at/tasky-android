package kotlinx.coroutines.sync;

import defpackage.by0;
import defpackage.ww8;
import kotlinx.coroutines.selects.SelectClause2;

/* loaded from: classes5.dex */
public interface Mutex {

    public static final class DefaultImpls {
        public static /* synthetic */ void getOnLock$annotations() {
        }

        public static /* synthetic */ Object lock$default(Mutex mutex, Object obj, by0 by0Var, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.lock(obj, by0Var);
        }

        public static /* synthetic */ boolean tryLock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }
    }

    SelectClause2<Object, Mutex> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, by0<? super ww8> by0Var);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
