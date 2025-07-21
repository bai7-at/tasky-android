package defpackage;

import android.database.Cursor;
import androidx.paging.n;
import androidx.room.RoomDatabase;
import androidx.room.d;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class p44 extends n {
    private final p27 e;
    private final String f;
    private final String g;
    private final RoomDatabase h;
    private final d.c i;
    private final boolean j;
    private final AtomicBoolean k = new AtomicBoolean(false);

    class a extends d.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.d.c
        public void c(Set set) {
            p44.this.d();
        }
    }

    protected p44(RoomDatabase roomDatabase, p27 p27Var, boolean z, boolean z2, String... strArr) {
        this.h = roomDatabase;
        this.e = p27Var;
        this.j = z;
        this.f = "SELECT COUNT(*) FROM ( " + p27Var.a() + " )";
        this.g = "SELECT * FROM ( " + p27Var.a() + " ) LIMIT ? OFFSET ?";
        this.i = new a(strArr);
        if (z2) {
            s();
        }
    }

    private p27 q(int i, int i2) {
        p27 d = p27.d(this.g, this.e.i() + 2);
        d.h(this.e);
        d.L0(d.i() - 1, i2);
        d.L0(d.i(), i);
        return d;
    }

    private void s() {
        if (this.k.compareAndSet(false, true)) {
            this.h.getInvalidationTracker().d(this.i);
        }
    }

    @Override // androidx.paging.DataSource
    public boolean e() {
        s();
        this.h.getInvalidationTracker().o();
        return super.e();
    }

    @Override // androidx.paging.n
    public void k(n.c cVar, n.b bVar) {
        p27 p27Var;
        int i;
        p27 p27Var2;
        s();
        List emptyList = Collections.emptyList();
        this.h.beginTransaction();
        Cursor cursor = null;
        try {
            int p = p();
            if (p != 0) {
                int h = n.h(cVar, p);
                p27Var = q(h, n.i(cVar, h, p));
                try {
                    cursor = this.h.query(p27Var);
                    List o = o(cursor);
                    this.h.setTransactionSuccessful();
                    p27Var2 = p27Var;
                    i = h;
                    emptyList = o;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.h.endTransaction();
                    if (p27Var != null) {
                        p27Var.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                p27Var2 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.h.endTransaction();
            if (p27Var2 != null) {
                p27Var2.release();
            }
            bVar.a(emptyList, i, p);
        } catch (Throwable th2) {
            th = th2;
            p27Var = null;
        }
    }

    @Override // androidx.paging.n
    public void n(n.e eVar, n.d dVar) {
        dVar.a(r(eVar.a, eVar.b));
    }

    protected abstract List o(Cursor cursor);

    public int p() {
        s();
        p27 d = p27.d(this.f, this.e.i());
        d.h(this.e);
        Cursor query = this.h.query(d);
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            return 0;
        } finally {
            query.close();
            d.release();
        }
    }

    public List r(int i, int i2) {
        p27 q = q(i, i2);
        if (!this.j) {
            Cursor query = this.h.query(q);
            try {
                return o(query);
            } finally {
                query.close();
                q.release();
            }
        }
        this.h.beginTransaction();
        Cursor cursor = null;
        try {
            cursor = this.h.query(q);
            List o = o(cursor);
            this.h.setTransactionSuccessful();
            return o;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            this.h.endTransaction();
            q.release();
        }
    }
}
