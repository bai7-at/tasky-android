package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public abstract class w76 {

    private static class a {
        private final UUID a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        yo5 yo5Var = new yo5(bArr);
        if (yo5Var.g() < 32) {
            return null;
        }
        yo5Var.U(0);
        if (yo5Var.q() != yo5Var.a() + 4 || yo5Var.q() != 1886614376) {
            return null;
        }
        int c = yu.c(yo5Var.q());
        if (c > 1) {
            a84.j("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(yo5Var.A(), yo5Var.A());
        if (c == 1) {
            yo5Var.V(yo5Var.L() * 16);
        }
        int L = yo5Var.L();
        if (L != yo5Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[L];
        yo5Var.l(bArr2, 0, L);
        return new a(uuid, c, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.a)) {
            return d.c;
        }
        a84.j("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.a + InstructionFileId.DOT);
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        return d.a;
    }

    public static int g(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return -1;
        }
        return d.b;
    }
}
