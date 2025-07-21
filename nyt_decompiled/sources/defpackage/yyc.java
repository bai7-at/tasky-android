package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zb;
import defpackage.n7;
import defpackage.p15;
import defpackage.q6;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yyc extends gfc {
    final Map a = new HashMap();
    private final Context b;
    private final WeakReference c;
    private final myc d;
    private final kke e;
    private final zyc f;
    private eyc g;

    yyc(Context context, WeakReference weakReference, myc mycVar, zyc zycVar, kke kkeVar) {
        this.b = context;
        this.c = weakReference;
        this.d = mycVar;
        this.e = kkeVar;
        this.f = zycVar;
    }

    private final Context D6() {
        Context context = (Context) this.c.get();
        return context == null ? this.b : context;
    }

    private static n7 E6() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return ((n7.a) new n7.a().b(AdMobAdapter.class, bundle)).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String F6(Object obj) {
        r07 c;
        qkc f;
        if (obj instanceof t64) {
            c = ((t64) obj).f();
        } else if (obj instanceof rm) {
            c = ((rm) obj).a();
        } else if (obj instanceof vq3) {
            c = ((vq3) obj).a();
        } else if (obj instanceof o17) {
            c = ((o17) obj).a();
        } else if (obj instanceof q17) {
            c = ((q17) obj).a();
        } else if (obj instanceof a8) {
            c = ((a8) obj).getResponseInfo();
        } else {
            if (!(obj instanceof p15)) {
                return "";
            }
            c = ((p15) obj).c();
        }
        if (c == null || (f = c.f()) == null) {
            return "";
        }
        try {
            return f.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void G6(String str, String str2) {
        try {
            zb.r(this.g.b(str), new wyc(this, str2), this.e);
        } catch (NullPointerException e) {
            dyf.q().w(e, "OutOfContextTester.setAdAsOutOfContext");
            this.d.f(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zb.r(this.g.b(str), new xyc(this, str2), this.e);
        } catch (NullPointerException e) {
            dyf.q().w(e, "OutOfContextTester.setAdAsShown");
            this.d.f(str2);
        }
    }

    protected final synchronized void A6(String str, Object obj, String str2) {
        this.a.put(str, obj);
        G6(F6(obj), str2);
    }

    @Override // defpackage.kgc
    public final void B1(String str, ee3 ee3Var, ee3 ee3Var2) {
        Context context = (Context) fc5.Q1(ee3Var);
        ViewGroup viewGroup = (ViewGroup) fc5.Q1(ee3Var2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.a.get(str);
        if (obj != null) {
            this.a.remove(str);
        }
        if (obj instanceof a8) {
            zyc.a(context, viewGroup, (a8) obj);
        } else if (obj instanceof p15) {
            zyc.b(context, viewGroup, (p15) obj);
        }
    }

    public final synchronized void B6(final String str, String str2, final String str3) {
        char c;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1372958932:
                    if (str2.equals("INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                rm.b(D6(), str, E6(), 1, new qyc(this, str, str3));
                return;
            }
            if (c == 1) {
                a8 a8Var = new a8(D6());
                a8Var.setAdSize(s7.i);
                a8Var.setAdUnitId(str);
                a8Var.setAdListener(new ryc(this, str, a8Var, str3));
                a8Var.b(E6());
                return;
            }
            if (c == 2) {
                vq3.b(D6(), str, E6(), new syc(this, str, str3));
                return;
            }
            if (c == 3) {
                q6.a aVar = new q6.a(D6(), str);
                aVar.b(new p15.c() { // from class: nyc
                    @Override // p15.c
                    public final void a(p15 p15Var) {
                        yyc.this.A6(str, p15Var, str3);
                    }
                });
                aVar.c(new vyc(this, str3));
                aVar.a().a(E6());
                return;
            }
            if (c == 4) {
                o17.b(D6(), str, E6(), new tyc(this, str, str3));
            } else {
                if (c != 5) {
                    return;
                }
                q17.b(D6(), str, E6(), new uyc(this, str, str3));
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003d, B:24:0x0048, B:27:0x004f, B:29:0x0053, B:32:0x005a, B:34:0x005e, B:37:0x0067, B:39:0x006b, B:42:0x0074, B:44:0x0084, B:46:0x0088, B:48:0x008c, B:51:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003d, B:24:0x0048, B:27:0x004f, B:29:0x0053, B:32:0x005a, B:34:0x005e, B:37:0x0067, B:39:0x006b, B:42:0x0074, B:44:0x0084, B:46:0x0088, B:48:0x008c, B:51:0x0038), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void C6(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            myc r0 = r4.d     // Catch: java.lang.Throwable -> L36
            android.app.Activity r0 = r0.b()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto Lb
            goto La7
        Lb:
            java.util.Map r1 = r4.a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto La7
            zoa r2 = defpackage.mpa.m9     // Catch: java.lang.Throwable -> L36
            kpa r3 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            boolean r3 = r1 instanceof defpackage.rm     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L38
            boolean r3 = r1 instanceof defpackage.vq3     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L38
            boolean r3 = r1 instanceof defpackage.o17     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L38
            boolean r3 = r1 instanceof defpackage.q17     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L3d
            goto L38
        L36:
            r5 = move-exception
            goto La9
        L38:
            java.util.Map r3 = r4.a     // Catch: java.lang.Throwable -> L36
            r3.remove(r5)     // Catch: java.lang.Throwable -> L36
        L3d:
            java.lang.String r3 = F6(r1)     // Catch: java.lang.Throwable -> L36
            r4.zzn(r3, r6)     // Catch: java.lang.Throwable -> L36
            boolean r6 = r1 instanceof defpackage.rm     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L4f
            rm r1 = (defpackage.rm) r1     // Catch: java.lang.Throwable -> L36
            r1.c(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L4f:
            boolean r6 = r1 instanceof defpackage.vq3     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L5a
            vq3 r1 = (defpackage.vq3) r1     // Catch: java.lang.Throwable -> L36
            r1.e(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L5a:
            boolean r6 = r1 instanceof defpackage.o17     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L67
            o17 r1 = (defpackage.o17) r1     // Catch: java.lang.Throwable -> L36
            oyc r5 = new defpackage.bg5() { // from class: oyc
                static {
                    /*
                        oyc r0 = new oyc
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:oyc) oyc.a oyc
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.oyc.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.oyc.<init>():void");
                }

                @Override // defpackage.bg5
                public final void a(defpackage.n17 r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.oyc.a(n17):void");
                }
            }     // Catch: java.lang.Throwable -> L36
            r1.c(r0, r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L67:
            boolean r6 = r1 instanceof defpackage.q17     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L74
            q17 r1 = (defpackage.q17) r1     // Catch: java.lang.Throwable -> L36
            pyc r5 = new defpackage.bg5() { // from class: pyc
                static {
                    /*
                        pyc r0 = new pyc
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:pyc) pyc.a pyc
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pyc.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pyc.<init>():void");
                }

                @Override // defpackage.bg5
                public final void a(defpackage.n17 r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pyc.a(n17):void");
                }
            }     // Catch: java.lang.Throwable -> L36
            r1.c(r0, r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L74:
            kpa r6 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r6.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L36
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto La7
            boolean r6 = r1 instanceof defpackage.a8     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L8c
            boolean r6 = r1 instanceof defpackage.p15     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto La7
        L8c:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            android.content.Context r0 = r4.D6()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r6.setClassName(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "adUnit"
            r6.putExtra(r1, r5)     // Catch: java.lang.Throwable -> L36
            defpackage.dyf.r()     // Catch: java.lang.Throwable -> L36
            defpackage.wxf.s(r0, r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        La7:
            monitor-exit(r4)
            return
        La9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyc.C6(java.lang.String, java.lang.String):void");
    }

    public final void z6(eyc eycVar) {
        this.g = eycVar;
    }
}
