package defpackage;

import androidx.datastore.core.DataMigrationInitializer;
import androidx.datastore.core.SingleProcessDataStore;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class da1 {
    public static final da1 a = new da1();

    private da1() {
    }

    public final ba1 a(rk7 rk7Var, rx6 rx6Var, List list, CoroutineScope coroutineScope, qs2 qs2Var) {
        zq3.h(rk7Var, "serializer");
        zq3.h(list, "migrations");
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "produceFile");
        return new SingleProcessDataStore(qs2Var, rk7Var, i.e(DataMigrationInitializer.a.b(list)), new t65(), coroutineScope);
    }
}
