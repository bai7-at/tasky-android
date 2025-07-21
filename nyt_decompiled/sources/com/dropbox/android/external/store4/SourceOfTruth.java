package com.dropbox.android.external.store4;

import com.dropbox.android.external.store4.impl.PersistentNonFlowingSourceOfTruth;
import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ss2;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public interface SourceOfTruth {
    public static final a a = a.a;

    public static final class ReadException extends RuntimeException {
        private final Object key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadException(Object obj, Throwable th) {
            super(zq3.q("Failed to read from Source of Truth. key: ", obj), th);
            zq3.h(th, "cause");
            this.key = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!zq3.c(ReadException.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dropbox.android.external.store4.SourceOfTruth.ReadException");
            }
            ReadException readException = (ReadException) obj;
            return zq3.c(this.key, readException.key) && zq3.c(getCause(), readException.getCause());
        }

        public int hashCode() {
            Object obj = this.key;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static final class WriteException extends RuntimeException {
        private final Object key;
        private final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriteException(Object obj, Object obj2, Throwable th) {
            super(zq3.q("Failed to write value to Source of Truth. key: ", obj), th);
            zq3.h(th, "cause");
            this.key = obj;
            this.value = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!zq3.c(WriteException.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dropbox.android.external.store4.SourceOfTruth.WriteException");
            }
            WriteException writeException = (WriteException) obj;
            return zq3.c(this.key, writeException.key) && zq3.c(this.value, writeException.value) && zq3.c(getCause(), writeException.getCause());
        }

        public int hashCode() {
            Object obj = this.key;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.value;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static /* synthetic */ SourceOfTruth b(a aVar, gt2 gt2Var, it2 it2Var, gt2 gt2Var2, ss2 ss2Var, int i, Object obj) {
            if ((i & 4) != 0) {
                gt2Var2 = null;
            }
            if ((i & 8) != 0) {
                ss2Var = null;
            }
            return aVar.a(gt2Var, it2Var, gt2Var2, ss2Var);
        }

        public final SourceOfTruth a(gt2 gt2Var, it2 it2Var, gt2 gt2Var2, ss2 ss2Var) {
            zq3.h(gt2Var, "nonFlowReader");
            zq3.h(it2Var, "writer");
            return new PersistentNonFlowingSourceOfTruth(gt2Var, it2Var, gt2Var2, ss2Var);
        }
    }

    Flow a(Object obj);

    Object b(Object obj, Object obj2, by0 by0Var);
}
