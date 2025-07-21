package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hf2 implements lu3 {
    private final lu3 a;
    private final Map b;

    public hf2(lu3 lu3Var) {
        zq3.h(lu3Var, "wrappedWriter");
        this.a = lu3Var;
        this.b = new LinkedHashMap();
    }

    @Override // defpackage.lu3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public hf2 z0(zt3 zt3Var) {
        zq3.h(zt3Var, "value");
        this.a.z0(zt3Var);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public hf2 A(ay8 ay8Var) {
        zq3.h(ay8Var, "value");
        this.b.put(this.a.getPath(), ay8Var);
        this.a.p1();
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public hf2 value(String str) {
        zq3.h(str, "value");
        this.a.value(str);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public hf2 value(boolean z) {
        this.a.value(z);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hf2 beginArray() {
        this.a.beginArray();
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public hf2 beginObject() {
        this.a.beginObject();
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public final Map d() {
        return this.b;
    }

    @Override // defpackage.lu3
    public String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.lu3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public hf2 endArray() {
        this.a.endArray();
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public hf2 endObject() {
        this.a.endObject();
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public hf2 name(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a.name(str);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public hf2 p1() {
        this.a.p1();
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public hf2 value(double d) {
        this.a.value(d);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public hf2 D(int i) {
        this.a.D(i);
        return this;
    }

    @Override // defpackage.lu3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public hf2 value(long j) {
        this.a.value(j);
        return this;
    }
}
