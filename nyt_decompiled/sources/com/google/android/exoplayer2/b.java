package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes2.dex */
final class b {
    private final Context a;
    private final a b;
    private boolean c;

    private final class a extends BroadcastReceiver implements Runnable {
        private final InterfaceC0180b a;
        private final Handler b;

        public a(Handler handler, InterfaceC0180b interfaceC0180b) {
            this.b = handler;
            this.a = interfaceC0180b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.c) {
                this.a.m();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0180b {
        void m();
    }

    public b(Context context, Handler handler, InterfaceC0180b interfaceC0180b) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, interfaceC0180b);
    }

    public void b(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
