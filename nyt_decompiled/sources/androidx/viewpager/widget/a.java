package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public float e(int i) {
        return 1.0f;
    }

    public abstract Object f(ViewGroup viewGroup, int i);

    public abstract boolean g(View view, Object obj);

    public abstract void h(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable i();

    public abstract void j(ViewGroup viewGroup, int i, Object obj);

    void k(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public abstract void l(ViewGroup viewGroup);
}
