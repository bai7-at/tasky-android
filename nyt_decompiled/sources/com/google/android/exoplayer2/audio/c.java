package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
public final class c {
    private final Context a;
    private final f b;
    private final Handler c;
    private final C0179c d;
    private final BroadcastReceiver e;
    private final d f;
    com.google.android.exoplayer2.audio.b g;
    private boolean h;

    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) ur.e((AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) ur.e((AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.c$c, reason: collision with other inner class name */
    private final class C0179c extends AudioDeviceCallback {
        private C0179c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.a));
        }
    }

    private final class d extends ContentObserver {
        private final ContentResolver a;
        private final Uri b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            c cVar = c.this;
            cVar.c(com.google.android.exoplayer2.audio.b.c(cVar.a));
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            c.this.c(com.google.android.exoplayer2.audio.b.d(context, intent));
        }
    }

    public interface f {
        void a(com.google.android.exoplayer2.audio.b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (f) ur.e(fVar);
        Handler y = z19.y();
        this.c = y;
        int i = z19.a;
        Object[] objArr = 0;
        this.d = i >= 23 ? new C0179c() : null;
        this.e = i >= 21 ? new e() : null;
        Uri g = com.google.android.exoplayer2.audio.b.g();
        this.f = g != null ? new d(y, applicationContext.getContentResolver(), g) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.google.android.exoplayer2.audio.b bVar) {
        if (!this.h || bVar.equals(this.g)) {
            return;
        }
        this.g = bVar;
        this.b.a(bVar);
    }

    public com.google.android.exoplayer2.audio.b d() {
        C0179c c0179c;
        if (this.h) {
            return (com.google.android.exoplayer2.audio.b) ur.e(this.g);
        }
        this.h = true;
        d dVar = this.f;
        if (dVar != null) {
            dVar.a();
        }
        if (z19.a >= 23 && (c0179c = this.d) != null) {
            b.a(this.a, c0179c, this.c);
        }
        com.google.android.exoplayer2.audio.b d2 = com.google.android.exoplayer2.audio.b.d(this.a, this.e != null ? this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.c) : null);
        this.g = d2;
        return d2;
    }

    public void e() {
        C0179c c0179c;
        if (this.h) {
            this.g = null;
            if (z19.a >= 23 && (c0179c = this.d) != null) {
                b.b(this.a, c0179c);
            }
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                this.a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f;
            if (dVar != null) {
                dVar.b();
            }
            this.h = false;
        }
    }
}
