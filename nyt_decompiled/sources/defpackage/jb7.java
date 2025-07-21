package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public interface jb7 {

    public static final class a {
        public static Scheduler a(jb7 jb7Var) {
            Scheduler computation = Schedulers.computation();
            zq3.g(computation, "computation(...)");
            return computation;
        }

        public static Scheduler b(jb7 jb7Var) {
            Scheduler io2 = Schedulers.io();
            zq3.g(io2, "io(...)");
            return io2;
        }
    }

    Scheduler a();

    Scheduler b();
}
