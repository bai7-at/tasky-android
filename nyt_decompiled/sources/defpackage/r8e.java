package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes3.dex */
public final class r8e extends ContentObserver {
    private final Context a;
    private final AudioManager b;
    private final p8e c;
    private float d;
    private final e9e e;

    public r8e(Handler handler, Context context, p8e p8eVar, e9e e9eVar) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
        this.c = p8eVar;
        this.e = e9eVar;
    }

    private final float c() {
        AudioManager audioManager = this.b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private final void d() {
        this.e.e(this.d);
    }

    public final void a() {
        this.d = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float c = c();
        if (c != this.d) {
            this.d = c;
            d();
        }
    }
}
