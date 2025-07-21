package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes.dex */
public abstract class py1 {
    private static final ns1 a = new ns1();

    public static final void a(Object obj, ss2 ss2Var, Composer composer, int i) {
        composer.z(-1371986847);
        if (b.G()) {
            b.S(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        composer.z(1157296644);
        boolean S = composer.S(obj);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new ls1(ss2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void b(Object obj, Object obj2, ss2 ss2Var, Composer composer, int i) {
        composer.z(1429097729);
        if (b.G()) {
            b.S(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        composer.z(511388516);
        boolean S = composer.S(obj) | composer.S(obj2);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new ls1(ss2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void c(Object obj, Object obj2, Object obj3, ss2 ss2Var, Composer composer, int i) {
        composer.z(-1239538271);
        if (b.G()) {
            b.S(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        composer.z(1618982084);
        boolean S = composer.S(obj) | composer.S(obj2) | composer.S(obj3);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new ls1(ss2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void d(Object obj, gt2 gt2Var, Composer composer, int i) {
        composer.z(1179185413);
        if (b.G()) {
            b.S(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        CoroutineContext n = composer.n();
        composer.z(1157296644);
        boolean S = composer.S(obj);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new k(n, gt2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void e(Object obj, Object obj2, gt2 gt2Var, Composer composer, int i) {
        composer.z(590241125);
        if (b.G()) {
            b.S(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext n = composer.n();
        composer.z(511388516);
        boolean S = composer.S(obj) | composer.S(obj2);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new k(n, gt2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void f(Object obj, Object obj2, Object obj3, gt2 gt2Var, Composer composer, int i) {
        composer.z(-54093371);
        if (b.G()) {
            b.S(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext n = composer.n();
        composer.z(1618982084);
        boolean S = composer.S(obj) | composer.S(obj2) | composer.S(obj3);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            composer.q(new k(n, gt2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void g(Object[] objArr, gt2 gt2Var, Composer composer, int i) {
        composer.z(-139560008);
        if (b.G()) {
            b.S(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        CoroutineContext n = composer.n();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.z(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= composer.S(obj);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            composer.q(new k(n, gt2Var));
        }
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void h(qs2 qs2Var, Composer composer, int i) {
        if (b.G()) {
            b.S(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer.L(qs2Var);
        if (b.G()) {
            b.R();
        }
    }

    public static final CoroutineScope j(CoroutineContext coroutineContext, Composer composer) {
        CompletableJob Job$default;
        Job.Key key = Job.Key;
        if (coroutineContext.get(key) == null) {
            CoroutineContext n = composer.n();
            return CoroutineScopeKt.CoroutineScope(n.plus(JobKt.Job((Job) n.get(key))).plus(coroutineContext));
        }
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Job$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.CoroutineScope(Job$default);
    }
}
