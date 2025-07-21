package androidx.paging;

import androidx.paging.d;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class f {
    private d a;
    private d b;
    private d c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public f() {
        d.c.a aVar = d.c.b;
        this.a = aVar.b();
        this.b = aVar.b();
        this.c = aVar.b();
    }

    public final d a(LoadType loadType) {
        zq3.h(loadType, "loadType");
        int i = a.a[loadType.ordinal()];
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(e eVar) {
        zq3.h(eVar, "states");
        this.a = eVar.f();
        this.c = eVar.d();
        this.b = eVar.e();
    }

    public final void c(LoadType loadType, d dVar) {
        zq3.h(loadType, TransferTable.COLUMN_TYPE);
        zq3.h(dVar, TransferTable.COLUMN_STATE);
        int i = a.a[loadType.ordinal()];
        if (i == 1) {
            this.a = dVar;
        } else if (i == 2) {
            this.c = dVar;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.b = dVar;
        }
    }

    public final e d() {
        return new e(this.a, this.b, this.c);
    }
}
