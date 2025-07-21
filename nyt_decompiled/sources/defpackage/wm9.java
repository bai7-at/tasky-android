package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okio.internal.ZipFilesKt;

/* loaded from: classes5.dex */
public final class wm9 {
    private final jp5 a;
    private final boolean b;
    private final String c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final long h;
    private final int i;
    private final int j;
    private final Long k;
    private final Long l;
    private final Long m;
    private final Integer n;
    private final Integer o;
    private final Integer p;
    private final List q;

    public wm9(jp5 jp5Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        zq3.h(jp5Var, "canonicalPath");
        zq3.h(str, "comment");
        this.a = jp5Var;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = j4;
        this.i = i2;
        this.j = i3;
        this.k = l;
        this.l = l2;
        this.m = l3;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = new ArrayList();
    }

    public final wm9 a(Integer num, Integer num2, Integer num3) {
        return new wm9(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, num, num2, num3);
    }

    public final jp5 b() {
        return this.a;
    }

    public final List c() {
        return this.q;
    }

    public final long d() {
        return this.e;
    }

    public final int e() {
        return this.g;
    }

    public final Long f() {
        Long l = this.m;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.d(l.longValue()));
        }
        if (this.p != null) {
            return Long.valueOf(r4.intValue() * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l = this.l;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.d(l.longValue()));
        }
        if (this.o != null) {
            return Long.valueOf(r4.intValue() * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l = this.k;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.d(l.longValue()));
        }
        if (this.n != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i = this.j;
        if (i != -1) {
            return ZipFilesKt.c(this.i, i);
        }
        return null;
    }

    public final long i() {
        return this.h;
    }

    public final long j() {
        return this.f;
    }

    public final boolean k() {
        return this.b;
    }

    public /* synthetic */ wm9(jp5 jp5Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(jp5Var, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) == 0 ? j4 : -1L, (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : l2, (i4 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : l3, (i4 & 8192) != 0 ? null : num, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }
}
