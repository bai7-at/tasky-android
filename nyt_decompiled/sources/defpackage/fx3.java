package defpackage;

import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public class fx3 {
    AppPreferences a;

    public fx3(AppPreferences appPreferences) {
        this.a = appPreferences;
        a();
    }

    private void a() {
        if (this.a.k("LAST_TIME_APP_USED", 0L) == 0) {
            c(System.currentTimeMillis());
        }
    }

    public long b() {
        return this.a.k("LAST_TIME_APP_USED", 0L);
    }

    public void c(long j) {
        this.a.c("LAST_TIME_APP_USED", j);
    }
}
