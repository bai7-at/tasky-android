package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class x12 extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(RoomDatabase roomDatabase) {
        super(roomDatabase);
        zq3.h(roomDatabase, "database");
    }

    protected abstract void bind(wc8 wc8Var, Object obj);

    public final int handle(Object obj) {
        wc8 acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.E();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        zq3.h(iterable, "entities");
        wc8 acquire = acquire();
        try {
            Iterator<Object> it2 = iterable.iterator();
            int i = 0;
            while (it2.hasNext()) {
                bind(acquire, it2.next());
                i += acquire.E();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        zq3.h(objArr, "entities");
        wc8 acquire = acquire();
        try {
            int i = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i += acquire.E();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
