package com.google.android.datatransport.runtime.firebase.transport;

import defpackage.k76;

/* loaded from: classes2.dex */
public final class LogEventDropped {
    private static final LogEventDropped c = new a().a();
    private final long a;
    private final Reason b;

    public enum Reason implements k76 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // defpackage.k76
        public int getNumber() {
            return this.number_;
        }
    }

    public static final class a {
        private long a = 0;
        private Reason b = Reason.REASON_UNKNOWN;

        a() {
        }

        public LogEventDropped a() {
            return new LogEventDropped(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(Reason reason) {
            this.b = reason;
            return this;
        }
    }

    LogEventDropped(long j, Reason reason) {
        this.a = j;
        this.b = reason;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public Reason b() {
        return this.b;
    }
}
