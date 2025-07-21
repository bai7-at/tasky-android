package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.temporal.TemporalAccessor;

/* loaded from: classes4.dex */
public final class m17 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m17(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPrefs");
        this.a = sharedPreferences;
    }

    private final LocalDateTime a() {
        LocalDateTime now = LocalDateTime.now();
        zq3.g(now, "now(...)");
        return now;
    }

    private final long b() {
        return a().toEpochSecond(ZoneOffset.UTC);
    }

    public final boolean c(LocalDateTime localDateTime) {
        zq3.h(localDateTime, "targetTime");
        return LocalDateTime.from((TemporalAccessor) Instant.ofEpochSecond(this.a.getLong("first_time_seen", b())).atOffset(ZoneOffset.UTC)).plusMonths(1L).isBefore(localDateTime);
    }

    public final void d() {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong("first_time_seen", b());
        edit.apply();
    }

    public final void e() {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putBoolean("SHARE_SUCCESSFUL_SHOW_REVIEW", true);
        edit.apply();
    }

    public final boolean f() {
        boolean z = this.a.getBoolean("SHARE_SUCCESSFUL_SHOW_REVIEW", false);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove("SHARE_SUCCESSFUL_SHOW_REVIEW");
        edit.apply();
        return z;
    }
}
