package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
abstract class o62 {
    static Executor a() {
        return new n77(Executors.newSingleThreadExecutor());
    }
}
