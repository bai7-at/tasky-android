package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c41 implements g {
    public static final c41 c = new c41(ImmutableList.x(), 0);
    private static final String d = z19.t0(0);
    private static final String e = z19.t0(1);
    public static final g.a f = new g.a() { // from class: b41
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            c41 d2;
            d2 = c41.d(bundle);
            return d2;
        }
    };
    public final ImmutableList a;
    public final long b;

    public c41(List list, long j) {
        this.a = ImmutableList.t(list);
        this.b = j;
    }

    private static ImmutableList c(List list) {
        ImmutableList.a p = ImmutableList.p();
        for (int i = 0; i < list.size(); i++) {
            if (((y31) list.get(i)).d == null) {
                p.a((y31) list.get(i));
            }
        }
        return p.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c41 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d);
        return new c41(parcelableArrayList == null ? ImmutableList.x() : pe0.d(y31.i0, parcelableArrayList), bundle.getLong(e));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(d, pe0.i(c(this.a)));
        bundle.putLong(e, this.b);
        return bundle;
    }
}
