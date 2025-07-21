package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.u0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jha extends cia {
    private final Map i;
    private final View j;
    private final Context k;

    public jha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, Map map, View view, Context context) {
        super(jgaVar, "DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", u0Var, i, 85);
        this.i = map;
        this.j = view;
        this.k = context;
    }

    private final long c(int i) {
        Map map = this.i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cia
    protected final void a() {
        long[] jArr = {c(1), c(2)};
        Context context = this.k;
        if (context == null) {
            context = this.b.b();
        }
        long[] jArr2 = (long[]) this.f.invoke(null, jArr, context, this.j);
        long j = jArr2[0];
        this.i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.e) {
            this.e.v0(j);
            this.e.u0(j2);
        }
    }
}
