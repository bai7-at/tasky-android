package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class nv3 {
    private final long a;
    public static final a b = new a(null);
    private static final long c = mw3.a(0);
    private static final long d = mw3.a(1);
    private static final long e = mw3.a(2);
    private static final long f = mw3.a(3);
    private static final long g = mw3.a(4);
    private static final long h = mw3.a(259);
    private static final long i = mw3.a(260);
    private static final long j = mw3.a(261);
    private static final long k = mw3.a(262);
    private static final long l = mw3.a(263);
    private static final long m = mw3.a(280);
    private static final long n = mw3.a(281);
    private static final long o = mw3.a(282);
    private static final long p = mw3.a(283);
    private static final long q = mw3.a(5);
    private static final long r = mw3.a(6);
    private static final long s = mw3.a(19);
    private static final long t = mw3.a(20);
    private static final long u = mw3.a(21);
    private static final long v = mw3.a(22);
    private static final long w = mw3.a(23);
    private static final long x = mw3.a(268);
    private static final long y = mw3.a(269);
    private static final long z = mw3.a(270);
    private static final long A = mw3.a(271);
    private static final long B = mw3.a(24);
    private static final long C = mw3.a(25);
    private static final long D = mw3.a(26);
    private static final long E = mw3.a(27);
    private static final long F = mw3.a(28);
    private static final long G = mw3.a(7);
    private static final long H = mw3.a(8);
    private static final long I = mw3.a(9);
    private static final long J = mw3.a(10);
    private static final long K = mw3.a(11);
    private static final long L = mw3.a(12);
    private static final long M = mw3.a(13);
    private static final long N = mw3.a(14);
    private static final long O = mw3.a(15);
    private static final long P = mw3.a(16);
    private static final long Q = mw3.a(81);
    private static final long R = mw3.a(69);
    private static final long S = mw3.a(17);
    private static final long T = mw3.a(70);
    private static final long U = mw3.a(18);
    private static final long V = mw3.a(29);
    private static final long W = mw3.a(30);
    private static final long X = mw3.a(31);
    private static final long Y = mw3.a(32);
    private static final long Z = mw3.a(33);
    private static final long a0 = mw3.a(34);
    private static final long b0 = mw3.a(35);
    private static final long c0 = mw3.a(36);
    private static final long d0 = mw3.a(37);
    private static final long e0 = mw3.a(38);
    private static final long f0 = mw3.a(39);
    private static final long g0 = mw3.a(40);
    private static final long h0 = mw3.a(41);
    private static final long i0 = mw3.a(42);
    private static final long j0 = mw3.a(43);
    private static final long k0 = mw3.a(44);
    private static final long l0 = mw3.a(45);
    private static final long m0 = mw3.a(46);
    private static final long n0 = mw3.a(47);
    private static final long o0 = mw3.a(48);
    private static final long p0 = mw3.a(49);
    private static final long q0 = mw3.a(50);
    private static final long r0 = mw3.a(51);
    private static final long s0 = mw3.a(52);
    private static final long t0 = mw3.a(53);
    private static final long u0 = mw3.a(54);
    private static final long v0 = mw3.a(55);
    private static final long w0 = mw3.a(56);
    private static final long x0 = mw3.a(57);
    private static final long y0 = mw3.a(58);
    private static final long z0 = mw3.a(59);
    private static final long A0 = mw3.a(60);
    private static final long B0 = mw3.a(61);
    private static final long C0 = mw3.a(62);
    private static final long D0 = mw3.a(63);
    private static final long E0 = mw3.a(64);
    private static final long F0 = mw3.a(65);
    private static final long G0 = mw3.a(66);
    private static final long H0 = mw3.a(67);
    private static final long I0 = mw3.a(ContentType.LONG_FORM_ON_DEMAND);
    private static final long J0 = mw3.a(ContentType.SHORT_FORM_ON_DEMAND);
    private static final long K0 = mw3.a(ContentType.LIVE);
    private static final long L0 = mw3.a(114);
    private static final long M0 = mw3.a(115);
    private static final long N0 = mw3.a(116);
    private static final long O0 = mw3.a(117);
    private static final long P0 = mw3.a(118);
    private static final long Q0 = mw3.a(119);
    private static final long R0 = mw3.a(120);
    private static final long S0 = mw3.a(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND);
    private static final long T0 = mw3.a(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND);
    private static final long U0 = mw3.a(ContentType.USER_GENERATED_LIVE);
    private static final long V0 = mw3.a(124);
    private static final long W0 = mw3.a(277);
    private static final long X0 = mw3.a(278);
    private static final long Y0 = mw3.a(279);
    private static final long Z0 = mw3.a(68);
    private static final long a1 = mw3.a(71);
    private static final long b1 = mw3.a(72);
    private static final long c1 = mw3.a(76);
    private static final long d1 = mw3.a(73);
    private static final long e1 = mw3.a(74);
    private static final long f1 = mw3.a(75);
    private static final long g1 = mw3.a(77);
    private static final long h1 = mw3.a(78);
    private static final long i1 = mw3.a(79);
    private static final long j1 = mw3.a(80);
    private static final long k1 = mw3.a(82);
    private static final long l1 = mw3.a(83);
    private static final long m1 = mw3.a(84);
    private static final long n1 = mw3.a(92);
    private static final long o1 = mw3.a(93);
    private static final long p1 = mw3.a(94);
    private static final long q1 = mw3.a(95);
    private static final long r1 = mw3.a(96);
    private static final long s1 = mw3.a(97);
    private static final long t1 = mw3.a(98);
    private static final long u1 = mw3.a(99);
    private static final long v1 = mw3.a(100);
    private static final long w1 = mw3.a(101);
    private static final long x1 = mw3.a(102);
    private static final long y1 = mw3.a(103);
    private static final long z1 = mw3.a(104);
    private static final long A1 = mw3.a(105);
    private static final long B1 = mw3.a(106);
    private static final long C1 = mw3.a(107);
    private static final long D1 = mw3.a(108);
    private static final long E1 = mw3.a(109);
    private static final long F1 = mw3.a(110);
    private static final long G1 = mw3.a(188);
    private static final long H1 = mw3.a(189);
    private static final long I1 = mw3.a(190);
    private static final long J1 = mw3.a(191);
    private static final long K1 = mw3.a(192);
    private static final long L1 = mw3.a(193);
    private static final long M1 = mw3.a(194);
    private static final long N1 = mw3.a(195);
    private static final long O1 = mw3.a(196);
    private static final long P1 = mw3.a(197);
    private static final long Q1 = mw3.a(198);
    private static final long R1 = mw3.a(ContentType.BUMPER);
    private static final long S1 = mw3.a(200);
    private static final long T1 = mw3.a(201);
    private static final long U1 = mw3.a(202);
    private static final long V1 = mw3.a(203);
    private static final long W1 = mw3.a(125);
    private static final long X1 = mw3.a(131);
    private static final long Y1 = mw3.a(132);
    private static final long Z1 = mw3.a(133);
    private static final long a2 = mw3.a(134);
    private static final long b2 = mw3.a(135);
    private static final long c2 = mw3.a(136);
    private static final long d2 = mw3.a(137);
    private static final long e2 = mw3.a(138);
    private static final long f2 = mw3.a(139);
    private static final long g2 = mw3.a(140);
    private static final long h2 = mw3.a(141);
    private static final long i2 = mw3.a(142);
    private static final long j2 = mw3.a(143);
    private static final long k2 = mw3.a(144);
    private static final long l2 = mw3.a(145);
    private static final long m2 = mw3.a(146);
    private static final long n2 = mw3.a(147);
    private static final long o2 = mw3.a(148);
    private static final long p2 = mw3.a(149);
    private static final long q2 = mw3.a(150);
    private static final long r2 = mw3.a(151);
    private static final long s2 = mw3.a(152);
    private static final long t2 = mw3.a(153);
    private static final long u2 = mw3.a(154);
    private static final long v2 = mw3.a(155);
    private static final long w2 = mw3.a(156);
    private static final long x2 = mw3.a(157);
    private static final long y2 = mw3.a(158);
    private static final long z2 = mw3.a(159);
    private static final long A2 = mw3.a(160);
    private static final long B2 = mw3.a(161);
    private static final long C2 = mw3.a(162);
    private static final long D2 = mw3.a(163);
    private static final long E2 = mw3.a(WebSocketProtocol.PAYLOAD_SHORT);
    private static final long F2 = mw3.a(127);
    private static final long G2 = mw3.a(85);
    private static final long H2 = mw3.a(86);
    private static final long I2 = mw3.a(130);
    private static final long J2 = mw3.a(87);
    private static final long K2 = mw3.a(88);
    private static final long L2 = mw3.a(89);
    private static final long M2 = mw3.a(90);
    private static final long N2 = mw3.a(128);
    private static final long O2 = mw3.a(222);
    private static final long P2 = mw3.a(129);
    private static final long Q2 = mw3.a(226);
    private static final long R2 = mw3.a(272);
    private static final long S2 = mw3.a(273);
    private static final long T2 = mw3.a(274);
    private static final long U2 = mw3.a(275);
    private static final long V2 = mw3.a(91);
    private static final long W2 = mw3.a(164);
    private static final long X2 = mw3.a(165);
    private static final long Y2 = mw3.a(166);
    private static final long Z2 = mw3.a(167);
    private static final long a3 = mw3.a(168);
    private static final long b3 = mw3.a(169);
    private static final long c3 = mw3.a(170);
    private static final long d3 = mw3.a(171);
    private static final long e3 = mw3.a(172);
    private static final long f3 = mw3.a(173);
    private static final long g3 = mw3.a(174);
    private static final long h3 = mw3.a(175);
    private static final long i3 = mw3.a(176);
    private static final long j3 = mw3.a(177);
    private static final long k3 = mw3.a(178);
    private static final long l3 = mw3.a(179);
    private static final long m3 = mw3.a(180);
    private static final long n3 = mw3.a(181);
    private static final long o3 = mw3.a(182);
    private static final long p3 = mw3.a(183);
    private static final long q3 = mw3.a(184);
    private static final long r3 = mw3.a(185);
    private static final long s3 = mw3.a(186);
    private static final long t3 = mw3.a(187);
    private static final long u3 = mw3.a(204);
    private static final long v3 = mw3.a(205);
    private static final long w3 = mw3.a(206);
    private static final long x3 = mw3.a(207);
    private static final long y3 = mw3.a(208);
    private static final long z3 = mw3.a(209);
    private static final long A3 = mw3.a(210);
    private static final long B3 = mw3.a(AdvertisementType.ON_DEMAND_PRE_ROLL);
    private static final long C3 = mw3.a(AdvertisementType.ON_DEMAND_MID_ROLL);
    private static final long D3 = mw3.a(AdvertisementType.ON_DEMAND_POST_ROLL);
    private static final long E3 = mw3.a(214);
    private static final long F3 = mw3.a(215);
    private static final long G3 = mw3.a(216);
    private static final long H3 = mw3.a(217);
    private static final long I3 = mw3.a(218);
    private static final long J3 = mw3.a(219);
    private static final long K3 = mw3.a(220);
    private static final long L3 = mw3.a(AdvertisementType.LIVE);
    private static final long M3 = mw3.a(223);
    private static final long N3 = mw3.a(224);
    private static final long O3 = mw3.a(276);
    private static final long P3 = mw3.a(225);
    private static final long Q3 = mw3.a(229);
    private static final long R3 = mw3.a(230);
    private static final long S3 = mw3.a(AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL);
    private static final long T3 = mw3.a(AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
    private static final long U3 = mw3.a(AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL);
    private static final long V3 = mw3.a(AdvertisementType.BRANDED_AS_CONTENT);
    private static final long W3 = mw3.a(AdvertisementType.BRANDED_DURING_LIVE);
    private static final long X3 = mw3.a(236);
    private static final long Y3 = mw3.a(237);
    private static final long Z3 = mw3.a(238);
    private static final long a4 = mw3.a(239);
    private static final long b4 = mw3.a(240);
    private static final long c4 = mw3.a(241);
    private static final long d4 = mw3.a(242);
    private static final long e4 = mw3.a(243);
    private static final long f4 = mw3.a(244);
    private static final long g4 = mw3.a(245);
    private static final long h4 = mw3.a(246);
    private static final long i4 = mw3.a(247);
    private static final long j4 = mw3.a(248);
    private static final long k4 = mw3.a(249);
    private static final long l4 = mw3.a(250);
    private static final long m4 = mw3.a(251);
    private static final long n4 = mw3.a(252);
    private static final long o4 = mw3.a(253);
    private static final long p4 = mw3.a(254);
    private static final long q4 = mw3.a(255);
    private static final long r4 = mw3.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
    private static final long s4 = mw3.a(257);
    private static final long t4 = mw3.a(258);
    private static final long u4 = mw3.a(264);
    private static final long v4 = mw3.a(265);
    private static final long w4 = mw3.a(266);
    private static final long x4 = mw3.a(267);
    private static final long y4 = mw3.a(284);
    private static final long z4 = mw3.a(285);
    private static final long A4 = mw3.a(286);
    private static final long B4 = mw3.a(287);
    private static final long C4 = mw3.a(288);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return nv3.g;
        }

        public final long b() {
            return nv3.w;
        }

        public final long c() {
            return nv3.t;
        }

        public final long d() {
            return nv3.u;
        }

        public final long e() {
            return nv3.v;
        }

        public final long f() {
            return nv3.s;
        }

        public final long g() {
            return nv3.G0;
        }

        public final long h() {
            return nv3.J0;
        }

        public final long i() {
            return nv3.A2;
        }

        public final long j() {
            return nv3.o1;
        }

        public final long k() {
            return nv3.n1;
        }

        public final long l() {
            return nv3.B0;
        }

        private a() {
        }
    }

    private /* synthetic */ nv3(long j5) {
        this.a = j5;
    }

    public static final /* synthetic */ nv3 m(long j5) {
        return new nv3(j5);
    }

    public static long n(long j5) {
        return j5;
    }

    public static boolean o(long j5, Object obj) {
        return (obj instanceof nv3) && j5 == ((nv3) obj).s();
    }

    public static final boolean p(long j5, long j6) {
        return j5 == j6;
    }

    public static int q(long j5) {
        return Long.hashCode(j5);
    }

    public static String r(long j5) {
        return "Key code: " + j5;
    }

    public boolean equals(Object obj) {
        return o(this.a, obj);
    }

    public int hashCode() {
        return q(this.a);
    }

    public final /* synthetic */ long s() {
        return this.a;
    }

    public String toString() {
        return r(this.a);
    }
}
