package coil.util;

import defpackage.qs2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements qs2 {
    public static final Time$provider$1 a = new Time$provider$1();

    Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // defpackage.qs2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Long mo865invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
