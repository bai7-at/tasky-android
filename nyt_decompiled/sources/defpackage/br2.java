package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class br2 implements uc8 {
    private final SQLiteProgram a;

    public br2(SQLiteProgram sQLiteProgram) {
        zq3.h(sQLiteProgram, "delegate");
        this.a = sQLiteProgram;
    }

    @Override // defpackage.uc8
    public void H(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.uc8
    public void L0(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.uc8
    public void Q0(int i, byte[] bArr) {
        zq3.h(bArr, "value");
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.uc8
    public void c1(int i) {
        this.a.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.uc8
    public void v0(int i, String str) {
        zq3.h(str, "value");
        this.a.bindString(i, str);
    }
}
