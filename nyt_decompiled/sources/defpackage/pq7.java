package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class pq7 implements ld8 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pq7(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    @Override // defpackage.ld8
    public void a(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_elapsed_time", j).apply();
    }

    @Override // defpackage.ld8
    public void b(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_offset", j).apply();
    }

    @Override // defpackage.ld8
    public long c() {
        return this.a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
    }

    @Override // defpackage.ld8
    public void clear() {
        this.a.edit().clear().apply();
    }

    @Override // defpackage.ld8
    public long d() {
        return this.a.getLong("com.lyft.kronos.cached_offset", 0L);
    }

    @Override // defpackage.ld8
    public void e(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_current_time", j).apply();
    }

    @Override // defpackage.ld8
    public long getCurrentTime() {
        return this.a.getLong("com.lyft.kronos.cached_current_time", 0L);
    }
}
