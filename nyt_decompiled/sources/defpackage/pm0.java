package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
public abstract class pm0 {
    private ImmutableList b = ImmutableList.x();
    private final DataSetObservable a = new DataSetObservable();

    public ImmutableList a() {
        return this.b;
    }

    protected void b(ImmutableList immutableList) {
        this.b = immutableList;
        this.a.notifyChanged();
    }

    public void c() {
    }

    protected void d(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }
}
