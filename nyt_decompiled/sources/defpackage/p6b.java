package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p6b extends q6b implements uxa {
    private final wlb c;
    private final Context d;
    private final WindowManager e;
    private final roa f;
    DisplayMetrics g;
    private float h;
    int i;
    int j;
    private int k;
    int l;
    int m;
    int n;
    int o;

    public p6b(wlb wlbVar, Context context, roa roaVar) {
        super(wlbVar, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = wlbVar;
        this.d = context;
        this.f = roaVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // defpackage.uxa
    public final /* synthetic */ void a(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        kia.b();
        DisplayMetrics displayMetrics = this.g;
        this.i = tfb.x(displayMetrics, displayMetrics.widthPixels);
        kia.b();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = tfb.x(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.c.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        } else {
            dyf.r();
            int[] p = wxf.p(zzi);
            kia.b();
            this.l = tfb.x(this.g, p[0]);
            kia.b();
            this.m = tfb.x(this.g, p[1]);
        }
        if (this.c.zzO().i()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.c.measure(0, 0);
        }
        e(this.i, this.j, this.l, this.m, this.h, this.k);
        o6b o6bVar = new o6b();
        roa roaVar = this.f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        o6bVar.e(roaVar.a(intent));
        roa roaVar2 = this.f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        o6bVar.c(roaVar2.a(intent2));
        o6bVar.a(this.f.b());
        o6bVar.d(this.f.c());
        o6bVar.b(true);
        z = o6bVar.a;
        z2 = o6bVar.b;
        z3 = o6bVar.c;
        z4 = o6bVar.d;
        z5 = o6bVar.e;
        wlb wlbVar = this.c;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            fgb.e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        wlbVar.k("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        h(kia.b().e(this.d, iArr[0]), kia.b().e(this.d, iArr[1]));
        if (fgb.j(2)) {
            fgb.f("Dispatching Ready Event.");
        }
        d(this.c.zzn().zza);
    }

    public final void h(int i, int i2) {
        int i3;
        Context context = this.d;
        int i4 = 0;
        if (context instanceof Activity) {
            dyf.r();
            i3 = wxf.q((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.c.zzO() == null || !this.c.zzO().i()) {
            wlb wlbVar = this.c;
            int width = wlbVar.getWidth();
            int height = wlbVar.getHeight();
            if (((Boolean) pla.c().a(mpa.R)).booleanValue()) {
                if (width == 0) {
                    width = this.c.zzO() != null ? this.c.zzO().c : 0;
                }
                if (height == 0) {
                    if (this.c.zzO() != null) {
                        i4 = this.c.zzO().b;
                    }
                    this.n = kia.b().e(this.d, width);
                    this.o = kia.b().e(this.d, i4);
                }
            }
            i4 = height;
            this.n = kia.b().e(this.d, width);
            this.o = kia.b().e(this.d, i4);
        }
        b(i, i2 - i3, this.n, this.o);
        this.c.zzN().l0(i, i2);
    }
}
