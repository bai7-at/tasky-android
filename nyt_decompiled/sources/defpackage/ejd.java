package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ejd implements gqd {
    private final kke a;
    private final kke b;
    private final Context c;
    private final s1e d;
    private final View e;

    public ejd(kke kkeVar, kke kkeVar2, Context context, s1e s1eVar, ViewGroup viewGroup) {
        this.a = kkeVar;
        this.b = kkeVar2;
        this.c = context;
        this.d = s1eVar;
        this.e = viewGroup;
    }

    private final List c() {
        ArrayList arrayList = new ArrayList();
        View view = this.e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString(TransferTable.COLUMN_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    final /* synthetic */ fjd a() {
        return new fjd(this.c, this.d.e, c());
    }

    final /* synthetic */ fjd b() {
        return new fjd(this.c, this.d.e, c());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 3;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        mpa.a(this.c);
        return ((Boolean) pla.c().a(mpa.Aa)).booleanValue() ? this.b.j(new Callable() { // from class: cjd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ejd.this.a();
            }
        }) : this.a.j(new Callable() { // from class: djd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ejd.this.b();
            }
        });
    }
}
