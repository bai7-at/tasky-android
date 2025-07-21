package defpackage;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import defpackage.tc8;

/* loaded from: classes.dex */
public final class ar2 implements tc8.c {
    @Override // tc8.c
    public tc8 a(tc8.b bVar) {
        zq3.h(bVar, "configuration");
        return new FrameworkSQLiteOpenHelper(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
    }
}
