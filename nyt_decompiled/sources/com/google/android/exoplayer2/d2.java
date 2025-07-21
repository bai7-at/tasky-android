package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.a84;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
final class d2 {
    private final Context a;
    private final Handler b;
    private final b c;
    private final AudioManager d;
    private c e;
    private int f;
    private int g;
    private boolean h;

    public interface b {
        void B(int i, boolean z);

        void c(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = d2.this.b;
            final d2 d2Var = d2.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.e2
                @Override // java.lang.Runnable
                public final void run() {
                    d2.b(d2.this);
                }
            });
        }
    }

    public d2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) ur.i((AudioManager) applicationContext.getSystemService(AssetConstants.AUDIO_TYPE));
        this.d = audioManager;
        this.f = 3;
        this.g = f(audioManager, 3);
        this.h = e(audioManager, this.f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e) {
            a84.k("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(d2 d2Var) {
        d2Var.i();
    }

    private static boolean e(AudioManager audioManager, int i) {
        return z19.a >= 23 ? audioManager.isStreamMute(i) : f(audioManager, i) == 0;
    }

    private static int f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            a84.k("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int f = f(this.d, this.f);
        boolean e = e(this.d, this.f);
        if (this.g == f && this.h == e) {
            return;
        }
        this.g = f;
        this.h = e;
        this.c.B(f, e);
    }

    public int c() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int d() {
        if (z19.a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                a84.k("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public void h(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        i();
        this.c.c(i);
    }
}
