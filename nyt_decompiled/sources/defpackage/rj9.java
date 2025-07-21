package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes.dex */
public class rj9 implements rg8 {
    private final fk7 a;
    private final CoroutineDispatcher b;
    final Handler c = new Handler(Looper.getMainLooper());
    private final Executor d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            rj9.this.c.post(runnable);
        }
    }

    public rj9(Executor executor) {
        fk7 fk7Var = new fk7(executor);
        this.a = fk7Var;
        this.b = ExecutorsKt.from(fk7Var);
    }

    @Override // defpackage.rg8
    public Executor a() {
        return this.d;
    }

    @Override // defpackage.rg8
    public CoroutineDispatcher b() {
        return this.b;
    }

    @Override // defpackage.rg8
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public fk7 c() {
        return this.a;
    }
}
