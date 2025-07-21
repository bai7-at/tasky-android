package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class wud implements v3f {
    public static jqd a(Context context, teb tebVar, zeb zebVar, Object obj, jrd jrdVar, ztd ztdVar, l3f l3fVar, l3f l3fVar2, l3f l3fVar3, l3f l3fVar4, l3f l3fVar5, l3f l3fVar6, l3f l3fVar7, l3f l3fVar8, l3f l3fVar9, Executor executor, q7e q7eVar, zuc zucVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((std) obj);
        hashSet.add(jrdVar);
        hashSet.add(ztdVar);
        if (((Boolean) pla.c().a(mpa.K5)).booleanValue()) {
            hashSet.add((gqd) l3fVar.zzb());
        }
        if (((Boolean) pla.c().a(mpa.L5)).booleanValue()) {
            hashSet.add((gqd) l3fVar2.zzb());
        }
        if (((Boolean) pla.c().a(mpa.M5)).booleanValue()) {
            hashSet.add((gqd) l3fVar3.zzb());
        }
        if (((Boolean) pla.c().a(mpa.N5)).booleanValue()) {
            hashSet.add((gqd) l3fVar4.zzb());
        }
        if (((Boolean) pla.c().a(mpa.R5)).booleanValue()) {
            hashSet.add((gqd) l3fVar6.zzb());
        }
        if (((Boolean) pla.c().a(mpa.S5)).booleanValue()) {
            hashSet.add((gqd) l3fVar7.zzb());
        }
        if (((Boolean) pla.c().a(mpa.I2)).booleanValue()) {
            hashSet.add((gqd) l3fVar9.zzb());
        }
        return new jqd(context, executor, hashSet, q7eVar, zucVar);
    }
}
