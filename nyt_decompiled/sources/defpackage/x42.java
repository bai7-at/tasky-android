package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.o10;

/* loaded from: classes2.dex */
abstract class x42 {
    static final x42 a = a().f(10485760).d(200).b(Constants.MAXIMUM_UPLOAD_PARTS).c(604800000).e(81920).a();

    static abstract class a {
        a() {
        }

        abstract x42 a();

        abstract a b(int i);

        abstract a c(long j);

        abstract a d(int i);

        abstract a e(int i);

        abstract a f(long j);
    }

    x42() {
    }

    static a a() {
        return new o10.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
