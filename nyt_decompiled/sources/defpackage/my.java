package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.nytimes.android.media.player.MediaService;
import com.nytimes.android.media.player.a;

/* loaded from: classes4.dex */
public class my extends BroadcastReceiver {
    private final Context a;
    private final a c;
    private volatile boolean d = false;
    private final IntentFilter b = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");

    public my(Context context, a aVar) {
        this.a = context;
        this.c = aVar;
    }

    public void a() {
        if (this.d) {
            return;
        }
        vr6.a(this.a, this, this.b);
        this.d = true;
    }

    public void b() {
        if (this.d) {
            this.a.unregisterReceiver(this);
            this.d = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction()) && this.c.l0()) {
            Intent intent2 = new Intent(context, (Class<?>) MediaService.class);
            intent2.setAction("com.nytimes.android.media.ACTION_COMMAND");
            intent2.putExtra("com.nytimes.android.media.COMMAND_TYPE", "com.nytimes.android.media.COMMAND_PAUSE");
            context.startForegroundService(intent2);
        }
    }
}
