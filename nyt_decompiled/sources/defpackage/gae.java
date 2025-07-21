package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class gae extends hae {
    protected final HashSet c;
    protected final JSONObject d;
    protected final long e;

    public gae(z9e z9eVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(z9eVar);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
