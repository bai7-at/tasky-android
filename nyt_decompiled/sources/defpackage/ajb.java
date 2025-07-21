package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes3.dex */
public final class ajb implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager a;
    private final zib b;
    private boolean c;
    private boolean d;
    private boolean e;
    private float f = 1.0f;

    public ajb(Context context, zib zibVar) {
        this.a = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
        this.b = zibVar;
    }

    private final void f() {
        if (!this.d || this.e || this.f <= 0.0f) {
            if (this.c) {
                AudioManager audioManager = this.a;
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.b.zzn();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        AudioManager audioManager2 = this.a;
        if (audioManager2 != null) {
            this.c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.b.zzn();
    }

    public final float a() {
        float f = this.e ? 0.0f : this.f;
        if (this.c) {
            return f;
        }
        return 0.0f;
    }

    public final void b() {
        this.d = true;
        f();
    }

    public final void c() {
        this.d = false;
        f();
    }

    public final void d(boolean z) {
        this.e = z;
        f();
    }

    public final void e(float f) {
        this.f = f;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.zzn();
    }
}
