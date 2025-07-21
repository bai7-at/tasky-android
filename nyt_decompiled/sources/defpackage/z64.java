package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.loader.content.b;
import defpackage.y64;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
class z64 extends y64 {
    static boolean c;
    private final d44 a;
    private final c b;

    public static class a extends fy4 implements b.a {
        private final int l;
        private final Bundle m;
        private final androidx.loader.content.b n;
        private d44 o;
        private b p;
        private androidx.loader.content.b q;

        a(int i, Bundle bundle, androidx.loader.content.b bVar, androidx.loader.content.b bVar2) {
            this.l = i;
            this.m = bundle;
            this.n = bVar;
            this.q = bVar2;
            bVar.q(i, this);
        }

        @Override // androidx.loader.content.b.a
        public void a(androidx.loader.content.b bVar, Object obj) {
            if (z64.c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(obj);
                return;
            }
            if (z64.c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            n(obj);
        }

        @Override // androidx.lifecycle.LiveData
        protected void l() {
            if (z64.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.n.t();
        }

        @Override // androidx.lifecycle.LiveData
        protected void m() {
            if (z64.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.n.u();
        }

        @Override // androidx.lifecycle.LiveData
        public void o(vc5 vc5Var) {
            super.o(vc5Var);
            this.o = null;
            this.p = null;
        }

        @Override // defpackage.fy4, androidx.lifecycle.LiveData
        public void p(Object obj) {
            super.p(obj);
            androidx.loader.content.b bVar = this.q;
            if (bVar != null) {
                bVar.r();
                this.q = null;
            }
        }

        androidx.loader.content.b q(boolean z) {
            if (z64.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.n.b();
            this.n.a();
            b bVar = this.p;
            if (bVar != null) {
                o(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.n.v(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.n;
            }
            this.n.r();
            return this.q;
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            this.n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(s().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        androidx.loader.content.b s() {
            return this.n;
        }

        void t() {
            d44 d44Var = this.o;
            b bVar = this.p;
            if (d44Var == null || bVar == null) {
                return;
            }
            super.o(bVar);
            j(d44Var, bVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            ic1.a(this.n, sb);
            sb.append("}}");
            return sb.toString();
        }

        androidx.loader.content.b u(d44 d44Var, y64.a aVar) {
            b bVar = new b(this.n, aVar);
            j(d44Var, bVar);
            vc5 vc5Var = this.p;
            if (vc5Var != null) {
                o(vc5Var);
            }
            this.o = d44Var;
            this.p = bVar;
            return this.n;
        }
    }

    static class b implements vc5 {
        private final androidx.loader.content.b a;
        private final y64.a b;
        private boolean c = false;

        b(androidx.loader.content.b bVar, y64.a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // defpackage.vc5
        public void a(Object obj) {
            if (z64.c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.d(obj));
            }
            this.b.a(this.a, obj);
            this.c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        boolean c() {
            return this.c;
        }

        void d() {
            if (this.c) {
                if (z64.c) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.c(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    static class c extends q {
        private static final t.b c = new a();
        private py7 a = new py7();
        private boolean b = false;

        static class a implements t.b {
            a() {
            }

            @Override // androidx.lifecycle.t.b
            public q a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(u uVar) {
            return (c) new t(uVar, c).a(c.class);
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.a.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.a.m(); i++) {
                    a aVar = (a) this.a.n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.a.h(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.b = false;
        }

        a i(int i) {
            return (a) this.a.e(i);
        }

        boolean j() {
            return this.b;
        }

        void k() {
            int m = this.a.m();
            for (int i = 0; i < m; i++) {
                ((a) this.a.n(i)).t();
            }
        }

        void l(int i, a aVar) {
            this.a.i(i, aVar);
        }

        void m() {
            this.b = true;
        }

        @Override // androidx.lifecycle.q
        protected void onCleared() {
            super.onCleared();
            int m = this.a.m();
            for (int i = 0; i < m; i++) {
                ((a) this.a.n(i)).q(true);
            }
            this.a.b();
        }
    }

    z64(d44 d44Var, u uVar) {
        this.a = d44Var;
        this.b = c.g(uVar);
    }

    private androidx.loader.content.b e(int i, Bundle bundle, y64.a aVar, androidx.loader.content.b bVar) {
        try {
            this.b.m();
            androidx.loader.content.b b2 = aVar.b(i, bundle);
            if (b2 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (b2.getClass().isMemberClass() && !Modifier.isStatic(b2.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
            }
            a aVar2 = new a(i, bundle, b2, bVar);
            if (c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.b.l(i, aVar2);
            this.b.f();
            return aVar2.u(this.a, aVar);
        } catch (Throwable th) {
            this.b.f();
            throw th;
        }
    }

    @Override // defpackage.y64
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.y64
    public androidx.loader.content.b c(int i, Bundle bundle, y64.a aVar) {
        if (this.b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a i2 = this.b.i(i);
        if (c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (i2 == null) {
            return e(i, bundle, aVar, null);
        }
        if (c) {
            Log.v("LoaderManager", "  Re-using existing loader " + i2);
        }
        return i2.u(this.a, aVar);
    }

    @Override // defpackage.y64
    public void d() {
        this.b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ic1.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
