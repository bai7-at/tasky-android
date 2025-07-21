package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzdyz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class rda {
    private final Context a;
    private final eyc b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private PointF i;
    private PointF j;
    private Handler k;
    private Runnable l;

    public rda(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: s0a
            @Override // java.lang.Runnable
            public final void run() {
                rda.this.g();
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        dyf.v().b();
        this.k = dyf.v().a();
        this.b = dyf.u().a();
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = u(arrayList, "None", true);
        final int u2 = u(arrayList, "Shake", true);
        final int u3 = u(arrayList, "Flick", true);
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.b.a().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        dyf.r();
        AlertDialog.Builder j = wxf.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        j.setTitle("Setup gesture");
        j.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: aaa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        j.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: taa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                rda.this.r();
            }
        });
        j.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: uba
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                rda.this.h(atomicInteger, i, u2, u3, dialogInterface, i2);
            }
        });
        j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tca
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rda.this.r();
            }
        });
        j.create().show();
    }

    private final boolean t(float f, float f2, float f3, float f4) {
        return Math.abs(this.i.x - f) < ((float) this.h) && Math.abs(this.i.y - f2) < ((float) this.h) && Math.abs(this.j.x - f3) < ((float) this.h) && Math.abs(this.j.y - f4) < ((float) this.h);
    }

    private static final int u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.a);
    }

    final /* synthetic */ void b() {
        s(this.a);
    }

    final /* synthetic */ void c(kke kkeVar) {
        if (dyf.u().j(this.a, this.d, this.e)) {
            kkeVar.execute(new Runnable() { // from class: o7a
                @Override // java.lang.Runnable
                public final void run() {
                    rda.this.b();
                }
            });
        } else {
            dyf.u().d(this.a, this.d, this.e);
        }
    }

    final /* synthetic */ void d(kke kkeVar) {
        if (dyf.u().j(this.a, this.d, this.e)) {
            kkeVar.execute(new Runnable() { // from class: j6a
                @Override // java.lang.Runnable
                public final void run() {
                    rda.this.f();
                }
            });
        } else {
            dyf.u().d(this.a, this.d, this.e);
        }
    }

    final /* synthetic */ void e() {
        dyf.u().c(this.a);
    }

    final /* synthetic */ void f() {
        dyf.u().c(this.a);
    }

    final /* synthetic */ void g() {
        this.g = 4;
        r();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.b.l(zzdyz.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.b.l(zzdyz.FLICK);
            } else {
                this.b.l(zzdyz.NONE);
            }
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i) {
        dyf.r();
        wxf.s(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                fgb.b("Debug mode [Creative Preview] selected.");
                pgb.a.execute(new Runnable() { // from class: o1a
                    @Override // java.lang.Runnable
                    public final void run() {
                        rda.this.l();
                    }
                });
                return;
            }
            if (i6 == i3) {
                fgb.b("Debug mode [Troubleshooting] selected.");
                pgb.a.execute(new Runnable() { // from class: zz9
                    @Override // java.lang.Runnable
                    public final void run() {
                        rda.this.k();
                    }
                });
                return;
            }
            if (i6 == i4) {
                eyc eycVar = this.b;
                final kke kkeVar = pgb.e;
                kke kkeVar2 = pgb.a;
                if (eycVar.p()) {
                    kkeVar.execute(new Runnable() { // from class: fda
                        @Override // java.lang.Runnable
                        public final void run() {
                            rda.this.e();
                        }
                    });
                    return;
                } else {
                    kkeVar2.execute(new Runnable() { // from class: xy9
                        @Override // java.lang.Runnable
                        public final void run() {
                            rda.this.d(kkeVar);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                eyc eycVar2 = this.b;
                final kke kkeVar3 = pgb.e;
                kke kkeVar4 = pgb.a;
                if (eycVar2.p()) {
                    kkeVar3.execute(new Runnable() { // from class: nx9
                        @Override // java.lang.Runnable
                        public final void run() {
                            rda.this.a();
                        }
                    });
                    return;
                } else {
                    kkeVar4.execute(new Runnable() { // from class: c5a
                        @Override // java.lang.Runnable
                        public final void run() {
                            rda.this.c(kkeVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.a instanceof Activity)) {
            fgb.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            dyf.r();
            Map o = wxf.o(build);
            for (String str3 : o.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) o.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        dyf.r();
        AlertDialog.Builder j = wxf.j(this.a);
        j.setMessage(str2);
        j.setTitle("Ad Information");
        j.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: u2a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
                rda.this.i(str2, dialogInterface2, i7);
            }
        });
        j.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: v3a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i7) {
            }
        });
        j.create().show();
    }

    final /* synthetic */ void k() {
        fia u = dyf.u();
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        boolean m = u.m();
        Context context = this.a;
        u.h(u.j(context, str, str2));
        if (!u.m()) {
            u.d(context, str, str2);
            return;
        }
        if (!m && !TextUtils.isEmpty(str3)) {
            u.e(context, str2, str3, str);
        }
        fgb.b("Device is linked for debug signals.");
        u.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        fia u = dyf.u();
        Context context = this.a;
        String str = this.d;
        String str2 = this.e;
        if (!u.k(context, str, str2)) {
            u.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(u.f)) {
            fgb.b("Creative is not pushed for this device.");
            u.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(u.f)) {
            fgb.b("The app is not linked for creative preview.");
            u.d(context, str, str2);
        } else if ("0".equals(u.f)) {
            fgb.b("Device is linked for in app preview.");
            u.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.k.postDelayed(this.l, ((Long) pla.c().a(mpa.B4)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            this.k.removeCallbacks(this.l);
        }
    }

    public final void n(String str) {
        this.d = str;
    }

    public final void o(String str) {
        this.e = str;
    }

    public final void p(String str) {
        this.c = str;
    }

    public final void q(String str) {
        this.f = str;
    }

    public final void r() {
        try {
            if (!(this.a instanceof Activity)) {
                fgb.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(dyf.u().b())) {
                str = "Creative preview";
            }
            String str2 = true != dyf.u().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u = u(arrayList, "Ad information", true);
            final int u2 = u(arrayList, str, true);
            final int u3 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) pla.c().a(mpa.c9)).booleanValue();
            final int u4 = u(arrayList, "Open ad inspector", booleanValue);
            final int u5 = u(arrayList, "Ad inspector settings", booleanValue);
            dyf.r();
            AlertDialog.Builder j = wxf.j(this.a);
            j.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: u8a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    rda.this.j(u, u2, u3, u4, u5, dialogInterface, i);
                }
            });
            j.create().show();
        } catch (WindowManager.BadTokenException e) {
            pzc.l("", e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public rda(Context context, String str) {
        this(context);
        this.c = str;
    }
}
