package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import defpackage.au1;
import defpackage.cg0;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class Picasso {
    static final Handler o = new a(Looper.getMainLooper());
    static volatile Picasso p = null;
    private final e a;
    private final c b;
    private final List c;
    final Context d;
    final g e;
    final cg0 f;
    final t g;
    final Map h;
    final Map i;
    final ReferenceQueue j;
    final Bitmap.Config k;
    boolean l;
    volatile boolean m;
    boolean n;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().m) {
                    w.u("Main", "canceled", aVar.b.d(), "target got garbage collected");
                }
                aVar.a.a(aVar.k());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i2);
                    cVar.b.d(cVar);
                    i2++;
                }
                return;
            }
            if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i2 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i2);
                aVar2.a.m(aVar2);
                i2++;
            }
        }
    }

    public static class b {
        private final Context a;
        private au1 b;
        private ExecutorService c;
        private cg0 d;
        private e e;
        private List f;
        private Bitmap.Config g;
        private boolean h;
        private boolean i;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }

        public Picasso a() {
            Context context = this.a;
            if (this.b == null) {
                this.b = new m(context);
            }
            if (this.d == null) {
                this.d = new k(context);
            }
            if (this.c == null) {
                this.c = new o();
            }
            if (this.e == null) {
                this.e = e.a;
            }
            t tVar = new t(this.d);
            return new Picasso(context, new g(context, this.c, Picasso.o, this.b, this.d, tVar), this.d, null, this.e, this.f, tVar, this.g, this.h, this.i);
        }

        public b b(au1 au1Var) {
            if (au1Var == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.b = au1Var;
            return this;
        }

        public b c(boolean z) {
            this.h = z;
            return this;
        }

        public b d(boolean z) {
            this.i = z;
            return this;
        }
    }

    private static class c extends Thread {
        private final ReferenceQueue a;
        private final Handler b;

        class a implements Runnable {
            final /* synthetic */ Exception a;

            a(Exception exc) {
                this.a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.a = referenceQueue;
            this.b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0471a c0471a = (a.C0471a) this.a.remove(1000L);
                    Message obtainMessage = this.b.obtainMessage();
                    if (c0471a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0471a.a;
                        this.b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.b.post(new a(e));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public interface e {
        public static final e a = new a();

        static class a implements e {
            a() {
            }

            @Override // com.squareup.picasso.Picasso.e
            public p a(p pVar) {
                return pVar;
            }
        }

        p a(p pVar);
    }

    Picasso(Context context, g gVar, cg0 cg0Var, d dVar, e eVar, List list, t tVar, Bitmap.Config config, boolean z, boolean z2) {
        this.d = context;
        this.e = gVar;
        this.f = cg0Var;
        this.a = eVar;
        this.k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new s(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new h(context));
        arrayList.add(new NetworkRequestHandler(gVar.d, tVar));
        this.c = Collections.unmodifiableList(arrayList);
        this.g = tVar;
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.l = z;
        this.m = z2;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.j = referenceQueue;
        c cVar = new c(referenceQueue, o);
        this.b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.a aVar, Exception exc) {
        if (aVar.l()) {
            return;
        }
        if (!aVar.m()) {
            this.h.remove(aVar.k());
        }
        if (bitmap == null) {
            aVar.c(exc);
            if (this.m) {
                w.u("Main", "errored", aVar.b.d(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        aVar.b(bitmap, loadedFrom);
        if (this.m) {
            w.u("Main", "completed", aVar.b.d(), "from " + loadedFrom);
        }
    }

    public static void n(Picasso picasso) {
        if (picasso == null) {
            throw new IllegalArgumentException("Picasso must not be null.");
        }
        synchronized (Picasso.class) {
            try {
                if (p != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                p = picasso;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(Object obj) {
        w.c();
        com.squareup.picasso.a aVar = (com.squareup.picasso.a) this.h.remove(obj);
        if (aVar != null) {
            aVar.a();
            this.e.c(aVar);
        }
        if (obj instanceof ImageView) {
            f fVar = (f) this.i.remove((ImageView) obj);
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        a(imageView);
    }

    public void c(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        a(uVar);
    }

    void d(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a h = cVar.h();
        List i = cVar.i();
        boolean z = (i == null || i.isEmpty()) ? false : true;
        if (h != null || z) {
            Uri uri = cVar.j().d;
            Exception k = cVar.k();
            Bitmap s = cVar.s();
            LoadedFrom o2 = cVar.o();
            if (h != null) {
                f(s, o2, h, k);
            }
            if (z) {
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    f(s, o2, (com.squareup.picasso.a) i.get(i2), k);
                }
            }
        }
    }

    void e(ImageView imageView, f fVar) {
        if (this.i.containsKey(imageView)) {
            a(imageView);
        }
        this.i.put(imageView, fVar);
    }

    void g(com.squareup.picasso.a aVar) {
        Object k = aVar.k();
        if (k != null && this.h.get(k) != aVar) {
            a(k);
            this.h.put(k, aVar);
        }
        o(aVar);
    }

    List h() {
        return this.c;
    }

    public q i(int i) {
        if (i != 0) {
            return new q(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public q j(Uri uri) {
        return new q(this, uri, 0);
    }

    public q k(String str) {
        if (str == null) {
            return new q(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    Bitmap l(String str) {
        Bitmap bitmap = this.f.get(str);
        if (bitmap != null) {
            this.g.d();
        } else {
            this.g.e();
        }
        return bitmap;
    }

    void m(com.squareup.picasso.a aVar) {
        Bitmap l = MemoryPolicy.shouldReadFromMemoryCache(aVar.e) ? l(aVar.d()) : null;
        if (l == null) {
            g(aVar);
            if (this.m) {
                w.t("Main", "resumed", aVar.b.d());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        f(l, loadedFrom, aVar, null);
        if (this.m) {
            w.u("Main", "completed", aVar.b.d(), "from " + loadedFrom);
        }
    }

    void o(com.squareup.picasso.a aVar) {
        this.e.h(aVar);
    }

    p p(p pVar) {
        p a2 = this.a.a(pVar);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Request transformer " + this.a.getClass().getCanonicalName() + " returned null for " + pVar);
    }
}
