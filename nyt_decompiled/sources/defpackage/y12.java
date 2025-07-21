package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class y12 extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(RoomDatabase roomDatabase) {
        super(roomDatabase);
        zq3.h(roomDatabase, "database");
    }

    protected abstract void bind(wc8 wc8Var, Object obj);

    public final void insert(Object obj) {
        wc8 acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.q0();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        wc8 acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.q0();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        zq3.h(collection, "entities");
        wc8 acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    i.v();
                }
                bind(acquire, obj);
                jArr[i] = acquire.q0();
                i = i2;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        zq3.h(collection, "entities");
        wc8 acquire = acquire();
        Iterator<Object> it2 = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it2.next());
                lArr[i] = Long.valueOf(acquire.q0());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        zq3.h(objArr, "entities");
        wc8 acquire = acquire();
        try {
            List c = i.c();
            for (Object obj : objArr) {
                bind(acquire, obj);
                c.add(Long.valueOf(acquire.q0()));
            }
            List<Long> a = i.a(c);
            release(acquire);
            return a;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        zq3.h(objArr, "entities");
        wc8 acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.q0();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        zq3.h(objArr, "entities");
        wc8 acquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(acquire, objArr[i]);
                jArr[i2] = acquire.q0();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        zq3.h(objArr, "entities");
        wc8 acquire = acquire();
        Iterator a = no.a(objArr);
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(acquire, a.next());
                lArr[i] = Long.valueOf(acquire.q0());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        zq3.h(collection, "entities");
        wc8 acquire = acquire();
        try {
            List c = i.c();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                bind(acquire, it2.next());
                c.add(Long.valueOf(acquire.q0()));
            }
            List<Long> a = i.a(c);
            release(acquire);
            return a;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> iterable) {
        zq3.h(iterable, "entities");
        wc8 acquire = acquire();
        try {
            Iterator<Object> it2 = iterable.iterator();
            while (it2.hasNext()) {
                bind(acquire, it2.next());
                acquire.q0();
            }
        } finally {
            release(acquire);
        }
    }
}
