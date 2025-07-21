package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ir3 {
    private final List a = new ArrayList();
    private final DataSetObservable b = new DataSetObservable();
    private List c = Collections.emptyList();
    private boolean d = false;
    private final Handler e = new a(Looper.getMainLooper());
    private final DataSetObserver f = new b();

    class a extends Handler {
        WeakReference a;

        a(Looper looper) {
            super(looper);
            this.a = new WeakReference(ir3.this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            if (this.a.get() != null && (i = message.what) == 1) {
                removeMessages(i);
                if (((ir3) this.a.get()).d) {
                    return;
                }
                ((ir3) this.a.get()).h();
            }
        }
    }

    class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ir3.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List f = f(this.a);
        if (this.c.equals(f)) {
            return;
        }
        this.c = f;
        this.b.notifyChanged();
    }

    public void c(pm0 pm0Var) {
        this.a.add(pm0Var);
        pm0Var.d(this.f);
        i();
    }

    public void d() {
        if (this.e.hasMessages(1)) {
            this.e.removeMessages(1);
            h();
        }
    }

    public List e() {
        return new ArrayList(this.c);
    }

    protected abstract List f(List list);

    public void g() {
        this.b.unregisterAll();
        this.d = true;
        this.e.removeMessages(1);
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((pm0) it2.next()).c();
        }
    }

    protected void i() {
        if (this.d) {
            return;
        }
        this.e.sendEmptyMessage(1);
    }

    public void j(DataSetObserver dataSetObserver) {
        this.b.registerObserver(dataSetObserver);
    }
}
