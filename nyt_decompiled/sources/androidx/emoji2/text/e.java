package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.a02;
import defpackage.h16;
import defpackage.su8;
import defpackage.vo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class e {
    private static final Object o = new Object();
    private static final Object p = new Object();
    private static volatile e q;
    private final Set b;
    private final b e;
    final h f;
    private final j g;
    final boolean h;
    final boolean i;
    final int[] j;
    private final boolean k;
    private final int l;
    private final int m;
    private final InterfaceC0080e n;
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private volatile int c = 3;
    private final Handler d = new Handler(Looper.getMainLooper());

    private static final class a extends b {
        private volatile androidx.emoji2.text.h b;
        private volatile l c;

        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0079a extends i {
            C0079a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                a.this.a.p(th);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                a.this.f(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        int a(CharSequence charSequence, int i) {
            return this.b.b(charSequence, i);
        }

        @Override // androidx.emoji2.text.e.b
        int b(CharSequence charSequence, int i) {
            return this.b.c(charSequence, i);
        }

        @Override // androidx.emoji2.text.e.b
        void c() {
            try {
                this.a.f.a(new C0079a());
            } catch (Throwable th) {
                this.a.p(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence d(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.j(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.e.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.h);
        }

        void f(l lVar) {
            if (lVar == null) {
                this.a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = lVar;
            l lVar2 = this.c;
            j jVar = this.a.g;
            InterfaceC0080e interfaceC0080e = this.a.n;
            e eVar = this.a;
            this.b = new androidx.emoji2.text.h(lVar2, jVar, interfaceC0080e, eVar.i, eVar.j, androidx.emoji2.text.g.a());
            this.a.q();
        }
    }

    private static class b {
        final e a;

        b(e eVar) {
            this.a = eVar;
        }

        abstract int a(CharSequence charSequence, int i);

        abstract int b(CharSequence charSequence, int i);

        abstract void c();

        abstract CharSequence d(CharSequence charSequence, int i, int i2, int i3, boolean z);

        abstract void e(EditorInfo editorInfo);
    }

    public static abstract class c {
        final h a;
        j b;
        boolean c;
        boolean d;
        int[] e;
        Set f;
        boolean g;
        int h = -16711936;
        int i = 0;
        InterfaceC0080e j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            h16.h(hVar, "metadataLoader cannot be null.");
            this.a = hVar;
        }

        protected final h a() {
            return this.a;
        }

        public c b(int i) {
            this.i = i;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public a02 a(m mVar) {
            return new su8(mVar);
        }
    }

    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0080e {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {
        private final List a;
        private final Throwable b;
        private final int c;

        g(f fVar, int i) {
            this(Arrays.asList((f) h16.h(fVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.a.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    ((f) this.a.get(i)).a(this.b);
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) this.a.get(i)).b();
                    i++;
                }
            }
        }

        g(Collection collection, int i) {
            this(collection, i, null);
        }

        g(Collection collection, int i, Throwable th) {
            h16.h(collection, "initCallbacks cannot be null");
            this.a = new ArrayList(collection);
            this.c = i;
            this.b = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    public interface j {
        a02 a(m mVar);
    }

    private e(c cVar) {
        this.h = cVar.c;
        this.i = cVar.d;
        this.j = cVar.e;
        this.k = cVar.g;
        this.l = cVar.h;
        this.f = cVar.a;
        this.m = cVar.i;
        this.n = cVar.j;
        vo voVar = new vo();
        this.b = voVar;
        j jVar = cVar.b;
        this.g = jVar == null ? new d() : jVar;
        Set set = cVar.f;
        if (set != null && !set.isEmpty()) {
            voVar.addAll(cVar.f);
        }
        this.e = new a(this);
        o();
    }

    public static e c() {
        e eVar;
        synchronized (o) {
            eVar = q;
            h16.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.h.d(inputConnection, editable, i2, i3, z);
    }

    public static boolean i(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.e(editable, i2, keyEvent);
    }

    public static e j(c cVar) {
        e eVar = q;
        if (eVar == null) {
            synchronized (o) {
                try {
                    eVar = q;
                    if (eVar == null) {
                        eVar = new e(cVar);
                        q = eVar;
                    }
                } finally {
                }
            }
        }
        return eVar;
    }

    public static boolean k() {
        return q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    private void o() {
        this.a.writeLock().lock();
        try {
            if (this.m == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (g() == 0) {
                this.e.c();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public int d(CharSequence charSequence, int i2) {
        return this.e.a(charSequence, i2);
    }

    public int e() {
        return this.l;
    }

    public int f(CharSequence charSequence, int i2) {
        return this.e.b(charSequence, i2);
    }

    public int g() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.k;
    }

    public void n() {
        h16.i(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.c();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    void p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i2, int i3) {
        return t(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i2, int i3, int i4) {
        return u(charSequence, i2, i3, i4, 0);
    }

    public CharSequence u(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        h16.i(m(), "Not initialized yet");
        h16.e(i2, "start cannot be negative");
        h16.e(i3, "end cannot be negative");
        h16.e(i4, "maxEmojiCount cannot be negative");
        h16.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        h16.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        h16.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.h : false;
        } else {
            z = true;
        }
        return this.e.d(charSequence, i2, i3, i4, z);
    }

    public void v(f fVar) {
        h16.h(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(fVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new g(fVar, this.c));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void w(f fVar) {
        h16.h(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(fVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.e(editorInfo);
    }
}
