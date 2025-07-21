package defpackage;

import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator;
import com.nytimes.android.eventtracker.validator.Validator;

/* loaded from: classes4.dex */
public abstract class eh1 implements op4 {
    public static void a(DefaultEventCoordinator defaultEventCoordinator, ab abVar) {
        defaultEventCoordinator.agentProvider = abVar;
    }

    public static void b(DefaultEventCoordinator defaultEventCoordinator, an anVar) {
        defaultEventCoordinator.appStateProvider = anVar;
    }

    public static void c(DefaultEventCoordinator defaultEventCoordinator, fu fuVar) {
        defaultEventCoordinator.asyncDataProvider = fuVar;
    }

    public static void d(DefaultEventCoordinator defaultEventCoordinator, cm0 cm0Var) {
        defaultEventCoordinator.clockProvider = cm0Var;
    }

    public static void e(DefaultEventCoordinator defaultEventCoordinator, EventTracker.a aVar) {
        defaultEventCoordinator.configuration = aVar;
    }

    public static void f(DefaultEventCoordinator defaultEventCoordinator, n01 n01Var) {
        defaultEventCoordinator.coroutineDispatchers = n01Var;
    }

    public static void g(DefaultEventCoordinator defaultEventCoordinator, g32 g32Var) {
        defaultEventCoordinator.eventBuffer = g32Var;
    }

    public static void h(DefaultEventCoordinator defaultEventCoordinator, c44 c44Var) {
        defaultEventCoordinator.eventFlushLifecycleObserver = c44Var;
    }

    public static void i(DefaultEventCoordinator defaultEventCoordinator, c44 c44Var) {
        defaultEventCoordinator.eventJobManagerLifecycleObserver = c44Var;
    }

    public static void j(DefaultEventCoordinator defaultEventCoordinator, u42 u42Var) {
        defaultEventCoordinator.eventReporter = u42Var;
    }

    public static void k(DefaultEventCoordinator defaultEventCoordinator, z32 z32Var) {
        defaultEventCoordinator.jobManager = z32Var;
    }

    public static void l(DefaultEventCoordinator defaultEventCoordinator, ls4 ls4Var) {
        defaultEventCoordinator.metaProvider = ls4Var;
    }

    public static void m(DefaultEventCoordinator defaultEventCoordinator, String str) {
        defaultEventCoordinator.secureDeviceId = str;
    }

    public static void n(DefaultEventCoordinator defaultEventCoordinator, jl7 jl7Var) {
        defaultEventCoordinator.sessionProvider = jl7Var;
    }

    public static void o(DefaultEventCoordinator defaultEventCoordinator, Validator validator) {
        defaultEventCoordinator.validator = validator;
    }
}
