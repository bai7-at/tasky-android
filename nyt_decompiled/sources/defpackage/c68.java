package defpackage;

import android.content.res.Resources;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.auth.network.response.c;
import com.nytimes.android.subauth.core.type.UserSubscriptionOwnershipStatus;
import com.nytimes.android.subauth.core.type.UserSubscriptionStatus;
import defpackage.yz8;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class c68 {
    public static final c68 a = new c68();
    private static final c.b b = new c.b("2wFsq9Uysq3Be94t6AjgBberGqis8ygS9huesCu0qrW0rszY5ZbrBBOfYb4MLOxZxCjOoea6bgYnQ8.7yDVlnZZbYxCIXcqWCJuOmTgRch7mKMqqriDLVycPZBUGmMi01MJh0RtGuPUc0UpZZcwOatwuI0.ZE0cTbj/JON53STFbr3nDJOcqcI.CzXlYk2/Hdr1JVFFQ24sjrzsE1zcuFm7000");
    private static final yz8.f c;
    private static final yz8.h d;
    private static final yz8.h e;
    private static final yz8.g f;
    private static final yj g;
    private static final yj h;
    private static final yj i;
    private static final yj j;

    static {
        yz8.h a2;
        yz8.f fVar = new yz8.f("testuser", "test user", "test", "user", "testuser", "gamesTestUser");
        c = fVar;
        Boolean bool = Boolean.FALSE;
        yz8.h hVar = new yz8.h("G", null, "All Access", false, bool, "2011-10-04T12:00:33.000Z", null, UserSubscriptionStatus.ACTIVE, i.o("AAA", "XWD", "MM", "MOW", "MSD", "MTD", "CKG", "WC", "ATH", "AUD"), null, null, bool, Boolean.TRUE, "Sartre", UserSubscriptionOwnershipStatus.OWNED, "ZERO_VALUE_COMP", i.o("NEWS", "COOKING", "GAMES", "WIRECUTTER", "ATHLETIC", "AUDIO"), i.e("BONUS"));
        d = hVar;
        a2 = hVar.a((r36 & 1) != 0 ? hVar.a : null, (r36 & 2) != 0 ? hVar.b : null, (r36 & 4) != 0 ? hVar.c : null, (r36 & 8) != 0 ? hVar.d : false, (r36 & 16) != 0 ? hVar.e : null, (r36 & 32) != 0 ? hVar.f : null, (r36 & 64) != 0 ? hVar.g : null, (r36 & 128) != 0 ? hVar.h : UserSubscriptionStatus.SOFT_CANCELED, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? hVar.i : null, (r36 & 512) != 0 ? hVar.j : null, (r36 & 1024) != 0 ? hVar.k : null, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? hVar.l : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? hVar.m : null, (r36 & 8192) != 0 ? hVar.n : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? hVar.o : UserSubscriptionOwnershipStatus.UNKNOWN__, (r36 & 32768) != 0 ? hVar.p : null, (r36 & 65536) != 0 ? hVar.q : null, (r36 & 131072) != 0 ? hVar.r : null);
        e = a2;
        yz8.g gVar = new yz8.g(new yz8.e(new yz8.a("gamesAvatar")));
        f = gVar;
        g = new q07().d(new yz8.i(new yz8.d("testemail@nytimes.com"), fVar, "220235743", gVar, i.e(hVar))).a();
        h = new q07().d(new yz8.i(new yz8.d("testemail@nytimes.com"), fVar, "220235743", gVar, i.e(a2))).a();
        i = new q07().d(new yz8.i(new yz8.d("testemail@nytimes.com"), fVar, "220235743", gVar, i.l())).a();
        j = new q07().c("Dev Setting User Detail Failure").a();
    }

    private c68() {
    }

    public final c a(Resources resources, String str) {
        zq3.h(resources, "resources");
        zq3.h(str, "prefVal");
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_success))) {
            return b;
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_missing_cookie))) {
            return new c.a.C0415c("Dev Setting Test");
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_bad_request))) {
            return new c.a.C0414a("Dev Setting Test");
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_internal_server_error))) {
            return new c.a.b("Dev Setting Test");
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_server_unavailable_error))) {
            return c.a.e.d;
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_network_connectivity_error))) {
            return new c.a.d("Dev Setting Test");
        }
        if (zq3.c(str, resources.getString(hm6.subauth_override_session_refresh_v2_unknown_error))) {
            return new c.a.f("Dev Setting Test");
        }
        return null;
    }
}
