package defpackage;

import android.database.Cursor;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class qc8 {
    public static final qc8 a = new qc8();

    private qc8() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        zq3.h(cursor, "cursor");
        zq3.h(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
