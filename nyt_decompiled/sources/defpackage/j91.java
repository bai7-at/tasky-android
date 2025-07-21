package defpackage;

import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.logging.NYTLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class j91 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;
    private final qs2 b;
    private final String c;
    private final long d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j91(SharedPreferences sharedPreferences, qs2 qs2Var, String str, long j) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(qs2Var, "clock");
        zq3.h(str, TransferTable.COLUMN_KEY);
        this.a = sharedPreferences;
        this.b = qs2Var;
        this.c = str;
        this.d = j;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.a.edit();
        zq3.g(edit, "editor");
        edit.putLong(this.c, -1L);
        edit.apply();
    }

    public final Instant b() {
        long longValue = ((Number) this.b.mo865invoke()).longValue();
        SharedPreferences.Editor edit = this.a.edit();
        zq3.g(edit, "editor");
        edit.putLong(this.c, longValue);
        edit.apply();
        Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
        zq3.g(ofEpochMilli, "ofEpochMilli(...)");
        return ofEpochMilli;
    }

    public final Instant c() {
        Long valueOf = Long.valueOf(this.a.getLong(this.c, -1L));
        if (valueOf.longValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Instant.ofEpochMilli(valueOf.longValue());
        }
        return null;
    }

    public final Instant d() {
        Instant c = c();
        if (c != null) {
            return c;
        }
        NYTLogger.h(new Exception("Data available in cache without a fetching date"));
        Instant now = Instant.now();
        zq3.e(now);
        return now;
    }

    public final boolean e() {
        long j = this.a.getLong(this.c, -1L);
        return j == -1 || ((Number) this.b.mo865invoke()).longValue() - j > this.d;
    }

    public /* synthetic */ j91(SharedPreferences sharedPreferences, qs2 qs2Var, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, qs2Var, str, (i & 8) != 0 ? 300000L : j);
    }
}
