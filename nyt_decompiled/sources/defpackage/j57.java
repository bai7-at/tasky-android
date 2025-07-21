package defpackage;

import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.tp7;
import java.util.UUID;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class j57 {
    public static final a e = new a(null);
    private final Context a;
    private final String b;
    private final String c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j57(Context context, String str) {
        zq3.h(context, "appContext");
        zq3.h(str, "debugDetails");
        this.a = context;
        this.b = str;
        String str2 = Build.VERSION.RELEASE;
        zq3.g(str2, "RELEASE");
        this.c = str2;
        this.d = Build.MANUFACTURER + " " + Build.MODEL;
    }

    private final String e() {
        Context context = this.a;
        String string = context.getString(fm6.feedback_app_version, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, "2.5.0");
        zq3.g(string, "getString(...)");
        String string2 = context.getString(fm6.feedback_device_info, this.d, this.c);
        zq3.g(string2, "getString(...)");
        String string3 = context.getString(fm6.feedback_available_memory, Long.valueOf(DeviceUtils.k() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), Long.valueOf(DeviceUtils.s() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
        zq3.g(string3, "getString(...)");
        return d.r0(new String[]{string, string2, string3, this.b}, "\n", null, null, 0, null, null, 62, null);
    }

    protected final Context a() {
        return this.a;
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String f(String str);

    public final void g() {
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        String substring = uuid.substring(0, 6);
        zq3.g(substring, "substring(...)");
        new tp7.a(this.a).h("message/rfc822").a(d()).f(f(substring)).g(e() + "\n " + c() + "\n").e(b()).i();
    }
}
