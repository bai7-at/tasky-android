package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class o extends ThreadPoolExecutor {

    private static final class a extends FutureTask implements Comparable {
        private final c a;

        a(c cVar) {
            super(cVar, null);
            this.a = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int ordinal;
            int ordinal2;
            Picasso.Priority r = this.a.r();
            Picasso.Priority r2 = aVar.a.r();
            if (r == r2) {
                ordinal = this.a.a;
                ordinal2 = aVar.a.a;
            } else {
                ordinal = r2.ordinal();
                ordinal2 = r.ordinal();
            }
            return ordinal - ordinal2;
        }
    }

    o() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new w.c());
    }

    private void c(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    void b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            c(3);
            return;
        }
        int type2 = networkInfo.getType();
        if (type2 != 0) {
            if (type2 == 1 || type2 == 6 || type2 == 9) {
                c(4);
                return;
            } else {
                c(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                c(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        c(3);
                        break;
                    default:
                        c(3);
                        break;
                }
                return;
        }
        c(2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
