package com.datadog.android.core.internal.data.upload;

import com.datadog.android.api.InternalLogger;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class UploadStatus {
    public static final a d = new a(null);
    private final boolean a;
    private final int b;
    private final Throwable c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(true, 0, th, 2, null);
            zq3.h(th, "throwable");
        }
    }

    public static final class c extends UploadStatus {
        public c(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class d extends UploadStatus {
        public d(int i) {
            super(true, i, null, 4, null);
        }
    }

    public static final class e extends UploadStatus {
        public e(int i) {
            super(true, i, null, 4, null);
        }
    }

    public static final class f extends UploadStatus {
        public f(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class g extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(true, 0, th, 2, null);
            zq3.h(th, "throwable");
        }
    }

    public static final class h extends UploadStatus {
        public h(Throwable th) {
            super(false, 0, th, 2, null);
        }
    }

    public static final class i extends UploadStatus {
        public i(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class j extends UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable th) {
            super(true, 0, th, 2, null);
            zq3.h(th, "throwable");
        }
    }

    public static final class k extends UploadStatus {
        public k(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class l extends UploadStatus {
        public static final l e = new l();

        private l() {
            super(false, 0, null, 4, null);
        }
    }

    public /* synthetic */ UploadStatus(boolean z, int i2, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(String str, int i2, String str2, Throwable th, int i3) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append("Batch [" + i2 + " bytes] (" + str2 + ")");
        } else {
            sb.append("Batch " + str + " [" + i2 + " bytes] (" + str2 + ")");
        }
        if (this instanceof b) {
            sb.append(" failed because of a DNS error");
        } else if (this instanceof c) {
            sb.append(" failed because of a processing error or invalid data");
        } else if (this instanceof d) {
            sb.append(" failed because of an intake rate limitation");
        } else if (this instanceof e) {
            sb.append(" failed because of a server processing error");
        } else if (this instanceof f) {
            sb.append(" failed because your token is invalid");
        } else if (this instanceof g) {
            sb.append(" failed because of a network error");
        } else if (this instanceof h) {
            sb.append(" failed because of an error when creating the request");
        } else if (this instanceof j) {
            sb.append(" failed because of an unknown error");
        } else if (this instanceof k) {
            sb.append(" failed because of an unexpected HTTP error (status code = " + this.b + ")");
        } else if (this instanceof l) {
            sb.append(" status is unknown");
        } else if (this instanceof i) {
            sb.append(" sent successfully.");
        }
        if (th != null) {
            sb.append(" (");
            sb.append(th.getMessage());
            sb.append(")");
        }
        if (this.a) {
            sb.append("; we will retry later.");
        } else if (!(this instanceof i)) {
            sb.append("; the batch was dropped.");
        }
        if (this instanceof f) {
            sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
        }
        String format = String.format(Locale.US, " This request was attempted %d time(s).", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(this.b)}, 2));
        zq3.g(format, "format(...)");
        sb.append(format);
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    private final InternalLogger.Level g() {
        if (this instanceof c ? true : this instanceof e ? true : this instanceof f ? true : this instanceof h ? true : this instanceof j ? true : this instanceof k) {
            return InternalLogger.Level.ERROR;
        }
        if (this instanceof b ? true : this instanceof d ? true : this instanceof l ? true : this instanceof g) {
            return InternalLogger.Level.WARN;
        }
        if (this instanceof i) {
            return InternalLogger.Level.INFO;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List h() {
        if (this instanceof c ? true : this instanceof d ? true : this instanceof l) {
            return kotlin.collections.i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY);
        }
        if (this instanceof b ? true : this instanceof e ? true : this instanceof f ? true : this instanceof g ? true : this instanceof h ? true : this instanceof i ? true : this instanceof j ? true : this instanceof k) {
            return kotlin.collections.i.e(InternalLogger.Target.USER);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public final Throwable e() {
        return this.c;
    }

    public final void f(final String str, final int i2, InternalLogger internalLogger, final int i3, final String str2) {
        zq3.h(str, "context");
        zq3.h(internalLogger, "logger");
        InternalLogger.b.b(internalLogger, g(), h(), new qs2() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String b2;
                UploadStatus uploadStatus = UploadStatus.this;
                b2 = uploadStatus.b(str2, i2, str, uploadStatus.e(), i3);
                return b2;
            }
        }, null, false, null, 56, null);
    }

    private UploadStatus(boolean z, int i2, Throwable th) {
        this.a = z;
        this.b = i2;
        this.c = th;
    }

    public /* synthetic */ UploadStatus(boolean z, int i2, Throwable th, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : th, null);
    }
}
