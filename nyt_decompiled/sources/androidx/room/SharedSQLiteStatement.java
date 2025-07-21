package androidx.room;

import defpackage.c04;
import defpackage.qs2;
import defpackage.wc8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock;
    private final c04 stmt$delegate;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        zq3.h(roomDatabase, "database");
        this.database = roomDatabase;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = kotlin.c.a(new qs2() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final wc8 mo865invoke() {
                wc8 a;
                a = SharedSQLiteStatement.this.a();
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wc8 a() {
        return this.database.compileStatement(createQuery());
    }

    private final wc8 b() {
        return (wc8) this.stmt$delegate.getValue();
    }

    private final wc8 c(boolean z) {
        return z ? b() : a();
    }

    public wc8 acquire() {
        assertNotMainThread();
        return c(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(wc8 wc8Var) {
        zq3.h(wc8Var, "statement");
        if (wc8Var == b()) {
            this.lock.set(false);
        }
    }
}
