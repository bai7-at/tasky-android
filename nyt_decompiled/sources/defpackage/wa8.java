package defpackage;

/* loaded from: classes5.dex */
public abstract class wa8 implements uc5, gb8 {
    private static final Long NOT_SET = Long.MIN_VALUE;
    private b46 producer;
    private long requested;
    private final wa8 subscriber;
    private final jb8 subscriptions;

    protected wa8() {
        this(null, false);
    }

    private void a(long j) {
        if (this.requested == NOT_SET.longValue()) {
            this.requested = j;
            return;
        }
        long j2 = this.requested + j;
        if (j2 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j2;
        }
    }

    public final void add(gb8 gb8Var) {
        this.subscriptions.a(gb8Var);
    }

    @Override // defpackage.gb8
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            b46 b46Var = this.producer;
            if (b46Var != null) {
                b46Var.request(j);
            } else {
                a(j);
            }
        }
    }

    public void setProducer(b46 b46Var) {
        long j;
        boolean z;
        synchronized (this) {
            try {
                j = this.requested;
                this.producer = b46Var;
                z = this.subscriber != null && j == NOT_SET.longValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET.longValue()) {
            this.producer.request(Long.MAX_VALUE);
        } else {
            this.producer.request(j);
        }
    }

    @Override // defpackage.gb8
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected wa8(wa8 wa8Var) {
        this(wa8Var, true);
    }

    protected wa8(wa8 wa8Var, boolean z) {
        this.requested = NOT_SET.longValue();
        this.subscriber = wa8Var;
        this.subscriptions = (!z || wa8Var == null) ? new jb8() : wa8Var.subscriptions;
    }
}
