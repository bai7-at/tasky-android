package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.daf;
import defpackage.erf;
import defpackage.lpf;
import defpackage.q3f;
import defpackage.vq9;
import defpackage.zdf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class t9 extends g9 {
    t9(r9 r9Var) {
        super(r9Var);
    }

    static zdf B(zdf zdfVar, byte[] bArr) {
        daf b = daf.b();
        return b != null ? zdfVar.L(bArr, b) : zdfVar.K0(bArr);
    }

    static List G(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    static boolean K(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    static boolean M(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static final void O(com.google.android.gms.internal.measurement.i0 i0Var, String str, Object obj) {
        List B = i0Var.B();
        int i = 0;
        while (true) {
            if (i >= B.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.n0) B.get(i)).x())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.m0 v = com.google.android.gms.internal.measurement.n0.v();
        v.v(str);
        if (obj instanceof Long) {
            v.u(((Long) obj).longValue());
        }
        if (i >= 0) {
            i0Var.v(i, v);
        } else {
            i0Var.q(v);
        }
    }

    static final boolean i(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    static final com.google.android.gms.internal.measurement.n0 j(com.google.android.gms.internal.measurement.j0 j0Var, String str) {
        for (com.google.android.gms.internal.measurement.n0 n0Var : j0Var.z()) {
            if (n0Var.x().equals(str)) {
                return n0Var;
            }
        }
        return null;
    }

    static final Object k(com.google.android.gms.internal.measurement.j0 j0Var, String str) {
        com.google.android.gms.internal.measurement.n0 j = j(j0Var, str);
        if (j == null) {
            return null;
        }
        if (j.T()) {
            return j.y();
        }
        if (j.N()) {
            return Long.valueOf(j.u());
        }
        if (j.K()) {
            return Double.valueOf(j.r());
        }
        if (j.t() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.n0> z = j.z();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.n0 n0Var : z) {
            if (n0Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.n0 n0Var2 : n0Var.z()) {
                    if (n0Var2.T()) {
                        bundle.putString(n0Var2.x(), n0Var2.y());
                    } else if (n0Var2.N()) {
                        bundle.putLong(n0Var2.x(), n0Var2.u());
                    } else if (n0Var2.K()) {
                        bundle.putDouble(n0Var2.x(), n0Var2.r());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void l(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) it2.next();
            if (n0Var != null) {
                n(sb, i2);
                sb.append("param {\n");
                t(sb, i2, AuthenticationTokenClaims.JSON_KEY_NAME, n0Var.S() ? this.a.C().e(n0Var.x()) : null);
                t(sb, i2, "string_value", n0Var.T() ? n0Var.y() : null);
                t(sb, i2, "int_value", n0Var.N() ? Long.valueOf(n0Var.u()) : null);
                t(sb, i2, "double_value", n0Var.K() ? Double.valueOf(n0Var.r()) : null);
                if (n0Var.t() > 0) {
                    l(sb, i2, n0Var.z());
                }
                n(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void m(StringBuilder sb, int i, com.google.android.gms.internal.measurement.g gVar) {
        String str;
        if (gVar == null) {
            return;
        }
        n(sb, i);
        sb.append("filter {\n");
        if (gVar.y()) {
            t(sb, i, "complement", Boolean.valueOf(gVar.x()));
        }
        if (gVar.A()) {
            t(sb, i, "param_name", this.a.C().e(gVar.v()));
        }
        if (gVar.B()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.o u = gVar.u();
            if (u != null) {
                n(sb, i2);
                sb.append("string_filter {\n");
                if (u.z()) {
                    switch (u.A()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    t(sb, i2, "match_type", str);
                }
                if (u.y()) {
                    t(sb, i2, "expression", u.u());
                }
                if (u.x()) {
                    t(sb, i2, "case_sensitive", Boolean.valueOf(u.w()));
                }
                if (u.r() > 0) {
                    n(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : u.v()) {
                        n(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                n(sb, i2);
                sb.append("}\n");
            }
        }
        if (gVar.z()) {
            u(sb, i + 1, "number_filter", gVar.t());
        }
        n(sb, i);
        sb.append("}\n");
    }

    private static final void n(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final String r(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void s(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        n(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (y0Var.s() != 0) {
            n(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : y0Var.B()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (y0Var.u() != 0) {
            n(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : y0Var.D()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (y0Var.r() != 0) {
            n(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.h0 h0Var : y0Var.A()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(h0Var.y() ? Integer.valueOf(h0Var.r()) : null);
                sb.append(":");
                sb.append(h0Var.x() ? Long.valueOf(h0Var.s()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (y0Var.t() != 0) {
            n(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.a1 a1Var : y0Var.C()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(a1Var.z() ? Integer.valueOf(a1Var.s()) : null);
                sb.append(": [");
                Iterator it2 = a1Var.w().iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    long longValue = ((Long) it2.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        n(sb, 3);
        sb.append("}\n");
    }

    private static final void t(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        n(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void u(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.j jVar) {
        if (jVar == null) {
            return;
        }
        n(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (jVar.x()) {
            int C = jVar.C();
            t(sb, i, "comparison_type", C != 1 ? C != 2 ? C != 3 ? C != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (jVar.z()) {
            t(sb, i, "match_as_float", Boolean.valueOf(jVar.w()));
        }
        if (jVar.y()) {
            t(sb, i, "comparison_value", jVar.t());
        }
        if (jVar.B()) {
            t(sb, i, "min_comparison_value", jVar.v());
        }
        if (jVar.A()) {
            t(sb, i, "max_comparison_value", jVar.u());
        }
        n(sb, i);
        sb.append("}\n");
    }

    static int v(com.google.android.gms.internal.measurement.s0 s0Var, String str) {
        if (s0Var != null) {
            for (int i = 0; i < s0Var.q0(); i++) {
                if (str.equals(s0Var.k0(i).w())) {
                    return i;
                }
            }
        }
        return -1;
    }

    final com.google.android.gms.internal.measurement.j0 A(p pVar) {
        com.google.android.gms.internal.measurement.i0 v = com.google.android.gms.internal.measurement.j0.v();
        v.x(pVar.e);
        r rVar = new r(pVar.f);
        while (rVar.hasNext()) {
            String next = rVar.next();
            com.google.android.gms.internal.measurement.m0 v2 = com.google.android.gms.internal.measurement.n0.v();
            v2.v(next);
            Object X0 = pVar.f.X0(next);
            Preconditions.checkNotNull(X0);
            I(v2, X0);
            v.q(v2);
        }
        return (com.google.android.gms.internal.measurement.j0) v.i();
    }

    final String C(com.google.android.gms.internal.measurement.r0 r0Var) {
        if (r0Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.t0 t0Var : r0Var.u()) {
            if (t0Var != null) {
                n(sb, 1);
                sb.append("bundle {\n");
                if (t0Var.p1()) {
                    t(sb, 1, "protocol_version", Integer.valueOf(t0Var.y1()));
                }
                erf.b();
                if (this.a.y().A(null, m3.J0) && t0Var.s1()) {
                    t(sb, 1, "session_stitching_token", t0Var.C());
                }
                t(sb, 1, "platform", t0Var.A());
                if (t0Var.l1()) {
                    t(sb, 1, "gmp_version", Long.valueOf(t0Var.H1()));
                }
                if (t0Var.w1()) {
                    t(sb, 1, "uploading_gmp_version", Long.valueOf(t0Var.M1()));
                }
                if (t0Var.j1()) {
                    t(sb, 1, "dynamite_version", Long.valueOf(t0Var.F1()));
                }
                if (t0Var.g1()) {
                    t(sb, 1, "config_version", Long.valueOf(t0Var.D1()));
                }
                t(sb, 1, "gmp_app_id", t0Var.x());
                t(sb, 1, "admob_app_id", t0Var.R1());
                t(sb, 1, "app_id", t0Var.S1());
                t(sb, 1, "app_version", t0Var.s());
                if (t0Var.e1()) {
                    t(sb, 1, "app_version_major", Integer.valueOf(t0Var.W()));
                }
                t(sb, 1, "firebase_instance_id", t0Var.w());
                if (t0Var.i1()) {
                    t(sb, 1, "dev_cert_hash", Long.valueOf(t0Var.E1()));
                }
                t(sb, 1, "app_store", t0Var.r());
                if (t0Var.v1()) {
                    t(sb, 1, "upload_timestamp_millis", Long.valueOf(t0Var.L1()));
                }
                if (t0Var.t1()) {
                    t(sb, 1, "start_timestamp_millis", Long.valueOf(t0Var.K1()));
                }
                if (t0Var.k1()) {
                    t(sb, 1, "end_timestamp_millis", Long.valueOf(t0Var.G1()));
                }
                if (t0Var.o1()) {
                    t(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(t0Var.J1()));
                }
                if (t0Var.n1()) {
                    t(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(t0Var.I1()));
                }
                t(sb, 1, "app_instance_id", t0Var.T1());
                t(sb, 1, "resettable_device_id", t0Var.B());
                t(sb, 1, "ds_id", t0Var.v());
                if (t0Var.m1()) {
                    t(sb, 1, "limited_ad_tracking", Boolean.valueOf(t0Var.x0()));
                }
                t(sb, 1, "os_version", t0Var.z());
                t(sb, 1, "device_model", t0Var.u());
                t(sb, 1, "user_default_language", t0Var.D());
                if (t0Var.u1()) {
                    t(sb, 1, "time_zone_offset_minutes", Integer.valueOf(t0Var.A1()));
                }
                if (t0Var.f1()) {
                    t(sb, 1, "bundle_sequential_index", Integer.valueOf(t0Var.a1()));
                }
                if (t0Var.r1()) {
                    t(sb, 1, "service_upload", Boolean.valueOf(t0Var.y0()));
                }
                t(sb, 1, "health_monitor", t0Var.y());
                if (!this.a.y().A(null, m3.j0) && t0Var.d1() && t0Var.C1() != 0) {
                    t(sb, 1, "android_id", Long.valueOf(t0Var.C1()));
                }
                if (t0Var.q1()) {
                    t(sb, 1, "retry_counter", Integer.valueOf(t0Var.z1()));
                }
                if (t0Var.h1()) {
                    t(sb, 1, "consent_signals", t0Var.t());
                }
                List<com.google.android.gms.internal.measurement.c1> G = t0Var.G();
                if (G != null) {
                    for (com.google.android.gms.internal.measurement.c1 c1Var : G) {
                        if (c1Var != null) {
                            n(sb, 2);
                            sb.append("user_property {\n");
                            t(sb, 2, "set_timestamp_millis", c1Var.I() ? Long.valueOf(c1Var.t()) : null);
                            t(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, this.a.C().f(c1Var.w()));
                            t(sb, 2, "string_value", c1Var.x());
                            t(sb, 2, "int_value", c1Var.H() ? Long.valueOf(c1Var.s()) : null);
                            t(sb, 2, "double_value", c1Var.G() ? Double.valueOf(c1Var.r()) : null);
                            n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.f0> E = t0Var.E();
                if (E != null) {
                    for (com.google.android.gms.internal.measurement.f0 f0Var : E) {
                        if (f0Var != null) {
                            n(sb, 2);
                            sb.append("audience_membership {\n");
                            if (f0Var.B()) {
                                t(sb, 2, "audience_id", Integer.valueOf(f0Var.r()));
                            }
                            if (f0Var.C()) {
                                t(sb, 2, "new_audience", Boolean.valueOf(f0Var.A()));
                            }
                            s(sb, 2, "current_data", f0Var.u());
                            if (f0Var.D()) {
                                s(sb, 2, "previous_data", f0Var.v());
                            }
                            n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.j0> F = t0Var.F();
                if (F != null) {
                    for (com.google.android.gms.internal.measurement.j0 j0Var : F) {
                        if (j0Var != null) {
                            n(sb, 2);
                            sb.append("event {\n");
                            t(sb, 2, AuthenticationTokenClaims.JSON_KEY_NAME, this.a.C().d(j0Var.y()));
                            if (j0Var.K()) {
                                t(sb, 2, "timestamp_millis", Long.valueOf(j0Var.u()));
                            }
                            if (j0Var.J()) {
                                t(sb, 2, "previous_timestamp_millis", Long.valueOf(j0Var.t()));
                            }
                            if (j0Var.I()) {
                                t(sb, 2, "count", Integer.valueOf(j0Var.r()));
                            }
                            if (j0Var.s() != 0) {
                                l(sb, 2, j0Var.z());
                            }
                            n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                n(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final String D(com.google.android.gms.internal.measurement.e eVar) {
        if (eVar == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (eVar.F()) {
            t(sb, 0, "filter_id", Integer.valueOf(eVar.s()));
        }
        t(sb, 0, "event_name", this.a.C().d(eVar.x()));
        String r = r(eVar.B(), eVar.C(), eVar.D());
        if (!r.isEmpty()) {
            t(sb, 0, "filter_type", r);
        }
        if (eVar.E()) {
            u(sb, 1, "event_count_filter", eVar.w());
        }
        if (eVar.r() > 0) {
            sb.append("  filters {\n");
            Iterator it2 = eVar.y().iterator();
            while (it2.hasNext()) {
                m(sb, 2, (com.google.android.gms.internal.measurement.g) it2.next());
            }
        }
        n(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String E(com.google.android.gms.internal.measurement.l lVar) {
        if (lVar == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (lVar.A()) {
            t(sb, 0, "filter_id", Integer.valueOf(lVar.r()));
        }
        t(sb, 0, "property_name", this.a.C().f(lVar.v()));
        String r = r(lVar.x(), lVar.y(), lVar.z());
        if (!r.isEmpty()) {
            t(sb, 0, "filter_type", r);
        }
        m(sb, 1, lVar.s());
        sb.append("}\n");
        return sb.toString();
    }

    final List F(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            if (num.intValue() < 0) {
                this.a.o().v().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.a.o().v().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r4.add(H((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r7 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r4.add(H((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r4.add(H((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map H(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            defpackage.lpf.b()
            com.google.android.gms.measurement.internal.a5 r4 = r10.a
            com.google.android.gms.measurement.internal.g r4 = r4.y()
            r5 = 0
            com.google.android.gms.measurement.internal.l3 r6 = com.google.android.gms.measurement.internal.m3.o0
            boolean r4 = r4.A(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.H(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.H(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.H(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.H(android.os.Bundle, boolean):java.util.Map");
    }

    final void I(com.google.android.gms.internal.measurement.m0 m0Var, Object obj) {
        Preconditions.checkNotNull(obj);
        m0Var.s();
        m0Var.q();
        m0Var.p();
        m0Var.r();
        if (obj instanceof String) {
            m0Var.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            m0Var.u(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            m0Var.t(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.a.o().n().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.m0 v = com.google.android.gms.internal.measurement.n0.v();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.m0 v2 = com.google.android.gms.internal.measurement.n0.v();
                    v2.v(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        v2.u(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        v2.w((String) obj2);
                    } else if (obj2 instanceof Double) {
                        v2.t(((Double) obj2).doubleValue());
                    }
                    v.o(v2);
                }
                if (v.m() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.n0) v.i());
                }
            }
        }
        m0Var.n(arrayList);
    }

    final void J(com.google.android.gms.internal.measurement.b1 b1Var, Object obj) {
        Preconditions.checkNotNull(obj);
        b1Var.o();
        b1Var.n();
        b1Var.m();
        if (obj instanceof String) {
            b1Var.t((String) obj);
            return;
        }
        if (obj instanceof Long) {
            b1Var.q(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            b1Var.p(((Double) obj).doubleValue());
        } else {
            this.a.o().n().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean L(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.a.p().currentTimeMillis() - j) > j2;
    }

    final byte[] N(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.a.o().n().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    final long w(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.a.M().c();
        MessageDigest s = x9.s();
        if (s != null) {
            return x9.p0(s.digest(bArr));
        }
        this.a.o().n().a("Failed to get MD5");
        return 0L;
    }

    final Bundle x(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                lpf.b();
                if (this.a.y().A(null, m3.o0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(x((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(x((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    final Parcelable y(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.a.o().n().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    final zzaw z(vq9 vq9Var) {
        Object obj;
        Bundle x = x(vq9Var.e(), true);
        String obj2 = (!x.containsKey("_o") || (obj = x.get("_o")) == null) ? "app" : obj.toString();
        String b = q3f.b(vq9Var.d());
        if (b == null) {
            b = vq9Var.d();
        }
        return new zzaw(b, new zzau(x), obj2, vq9Var.a());
    }
}
