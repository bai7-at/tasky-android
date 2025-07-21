package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class cr2 extends br2 implements wc8 {
    private final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr2(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        zq3.h(sQLiteStatement, "delegate");
        this.b = sQLiteStatement;
    }

    @Override // defpackage.wc8
    public int E() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.wc8
    public long q0() {
        return this.b.executeInsert();
    }
}
