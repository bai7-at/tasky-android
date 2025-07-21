package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* loaded from: classes3.dex */
public final class k6b extends q6b {
    static final Set u = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final Object k;
    private final wlb l;
    private final Activity m;
    private unb n;
    private ImageView o;
    private LinearLayout p;
    private final r6b q;
    private PopupWindow r;
    private RelativeLayout s;
    private ViewGroup t;

    public k6b(wlb wlbVar, r6b r6bVar) {
        super(wlbVar, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = wlbVar;
        this.m = wlbVar.zzi();
        this.q = r6bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(boolean z) {
        this.r.dismiss();
        this.s.removeView((View) this.l);
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.removeView(this.o);
            this.t.addView((View) this.l);
            this.l.t0(this.n);
        }
        if (z) {
            g("default");
            r6b r6bVar = this.q;
            if (r6bVar != null) {
                r6bVar.zzb();
            }
        }
        this.r = null;
        this.s = null;
        this.t = null;
        this.p = null;
    }

    public final void h(final boolean z) {
        synchronized (this.k) {
            try {
                if (this.r != null) {
                    if (!((Boolean) pla.c().a(mpa.pa)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        j(z);
                    } else {
                        pgb.e.l(new Runnable() { // from class: i6b
                            @Override // java.lang.Runnable
                            public final void run() {
                                k6b.this.j(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0015, B:12:0x001d, B:13:0x0022, B:15:0x0024, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003f, B:23:0x0044, B:25:0x0046, B:27:0x0054, B:28:0x0065, B:30:0x0073, B:31:0x0084, B:33:0x0092, B:34:0x00a3, B:36:0x00b1, B:37:0x00c2, B:39:0x00d0, B:40:0x00de, B:42:0x00ec, B:43:0x00ee, B:45:0x00f2, B:47:0x00f6, B:49:0x00fe, B:52:0x0106, B:56:0x012c, B:62:0x0138, B:65:0x0260, B:66:0x0265, B:68:0x0267, B:70:0x0287, B:72:0x028b, B:74:0x0298, B:75:0x02d4, B:90:0x038d, B:91:0x03bc, B:93:0x03d4, B:94:0x03f5, B:96:0x03fd, B:97:0x0404, B:98:0x042a, B:102:0x042d, B:104:0x0452, B:105:0x0467, B:107:0x0394, B:108:0x039b, B:109:0x03a2, B:110:0x03a9, B:111:0x03af, B:112:0x03b6, B:129:0x02d1, B:130:0x0469, B:131:0x046e, B:133:0x0140, B:135:0x0144, B:146:0x0197, B:147:0x01a1, B:149:0x01f4, B:151:0x01f7, B:153:0x01fb, B:156:0x0202, B:157:0x01a5, B:158:0x01af, B:159:0x01b6, B:160:0x01c2, B:161:0x01ca, B:162:0x01de, B:163:0x01ea, B:180:0x0211, B:183:0x023b, B:186:0x024b, B:187:0x0241, B:189:0x0249, B:190:0x0233, B:192:0x0239, B:193:0x0250, B:194:0x0257, B:195:0x0470, B:196:0x0475, B:198:0x0477, B:199:0x047c), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0267 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0015, B:12:0x001d, B:13:0x0022, B:15:0x0024, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003f, B:23:0x0044, B:25:0x0046, B:27:0x0054, B:28:0x0065, B:30:0x0073, B:31:0x0084, B:33:0x0092, B:34:0x00a3, B:36:0x00b1, B:37:0x00c2, B:39:0x00d0, B:40:0x00de, B:42:0x00ec, B:43:0x00ee, B:45:0x00f2, B:47:0x00f6, B:49:0x00fe, B:52:0x0106, B:56:0x012c, B:62:0x0138, B:65:0x0260, B:66:0x0265, B:68:0x0267, B:70:0x0287, B:72:0x028b, B:74:0x0298, B:75:0x02d4, B:90:0x038d, B:91:0x03bc, B:93:0x03d4, B:94:0x03f5, B:96:0x03fd, B:97:0x0404, B:98:0x042a, B:102:0x042d, B:104:0x0452, B:105:0x0467, B:107:0x0394, B:108:0x039b, B:109:0x03a2, B:110:0x03a9, B:111:0x03af, B:112:0x03b6, B:129:0x02d1, B:130:0x0469, B:131:0x046e, B:133:0x0140, B:135:0x0144, B:146:0x0197, B:147:0x01a1, B:149:0x01f4, B:151:0x01f7, B:153:0x01fb, B:156:0x0202, B:157:0x01a5, B:158:0x01af, B:159:0x01b6, B:160:0x01c2, B:161:0x01ca, B:162:0x01de, B:163:0x01ea, B:180:0x0211, B:183:0x023b, B:186:0x024b, B:187:0x0241, B:189:0x0249, B:190:0x0233, B:192:0x0239, B:193:0x0250, B:194:0x0257, B:195:0x0470, B:196:0x0475, B:198:0x0477, B:199:0x047c), top: B:3:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6b.i(java.util.Map):void");
    }

    public final void k(int i, int i2, boolean z) {
        synchronized (this.k) {
            this.e = i;
            this.f = i2;
        }
    }

    public final void l(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
