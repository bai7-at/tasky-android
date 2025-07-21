package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import defpackage.tc8;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a {
    public final Context a;
    public final String b;
    public final tc8.c c;
    public final RoomDatabase.d d;
    public final List e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    private final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final List q;
    public final List r;
    public final boolean s;

    public a(Context context, String str, tc8.c cVar, RoomDatabase.d dVar, List list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, RoomDatabase.e eVar, List list2, List list3) {
        zq3.h(context, "context");
        zq3.h(cVar, "sqliteOpenHelperFactory");
        zq3.h(dVar, "migrationContainer");
        zq3.h(journalMode, "journalMode");
        zq3.h(executor, "queryExecutor");
        zq3.h(executor2, "transactionExecutor");
        zq3.h(list2, "typeConverters");
        zq3.h(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = cVar;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = intent != null;
    }

    public boolean a(int i, int i2) {
        if ((i > i2 && this.l) || !this.k) {
            return false;
        }
        Set set = this.m;
        return set == null || !set.contains(Integer.valueOf(i));
    }
}
