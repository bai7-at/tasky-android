package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public final class c57 {
    public static final c57 a = new c57();

    private c57() {
    }

    public final Scheduler a() {
        Scheduler io2 = Schedulers.io();
        zq3.g(io2, "io(...)");
        return io2;
    }

    public final Scheduler b() {
        Scheduler mainThread = AndroidSchedulers.mainThread();
        zq3.g(mainThread, "mainThread(...)");
        return mainThread;
    }
}
