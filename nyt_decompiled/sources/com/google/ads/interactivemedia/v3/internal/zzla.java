package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzla implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler zza = new Handler(Looper.getMainLooper());
    private final Context zzb;
    private Application zzc;
    private final PowerManager zzd;
    private final KeyguardManager zze;
    private BroadcastReceiver zzf;
    private final zzkm zzg;
    private WeakReference zzh;
    private WeakReference zzi;
    private zzki zzj;
    private byte zzk = -1;
    private int zzl = -1;
    private long zzm = -3;

    public zzla(Context context, zzkm zzkmVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zzg = zzkmVar;
        this.zzd = (PowerManager) applicationContext.getSystemService("power");
        this.zze = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zzc = application;
            this.zzj = new zzki(application, this);
        }
        zzd(null);
    }

    private final void zze(Activity activity, int i) {
        Window window;
        if (this.zzi == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View zzb = zzb();
        if (zzb == null || peekDecorView == null || zzb.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if ((r9.flags & 524288) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.zzi
            if (r1 != 0) goto L6
            return
        L6:
            android.view.View r1 = r10.zzb()
            r2 = -1
            r3 = -3
            if (r1 != 0) goto L14
            r10.zzm = r3
            r10.zzk = r2
            return
        L14:
            int r5 = r1.getVisibility()
            r6 = 0
            if (r5 == 0) goto L1d
            r5 = r0
            goto L1e
        L1d:
            r5 = r6
        L1e:
            boolean r7 = r1.isShown()
            if (r7 != 0) goto L26
            r5 = r5 | 2
        L26:
            android.os.PowerManager r7 = r10.zzd
            if (r7 == 0) goto L32
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L32
            r5 = r5 | 4
        L32:
            com.google.ads.interactivemedia.v3.internal.zzkm r7 = r10.zzg
            boolean r7 = r7.zza()
            if (r7 != 0) goto L83
            android.app.KeyguardManager r7 = r10.zze
            if (r7 == 0) goto L81
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L81
            int r7 = com.google.ads.interactivemedia.v3.internal.zzkw.zza
            android.view.View r7 = r1.getRootView()
            if (r7 != 0) goto L4d
            r7 = r1
        L4d:
            android.content.Context r7 = r7.getContext()
        L51:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            r9 = 0
            if (r8 == 0) goto L69
            r8 = 10
            if (r6 >= r8) goto L69
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L61
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6a
        L61:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + r0
            goto L51
        L69:
            r7 = r9
        L6a:
            if (r7 != 0) goto L6d
            goto L81
        L6d:
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L74
            goto L78
        L74:
            android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
        L78:
            if (r9 == 0) goto L81
            int r0 = r9.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r6
            if (r0 != 0) goto L83
        L81:
            r5 = r5 | 8
        L83:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L90
            r5 = r5 | 16
        L90:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto L9d
            r5 = r5 | 32
        L9d:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.zzl
            if (r1 == r2) goto La6
            r0 = r1
        La6:
            if (r0 == 0) goto Laa
            r5 = r5 | 64
        Laa:
            byte r0 = r10.zzk
            if (r0 == r5) goto Lbd
            byte r0 = (byte) r5
            r10.zzk = r0
            if (r5 != 0) goto Lb8
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbb
        Lb8:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lbb:
            r10.zzm = r0
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzla.zzf():void");
    }

    private final void zzg() {
        zza.post(new zzky(this));
    }

    private final void zzh(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzh = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzf == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzkz zzkzVar = new zzkz(this);
            this.zzf = zzkzVar;
            this.zzb.registerReceiver(zzkzVar, intentFilter);
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzi(View view) {
        try {
            WeakReference weakReference = this.zzh;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.zzf;
        if (broadcastReceiver != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zzf = null;
        }
        Application application = this.zzc;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zze(activity, 4);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zze(activity, 0);
        zzf();
        zzg();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zze(activity, 0);
        zzf();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzf();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzl = -1;
        zzh(view);
        zzf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzl = -1;
        zzf();
        zzg();
        zzi(view);
    }

    public final long zza() {
        if (this.zzm <= -2 && zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }

    final View zzb() {
        WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void zzd(View view) {
        long j;
        View zzb = zzb();
        if (zzb != null) {
            zzb.removeOnAttachStateChangeListener(this);
            zzi(zzb);
        }
        this.zzi = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                zzh(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzm = j;
    }
}
