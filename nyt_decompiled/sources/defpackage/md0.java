package defpackage;

import com.nytimes.android.eventtracker.buffer.UploadStatus;
import com.nytimes.android.eventtracker.buffer.ValidationStatus;
import com.nytimes.android.eventtracker.model.Event;

/* loaded from: classes4.dex */
public final class md0 {
    private final long a;
    private final long b;
    private final long c;
    private final ValidationStatus d;
    private final UploadStatus e;
    private final boolean f;
    private final Event g;

    public md0(long j, long j2, long j3, ValidationStatus validationStatus, UploadStatus uploadStatus, boolean z, Event event) {
        zq3.h(validationStatus, "validatedStatus");
        zq3.h(uploadStatus, "uploadStatus");
        zq3.h(event, "event");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = validationStatus;
        this.e = uploadStatus;
        this.f = z;
        this.g = event;
    }

    public final md0 a(long j, long j2, long j3, ValidationStatus validationStatus, UploadStatus uploadStatus, boolean z, Event event) {
        zq3.h(validationStatus, "validatedStatus");
        zq3.h(uploadStatus, "uploadStatus");
        zq3.h(event, "event");
        return new md0(j, j2, j3, validationStatus, uploadStatus, z, event);
    }

    public final boolean c() {
        return this.f;
    }

    public final long d() {
        return this.b;
    }

    public final Event e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md0)) {
            return false;
        }
        md0 md0Var = (md0) obj;
        return this.a == md0Var.a && this.b == md0Var.b && this.c == md0Var.c && this.d == md0Var.d && this.e == md0Var.e && this.f == md0Var.f && zq3.c(this.g, md0Var.g);
    }

    public final long f() {
        return this.a;
    }

    public final long g() {
        return this.c;
    }

    public final UploadStatus h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + this.g.hashCode();
    }

    public final ValidationStatus i() {
        return this.d;
    }

    public String toString() {
        return "BufferedEvent(id=" + this.a + ", created=" + this.b + ", updated=" + this.c + ", validatedStatus=" + this.d + ", uploadStatus=" + this.e + ", archive=" + this.f + ", event=" + this.g + ")";
    }
}
