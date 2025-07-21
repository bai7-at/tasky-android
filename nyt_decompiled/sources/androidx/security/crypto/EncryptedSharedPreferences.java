package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.d;
import defpackage.mf;
import defpackage.nn1;
import defpackage.o9;
import defpackage.oa;
import defpackage.on1;
import defpackage.p9;
import defpackage.q40;
import defpackage.vo;
import defpackage.wa;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    final SharedPreferences a;
    final List b = new ArrayList();
    final String c;
    final String d;
    final o9 e;
    final nn1 f;

    private enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum PrefKeyEncryptionScheme {
        AES256_SIV(wa.j());

        private final KeyTemplate mDeterministicAeadKeyTemplate;

        PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM(oa.j());

        private final KeyTemplate mAeadKeyTemplate;

        PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            a = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class b implements SharedPreferences.Editor {
        private final EncryptedSharedPreferences a;
        private final SharedPreferences.Editor b;
        private AtomicBoolean d = new AtomicBoolean(false);
        private final List c = new CopyOnWriteArrayList();

        b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.a = encryptedSharedPreferences;
            this.b = editor;
        }

        private void a() {
            if (this.d.getAndSet(false)) {
                for (String str : this.a.getAll().keySet()) {
                    if (!this.c.contains(str) && !this.a.g(str)) {
                        this.b.remove(this.a.d(str));
                    }
                }
            }
        }

        private void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.a.b) {
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.a, (String) it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e = this.a.e(str, bArr);
                this.b.putString((String) e.first, (String) e.second);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                this.c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new vo();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                byte[] bytes = ((String) it2.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.a.g(str)) {
                this.b.remove(this.a.d(str));
                this.c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, o9 o9Var, nn1 nn1Var) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = str2;
        this.e = o9Var;
        this.f = nn1Var;
    }

    public static SharedPreferences a(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        return b(str, masterKey.a(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    public static SharedPreferences b(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        on1.b();
        p9.b();
        Context applicationContext = context.getApplicationContext();
        d c = new mf.b().h(prefKeyEncryptionScheme.getKeyTemplate()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).i("android-keystore://" + str2).d().c();
        d c2 = new mf.b().h(prefValueEncryptionScheme.getKeyTemplate()).j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).i("android-keystore://" + str2).d().c();
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (o9) c2.h(o9.class), (nn1) c.h(nn1.class));
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d = d(str);
            String string = this.a.getString(d, null);
            if (string == null) {
                return null;
            }
            byte[] a2 = q40.a(string, 0);
            o9 o9Var = this.e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(o9Var.b(a2, d.getBytes(charset)));
            wrap.position(0);
            switch (a.a[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                case 1:
                    int i = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i);
                    String charBuffer = charset.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    vo voVar = new vo();
                    while (wrap.hasRemaining()) {
                        int i2 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i2);
                        wrap.position(wrap.position() + i2);
                        voVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (voVar.size() == 1 && "__NULL__".equals(voVar.u(0))) {
                        return null;
                    }
                    return voVar;
                default:
                    return null;
            }
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f.b(q40.a(str, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return q40.d(this.f.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    Pair e(String str, byte[] bArr) {
        String d = d(str);
        return new Pair(d, q40.d(this.e.a(bArr, d.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c = c(entry.getKey());
                hashMap.put(c, f(c));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object f = f(str);
        return (f == null || !(f instanceof Boolean)) ? z : ((Boolean) f).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object f2 = f(str);
        return (f2 == null || !(f2 instanceof Float)) ? f : ((Float) f2).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object f = f(str);
        return (f == null || !(f instanceof Integer)) ? i : ((Integer) f).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object f = f(str);
        return (f == null || !(f instanceof Long)) ? j : ((Long) f).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f = f(str);
        return (f == null || !(f instanceof String)) ? str2 : (String) f;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f = f(str);
        Set voVar = f instanceof Set ? (Set) f : new vo();
        return voVar.size() > 0 ? voVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
