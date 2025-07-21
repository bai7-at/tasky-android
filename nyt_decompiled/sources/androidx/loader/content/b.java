package androidx.loader.content;

import android.content.Context;
import defpackage.ic1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class b {
    int a;
    a b;
    Context c;
    boolean d = false;
    boolean e = false;
    boolean f = true;
    boolean g = false;
    boolean h = false;

    public interface a {
        void a(b bVar, Object obj);
    }

    public b(Context context) {
        this.c = context.getApplicationContext();
    }

    public void a() {
        this.e = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        ic1.a(obj, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
    }

    public void f(Object obj) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.e;
    }

    protected void j() {
    }

    protected abstract boolean k();

    public void l() {
        if (this.d) {
            h();
        } else {
            this.g = true;
        }
    }

    protected void m() {
    }

    protected void n() {
    }

    protected abstract void o();

    protected void p() {
    }

    public void q(int i, a aVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = aVar;
        this.a = i;
    }

    public void r() {
        n();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void s() {
        if (this.h) {
            l();
        }
    }

    public final void t() {
        this.d = true;
        this.f = false;
        this.e = false;
        o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        ic1.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        this.d = false;
        p();
    }

    public void v(a aVar) {
        a aVar2 = this.b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }
}
