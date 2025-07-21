package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import androidx.emoji2.text.i;
import defpackage.fn2;
import defpackage.h16;
import defpackage.ru8;
import defpackage.sm2;
import defpackage.xo8;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class i extends e.c {
    private static final a k = new a();

    public static class a {
        public Typeface a(Context context, fn2.b bVar) {
            return fn2.a(context, null, new fn2.b[]{bVar});
        }

        public fn2.a b(Context context, sm2 sm2Var) {
            return fn2.b(context, null, sm2Var);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {
        private final Context a;
        private final sm2 b;
        private final a c;
        private final Object d = new Object();
        private Handler e;
        private Executor f;
        private ThreadPoolExecutor g;
        e.i h;
        private ContentObserver i;
        private Runnable j;

        b(Context context, sm2 sm2Var, a aVar) {
            h16.h(context, "Context cannot be null");
            h16.h(sm2Var, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = sm2Var;
            this.c = aVar;
        }

        private void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private fn2.b e() {
            try {
                fn2.a b = this.c.b(this.a, this.b);
                if (b.c() == 0) {
                    fn2.b[] b2 = b.b();
                    if (b2 == null || b2.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b2[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            h16.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        fn2.b e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                        }
                        try {
                            xo8.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a = this.c.a(this.a, e);
                            ByteBuffer a2 = ru8.a(this.a, null, e.d());
                            if (a2 == null || a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            l b2 = l.b(a, a2);
                            xo8.b();
                            synchronized (this.d) {
                                try {
                                    e.i iVar = this.h;
                                    if (iVar != null) {
                                        iVar.b(b2);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            xo8.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                e.i iVar2 = this.h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor b = androidx.emoji2.text.b.b("emojiCompat");
                        this.g = b;
                        this.f = b;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public i(Context context, sm2 sm2Var) {
        super(new b(context, sm2Var, k));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
