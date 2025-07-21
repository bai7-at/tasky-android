package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.d;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.a84;
import defpackage.ur;
import defpackage.z19;

/* loaded from: classes2.dex */
final class d {
    private final AudioManager a;
    private final a b;
    private b c;
    private com.google.android.exoplayer2.audio.a d;
    private int f;
    private AudioFocusRequest h;
    private boolean i;
    private float g = 1.0f;
    private int e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i) {
            d.this.h(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.a.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.b(i);
                }
            });
        }
    }

    public interface b {
        void F(float f);

        void G(int i);
    }

    public d(Context context, Handler handler, b bVar) {
        this.a = (AudioManager) ur.e((AudioManager) context.getApplicationContext().getSystemService(AssetConstants.AUDIO_TYPE));
        this.c = bVar;
        this.b = new a(handler);
    }

    private void a() {
        this.a.abandonAudioFocus(this.b);
    }

    private void b() {
        if (this.e == 0) {
            return;
        }
        if (z19.a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(com.google.android.exoplayer2.audio.a aVar) {
        if (aVar == null) {
            return 0;
        }
        switch (aVar.c) {
            case 0:
                a84.j("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (aVar.a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                a84.j("AudioFocusManager", "Unidentified audio usage: " + aVar.c);
                return 0;
            case 16:
                return z19.a >= 19 ? 4 : 2;
        }
    }

    private void f(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.G(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !q()) {
                n(3);
                return;
            } else {
                f(0);
                n(2);
                return;
            }
        }
        if (i == -1) {
            f(-1);
            b();
        } else if (i == 1) {
            n(1);
            f(1);
        } else {
            a84.j("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private int j() {
        if (this.e == 1) {
            return 1;
        }
        if ((z19.a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.a.requestAudioFocus(this.b, z19.i0(((com.google.android.exoplayer2.audio.a) ur.e(this.d)).c), this.f);
    }

    private int l() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            this.h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.h)).setAudioAttributes(((com.google.android.exoplayer2.audio.a) ur.e(this.d)).c().a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.a.requestAudioFocus(this.h);
    }

    private void n(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            bVar.F(f);
        }
    }

    private boolean o(int i) {
        return i == 1 || this.f != 1;
    }

    private boolean q() {
        com.google.android.exoplayer2.audio.a aVar = this.d;
        return aVar != null && aVar.a == 1;
    }

    public float g() {
        return this.g;
    }

    public void i() {
        this.c = null;
        b();
    }

    public void m(com.google.android.exoplayer2.audio.a aVar) {
        if (z19.c(this.d, aVar)) {
            return;
        }
        this.d = aVar;
        int e = e(aVar);
        this.f = e;
        boolean z = true;
        if (e != 1 && e != 0) {
            z = false;
        }
        ur.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z, int i) {
        if (o(i)) {
            b();
            return z ? 1 : -1;
        }
        if (z) {
            return j();
        }
        return -1;
    }
}
