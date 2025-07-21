package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class gl7 {
    public static final a g = new a(null);
    private final Long a;
    private Long b;
    private UUID c;
    private int d;
    private Long e;
    private qx7 f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w92.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            qx7.c.a();
        }

        public final gl7 b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(w92.l());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            gl7 gl7Var = new gl7(Long.valueOf(j), Long.valueOf(j2), null, 4, null);
            gl7Var.d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            gl7Var.l(qx7.c.b());
            gl7Var.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            zq3.g(fromString, "fromString(sessionIDStr)");
            gl7Var.j(fromString);
            return gl7Var;
        }

        private a() {
        }
    }

    public gl7(Long l, Long l2, UUID uuid) {
        zq3.h(uuid, "sessionId");
        this.a = l;
        this.b = l2;
        this.c = uuid;
    }

    public final Long b() {
        Long l = this.e;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final int c() {
        return this.d;
    }

    public final UUID d() {
        return this.c;
    }

    public final Long e() {
        return this.b;
    }

    public final long f() {
        Long l;
        if (this.a == null || (l = this.b) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final qx7 g() {
        return this.f;
    }

    public final void h() {
        this.d++;
    }

    public final void i(Long l) {
        this.e = l;
    }

    public final void j(UUID uuid) {
        zq3.h(uuid, "<set-?>");
        this.c = uuid;
    }

    public final void k(Long l) {
        this.b = l;
    }

    public final void l(qx7 qx7Var) {
        this.f = qx7Var;
    }

    public final void m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w92.l()).edit();
        Long l = this.a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l == null ? 0L : l.longValue());
        Long l2 = this.b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        edit.apply();
        qx7 qx7Var = this.f;
        if (qx7Var == null || qx7Var == null) {
            return;
        }
        qx7Var.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ gl7(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            defpackage.zq3.g(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl7.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
