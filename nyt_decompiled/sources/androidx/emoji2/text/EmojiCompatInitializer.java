package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.d44;
import defpackage.ei1;
import defpackage.uj3;
import defpackage.xo8;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements uj3 {

    static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements e.h {
        private final Context a;

        class a extends e.i {
            final /* synthetic */ e.i a;
            final /* synthetic */ ThreadPoolExecutor b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = iVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                try {
                    this.a.b(lVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor b = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(iVar, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a2 = androidx.emoji2.text.c.a(this.a);
                if (a2 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a2.c(threadPoolExecutor);
                a2.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                xo8.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.k()) {
                    e.c().n();
                }
            } finally {
                xo8.b();
            }
        }
    }

    @Override // defpackage.uj3
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.uj3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.j(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final Lifecycle lifecycle = ((d44) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new ei1() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.ei1
            public void onResume(d44 d44Var) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
