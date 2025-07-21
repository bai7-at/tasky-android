package defpackage;

import defpackage.b38;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class c38 {
    public static final Void a(b38.b bVar) {
        zq3.h(bVar, "<this>");
        if (bVar instanceof b38.b.a) {
            throw ((b38.b.a) bVar).e();
        }
        if (bVar instanceof b38.b.C0127b) {
            throw new RuntimeException(((b38.b.C0127b) bVar).e());
        }
        throw new NoWhenBranchMatchedException();
    }
}
