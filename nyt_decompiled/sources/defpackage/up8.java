package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class up8 implements g {
    private static final String f = z19.t0(0);
    private static final String g = z19.t0(1);
    public static final g.a h = new g.a() { // from class: tp8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            up8 f2;
            f2 = up8.f(bundle);
            return f2;
        }
    };
    public final int a;
    public final String b;
    public final int c;
    private final t0[] d;
    private int e;

    public up8(t0... t0VarArr) {
        this("", t0VarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ up8 f(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        return new up8(bundle.getString(g, ""), (t0[]) (parcelableArrayList == null ? ImmutableList.x() : pe0.d(t0.O0, parcelableArrayList)).toArray(new t0[0]));
    }

    private static void g(String str, String str2, String str3, int i) {
        a84.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    private static String h(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int i(int i) {
        return i | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    private void j() {
        String h2 = h(this.d[0].c);
        int i = i(this.d[0].e);
        int i2 = 1;
        while (true) {
            t0[] t0VarArr = this.d;
            if (i2 >= t0VarArr.length) {
                return;
            }
            if (!h2.equals(h(t0VarArr[i2].c))) {
                t0[] t0VarArr2 = this.d;
                g("languages", t0VarArr2[0].c, t0VarArr2[i2].c, i2);
                return;
            } else {
                if (i != i(this.d[i2].e)) {
                    g("role flags", Integer.toBinaryString(this.d[0].e), Integer.toBinaryString(this.d[i2].e), i2);
                    return;
                }
                i2++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.d.length);
        for (t0 t0Var : this.d) {
            arrayList.add(t0Var.j(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public up8 c(String str) {
        return new up8(str, this.d);
    }

    public t0 d(int i) {
        return this.d[i];
    }

    public int e(t0 t0Var) {
        int i = 0;
        while (true) {
            t0[] t0VarArr = this.d;
            if (i >= t0VarArr.length) {
                return -1;
            }
            if (t0Var == t0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up8.class != obj.getClass()) {
            return false;
        }
        up8 up8Var = (up8) obj;
        return this.b.equals(up8Var.b) && Arrays.equals(this.d, up8Var.d);
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((527 + this.b.hashCode()) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public up8(String str, t0... t0VarArr) {
        ur.a(t0VarArr.length > 0);
        this.b = str;
        this.d = t0VarArr;
        this.a = t0VarArr.length;
        int k = ku4.k(t0VarArr[0].l);
        this.c = k == -1 ? ku4.k(t0VarArr[0].k) : k;
        j();
    }
}
