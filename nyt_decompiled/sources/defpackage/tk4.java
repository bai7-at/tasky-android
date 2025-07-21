package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.room.f;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.h;
import com.nytimes.android.media.player.a;
import com.nytimes.android.media.player.p;
import com.nytimes.android.media.player.position.DeviceMediaPositionProxy;
import com.nytimes.android.room.media.MediaDatabase;
import java.io.File;
import java.util.Locale;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class tk4 {
    public static final tk4 a = new tk4();

    private tk4() {
    }

    public final p a(a aVar) {
        zq3.h(aVar, "impl");
        return aVar;
    }

    public final DateTimeFormatter b(Application application) {
        zq3.h(application, "app");
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(application.getString(gk6.dt_year_format), Locale.ENGLISH);
        zq3.g(ofPattern, "ofPattern(...)");
        return ofPattern;
    }

    public final Cache c(Application application) {
        zq3.h(application, "app");
        return new h(new File(application.getCacheDir(), "exoplayerCache"), new w14(52428800L));
    }

    public final MediaDatabase d(Application application) {
        zq3.h(application, "application");
        Context applicationContext = application.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        return (MediaDatabase) f.a(applicationContext, MediaDatabase.class, "audio-positions").b(iu4.a).d();
    }

    public final cl4 e(MediaDatabase mediaDatabase) {
        zq3.h(mediaDatabase, "mediaDatabase");
        return new DeviceMediaPositionProxy(mediaDatabase.d());
    }

    public final ov5 f(cl4 cl4Var) {
        zq3.h(cl4Var, "mediaPositionProxy");
        return new ov5(cl4Var, new kr6());
    }
}
