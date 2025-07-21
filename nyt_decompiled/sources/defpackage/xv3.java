package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.security.PrivateKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class xv3 {

    public static final class a extends xv3 {
        private final PrivateKey a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PrivateKey privateKey) {
            super(null);
            zq3.h(privateKey, TransferTable.COLUMN_KEY);
            this.a = privateKey;
        }

        public final PrivateKey a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "SamizdatKey(key=" + this.a + ")";
        }
    }

    public /* synthetic */ xv3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private xv3() {
    }
}
