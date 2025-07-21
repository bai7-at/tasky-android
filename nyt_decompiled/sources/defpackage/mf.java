package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.d;
import com.google.crypto.tink.e;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.of;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes3.dex */
public final class mf {
    private static final String d = "mf";
    private final bx3 a;
    private final o9 b;
    private e c;

    public static final class b {
        private ax3 a = null;
        private bx3 b = null;
        private String c = null;
        private o9 d = null;
        private boolean e = true;
        private KeyTemplate f = null;
        private KeyStore g = null;
        private e h;

        private e e() {
            o9 o9Var = this.d;
            if (o9Var != null) {
                try {
                    return e.j(d.j(this.a, o9Var));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                    Log.w(mf.d, "cannot decrypt keyset: ", e);
                }
            }
            return e.j(com.google.crypto.tink.a.a(this.a));
        }

        private e f() {
            try {
                return e();
            } catch (FileNotFoundException e) {
                Log.w(mf.d, "keyset not found, will generate a new one", e);
                if (this.f == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                e a = e.i().a(this.f);
                e h = a.h(a.c().g().P(0).P());
                if (this.d != null) {
                    h.c().k(this.b, this.d);
                } else {
                    com.google.crypto.tink.a.b(h.c(), this.b);
                }
                return h;
            }
        }

        private o9 g() {
            if (!mf.d()) {
                Log.w(mf.d, "Android Keystore requires at least Android M");
                return null;
            }
            of a = this.g != null ? new of.b().b(this.g).a() : new of();
            boolean e = a.e(this.c);
            if (!e) {
                try {
                    of.d(this.c);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w(mf.d, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            }
            try {
                return a.b(this.c);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (e) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.c), e3);
                }
                Log.w(mf.d, "cannot use Android Keystore, it'll be disabled", e3);
                return null;
            }
        }

        public synchronized mf d() {
            try {
                if (this.c != null) {
                    this.d = g();
                }
                this.h = f();
            } catch (Throwable th) {
                throw th;
            }
            return new mf(this);
        }

        public b h(KeyTemplate keyTemplate) {
            this.f = keyTemplate;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.e) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.c = str;
            return this;
        }

        public b j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.a = new nq7(context, str, str2);
            this.b = new oq7(context, str, str2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d() {
        return true;
    }

    public synchronized d c() {
        return this.c.c();
    }

    private mf(b bVar) {
        this.a = bVar.b;
        this.b = bVar.d;
        this.c = bVar.h;
    }
}
