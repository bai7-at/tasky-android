package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.sq8;
import defpackage.ur;
import defpackage.z91;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
class a implements com.google.android.exoplayer2.upstream.a {
    private final com.google.android.exoplayer2.upstream.a a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public a(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        this.a = aVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final long b(com.google.android.exoplayer2.upstream.b bVar) {
        try {
            Cipher k = k();
            try {
                k.init(2, new SecretKeySpec(this.b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(this.c));
                z91 z91Var = new z91(this.a, bVar);
                this.d = new CipherInputStream(z91Var, k);
                z91Var.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Map f() {
        return this.a.f();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void i(sq8 sq8Var) {
        ur.e(sq8Var);
        this.a.i(sq8Var);
    }

    protected Cipher k() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // defpackage.s91
    public final int read(byte[] bArr, int i, int i2) {
        ur.e(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
