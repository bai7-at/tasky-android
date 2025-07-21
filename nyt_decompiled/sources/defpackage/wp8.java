package defpackage;

import android.os.Bundle;
import com.google.android.exoplayer2.g;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class wp8 implements g {
    public static final wp8 d = new wp8(new up8[0]);
    private static final String e = z19.t0(0);
    public static final g.a f = new g.a() { // from class: vp8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            wp8 e2;
            e2 = wp8.e(bundle);
            return e2;
        }
    };
    public final int a;
    private final ImmutableList b;
    private int c;

    public wp8(up8... up8VarArr) {
        this.b = ImmutableList.u(up8VarArr);
        this.a = up8VarArr.length;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wp8 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e);
        return parcelableArrayList == null ? new wp8(new up8[0]) : new wp8((up8[]) pe0.d(up8.h, parcelableArrayList).toArray(new up8[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f() {
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (((up8) this.b.get(i)).equals(this.b.get(i3))) {
                    a84.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e, pe0.i(this.b));
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public up8 c(int i) {
        return (up8) this.b.get(i);
    }

    public int d(up8 up8Var) {
        int indexOf = this.b.indexOf(up8Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wp8.class != obj.getClass()) {
            return false;
        }
        wp8 wp8Var = (wp8) obj;
        return this.a == wp8Var.a && this.b.equals(wp8Var.b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
