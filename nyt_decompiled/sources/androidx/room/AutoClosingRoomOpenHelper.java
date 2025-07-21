package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.room.AutoClosingRoomOpenHelper;
import defpackage.oc8;
import defpackage.qc8;
import defpackage.rc8;
import defpackage.sc8;
import defpackage.ss2;
import defpackage.tc8;
import defpackage.vc8;
import defpackage.vl1;
import defpackage.wc8;
import defpackage.ww8;
import defpackage.xz;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements tc8, vl1 {
    private final tc8 a;
    public final xz b;
    private final AutoClosingSupportSQLiteDatabase c;

    public static final class AutoClosingSupportSQLiteDatabase implements sc8 {
        private final xz a;

        public AutoClosingSupportSQLiteDatabase(xz xzVar) {
            zq3.h(xzVar, "autoCloser");
            this.a = xzVar;
        }

        @Override // defpackage.sc8
        public wc8 A0(String str) {
            zq3.h(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, this.a);
        }

        @Override // defpackage.sc8
        public void B(final String str) {
            zq3.h(str, "sql");
            this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "db");
                    sc8Var.B(str);
                    return null;
                }
            });
        }

        @Override // defpackage.sc8
        public Cursor O0(vc8 vc8Var, CancellationSignal cancellationSignal) {
            zq3.h(vc8Var, "query");
            try {
                return new a(this.a.j().O0(vc8Var, cancellationSignal), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.sc8
        public int P0(final String str, final int i, final ContentValues contentValues, final String str2, final Object[] objArr) {
            zq3.h(str, "table");
            zq3.h(contentValues, "values");
            return ((Number) this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "db");
                    return Integer.valueOf(sc8Var.P0(str, i, contentValues, str2, objArr));
                }
            })).intValue();
        }

        @Override // defpackage.sc8
        public void R() {
            ww8 ww8Var;
            sc8 h = this.a.h();
            if (h != null) {
                h.R();
                ww8Var = ww8.a;
            } else {
                ww8Var = null;
            }
            if (ww8Var == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // defpackage.sc8
        public void S(final String str, final Object[] objArr) {
            zq3.h(str, "sql");
            zq3.h(objArr, "bindArgs");
            this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "db");
                    sc8Var.S(str, objArr);
                    return null;
                }
            });
        }

        @Override // defpackage.sc8
        public void T() {
            try {
                this.a.j().T();
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.sc8
        public Cursor T0(String str) {
            zq3.h(str, "query");
            try {
                return new a(this.a.j().T0(str), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.sc8
        public void Z() {
            if (this.a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                sc8 h = this.a.h();
                zq3.e(h);
                h.Z();
            } finally {
                this.a.e();
            }
        }

        public final void a() {
            this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "it");
                    return null;
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.d();
        }

        @Override // defpackage.sc8
        public boolean g1() {
            if (this.a.h() == null) {
                return false;
            }
            return ((Boolean) this.a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.a)).booleanValue();
        }

        @Override // defpackage.sc8
        public String getPath() {
            return (String) this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "obj");
                    return sc8Var.getPath();
                }
            });
        }

        @Override // defpackage.sc8
        public boolean isOpen() {
            sc8 h = this.a.h();
            if (h == null) {
                return false;
            }
            return h.isOpen();
        }

        @Override // defpackage.sc8
        public boolean o1() {
            return ((Boolean) this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "db");
                    return Boolean.valueOf(sc8Var.o1());
                }
            })).booleanValue();
        }

        @Override // defpackage.sc8
        public void t() {
            try {
                this.a.j().t();
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.sc8
        public Cursor v(vc8 vc8Var) {
            zq3.h(vc8Var, "query");
            try {
                return new a(this.a.j().v(vc8Var), this.a);
            } catch (Throwable th) {
                this.a.e();
                throw th;
            }
        }

        @Override // defpackage.sc8
        public List x() {
            return (List) this.a.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List invoke(sc8 sc8Var) {
                    zq3.h(sc8Var, "obj");
                    return sc8Var.x();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AutoClosingSupportSqliteStatement implements wc8 {
        private final String a;
        private final xz b;
        private final ArrayList c;

        public AutoClosingSupportSqliteStatement(String str, xz xzVar) {
            zq3.h(str, "sql");
            zq3.h(xzVar, "autoCloser");
            this.a = str;
            this.b = xzVar;
            this.c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(wc8 wc8Var) {
            Iterator it2 = this.c.iterator();
            int i = 0;
            while (it2.hasNext()) {
                it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.i.v();
                }
                Object obj = this.c.get(i);
                if (obj == null) {
                    wc8Var.c1(i2);
                } else if (obj instanceof Long) {
                    wc8Var.L0(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    wc8Var.H(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    wc8Var.v0(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    wc8Var.Q0(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final Object h(final ss2 ss2Var) {
            return this.b.g(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(sc8 sc8Var) {
                    String str;
                    zq3.h(sc8Var, "db");
                    str = AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.a;
                    wc8 A0 = sc8Var.A0(str);
                    AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.d(A0);
                    return ss2Var.invoke(A0);
                }
            });
        }

        private final void i(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.c.size() && (size = this.c.size()) <= i2) {
                while (true) {
                    this.c.add(null);
                    if (size == i2) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.c.set(i2, obj);
        }

        @Override // defpackage.wc8
        public int E() {
            return ((Number) h(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(wc8 wc8Var) {
                    zq3.h(wc8Var, "obj");
                    return Integer.valueOf(wc8Var.E());
                }
            })).intValue();
        }

        @Override // defpackage.uc8
        public void H(int i, double d) {
            i(i, Double.valueOf(d));
        }

        @Override // defpackage.uc8
        public void L0(int i, long j) {
            i(i, Long.valueOf(j));
        }

        @Override // defpackage.uc8
        public void Q0(int i, byte[] bArr) {
            zq3.h(bArr, "value");
            i(i, bArr);
        }

        @Override // defpackage.uc8
        public void c1(int i) {
            i(i, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // defpackage.wc8
        public long q0() {
            return ((Number) h(new ss2() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Long invoke(wc8 wc8Var) {
                    zq3.h(wc8Var, "obj");
                    return Long.valueOf(wc8Var.q0());
                }
            })).longValue();
        }

        @Override // defpackage.uc8
        public void v0(int i, String str) {
            zq3.h(str, "value");
            i(i, str);
        }
    }

    private static final class a implements Cursor {
        private final Cursor a;
        private final xz b;

        public a(Cursor cursor, xz xzVar) {
            zq3.h(cursor, "delegate");
            zq3.h(xzVar, "autoCloser");
            this.a = cursor;
            this.b = xzVar;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
            this.b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.a.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.a.getBlob(i);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i) {
            return this.a.getColumnName(i);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.a.getDouble(i);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.a.getFloat(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.a.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.a.getLong(i);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return oc8.a(this.a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return rc8.a(this.a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.a.getShort(i);
        }

        @Override // android.database.Cursor
        public String getString(int i) {
            return this.a.getString(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.a.getType(i);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.a.isNull(i);
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.a.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.a.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            zq3.h(bundle, "extras");
            qc8.a(this.a, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List list) {
            zq3.h(contentResolver, "cr");
            zq3.h(list, "uris");
            rc8.b(this.a, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(tc8 tc8Var, xz xzVar) {
        zq3.h(tc8Var, "delegate");
        zq3.h(xzVar, "autoCloser");
        this.a = tc8Var;
        this.b = xzVar;
        xzVar.k(getDelegate());
        this.c = new AutoClosingSupportSQLiteDatabase(xzVar);
    }

    @Override // defpackage.tc8, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // defpackage.tc8
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.vl1
    public tc8 getDelegate() {
        return this.a;
    }

    @Override // defpackage.tc8
    public sc8 o() {
        this.c.a();
        return this.c;
    }

    @Override // defpackage.tc8
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
