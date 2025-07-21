package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class mq7 implements am0 {
    private static final a Companion = new a(null);
    private final SharedPreferences a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public mq7(Application application) {
        zq3.h(application, "context");
        this.a = application.getSharedPreferences("com.nytimes.android.eventtracker.CLOCK_CACHE", 0);
    }

    public void a(String str, long j) {
        this.a.edit().putLong(str, j).commit();
    }

    public void clear() {
        this.a.edit().clear().commit();
    }

    public long get(String str, long j) {
        return this.a.getLong(str, j);
    }
}
