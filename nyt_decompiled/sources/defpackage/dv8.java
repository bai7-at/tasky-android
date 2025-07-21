package defpackage;

import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.u44;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class dv8 {
    private static final u44 a;
    private static final j b;

    static {
        j f;
        u44 u44Var = new u44(u44.a.a.a(), u44.c.a.b(), null);
        a = u44Var;
        f = r0.f((r48 & 1) != 0 ? r0.a.i() : 0L, (r48 & 2) != 0 ? r0.a.m() : 0L, (r48 & 4) != 0 ? r0.a.p() : null, (r48 & 8) != 0 ? r0.a.n() : null, (r48 & 16) != 0 ? r0.a.o() : null, (r48 & 32) != 0 ? r0.a.k() : null, (r48 & 64) != 0 ? r0.a.l() : null, (r48 & 128) != 0 ? r0.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r0.a.g() : null, (r48 & 512) != 0 ? r0.a.w() : null, (r48 & 1024) != 0 ? r0.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r0.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r0.a.u() : null, (r48 & 8192) != 0 ? r0.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r0.a.j() : null, (r48 & 32768) != 0 ? r0.b.h() : 0, (r48 & 65536) != 0 ? r0.b.i() : 0, (r48 & 131072) != 0 ? r0.b.e() : 0L, (r48 & 262144) != 0 ? r0.b.j() : null, (r48 & 524288) != 0 ? r0.c : vi1.a(), (r48 & Constants.MB) != 0 ? r0.b.f() : u44Var, (r48 & 2097152) != 0 ? r0.b.d() : 0, (r48 & 4194304) != 0 ? r0.b.c() : 0, (r48 & 8388608) != 0 ? j.d.a().b.k() : null);
        b = f;
    }

    public static final j a() {
        return b;
    }
}
