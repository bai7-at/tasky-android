package com.google.android.exoplayer2.upstream.cache;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.common.collect.ImmutableSet;
import defpackage.av;
import defpackage.e59;
import defpackage.gx8;
import defpackage.mw0;
import defpackage.ow0;
import defpackage.sa1;
import defpackage.ug1;
import defpackage.ur;
import defpackage.z19;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
class f {
    private final HashMap a;
    private final SparseArray b;
    private final SparseBooleanArray c;
    private final SparseBooleanArray d;
    private c e;
    private c f;

    private static final class a implements c {
        private static final String[] d = {"id", TransferTable.COLUMN_KEY, "metadata"};
        private final SparseArray a = new SparseArray();
        private String b;
        private String c;

        public a(sa1 sa1Var) {
        }

        private static void h(sa1 sa1Var, String str) {
            try {
                String j = j(str);
                SQLiteDatabase o = sa1Var.o();
                o.beginTransactionNonExclusive();
                try {
                    e59.b(o, 1, str);
                    i(o, j);
                    o.setTransactionSuccessful();
                } finally {
                    o.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        private static void i(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private static String j(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void a(e eVar, boolean z) {
            if (z) {
                this.a.delete(eVar.a);
            } else {
                this.a.put(eVar.a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public boolean b() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void c(HashMap hashMap) {
            if (this.a.size() != 0) {
                throw null;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void d(long j) {
            String hexString = Long.toHexString(j);
            this.b = hexString;
            this.c = j(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void delete() {
            h(null, (String) ur.e(this.b));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void e(HashMap hashMap) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void f(e eVar) {
            this.a.put(eVar.a, eVar);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void g(HashMap hashMap, SparseArray sparseArray) {
            ur.g(this.a.size() == 0);
            throw null;
        }
    }

    private static class b implements c {
        private final boolean a;
        private final Cipher b;
        private final SecretKeySpec c;
        private final SecureRandom d;
        private final av e;
        private boolean f;
        private g g;

        public b(File file, byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            ur.g((bArr == null && z) ? false : true);
            if (bArr != null) {
                ur.a(bArr.length == 16);
                try {
                    cipher = f.i();
                    secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                ur.a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.a = z;
            this.b = cipher;
            this.c = secretKeySpec;
            this.d = z ? new SecureRandom() : null;
            this.e = new av(file);
        }

        private int h(e eVar, int i) {
            int i2;
            int hashCode;
            int hashCode2 = (eVar.a * 31) + eVar.b.hashCode();
            if (i < 2) {
                long d = mw0.d(eVar.c());
                i2 = hashCode2 * 31;
                hashCode = (int) (d ^ (d >>> 32));
            } else {
                i2 = hashCode2 * 31;
                hashCode = eVar.c().hashCode();
            }
            return i2 + hashCode;
        }

        private e i(int i, DataInputStream dataInputStream) {
            ug1 q;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                ow0 ow0Var = new ow0();
                ow0.g(ow0Var, readLong);
                q = ug1.c.f(ow0Var);
            } else {
                q = f.q(dataInputStream);
            }
            return new e(readInt, readUTF, q);
        }

        private boolean j(HashMap hashMap, SparseArray sparseArray) {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.e.c()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.e.d());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.b == null) {
                            z19.n(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.b.init(2, (Key) z19.j(this.c), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.b));
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                            throw new IllegalStateException(e);
                        }
                    } else if (this.a) {
                        this.f = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        e i3 = i(readInt, dataInputStream);
                        hashMap.put(i3.b, i3);
                        sparseArray.put(i3.a, i3.b);
                        i += h(i3, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i && z) {
                        z19.n(dataInputStream);
                        return true;
                    }
                    z19.n(dataInputStream);
                    return false;
                }
                z19.n(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    z19.n(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    z19.n(dataInputStream2);
                }
                throw th;
            }
        }

        private void k(e eVar, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(eVar.a);
            dataOutputStream.writeUTF(eVar.b);
            f.t(eVar.c(), dataOutputStream);
        }

        private void l(HashMap hashMap) {
            g gVar;
            DataOutputStream dataOutputStream;
            Closeable closeable = null;
            try {
                OutputStream f = this.e.f();
                g gVar2 = this.g;
                if (gVar2 == null) {
                    this.g = new g(f);
                } else {
                    gVar2.a(f);
                }
                gVar = this.g;
                dataOutputStream = new DataOutputStream(gVar);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                int i = 0;
                dataOutputStream.writeInt(this.a ? 1 : 0);
                if (this.a) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) z19.j(this.d)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) z19.j(this.b)).init(1, (Key) z19.j(this.c), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(gVar, this.b));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                for (e eVar : hashMap.values()) {
                    k(eVar, dataOutputStream);
                    i += h(eVar, 2);
                }
                dataOutputStream.writeInt(i);
                this.e.b(dataOutputStream);
                z19.n(null);
            } catch (Throwable th2) {
                th = th2;
                closeable = dataOutputStream;
                z19.n(closeable);
                throw th;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void a(e eVar, boolean z) {
            this.f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public boolean b() {
            return this.e.c();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void c(HashMap hashMap) {
            if (this.f) {
                e(hashMap);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void d(long j) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void delete() {
            this.e.a();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void e(HashMap hashMap) {
            l(hashMap);
            this.f = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void f(e eVar) {
            this.f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.f.c
        public void g(HashMap hashMap, SparseArray sparseArray) {
            ur.g(!this.f);
            if (j(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.e.a();
        }
    }

    private interface c {
        void a(e eVar, boolean z);

        boolean b();

        void c(HashMap hashMap);

        void d(long j);

        void delete();

        void e(HashMap hashMap);

        void f(e eVar);

        void g(HashMap hashMap, SparseArray sparseArray);
    }

    public f(sa1 sa1Var, File file, byte[] bArr, boolean z, boolean z2) {
        ur.g((sa1Var == null && file == null) ? false : true);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        a aVar = sa1Var != null ? new a(sa1Var) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (aVar == null || (bVar != null && z2)) {
            this.e = (c) z19.j(bVar);
            this.f = aVar;
        } else {
            this.e = aVar;
            this.f = bVar;
        }
    }

    private e d(String str) {
        int l = l(this.b);
        e eVar = new e(l, str);
        this.a.put(str, eVar);
        this.b.put(l, str);
        this.d.put(l, true);
        this.e.f(eVar);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher i() {
        if (z19.a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    static int l(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ug1 q(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException("Invalid value size: " + readInt2);
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = z19.f;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new ug1(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(ug1 ug1Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> g = ug1Var.g();
        dataOutputStream.writeInt(g.size());
        for (Map.Entry entry : g) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void e(String str, ow0 ow0Var) {
        e m = m(str);
        if (m.b(ow0Var)) {
            this.e.f(m);
        }
    }

    public int f(String str) {
        return m(str).a;
    }

    public e g(String str) {
        return (e) this.a.get(str);
    }

    public Collection h() {
        return Collections.unmodifiableCollection(this.a.values());
    }

    public mw0 j(String str) {
        e g = g(str);
        return g != null ? g.c() : ug1.c;
    }

    public String k(int i) {
        return (String) this.b.get(i);
    }

    public e m(String str) {
        e eVar = (e) this.a.get(str);
        return eVar == null ? d(str) : eVar;
    }

    public void n(long j) {
        c cVar;
        this.e.d(j);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.d(j);
        }
        if (this.e.b() || (cVar = this.f) == null || !cVar.b()) {
            this.e.g(this.a, this.b);
        } else {
            this.f.g(this.a, this.b);
            this.e.e(this.a);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.delete();
            this.f = null;
        }
    }

    public void p(String str) {
        e eVar = (e) this.a.get(str);
        if (eVar != null && eVar.f() && eVar.h()) {
            this.a.remove(str);
            int i = eVar.a;
            boolean z = this.d.get(i);
            this.e.a(eVar, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
            } else {
                this.b.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public void r() {
        gx8 it2 = ImmutableSet.u(this.a.keySet()).iterator();
        while (it2.hasNext()) {
            p((String) it2.next());
        }
    }

    public void s() {
        this.e.c(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
}
