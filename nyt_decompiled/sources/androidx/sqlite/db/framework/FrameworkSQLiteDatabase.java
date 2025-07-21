package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import defpackage.br2;
import defpackage.cr2;
import defpackage.kt2;
import defpackage.nc8;
import defpackage.ps7;
import defpackage.sc8;
import defpackage.vc8;
import defpackage.wc8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements sc8 {
    public static final a b = new a(null);
    private static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] d = new String[0];
    private final SQLiteDatabase a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        zq3.h(sQLiteDatabase, "delegate");
        this.a = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor h(kt2 kt2Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        zq3.h(kt2Var, "$tmp0");
        return (Cursor) kt2Var.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor i(vc8 vc8Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        zq3.h(vc8Var, "$query");
        zq3.e(sQLiteQuery);
        vc8Var.b(new br2(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // defpackage.sc8
    public wc8 A0(String str) {
        zq3.h(str, "sql");
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        zq3.g(compileStatement, "delegate.compileStatement(sql)");
        return new cr2(compileStatement);
    }

    @Override // defpackage.sc8
    public void B(String str) {
        zq3.h(str, "sql");
        this.a.execSQL(str);
    }

    @Override // defpackage.sc8
    public Cursor O0(final vc8 vc8Var, CancellationSignal cancellationSignal) {
        zq3.h(vc8Var, "query");
        SQLiteDatabase sQLiteDatabase = this.a;
        String a2 = vc8Var.a();
        String[] strArr = d;
        zq3.e(cancellationSignal);
        return nc8.e(sQLiteDatabase, a2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: yq2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor i;
                i = FrameworkSQLiteDatabase.i(vc8.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return i;
            }
        });
    }

    @Override // defpackage.sc8
    public int P0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        zq3.h(str, "table");
        zq3.h(contentValues, "values");
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(c[i]);
        sb.append(str);
        sb.append(" SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        wc8 A0 = A0(sb2);
        ps7.c.b(A0, objArr2);
        return A0.E();
    }

    @Override // defpackage.sc8
    public void R() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.sc8
    public void S(String str, Object[] objArr) {
        zq3.h(str, "sql");
        zq3.h(objArr, "bindArgs");
        this.a.execSQL(str, objArr);
    }

    @Override // defpackage.sc8
    public void T() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.sc8
    public Cursor T0(String str) {
        zq3.h(str, "query");
        return v(new ps7(str));
    }

    @Override // defpackage.sc8
    public void Z() {
        this.a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final boolean d(SQLiteDatabase sQLiteDatabase) {
        zq3.h(sQLiteDatabase, "sqLiteDatabase");
        return zq3.c(this.a, sQLiteDatabase);
    }

    @Override // defpackage.sc8
    public boolean g1() {
        return this.a.inTransaction();
    }

    @Override // defpackage.sc8
    public String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.sc8
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.sc8
    public boolean o1() {
        return nc8.d(this.a);
    }

    @Override // defpackage.sc8
    public void t() {
        this.a.beginTransaction();
    }

    @Override // defpackage.sc8
    public Cursor v(final vc8 vc8Var) {
        zq3.h(vc8Var, "query");
        final kt2 kt2Var = new kt2() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // defpackage.kt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                vc8 vc8Var2 = vc8.this;
                zq3.e(sQLiteQuery);
                vc8Var2.b(new br2(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: zq2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor h;
                h = FrameworkSQLiteDatabase.h(kt2.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return h;
            }
        }, vc8Var.a(), d, null);
        zq3.g(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // defpackage.sc8
    public List x() {
        return this.a.getAttachedDbs();
    }
}
