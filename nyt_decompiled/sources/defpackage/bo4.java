package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.MediaService;
import com.nytimes.android.media.player.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class bo4 implements ServiceConnection {
    private final Activity a;
    private MediaService b;
    private List c;

    public bo4(Activity activity) {
        this.a = activity;
    }

    public void a(oz4 oz4Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(oz4Var);
    }

    public void b(sb5 sb5Var) {
        MediaService mediaService = this.b;
        if (mediaService != null) {
            mediaService.E(sb5Var);
        }
    }

    public void c() {
        Intent intent = new Intent(this.a, (Class<?>) MediaService.class);
        intent.setAction("com.nytimes.android.media.PLAY_VIDEO");
        this.a.bindService(intent, this, 1);
    }

    public void d(oz4 oz4Var) {
        if (f()) {
            oz4Var.call();
        } else {
            a(oz4Var);
            c();
        }
    }

    public ro4 e() {
        MediaService mediaService = this.b;
        if (mediaService == null) {
            return null;
        }
        return mediaService.L();
    }

    public boolean f() {
        return this.b != null;
    }

    public long g() {
        MediaService mediaService = this.b;
        if (mediaService == null) {
            return -1L;
        }
        return mediaService.F();
    }

    public void h(NYTMediaItem nYTMediaItem, qo4 qo4Var, sb5 sb5Var) {
        MediaService mediaService = this.b;
        if (mediaService != null) {
            mediaService.M(nYTMediaItem, qo4Var, sb5Var);
        }
    }

    public void i() {
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
            Log.d("doNothing", "");
        }
        this.b = null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b = ((d) iBinder).a();
        List list = this.c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((oz4) it2.next()).call();
            }
            this.c.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
    }
}
